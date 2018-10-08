
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
public class Medical_condition extends javax.swing.JFrame {

    
    private static String heart_condition;
    private static String epilepsy;
    private static String allergies;
    private static String dental_sedation;
    private static String bleeding_disorder;
    private static String teeth_sensitive;
    private static String medication;
    private static String sores_in_mouth;
    private static String toung_diagnosis;
    private static String hiv_aids;
    private static String medical_aid_name;
    private static int medical_aid_number;
    private static String fam_dr_name;
    private static String fam_dr_contact;
    
    /**
     * Creates new form Medical_condition
     */
    public Medical_condition() {
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

        jPanel1 = new javax.swing.JPanel();
        txt_heart_cond = new javax.swing.JTextField();
        lbl_heart_condition = new javax.swing.JLabel();
        lbl_epilepsy = new javax.swing.JLabel();
        lbl_allergy = new javax.swing.JLabel();
        txt_epilepsy = new javax.swing.JTextField();
        txt_allergies = new javax.swing.JTextField();
        txt_dental_sedation = new javax.swing.JTextField();
        txt_bleeding_dis = new javax.swing.JTextField();
        lbl_title = new javax.swing.JLabel();
        lbl_dental_sadation = new javax.swing.JLabel();
        lbl_bleeding_disorder = new javax.swing.JLabel();
        lbl_bleeding_disorder1 = new javax.swing.JLabel();
        lbl_bleeding_disorder2 = new javax.swing.JLabel();
        txt_teeth_sensitivity = new javax.swing.JTextField();
        txtf_medication = new javax.swing.JTextField();
        Cancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_mouth_sores = new javax.swing.JTextField();
        txtf_med_aid_number = new javax.swing.JTextField();
        txt_hiv = new javax.swing.JTextField();
        txt_med_aid_name = new javax.swing.JTextField();
        txtf_tongue_diagn = new javax.swing.JTextField();
        txt_fam_dr_name = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        txtfamily_doct_numb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(115, 101, 152));

        lbl_heart_condition.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbl_heart_condition.setForeground(java.awt.Color.white);
        lbl_heart_condition.setText("Heart Condition");
        lbl_heart_condition.setFocusable(false);

        lbl_epilepsy.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbl_epilepsy.setForeground(java.awt.Color.white);
        lbl_epilepsy.setText("Epilepsy");
        lbl_epilepsy.setFocusable(false);

        lbl_allergy.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbl_allergy.setForeground(java.awt.Color.white);
        lbl_allergy.setText("Allergies");
        lbl_allergy.setFocusable(false);

        lbl_title.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lbl_title.setForeground(java.awt.Color.white);
        lbl_title.setText("Patient Medical Details");
        lbl_title.setFocusable(false);

        lbl_dental_sadation.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbl_dental_sadation.setForeground(java.awt.Color.white);
        lbl_dental_sadation.setText("Dental Sedation");
        lbl_dental_sadation.setFocusable(false);

        lbl_bleeding_disorder.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbl_bleeding_disorder.setForeground(java.awt.Color.white);
        lbl_bleeding_disorder.setText("Bleeding Disorder");
        lbl_bleeding_disorder.setFocusable(false);

        lbl_bleeding_disorder1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbl_bleeding_disorder1.setForeground(java.awt.Color.white);
        lbl_bleeding_disorder1.setText("Teeth Sensativity");
        lbl_bleeding_disorder1.setFocusable(false);

        lbl_bleeding_disorder2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbl_bleeding_disorder2.setForeground(java.awt.Color.white);
        lbl_bleeding_disorder2.setText("Medication");
        lbl_bleeding_disorder2.setFocusable(false);

        Cancel.setBackground(java.awt.Color.red);
        Cancel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        Cancel.setForeground(java.awt.Color.white);
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Family Doctor Contact");
        jLabel7.setFocusable(false);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Family Doctor Name");
        jLabel6.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Medical Aid Number");
        jLabel5.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Medical Aid Name");
        jLabel4.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("H.I.V/Aids");
        jLabel3.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Tongue Diagnosis");
        jLabel2.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Sores In Mouth");
        jLabel1.setFocusable(false);

