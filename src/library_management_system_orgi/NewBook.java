
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import static javafx.scene.paint.Color.color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class NewBook extends javax.swing.JFrame {

   Connection conn;
   ResultSet rs;
   PreparedStatement pst;
    public NewBook() {
        super("New Book");
        initComponents();
        conn=javaconnect.connect();
        random();
        randomtxt.setBackground(new Color(0,0,0,64));
        nametxt.setBackground(new Color(0,0,0,64));
        pubtxt.setBackground(new Color(0,0,0,64));
        pr.setBackground(new Color(0,0,0,64));
        pg.setBackground(new Color(0,0,0,64));
        
           
    }

   public void random(){
   
       Random rd=new Random();
       randomtxt.setText(""+rd.nextInt(1000+1));
       
   }
   public void clear(){
   
       randomtxt.setText(" ");
       nametxt.setText(" ");
       editioncom.setSelectedIndex(0);
       pubtxt.setText(" ");
       pr.setText(" ");
       pg.setText(" ");
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pg = new javax.swing.JTextField();
        randomtxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        pubtxt = new javax.swing.JTextField();
        pr = new javax.swing.JTextField();
        editioncom = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0), 5), "New Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(102, 0, 0))); // NOI18N
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 153, 51));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 153));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Book ID ");
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Edition");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Publisher");
        kGradientPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Price");
        kGradientPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Pages");
        kGradientPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("ADD");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 90, 30));

        pg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pg.setForeground(new java.awt.Color(0, 0, 102));
        pg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgActionPerformed(evt);
            }
        });
        kGradientPanel2.add(pg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 190, 30));

        randomtxt.setEditable(false);
        randomtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        randomtxt.setForeground(new java.awt.Color(0, 0, 102));
        kGradientPanel2.add(randomtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 190, 30));

        nametxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nametxt.setForeground(new java.awt.Color(0, 0, 102));
        kGradientPanel2.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 190, 30));

        pubtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pubtxt.setForeground(new java.awt.Color(0, 0, 102));
        kGradientPanel2.add(pubtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 190, 30));

        pr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pr.setForeground(new java.awt.Color(0, 0, 102));
        pr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prKeyReleased(evt);
            }
        });
        kGradientPanel2.add(pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 190, 30));

        editioncom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editioncom.setForeground(new java.awt.Color(0, 0, 102));
        editioncom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        kGradientPanel2.add(editioncom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 190, 30));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        setVisible(false);
        Home obj=new Home();
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int ID=Integer.parseInt(randomtxt.getText());
        String nm=nametxt.getText();
        int edition=Integer.parseInt(editioncom.getSelectedItem().toString());
        String pub=pubtxt.getText();
        int price=Integer.parseInt(pr.getText());
        int page=Integer.parseInt(pg.getText());
        
            Object []options={"Yes","No"};
            String input=(String)JOptionPane.showInputDialog(null,"Do you want to add a new book?","Choose",JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
            
                if(input.equals("Yes")){
                
                  try {
            
            String sql="INSERT INTO book(Book_id,Name,Edition,Publisher,Price,Pages)VALUES('"+ID+"','"+nm+"','"+edition+"','"+pub+"','"+price+"','"+page+"')";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Book was added!","New Book",JOptionPane.INFORMATION_MESSAGE);
            clear();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
                
       }else{
                clear();
                    setVisible(false);
                    Home obj=new Home();
                    obj.setVisible(true);
                    
                }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void prKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prKeyReleased
        try {
            int num=Integer.parseInt(pr.getText());
            Border border = BorderFactory.createLineBorder(null);
            pr.setBorder(border);
        } catch (NumberFormatException e) {
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            pr.setBorder(border);
            JOptionPane.showMessageDialog(this, "Invalid input","Number error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_prKeyReleased

    private void pgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgActionPerformed
         try {
            int num2=Integer.parseInt(pg.getText());
            Border border = BorderFactory.createLineBorder(null);
            pg.setBorder(border);
        } catch (NumberFormatException e) {
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            pg.setBorder(border);
            JOptionPane.showMessageDialog(this, "Invalid input","Number error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_pgActionPerformed

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
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> editioncom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField pg;
    private javax.swing.JTextField pr;
    private javax.swing.JTextField pubtxt;
    private javax.swing.JTextField randomtxt;
    // End of variables declaration//GEN-END:variables
}
