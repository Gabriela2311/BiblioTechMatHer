package interfaces;

public class Interface_Main extends javax.swing.JFrame {

    public Interface_Main () {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_Title = new javax.swing.JLabel();
        lb_title2 = new javax.swing.JLabel();
        lb_image1 = new javax.swing.JLabel();
        lb_image2 = new javax.swing.JLabel();
        lb_background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_File = new javax.swing.JMenu();
        item_record = new javax.swing.JMenuItem();
        item_exit = new javax.swing.JMenuItem();
        menu_System = new javax.swing.JMenu();
        menu_register = new javax.swing.JMenu();
        item_RegBook = new javax.swing.JMenuItem();
        item_RegAudioV = new javax.swing.JMenuItem();
        menu_rent = new javax.swing.JMenu();
        item_RentBook = new javax.swing.JMenuItem();
        item_RentAudioV = new javax.swing.JMenuItem();
        menu_refund = new javax.swing.JMenu();
        item_refundBook = new javax.swing.JMenuItem();
        item_refundAudio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_Title.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        lb_Title.setForeground(new java.awt.Color(0, 0, 255));
        lb_Title.setText("Welcome To The Library System");
        getContentPane().add(lb_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        lb_title2.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        lb_title2.setForeground(new java.awt.Color(51, 51, 255));
        lb_title2.setText("BiblioTech");
        getContentPane().add(lb_title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        lb_image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/audio.png"))); // NOI18N
        getContentPane().add(lb_image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        lb_image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/books.png"))); // NOI18N
        getContentPane().add(lb_image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lb_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        getContentPane().add(lb_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -400, 760, 900));

        menu_File.setText("File");

        item_record.setText("Register");
        item_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_recordActionPerformed(evt);
            }
        });
        menu_File.add(item_record);

        item_exit.setText("Exit");
        item_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_exitActionPerformed(evt);
            }
        });
        menu_File.add(item_exit);

        jMenuBar1.add(menu_File);

        menu_System.setText("Sistem");

        menu_register.setText("Register");

        item_RegBook.setText("Books");
        item_RegBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_RegBookActionPerformed(evt);
            }
        });
        menu_register.add(item_RegBook);

        item_RegAudioV.setText("Audiovisuals");
        item_RegAudioV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_RegAudioVActionPerformed(evt);
            }
        });
        menu_register.add(item_RegAudioV);

        menu_System.add(menu_register);

        menu_rent.setText("Loans");

        item_RentBook.setText("Books");
        item_RentBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_RentBookActionPerformed(evt);
            }
        });
        menu_rent.add(item_RentBook);

        item_RentAudioV.setText("AudioVisuals ");
        item_RentAudioV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_RentAudioVActionPerformed(evt);
            }
        });
        menu_rent.add(item_RentAudioV);

        menu_System.add(menu_rent);

        menu_refund.setText("Refund");

        item_refundBook.setText("Books");
        item_refundBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_refundBookActionPerformed(evt);
            }
        });
        menu_refund.add(item_refundBook);

        item_refundAudio.setText("AudioVisuals");
        item_refundAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_refundAudioActionPerformed(evt);
            }
        });
        menu_refund.add(item_refundAudio);

        menu_System.add(menu_refund);

        jMenuBar1.add(menu_System);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_recordActionPerformed
        Interface_Login in_login = new Interface_Login();
        in_login.setVisible(true);
        in_login.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_item_recordActionPerformed

    private void item_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_item_exitActionPerformed

    private void item_RegBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_RegBookActionPerformed
        Interface_RecordBook in_book = new Interface_RecordBook();
        in_book.setVisible(true);
        in_book.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_item_RegBookActionPerformed

    private void item_RegAudioVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_RegAudioVActionPerformed
        Interface_RecordAudio in_Audio = new Interface_RecordAudio();
        in_Audio.setVisible(true);
        in_Audio.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_item_RegAudioVActionPerformed

    private void item_RentBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_RentBookActionPerformed
        Interface_LoansBook in_SearchBook = new Interface_LoansBook();
        in_SearchBook.setVisible(true);
        in_SearchBook.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_item_RentBookActionPerformed

    private void item_RentAudioVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_RentAudioVActionPerformed
        Interface_LoansAudio in_SearchAudio = new Interface_LoansAudio();
        in_SearchAudio.setVisible(true);
        in_SearchAudio.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_item_RentAudioVActionPerformed

    private void item_refundBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_refundBookActionPerformed
        Interface_RefundBook in_refundBook = new Interface_RefundBook();
        in_refundBook.setVisible(true);
        in_refundBook.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_item_refundBookActionPerformed

    private void item_refundAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_refundAudioActionPerformed
        Interface_RefundAudio in_refundAudio = new Interface_RefundAudio();
        in_refundAudio.setVisible(true);
        in_refundAudio.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_item_refundAudioActionPerformed

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
            java.util.logging.Logger.getLogger(Interface_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem item_RegAudioV;
    private javax.swing.JMenuItem item_RegBook;
    private javax.swing.JMenuItem item_RentAudioV;
    private javax.swing.JMenuItem item_RentBook;
    private javax.swing.JMenuItem item_exit;
    private javax.swing.JMenuItem item_record;
    private javax.swing.JMenuItem item_refundAudio;
    private javax.swing.JMenuItem item_refundBook;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lb_Title;
    private javax.swing.JLabel lb_background;
    private javax.swing.JLabel lb_image1;
    private javax.swing.JLabel lb_image2;
    private javax.swing.JLabel lb_title2;
    private javax.swing.JMenu menu_File;
    private javax.swing.JMenu menu_System;
    private javax.swing.JMenu menu_refund;
    private javax.swing.JMenu menu_register;
    private javax.swing.JMenu menu_rent;
    // End of variables declaration//GEN-END:variables
}