        btn_save.setBackground(java.awt.Color.blue);
        btn_save.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_save.setForeground(java.awt.Color.white);
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_bleeding_disorder2)
                        .addGap(71, 71, 71)
                        .addComponent(txtf_medication, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_dental_sadation)
                            .addComponent(lbl_allergy)
                            .addComponent(lbl_epilepsy)
                            .addComponent(lbl_heart_condition)
                            .addComponent(lbl_bleeding_disorder)
                            .addComponent(lbl_bleeding_disorder1))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_epilepsy, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_heart_cond, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(txt_mouth_sores, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_bleeding_dis, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(txt_dental_sedation)
                                    .addComponent(txt_allergies)
                                    .addComponent(txt_teeth_sensitivity))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtf_med_aid_number)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txt_med_aid_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                                    .addComponent(txt_hiv, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtf_tongue_diagn, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_fam_dr_name))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtfamily_doct_numb, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_title)
                                .addGap(236, 236, 236)))
                        .addGap(77, 77, 77))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(459, Short.MAX_VALUE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(334, 334, 334)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lbl_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_mouth_sores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtf_med_aid_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtf_tongue_diagn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_hiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_med_aid_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_heart_cond, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_heart_condition))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_epilepsy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_epilepsy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_allergies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_allergy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_dental_sedation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_dental_sadation))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_bleeding_dis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_bleeding_disorder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_teeth_sensitivity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_bleeding_disorder1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtf_medication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_bleeding_disorder2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fam_dr_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtfamily_doct_numb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(Cancel)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(362, Short.MAX_VALUE)
                    .addComponent(btn_save)
                    .addGap(11, 11, 11)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(919, 432));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CancelActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        heart_condition = txt_heart_cond.getText();
        epilepsy = txt_epilepsy.getText();
        allergies = txt_allergies.getText();
        dental_sedation = txt_dental_sedation.getText();
        bleeding_disorder = txt_bleeding_dis.getText();
        teeth_sensitive = txt_teeth_sensitivity.getText();
        medication = txtf_medication.getText();
        sores_in_mouth =  txt_mouth_sores.getText();
        toung_diagnosis = txtf_tongue_diagn.getText();
        hiv_aids = txt_hiv.getText();
        medical_aid_name = txt_med_aid_name.getText();
        if(txtf_med_aid_number.getText().length()==0)return;
        medical_aid_number = Integer.parseInt(txtf_med_aid_number.getText());
        fam_dr_name = txt_fam_dr_name.getText();
        fam_dr_contact = txtfamily_doct_numb.getText();
        
        
        
       medical_condition();
    }//GEN-LAST:event_btn_saveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        
       // 
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
            java.util.logging.Logger.getLogger(Medical_condition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medical_condition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medical_condition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medical_condition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medical_condition().setVisible(true);
            }
        });
    }

    
    public void medical_condition()
    {
        
        PreparedStatement ps;
        String insert_query =
                "INSERT INTO `MEDICAL_CONDTION`(`HEART_CONDITION`, `EPILEPSY`, `ALLERGIES`, "
                + "`DENTAL_SEDATION`, `BLEEDING_DISORDER`, `TEETH_SENSITIVE`, `MEDICATION`, "
                + "`SORES_IN_MOUTH`, `TOUNGE_DIAGNOSIS`, `HIV_AIDS`, `MEDICAL_AID_NAME`, `MEDICAL_AID_NUMBER`, "
                + "`FAMILY_DR_NAME`, `FAMILY_DR_CONTACT`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
   
        try{
            
            ps = Connect2database.getConnection().prepareStatement(insert_query);
            System.out.println("hello.....");
            ps.setString(1, heart_condition);
            ps.setString(2, epilepsy);
            ps.setString(3, allergies);
            ps.setString(4, dental_sedation);
            ps.setString(5, bleeding_disorder);
            ps.setString(6, teeth_sensitive);
            ps.setString(7, medication);
            ps.setString(8, sores_in_mouth);
            ps.setString(9,toung_diagnosis);
            ps.setString(10, hiv_aids);
            ps.setString(11, medical_aid_name);
            ps.setInt(12, medical_aid_number);
            ps.setString(13, fam_dr_name);
            ps.setString(14, fam_dr_contact);
            
            
            
            if(ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null, "data captured successfully");
                       new PatientHomeScreen("").setVisible(true);
                      this.setVisible(false);
            }
            
            
        }catch(SQLException sq)
        {
            sq.getSQLState();
        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_allergy;
    private javax.swing.JLabel lbl_bleeding_disorder;
    private javax.swing.JLabel lbl_bleeding_disorder1;
    private javax.swing.JLabel lbl_bleeding_disorder2;
    private javax.swing.JLabel lbl_dental_sadation;
    private javax.swing.JLabel lbl_epilepsy;
    private javax.swing.JLabel lbl_heart_condition;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextField txt_allergies;
    private javax.swing.JTextField txt_bleeding_dis;
    private javax.swing.JTextField txt_dental_sedation;
    private javax.swing.JTextField txt_epilepsy;
    private javax.swing.JTextField txt_fam_dr_name;
    private javax.swing.JTextField txt_heart_cond;
    private javax.swing.JTextField txt_hiv;
    private javax.swing.JTextField txt_med_aid_name;
    private javax.swing.JTextField txt_mouth_sores;
    private javax.swing.JTextField txt_teeth_sensitivity;
    private javax.swing.JTextField txtf_med_aid_number;
    private javax.swing.JTextField txtf_medication;
    private javax.swing.JTextField txtf_tongue_diagn;
    private javax.swing.JTextField txtfamily_doct_numb;
    // End of variables declaration//GEN-END:variables
}
