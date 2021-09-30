
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class ReturnBook extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    public ReturnBook() {
        super("Return Book");
        initComponents();
        conn=javaconnect.connect();
        
        bid.setBackground(new Color(0,0,0,64));
        bname.setBackground(new Color(0,0,0,64));
        bedition.setBackground(new Color(0,0,0,64));
        publish.setBackground(new Color(0,0,0,64));
        bprice.setBackground(new Color(0,0,0,64));
        bpage.setBackground(new Color(0,0,0,64));
        stid.setBackground(new Color(0,0,0,64));
        sname.setBackground(new Color(0,0,0,64));
        fathername.setBackground(new Color(0,0,0,64));
        scourse.setBackground(new Color(0,0,0,64));
        sbranch.setBackground(new Color(0,0,0,64));
        syear.setBackground(new Color(0,0,0,64));
        ssemester.setBackground(new Color(0,0,0,64));
    }

    public void clear(){
    
        bid.setText(" ");
        bname.setText(" ");
        bedition.setText(" ");
        publish.setText(" ");
        bprice.setText(" ");
        bpage.setText(" ");
        stid.setText(" ");
        sname.setText(" ");
        fathername.setText(" ");
        scourse.setText(" ");
        sbranch.setText(" ");
        syear.setText(" ");
        ssemester.setText(" ");
    
        
    }
    
    public void Rn(){
    
        
        try {
            int sid=Integer.parseInt(stid.getText());
             int bookid=Integer.parseInt(bid.getText());
            char nme=bname.getText().charAt(0);
            int edi=Integer.parseInt(bedition.getText());
            char pub=publish.getText().charAt(0);
            int pc=Integer.parseInt(bprice.getText());
            int pg=Integer.parseInt(bpage.getText());
            char snm=sname.getText().charAt(0);
            char fnam=fathername.getText().charAt(0);
            char cou=scourse.getText().charAt(0);
            char bran=sbranch.getText().charAt(0);
            int yr=Integer.parseInt(syear.getText());
            int sem=Integer.parseInt(ssemester.getText());
            
            java.util.Date date1=isdate.getDate();
            SimpleDateFormat fr= new SimpleDateFormat("yyyy-MM-dd");
            String Isdate=fr.format(date1);
            
            java.util.Date date2=returndate.getDate();
            SimpleDateFormat fr2= new SimpleDateFormat("yyyy-MM-dd");
            String Isdate2=fr2.format(date2);
                    
                    String sql2="insert into Returnbook(Book_id,Name,Edition,Publisher,Price,Pages,student_id,sname,fname,course,branch,year,semester,DOI,DOR) values('"+bookid+"','"+nme+"','"+edi+"','"+pub+"','"+pc+"','"+pg+"','"+sid+"','"+snm+"','"+fnam+"','"+cou+"','"+bran+"','"+yr+"','"+sem+"','"+Isdate+"','"+Isdate2+"')";
                    pst=conn.prepareStatement(sql2);
                    pst.execute();
                    
                    JOptionPane.showMessageDialog(this,"Data was inserted!","Insert alert",JOptionPane.INFORMATION_MESSAGE);
                    clear();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        bname = new javax.swing.JTextField();
        bedition = new javax.swing.JTextField();
        publish = new javax.swing.JTextField();
        bprice = new javax.swing.JTextField();
        bpage = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        stid = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        fathername = new javax.swing.JTextField();
        scourse = new javax.swing.JTextField();
        sbranch = new javax.swing.JTextField();
        ssemester = new javax.swing.JTextField();
        syear = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        isdate = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        returndate = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 5), "Return Books' Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(102, 0, 0))); // NOI18N
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 102));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Book ID");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Name");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Edition");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Publisher");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Price");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 392, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Pages");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, 30));

        bid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bid.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 212, 30));

        bname.setEditable(false);
        bname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bname.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 212, 32));

        bedition.setEditable(false);
        bedition.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bedition.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(bedition, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 212, 31));

        publish.setEditable(false);
        publish.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        publish.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(publish, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 212, 33));

        bprice.setEditable(false);
        bprice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bprice.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(bprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 212, 33));

        bpage.setEditable(false);
        bpage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bpage.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(bpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 212, 31));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 660, 114, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Students' Details");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 160, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Student ID");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Name");
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("Father Name");
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("Course");
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Branch");
        kGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setText("Year");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("Date Of Issue");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        stid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stid.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(stid, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 212, 30));

        sname.setEditable(false);
        sname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sname.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 212, 32));

        fathername.setEditable(false);
        fathername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fathername.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(fathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 212, 31));

        scourse.setEditable(false);
        scourse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        scourse.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(scourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, 212, 33));

        sbranch.setEditable(false);
        sbranch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sbranch.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(sbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 212, 33));

        ssemester.setEditable(false);
        ssemester.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ssemester.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(ssemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 520, 212, 31));

        syear.setEditable(false);
        syear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        syear.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(syear, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 212, 31));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 114, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText(" Book Details");
        kGradientPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 102));
        jLabel18.setText("Semester");
        kGradientPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, -1, -1));
        kGradientPanel1.add(isdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 210, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Return");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 660, 114, 30));

        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        kGradientPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 540, 467));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 540, 467));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 102));
        jLabel19.setText("Date Of Return");
        kGradientPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 590, -1, -1));
        kGradientPanel1.add(returndate, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, 210, 30));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Cancel");
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

        jMenu2.setText("Edit");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("About");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        Home h=new Home();
        h.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String sql="select * from issue where Book_id=? || student_id=?";
        
        try {
            int bookid=Integer.parseInt(bid.getText()); 
            int sid=Integer.parseInt(stid.getText());
            pst=conn.prepareStatement(sql);
            pst.setInt(1, bookid);
            pst.setInt(2, sid);
            rs=pst.executeQuery();
            
            if(rs.next()){
            bname.setText(rs.getString("Name"));
            String idi=Integer.toString(rs.getInt("Edition"));
            bedition.setText(idi);
            publish.setText(rs.getString("Publisher"));
            String pri=Integer.toString(rs.getInt("Price"));
            bprice.setText(pri);
            String pag=Integer.toString(rs.getInt("Pages"));
            bpage.setText(pag);
                String suid=Integer.toString(rs.getInt("student_id"));
                stid.setText(suid);
                sname.setText(rs.getString("sname"));
                fathername.setText(rs.getString("fname"));
                scourse.setText(rs.getString("course"));
                sbranch.setText(rs.getString("branch"));
                int yr=rs.getInt("year");
                String yrs=Integer.toString(yr);
                syear.setText(yrs);
                
                int sem=rs.getInt("semester");
                String sems=Integer.toString(sem);
                ssemester.setText(sems);
                
               String date=rs.getString("dateOfIssue");
               Date fr= new SimpleDateFormat("yyyy-MM-dd").parse(date);
            isdate.setDate(fr);
       
            }
            else{
                JOptionPane.showMessageDialog(null, "Book ID is not found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
        try {
            int sid=Integer.parseInt(stid.getText());
            String sql="delete from issue where student_id='"+sid+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Book was returned!","Alert",JOptionPane.INFORMATION_MESSAGE);
       
            Rn();
            clear();
            
           
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bedition;
    private javax.swing.JTextField bid;
    private javax.swing.JTextField bname;
    private javax.swing.JTextField bpage;
    private javax.swing.JTextField bprice;
    private javax.swing.JTextField fathername;
    private com.toedter.calendar.JDateChooser isdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField publish;
    private com.toedter.calendar.JDateChooser returndate;
    private javax.swing.JTextField sbranch;
    private javax.swing.JTextField scourse;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField ssemester;
    private javax.swing.JTextField stid;
    private javax.swing.JTextField syear;
    // End of variables declaration//GEN-END:variables
}
