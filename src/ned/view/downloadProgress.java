/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ned.view;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.WindowConstants;
import ned.task.DownloaderThread;
/**
 *
 * @author Mr Vishwas
 */
public class downloadProgress extends javax.swing.JFrame implements DownloaderThread.DownloadListener{

    /**
     * Creates new form downloadProgress
     */
    private String url;
    
    public downloadProgress() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("NED");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jScrollPane1.setVisible(true);
        
    }
    
    public void geturl(String dURL){
        url = dURL;
        DownloaderThread download = new DownloaderThread(downloadProgress.this, url);
            download.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        urlLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        statLbl = new javax.swing.JLabel();
        fileSizeLbl = new javax.swing.JLabel();
        downloadedLbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        progressStatus = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoPan = new javax.swing.JTextArea();
        cancelBtn = new javax.swing.JButton();
        startStoptBtn = new javax.swing.JButton();
        showHideBtn = new javax.swing.JButton();
        temp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(187, 187, 207));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        urlLbl.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jPanel2.add(urlLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 530, 10));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel2.setText("Status");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel3.setText("File Size");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 81, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel4.setText("Downloaded");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel5.setText("Transfer Speed");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel6.setText("Time");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 141, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Download Status");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        statLbl.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jPanel2.add(statLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 200, 10));

        fileSizeLbl.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jPanel2.add(fileSizeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 81, 200, 10));

        downloadedLbl.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jPanel2.add(downloadedLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 101, 130, 10));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel11.setText("Status");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 121, -1, -1));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel12.setText("Status");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 141, -1, -1));

        infoPan.setEditable(false);
        infoPan.setColumns(20);
        infoPan.setRows(5);
        infoPan.setUI(null);
        jScrollPane1.setViewportView(infoPan);

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        startStoptBtn.setText("Pause");
        startStoptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startStoptBtnActionPerformed(evt);
            }
        });

        showHideBtn.setText("Details >>");
        showHideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHideBtnActionPerformed(evt);
            }
        });

        temp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tempKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progressStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(showHideBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                        .addComponent(startStoptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(progressStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startStoptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showHideBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
       System.exit(0);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void startStoptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startStoptBtnActionPerformed

        //stop download 

    }//GEN-LAST:event_startStoptBtnActionPerformed

    private void showHideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHideBtnActionPerformed

//        if(showHideBtn.getText() == "Details >>"){
//            jScrollPane1.setVisible(true);
//            showHideBtn.setText("<< Details");
//        }
//        else{
//            showHideBtn.setText("Details >>");
//            jScrollPane1.setVisible(false);
//        }
        
        
    }//GEN-LAST:event_showHideBtnActionPerformed

    private void tempKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tempKeyPressed

//        String url = temp.getText();
//        if(evt.getKeyCode()==10){
//            if(checkValidURL(url)){
//                startDownload(url);
//                System.out.println("Start Downloading");
//            }
//            else{
//                System.err.println("download cann't start");
//            }
//        }
    }//GEN-LAST:event_tempKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(downloadProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(downloadProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(downloadProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(downloadProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel downloadedLbl;
    private javax.swing.JLabel fileSizeLbl;
    private javax.swing.JTextArea infoPan;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar progressStatus;
    private javax.swing.JButton showHideBtn;
    private javax.swing.JButton startStoptBtn;
    private javax.swing.JLabel statLbl;
    private javax.swing.JTextField temp;
    private javax.swing.JLabel urlLbl;
    // End of variables declaration//GEN-END:variables

    @Override
    public void preDwonload(boolean stat) {
        
       
        
    }
    
    @Override
    public void onDownloadStart() {
        
        this.infoPan.append("Download started \n");
        
    }

    @Override
    public void onDownloadProgress(String description, String url, int fileSize, int progress, double downloaded) {
        
        this.urlLbl.setText(url);
        this.statLbl.setText(description);
        this.fileSizeLbl.setText(Integer.toString(fileSize));
        //this.infoPan.append(description +"\n" );
        this.progressStatus.setValue(progress);
        this.downloadedLbl.setText(Double.toString(downloaded));
        
    }

    @Override
    public void onDownloadComplete() {

        this.infoPan.append("Download Complete \n");
        
    }

    @Override
    public void onDownloadFailed(String errorMsg) {
        
        errorMsg msg = new errorMsg();
        msg.Error(errorMsg);
        msg.setVisible(true);
        
    }

    @Override
    public String showSaveDialog(File fileToSave) {
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose where to Save " + fileToSave.getName());
        fileChooser.setSelectedFile(fileToSave);
        int userSelection = fileChooser.showSaveDialog(downloadProgress.this);
        if(userSelection == JFileChooser.APPROVE_OPTION){
          File saveIN = fileChooser.getSelectedFile();
          return saveIN.getAbsolutePath();
        }
        return null;
        
    }

    
}
