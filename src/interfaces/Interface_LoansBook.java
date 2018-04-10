package interfaces;

import com.mxrck.autocompleter.TextAutoCompleter;
import domain.Book;
import file.BookFile;
import file.BookLoansFile;
import file.AudioLoansFile;
import file.StudentFile;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Interface_LoansBook extends javax.swing.JFrame {

    ArrayList<Book> arrayListBook = new ArrayList<Book>();
    BookFile new_BookFile = new BookFile();
    File file = new File("./Student.dat");
    StudentFile studentFile;
    BookLoansFile loanFile;
    AudioLoansFile loans_Util;
    //variables para las obtener las fechas
    SimpleDateFormat formatDate;
    Date dateDeparture, dateDelivery;
    String deparString, deliString, auxT, auxC; 

    private TextAutoCompleter autoCompleter;

    public Interface_LoansBook () {
        
        initComponents();
        this.setLocationRelativeTo(null);
        lb_Login.setVisible(false);
        lb_loginMessage.setVisible(false);
        lb_career.setVisible(false);
        txf_IDinsert.setVisible(false);
        btn_login.setVisible(false);
        lb_DateDelivery.setVisible(false);
        lb_DateDeparture.setVisible(false);
        dtC_delivery.setVisible(false);
        dtC_departure.setVisible(false);
        btn_get.setVisible(false);
        
        arrayListBook = (ArrayList<Book>) new_BookFile.getAllBooks();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titleMain = new javax.swing.JLabel();
        lb_title = new javax.swing.JLabel();
        lb_DateDeparture = new javax.swing.JLabel();
        txf_code = new javax.swing.JTextField();
        lb_code = new javax.swing.JLabel();
        lb_DateDelivery = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        btn_get = new javax.swing.JButton();
        lb_Login = new javax.swing.JLabel();
        lb_career = new javax.swing.JLabel();
        txf_IDinsert = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        lb_loginMessage = new javax.swing.JLabel();
        dtC_departure = new com.toedter.calendar.JDateChooser();
        dtC_delivery = new com.toedter.calendar.JDateChooser();
        txf_title = new javax.swing.JTextField();
        lb_message = new javax.swing.JLabel();
        lb_background = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        menu_File2 = new javax.swing.JMenu();
        item_record2 = new javax.swing.JMenuItem();
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

        lb_titleMain.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        lb_titleMain.setForeground(new java.awt.Color(255, 255, 255));
        lb_titleMain.setText("Books Loans");
        getContentPane().add(lb_titleMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        lb_title.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_title.setForeground(new java.awt.Color(255, 255, 255));
        lb_title.setText("Title :");
        getContentPane().add(lb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lb_DateDeparture.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_DateDeparture.setForeground(new java.awt.Color(255, 255, 255));
        lb_DateDeparture.setText("Departure Date : ");
        getContentPane().add(lb_DateDeparture, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 231, -1, 20));

        txf_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txf_codeKeyPressed(evt);
            }
        });
        getContentPane().add(txf_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 310, -1));

        lb_code.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_code.setForeground(new java.awt.Color(255, 255, 255));
        lb_code.setText("Code :");
        getContentPane().add(lb_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lb_DateDelivery.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_DateDelivery.setForeground(new java.awt.Color(255, 255, 255));
        lb_DateDelivery.setText("Date of Delivery :");
        getContentPane().add(lb_DateDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        btn_search.setBackground(new java.awt.Color(51, 204, 255));
        btn_search.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        btn_get.setBackground(new java.awt.Color(51, 204, 255));
        btn_get.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        btn_get.setForeground(new java.awt.Color(255, 255, 255));
        btn_get.setText("Get");
        btn_get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_getActionPerformed(evt);
            }
        });
        getContentPane().add(btn_get, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 90, -1));

        lb_Login.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        lb_Login.setForeground(new java.awt.Color(255, 255, 255));
        lb_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        lb_Login.setText("Login Here");
        getContentPane().add(lb_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 280, 140));

        lb_career.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_career.setForeground(new java.awt.Color(255, 255, 255));
        lb_career.setText("Enter your ID");
        getContentPane().add(lb_career, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 100, -1));
        getContentPane().add(txf_IDinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 240, -1));

        btn_login.setBackground(new java.awt.Color(51, 204, 255));
        btn_login.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 100, -1));

        lb_loginMessage.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        lb_loginMessage.setForeground(new java.awt.Color(255, 255, 255));
        lb_loginMessage.setText("Only if you are Registered");
        getContentPane().add(lb_loginMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 150, -1));

        dtC_departure.setBackground(new java.awt.Color(51, 204, 255));
        dtC_departure.setDateFormatString("dd / MMMM / yyyy");
        getContentPane().add(dtC_departure, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 190, -1));

        dtC_delivery.setBackground(new java.awt.Color(51, 204, 255));
        dtC_delivery.setDateFormatString("dd / MMMM / yyyy");
        getContentPane().add(dtC_delivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 190, -1));

        txf_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_titleActionPerformed(evt);
            }
        });
        txf_title.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txf_titleKeyPressed(evt);
            }
        });
        getContentPane().add(txf_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 310, -1));

        lb_message.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        lb_message.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lb_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 350, 30));

        lb_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        getContentPane().add(lb_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -340, 770, 900));

        menu_File2.setText("File");

        item_record2.setText("Register");
        item_record2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_record2ActionPerformed(evt);
            }
        });
        menu_File2.add(item_record2);

        item_exit.setText("Exit");
        item_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_exitActionPerformed(evt);
            }
        });
        menu_File2.add(item_exit);

        jMenuBar3.add(menu_File2);

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

        jMenuBar3.add(menu_System);

        setJMenuBar(jMenuBar3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_record2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_record2ActionPerformed
        Interface_Login in_login = new Interface_Login();
        in_login.setVisible(true);
        in_login.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_item_record2ActionPerformed

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

    private void txf_codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_codeKeyPressed

        autoCompleter = new TextAutoCompleter(txf_code);
        
        for (int i = 0; i < arrayListBook.size(); i++) {
            if (arrayListBook.get(i).isAvailability()!=false) {
                autoCompleter.addItem(arrayListBook.get(i).getISBN());
            }// Fin del if 
        }// fin del for
    }//GEN-LAST:event_txf_codeKeyPressed

    private void txf_titleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_titleKeyPressed

        autoCompleter = new TextAutoCompleter(txf_title);
        
        for (int i = 0; i < arrayListBook.size(); i++) {
            if (arrayListBook.get(i).isAvailability()!=false) {
                autoCompleter.addItem(arrayListBook.get(i).getTitle());
            }// Fin del if 
        }// fin del for
    }//GEN-LAST:event_txf_titleKeyPressed

    private void btn_getActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_getActionPerformed
        try {
        //formatea y convierte en String 
        formatDate = new SimpleDateFormat("dd-MM-yyyy");
        dateDeparture = dtC_departure.getDate();
        dateDelivery = dtC_delivery.getDate();
        String departure_string = formatDate.format(dateDeparture);
        String delivery_string =  formatDate.format(dateDelivery);
        
        //las guarda global para utilizarlas a la hora de guardar
        deparString = departure_string;
        deliString = delivery_string;
        
        //para comparar si ingresa un fecha anterior a la de la solicitud
        int dat = delivery_string.compareToIgnoreCase(departure_string);
        
        // compara que no esten vacias 
        if (!delivery_string.equals("") && !departure_string.equals("") && dat>=0) {
            lb_Login.setVisible(true);
            lb_loginMessage.setVisible(true);
            lb_career.setVisible(true);
            txf_IDinsert.setVisible(true);
            btn_login.setVisible(true);
            lb_message.setText("Enter the data to finish the process");
        }else{
            lb_Login.setVisible(false);
            lb_loginMessage.setVisible(false);
            lb_career.setVisible(false);
            txf_IDinsert.setVisible(false);
            btn_login.setVisible(false);
            lb_message.setText("Error when entering the date");
        }
        }catch(NullPointerException npe){
            lb_message.setText("Error when entering the date");
        }
        
        
        
    }//GEN-LAST:event_btn_getActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        
        String title = txf_title.getText();
        String code = txf_code.getText();

            

        if (!code.equals("") || !title.equals("") ) {

            if (!code.equals("") && new_BookFile.searchCod(code)== true) {
                auxC = code;
                auxT = new_BookFile.searchCode(code);
                title = new_BookFile.searchCode(code);
                txf_title.setText(title);
                
            }else if (!title.equals("") && new_BookFile.searchTitl(title)== true) {

                auxT = title;
                auxC = new_BookFile.searchTitle(title);
                code = new_BookFile.searchTitle(title);
                txf_code.setText(code);
                
            }// fin del else 
            
            lb_DateDelivery.setVisible(true);
            lb_DateDeparture.setVisible(true);
            dtC_delivery.setVisible(true);
            dtC_departure.setVisible(true); 
            btn_get.setVisible(true);
            
        }else{
            
            lb_DateDelivery.setVisible(false);
            lb_DateDeparture.setVisible(false);
            dtC_delivery.setVisible(false);
            dtC_departure.setVisible(false); 
            btn_get.setVisible(false);
        
        }// Fin del else 

    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        
        String id = txf_IDinsert.getText();
        boolean penalty = false;
        String code = auxC;
        
        try {
            studentFile = new StudentFile(file);
            if (studentFile.searchStudent(id) == true) {

                if (new_BookFile.availabilityBook(auxC, auxT)== true) {
                    lb_message.setText("");

//                    try {
//                       loans_Util.loansAudio(id, penalty, deliString, deparString, code);
//                        try {
//                            loanFile.getLoans(code);
//                        } catch (ClassNotFoundException cnfe) {
//                            Logger.getLogger(Interface_LoansBook.class.getName()).log(Level.SEVERE, null, cnfe);
//                        }
//                    } catch (IOException ioe) {
//                        Logger.getLogger(Interface_LoansBook.class.getName()).log(Level.SEVERE, null, ioe);
//                    } 
                    
                    //Inicializa todo 
                    lb_Login.setVisible(false);
                    lb_loginMessage.setVisible(false);
                    lb_career.setVisible(false);
                    txf_IDinsert.setVisible(false);
                    btn_login.setVisible(false);
                    lb_DateDelivery.setVisible(false);
                    lb_DateDeparture.setVisible(false);
                    dtC_delivery.setVisible(false);
                    dtC_departure.setVisible(false);
                    btn_get.setVisible(false);
                    txf_title.setText("");
                    txf_code.setText("");
                    txf_IDinsert.setText("");
                    deparString=deliString=auxT=auxC="";
                    
                }

            }else
                lb_message.setText("It is not registered your ID");
            
        } catch (IOException ex) {
            System.err.println("Error File" + ex.getCause());
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txf_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_titleActionPerformed

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
                new Interface_LoansBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_get;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_search;
    private com.toedter.calendar.JDateChooser dtC_delivery;
    private com.toedter.calendar.JDateChooser dtC_departure;
    private javax.swing.JMenuItem item_RegAudioV;
    private javax.swing.JMenuItem item_RegBook;
    private javax.swing.JMenuItem item_RentAudioV;
    private javax.swing.JMenuItem item_RentBook;
    private javax.swing.JMenuItem item_exit;
    private javax.swing.JMenuItem item_record2;
    private javax.swing.JMenuItem item_refundAudio;
    private javax.swing.JMenuItem item_refundBook;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JLabel lb_DateDelivery;
    private javax.swing.JLabel lb_DateDeparture;
    private javax.swing.JLabel lb_Login;
    private javax.swing.JLabel lb_background;
    private javax.swing.JLabel lb_career;
    private javax.swing.JLabel lb_code;
    private javax.swing.JLabel lb_loginMessage;
    private javax.swing.JLabel lb_message;
    private javax.swing.JLabel lb_title;
    private javax.swing.JLabel lb_titleMain;
    private javax.swing.JMenu menu_File2;
    private javax.swing.JMenu menu_System;
    private javax.swing.JMenu menu_refund;
    private javax.swing.JMenu menu_register;
    private javax.swing.JMenu menu_rent;
    private javax.swing.JTextField txf_IDinsert;
    private javax.swing.JTextField txf_code;
    private javax.swing.JTextField txf_title;
    // End of variables declaration//GEN-END:variables

}
