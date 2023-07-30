/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ned.task;

import java.io.FileWriter;
import java.io.*;
import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import ned.view.downloadComplete;
import ned.view.errorMsg;
import org.json.simple.JSONObject;

/**
 *
 * @author Mr Vishwas
 */
public class DownloaderThread extends Thread{

    private static final int TIMEOUT = 5000;
    private static final int BLOCK_SIZE = 1024;
    public final static int ONE_SECOND = 1000;
    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    
    
    private DownloadListener listener;
    private String url;
    
    public DownloaderThread(DownloadListener listener, String url){
        
        this.listener = listener;
        this.url = url;
    }
    
    @Override
    public void run(){
        
        try{
            
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setReadTimeout(TIMEOUT);
            connection.connect();
            
           // this.listener.preDwonload(true);
            
            String fileName = new java.io.File(url).getName();
            
            File fileToSave = new File(fileName);
            int fileSize = connection.getContentLength();
            //downloadStart ds = new downloadStart();
            //String path = ds.downloadStart(url, fileName,Integer.toString(fileSize/1024));
                    
            this.listener.onDownloadProgress("downloading...", url, fileSize, 0, 0.0);
            String savePath = this.listener.showSaveDialog(fileToSave);
            
            if(savePath == null){
                this.listener.onDownloadFailed("Fail To Get Directory");
                return;
            }
            
            FileOutputStream out = new FileOutputStream(new File(savePath));
            
            double total = 0.0;
            
            this.listener.onDownloadStart();
            
            InputStream input = connection.getInputStream();
            
            byte buffer[] = new byte[BLOCK_SIZE];
            int length = -1;

            while((length=input.read(buffer, 0, BLOCK_SIZE)) != -1){
                total = total + length;
                out.write(buffer, 0, length);
                this.listener.onDownloadProgress("downloading..." +length, url, fileSize, (int)((total/fileSize)*100), total);
                
            }
            
            input.close();
            out.close();
            
            Date date = new Date();
            
            
            JSONObject jObject = new JSONObject();
            jObject.put("FIle_name", fileName);
            jObject.put("File_size", fileSize);
            jObject.put("Download_status", "Completed");
            jObject.put("Last_try", sdf.format(date));
            jObject.put("Description", "Description");
            
            FileWriter fw = new FileWriter("Log.json", true);
            fw.write(jObject.toJSONString());
            fw.flush();
            
            
            this.listener.onDownloadProgress("complete", url, fileSize, (int)((total/fileSize)*100), total);
            this.listener.onDownloadComplete();
            
            downloadComplete comp = new downloadComplete();
            comp.getPath(savePath);
            comp.setVisible(true);
            
            
        }
        catch(Exception e){
            errorMsg msg = new errorMsg();
            msg.Error(e.getMessage());
            msg.setVisible(true);
        }
        
        
    }
    
    public interface DownloadListener {
        
        void preDwonload(boolean stat);
        void onDownloadStart();
        void onDownloadProgress(String description, String url, int fileSize, int progress, double downloaded);
        void onDownloadComplete();
        void onDownloadFailed(String errorMsg);
        String showSaveDialog(File fileToSave);
    }
    
}
