
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tholithemba
 */
public class Appointment extends javax.swing.JFrame {

    /**
     * Creates new form Appointment
     */
        String[] btn = {"btn_7","btn_8","btn_9","btn_10","btn_11","btn_12",
        "btn_13","btn_14","btn_15","btn_16","btn_17","btn_18","btn_19","btn_20"};
    public Appointment() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contact1 = new com.mindfusion.scheduling.model.Contact();
        appointment1 = new com.mindfusion.scheduling.model.Appointment();
        duration1 = new com.mindfusion.common.Duration();
        dayOfWeekStyle1 = new com.mindfusion.scheduling.DayOfWeekStyle();
        reminder1 = new com.mindfusion.scheduling.model.Reminder();
        jFrame1 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        btn_11 = new javax.swing.JButton();
        btn_12 = new javax.swing.JButton();
        btn_14 = new javax.swing.JButton();
        btn_13 = new javax.swing.JButton();
        btn_10 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_16 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_15 = new javax.swing.JButton();
        btn_17 = new javax.swing.JButton();
        btn_19 = new javax.swing.JButton();
        btn_20 = new javax.swing.JButton();
        btn_18 = new javax.swing.JButton();
        choosen_date = new com.toedter.calendar.JDateChooser();
        book = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        show_dat = new javax.swing.JLabel();
        hr_to = new javax.swing.JComboBox<>();
        hr_from = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 0, 250));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        btn_11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_11.setText("11AM");

        btn_12.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_12.setText("12PM");

        btn_14.setBackground(java.awt.Color.blue);
        btn_14.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_14.setText("2PM");

        btn_13.setBackground(java.awt.Color.blue);
        btn_13.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_13.setText("1PM");

        btn_10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_10.setText("10AM");

        btn_7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_7.setText("7AM");

        btn_8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_8.setText("8AM");
        btn_8.setPreferredSize(new java.awt.Dimension(60, 29));

        btn_16.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_16.setText("4PM");

        btn_9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_9.setText("9AM");

        btn_15.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_15.setText("3PM");

        btn_17.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_17.setText("5PM");

        btn_19.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_19.setText("7PM");

        btn_20.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_20.setText("8PM");

        btn_18.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_18.setText("6PM");

        book.setBackground(java.awt.Color.blue);
        book.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        book.setForeground(java.awt.Color.white);
        book.setText("Schedule");
        book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookMouseClicked(evt);
            }
        });
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        jButton10.setBackground(java.awt.Color.red);
        jButton10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton10.setForeground(java.awt.Color.white);
        jButton10.setText("Cancel");

        show_dat.setBackground(java.awt.Color.green);
        show_dat.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        show_dat.setForeground(java.awt.Color.black);
        show_dat.setText("date");

        hr_to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08AM", "09AM", "10AM", "11AM", "12PM", "01PM", "02PM", "03PM", "04PM", "05PM", "06PM", "07PM", "08PM" }));

        hr_from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07AM", "08AM", "09AM", "10AM", "11AM", "12PM", "01PM", "02PM", "03PM", "04PM", "05PM", "06PM", "07PM" }));
        hr_from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hr_fromActionPerformed(evt);
            }
        });

        jLabel1.setText("To");

        user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "login as", "Receptionist", "Patient", "Doctor" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(show_dat)
                .addGap(193, 193, 193))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btn_19, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(hr_from, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hr_to, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(choosen_date, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(show_dat)
                .addGap(31, 31, 31)
                .addComponent(choosen_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hr_to)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hr_from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_10)
                    .addComponent(btn_9)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_11)
                    .addComponent(btn_12)
                    .addComponent(btn_13)
                    .addComponent(btn_14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_15)
                    .addComponent(btn_16)
                    .addComponent(btn_17)
                    .addComponent(btn_18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_20)
                    .addComponent(btn_19))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(book))
                .addGap(21, 21, 21))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Week", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseClicked
         //Date d1 = new Date();

         //change begroung color for selected hour
         for(int r = hr_from.getSelectedIndex()+7; r<=hr_to.getSelectedIndex()+8;r++)
                      change_colour(r);
        create_appointment();
        
         
    }//GEN-LAST:event_bookMouseClicked

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_bookActionPerformed

    private void hr_fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hr_fromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hr_fromActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    PreparedStatement  p_s;
    int id = -1;
    
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
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment().setVisible(true);
            }
        });
        
    }
    
    //creating an appointment and savind data to database
    public void create_appointment()
    {
        PreparedStatement ps;
        
         SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
         String conv_dat = sdf.format(choosen_date.getDate());
         show_dat.setText(conv_dat);
        
        String insert = "";
        
         if(user.getSelectedItem()== "Patient" )
            {
                insert = "INSERT INTO `APPOINTMENT`(`DATE`, `CHECKIN`, `CHECKOUT`,"
                + " `PATIENT_ID`) "
                + "VALUES (?,?,?,?)";
            }
            else if(user.getSelectedItem() == "Doctor")
            {
               insert = "INSERT INTO `APPOINTMENT`(`DATE`, `CHECKIN`, `CHECKOUT`,"
                + " `DOCTOR_ID`) "
                + "VALUES (?,?,?,?)";
            }
            else if(user.getSelectedItem() == "Receptionist")
            {
               insert = "INSERT INTO `APPOINTMENT`(`DATE`, `CHECKIN`, `CHECKOUT`,"
                + " `RECEPTIONIST_ID`) "
                + "VALUES (?,?,?,?)";
            }
            else
            {
                JOptionPane.showMessageDialog(null, "select user");
            }
        
        
        try
        {
            ps = Connect2database.getConnection().prepareStatement(insert);
            
            ps.setString(1, conv_dat);
            ps.setString(2,hr_from.getSelectedItem().toString());
            ps.setString(3,hr_to.getSelectedItem().toString());

           
            //fetch the seledte user id
            if(user.getSelectedItem()== "Patient" )
            {
                ps.setInt(4, fetch_patient_id());
            }
            else if(user.getSelectedItem() == "Doctor")
            {
                ps.setInt(5, fetch_receptionist_id());
            }
            else if(user.getSelectedItem() == "Receptionist")
            {
                ps.setInt(6, fetch_doctor_id());
            }
            else
            {
                JOptionPane.showMessageDialog(null, "select user");
            }
            System.out.println("waiting......");
            if(ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null, "appointment was successfully");
            }
            
        }catch(SQLException sq)
        {
            sq.getSQLState();
        }
                    
    }
    //end create_appointment function
    
    //fetch doctor id from Doctor table
    public int fetch_doctor_id()
    {
        String fetch = "SELECT DOCTOR_ID FROM `DOCTOR` WHERE EMAIL =\"peace@gmail.com\"";

        return return_id(fetch);
    }
    //end fetch_doctor_id function
    
    //fetch patient id from patient table
    public int fetch_patient_id()
    {   
        String fetch = "SELECT PATIENT_ID FROM `PATIENT` WHERE EMAIL =\"makhe@gmail.com\"";
       
        return return_id(fetch);
    }
    //end of fetch_patient_id function
    
    //fetching receptionist id to receptionist table
    public int fetch_receptionist_id()
    {
        String fetch = "SELECT RECEPTIONIST_ID FROM `RECEPTIONIST` WHERE EMAIL =\"zanale@gmail.com\"";
      
        return return_id(fetch);
    }
    //end fetch_receptionist_id function
     
    //this function fetch id of a selected user
    public int return_id(String fetch)
    {
        try
        {
            
            p_s = Connect2database.getConnection().prepareStatement(fetch);

            ResultSet rs = p_s.executeQuery();
            if(rs.next())
            {
                id = rs.getInt(1);
                
            }
        }
        catch(SQLException s)
        {
            System.out.println("error");
        }
        System.out.println("id: "+id);
        
        return id;
    }
    //end of return_id function
    
    
    //this function change the backgroung colour of a selected button
    public void change_colour(int i)
    {
        switch(i)
        {
            case 7: btn_7.setBackground(Color.blue);
            break;
               
            case 8: btn_8.setBackground(Color.blue);
            break;
            
            case 9: btn_9.setBackground(Color.blue);
            break;
            
            case 10: btn_10.setBackground(Color.blue);
            break;
            
            case 11: btn_11.setBackground(Color.blue);
            break;
            
            case 12: btn_13.setBackground(Color.blue);
            break;
            
            case 13: btn_14.setBackground(Color.blue);
            break;
            
            case 15: btn_15.setBackground(Color.blue);
            break;
            
            case 16: btn_16.setBackground(Color.blue);
            break;
            
            case 17: btn_17.setBackground(Color.blue);
            break;
            
            case 18: btn_18.setBackground(Color.blue);
            break;
            
            case 19: btn_19.setBackground(Color.blue);
            break;
            
            case 20: btn_20.setBackground(Color.blue);
            break;
            
            default : System.out.println("not in the selection list");
        }
        //end of change_colour function
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mindfusion.scheduling.model.Appointment appointment1;
    private javax.swing.JButton book;
    private javax.swing.JButton btn_10;
    private javax.swing.JButton btn_11;
    private javax.swing.JButton btn_12;
    private javax.swing.JButton btn_13;
    private javax.swing.JButton btn_14;
    private javax.swing.JButton btn_15;
    private javax.swing.JButton btn_16;
    private javax.swing.JButton btn_17;
    private javax.swing.JButton btn_18;
    private javax.swing.JButton btn_19;
    private javax.swing.JButton btn_20;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private com.toedter.calendar.JDateChooser choosen_date;
    private com.mindfusion.scheduling.model.Contact contact1;
    private com.mindfusion.scheduling.DayOfWeekStyle dayOfWeekStyle1;
    private com.mindfusion.common.Duration duration1;
    private javax.swing.JComboBox<String> hr_from;
    private javax.swing.JComboBox<String> hr_to;
    private javax.swing.JButton jButton10;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private com.mindfusion.scheduling.model.Reminder reminder1;
    private javax.swing.JLabel show_dat;
    private javax.swing.JComboBox<String> user;
    // End of variables declaration//GEN-END:variables
}
