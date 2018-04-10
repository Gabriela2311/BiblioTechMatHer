package interfaces;

import domain.Audiovisual;
import file.AudiovisualFile;
import java.io.IOException;

public class Interface_RecordAudio extends javax.swing.JFrame {

    Audiovisual audio;
    AudiovisualFile audiofile;
    
    public Interface_RecordAudio () {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_title = new javax.swing.JLabel();
        lb_device = new javax.swing.JLabel();
        btn_insert = new javax.swing.JButton();
        lb_serie = new javax.swing.JLabel();
        txf_code = new javax.swing.JTextField();
        lb_brand = new javax.swing.JLabel();
        txf_brand = new javax.swing.JTextField();
        txf_model = new javax.swing.JTextField();
        lb_model = new javax.swing.JLabel();
        lb_code = new javax.swing.JLabel();
        txf_serie = new javax.swing.JTextField();
        txf_year = new javax.swing.JTextField();
        lb_year = new javax.swing.JLabel();
        cBx_device = new javax.swing.JComboBox<>();
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

        lb_title.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        lb_title.setForeground(new java.awt.Color(255, 255, 255));
        lb_title.setText("Register AudioVisuals");
        getContentPane().add(lb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        lb_device.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_device.setForeground(new java.awt.Color(255, 255, 255));
        lb_device.setText("Device :");
        getContentPane().add(lb_device, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        btn_insert.setBackground(new java.awt.Color(51, 204, 255));
        btn_insert.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        btn_insert.setForeground(new java.awt.Color(255, 255, 255));
        btn_insert.setText("To Register");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });
        getContentPane().add(btn_insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        lb_serie.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_serie.setForeground(new java.awt.Color(255, 255, 255));
        lb_serie.setText("Serie:");
        getContentPane().add(lb_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txf_code.setEditable(false);
        getContentPane().add(txf_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 240, -1));

        lb_brand.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_brand.setForeground(new java.awt.Color(255, 255, 255));
        lb_brand.setText("Brand :");
        getContentPane().add(lb_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(txf_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 240, -1));
        getContentPane().add(txf_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 240, -1));

        lb_model.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_model.setForeground(new java.awt.Color(255, 255, 255));
        lb_model.setText("Model :");
        getContentPane().add(lb_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        lb_code.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_code.setForeground(new java.awt.Color(255, 255, 255));
        lb_code.setText("Code :");
        getContentPane().add(lb_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));
        getContentPane().add(txf_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 240, -1));
        getContentPane().add(txf_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 240, -1));

        lb_year.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_year.setForeground(new java.awt.Color(255, 255, 255));
        lb_year.setText("Year :");
        getContentPane().add(lb_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        cBx_device.setBackground(new java.awt.Color(51, 204, 255));
        cBx_device.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        cBx_device.setForeground(new java.awt.Color(255, 255, 255));
        cBx_device.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer", "Projector (Video Beam)", "Tablet", "Speakers", "Headphones" }));
        getContentPane().add(cBx_device, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 240, -1));

        lb_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        getContentPane().add(lb_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -350, 770, 900));

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

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed

        try {
            try {
                //Crea el archivo .dat
                audiofile = new AudiovisualFile();
                //insertar datos en nuevas variables
                 String brand = txf_brand.getText();
                 String model = txf_model.getText();
                 String year = txf_year.getText();
                 String device = (String) cBx_device.getSelectedItem();
                 String serie = txf_serie.getText();
                 boolean available = true;
                 String id = audiofile.generateCod();
                 
                 //insertar los datos capturados
                 audio = new Audiovisual(device, brand, model, available, serie, year, id);
                 audiofile.addEndAud(audio);
                
                //Limpiar campos
                txf_year.setText("");
                txf_brand.setText("");
                txf_model.setText("");
                cBx_device.setSelectedIndex(0);
                txf_serie.setText("");
                txf_code.setText(id);
              //  lb_message.setText("Registrado exitosamente");
        
             }
            catch(IOException ioe){
               System.out.println("Error File");
        
        }
             
        }
        catch( StringIndexOutOfBoundsException soe){
            System.err.println("Error en llenar");
           // lb_message.setText("No ha llenado todos los campos");
        }
    }//GEN-LAST:event_btn_insertActionPerformed

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
                new Interface_RecordAudio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_insert;
    private javax.swing.JComboBox<String> cBx_device;
    private javax.swing.JMenuItem item_RegAudioV;
    private javax.swing.JMenuItem item_RegBook;
    private javax.swing.JMenuItem item_RentAudioV;
    private javax.swing.JMenuItem item_RentBook;
    private javax.swing.JMenuItem item_exit;
    private javax.swing.JMenuItem item_record;
    private javax.swing.JMenuItem item_refundAudio;
    private javax.swing.JMenuItem item_refundBook;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lb_background;
    private javax.swing.JLabel lb_brand;
    private javax.swing.JLabel lb_code;
    private javax.swing.JLabel lb_device;
    private javax.swing.JLabel lb_model;
    private javax.swing.JLabel lb_serie;
    private javax.swing.JLabel lb_title;
    private javax.swing.JLabel lb_year;
    private javax.swing.JMenu menu_File;
    private javax.swing.JMenu menu_System;
    private javax.swing.JMenu menu_refund;
    private javax.swing.JMenu menu_register;
    private javax.swing.JMenu menu_rent;
    private javax.swing.JTextField txf_brand;
    private javax.swing.JTextField txf_code;
    private javax.swing.JTextField txf_model;
    private javax.swing.JTextField txf_serie;
    private javax.swing.JTextField txf_year;
    // End of variables declaration//GEN-END:variables
}
