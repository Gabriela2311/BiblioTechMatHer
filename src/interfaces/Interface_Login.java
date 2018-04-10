package interfaces;

import domain.Student;
import file.StudentFile;
import java.io.File;
import java.io.IOException;

public class Interface_Login extends javax.swing.JFrame {
    
    
    File file = new File("./Student.dat");
    Student student;
    
    
    public Interface_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_AddMessage = new javax.swing.JLabel();
        cBx_Career = new javax.swing.JComboBox<>();
        lb_year = new javax.swing.JLabel();
        lb_lastname = new javax.swing.JLabel();
        txf_lastname = new javax.swing.JTextField();
        btn_Record = new javax.swing.JButton();
        txf_ID = new javax.swing.JTextField();
        lb_titleAdd = new javax.swing.JLabel();
        lb_Career = new javax.swing.JLabel();
        txf_year = new javax.swing.JTextField();
        lb_name = new javax.swing.JLabel();
        txf_name = new javax.swing.JTextField();
        lb_message = new javax.swing.JLabel();
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

        lb_AddMessage.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        lb_AddMessage.setForeground(new java.awt.Color(255, 255, 255));
        lb_AddMessage.setText("If it is not registered, enter the requested information.");
        getContentPane().add(lb_AddMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        cBx_Career.setBackground(new java.awt.Color(51, 204, 255));
        cBx_Career.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        cBx_Career.setForeground(new java.awt.Color(255, 255, 255));
        cBx_Career.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Education", "Agronomy", "Computing" }));
        getContentPane().add(cBx_Career, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 240, -1));

        lb_year.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_year.setForeground(new java.awt.Color(255, 255, 255));
        lb_year.setText("Enter your year of Income");
        getContentPane().add(lb_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        lb_lastname.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_lastname.setForeground(new java.awt.Color(255, 255, 255));
        lb_lastname.setText("Enter your Lastname");
        getContentPane().add(lb_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));
        getContentPane().add(txf_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 240, -1));

        btn_Record.setBackground(new java.awt.Color(51, 204, 255));
        btn_Record.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        btn_Record.setForeground(new java.awt.Color(255, 255, 255));
        btn_Record.setText("Login");
        btn_Record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RecordActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Record, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 110, -1));

        txf_ID.setEditable(false);
        txf_ID.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        getContentPane().add(txf_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 240, -1));

        lb_titleAdd.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        lb_titleAdd.setForeground(new java.awt.Color(255, 255, 255));
        lb_titleAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/record.png"))); // NOI18N
        lb_titleAdd.setText("Login Here");
        getContentPane().add(lb_titleAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 300, -1));

        lb_Career.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_Career.setForeground(new java.awt.Color(255, 255, 255));
        lb_Career.setText("Select your Career");
        getContentPane().add(lb_Career, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));
        getContentPane().add(txf_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 240, -1));

        lb_name.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_name.setForeground(new java.awt.Color(255, 255, 255));
        lb_name.setText("Enter your Name");
        getContentPane().add(lb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));
        getContentPane().add(txf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 240, -1));

        lb_message.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_message.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lb_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        lb_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        getContentPane().add(lb_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, -350, 950, 900));

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

    private void btn_RecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RecordActionPerformed

        try {
            try {
                //Crea el archivo .dat
                StudentFile studentfile = new StudentFile(file);
                //insertar datos en nuevas variables
                 String name = txf_name.getText();
                 String lastname = txf_lastname.getText();
                 String year = txf_year.getText();
                 String career = (String) cBx_Career.getSelectedItem();
                 String id = studentfile.generateID(career, year); 
                 
                 //insertar los datos capturados
                 student = new Student(name, lastname, id, year, career);
                 studentfile.addEndStudent(student);
                
                //Limpiar campos
                txf_name.setText("");
                txf_lastname.setText("");
                cBx_Career.setSelectedIndex(0);
                txf_year.setText("");
                txf_ID.setText("Carnet: " + id);
                lb_message.setText("Registrado exitosamente");
        
             }
            catch(IOException ioe){
               System.out.println("Error File");
        
        }
             
        }
        catch( StringIndexOutOfBoundsException soe){
            System.err.println("Error en llenar");
            lb_message.setText("No ha llenado todos los campos");
        }
        
    }//GEN-LAST:event_btn_RecordActionPerformed

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
                new Interface_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Record;
    private javax.swing.JComboBox<String> cBx_Career;
    private javax.swing.JMenuItem item_RegAudioV;
    private javax.swing.JMenuItem item_RegBook;
    private javax.swing.JMenuItem item_RentAudioV;
    private javax.swing.JMenuItem item_RentBook;
    private javax.swing.JMenuItem item_exit;
    private javax.swing.JMenuItem item_record;
    private javax.swing.JMenuItem item_refundAudio;
    private javax.swing.JMenuItem item_refundBook;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lb_AddMessage;
    private javax.swing.JLabel lb_Career;
    private javax.swing.JLabel lb_background;
    private javax.swing.JLabel lb_lastname;
    private javax.swing.JLabel lb_message;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_titleAdd;
    private javax.swing.JLabel lb_year;
    private javax.swing.JMenu menu_File;
    private javax.swing.JMenu menu_System;
    private javax.swing.JMenu menu_refund;
    private javax.swing.JMenu menu_register;
    private javax.swing.JMenu menu_rent;
    private javax.swing.JTextField txf_ID;
    private javax.swing.JTextField txf_lastname;
    private javax.swing.JTextField txf_name;
    private javax.swing.JTextField txf_year;
    // End of variables declaration//GEN-END:variables
}
