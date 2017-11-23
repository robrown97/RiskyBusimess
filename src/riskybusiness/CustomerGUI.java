/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskybusiness;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author robertbrown
 */

public class CustomerGUI extends javax.swing.JFrame {
    
    private SuperClass s;//creating instance of the SuperClass
    private ArrayList <SuperClass> customerBet; 
    private ArrayList <Fixture> fList;//creating a arrayList called CustomerBet
    /*
     * Creates new form EmployeeGUI
     */
    public CustomerGUI() {
        initComponents();
        customerBet = new ArrayList <>(); //creating instance of ArrayList
        fList = new ArrayList <>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        oddsTP = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sportCB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        teamLb = new javax.swing.JLabel();
        horseLb = new javax.swing.JLabel();
        teamNameTF = new javax.swing.JTextField();
        horseNameTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        betAmountTF = new javax.swing.JTextField();
        placeBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        doubleDownCheckBox = new javax.swing.JCheckBox();
        viewBtn = new javax.swing.JButton();
        viewTeamBtn = new javax.swing.JButton();
        viewHorseBtn = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("jButton1");

        jLabel7.setText("Our Odds:");

        jScrollPane3.setViewportView(oddsTP);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Welcome to the Risky Business Betting App");

        jLabel2.setText("Please Enter the following:");

        sportCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sportCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportCBActionPerformed(evt);
            }
        });

        jLabel3.setText("Sport");

        teamLb.setText("Team Name:");

        horseLb.setText("Horse Name:");

        jLabel6.setText("Bet (€)");

        placeBtn.setText("Place Bet");
        placeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        doubleDownCheckBox.setText("Double Down");

        viewBtn.setText("View Verdict");

        viewTeamBtn.setText("View Teams");
        viewTeamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTeamBtnActionPerformed(evt);
            }
        });

        viewHorseBtn.setText("View Horses");
        viewHorseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHorseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(resetBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sportCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(betAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(doubleDownCheckBox))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(teamLb)
                                    .addGap(21, 21, 21)
                                    .addComponent(teamNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(viewTeamBtn))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(horseLb)
                                    .addGap(18, 18, 18)
                                    .addComponent(horseNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(viewHorseBtn))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sportCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamLb)
                    .addComponent(teamNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewTeamBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horseLb)
                    .addComponent(horseNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewHorseBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(betAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(doubleDownCheckBox))
                .addGap(12, 12, 12)
                .addComponent(placeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeBtn)
                    .addComponent(resetBtn))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sportCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportCBActionPerformed
    if(sportCB.getSelectedItem().equals("Choose Sport")){
            teamNameTF.setEditable(false);
            horseNameTF.setEditable(false);
                teamNameTF.setVisible(true);
                teamLb.setVisible(true);
                horseNameTF.setVisible(true);
                horseLb.setVisible(true);
        } else if(sportCB.getSelectedItem().equals("Football")){
            teamNameTF.setEditable(true);
            horseNameTF.setEditable(false);
                teamNameTF.setVisible(true);
                teamLb.setVisible(true);
                horseNameTF.setVisible(false);
                horseLb.setVisible(false);
        } else if(sportCB.getSelectedItem().equals("Horse Racing")){
            teamNameTF.setEditable(false);
            horseNameTF.setEditable(true);
                horseNameTF.setVisible(true);
                horseLb.setVisible(true);
                teamNameTF.setVisible(false);
                teamLb.setVisible(false);
        }
    }//GEN-LAST:event_sportCBActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        //clear text entered
        teamNameTF.setText(" ");
        horseNameTF.setText(" ");
        betAmountTF.setText(" ");
        //make all input options available again
        teamLb.setVisible(true);
        horseLb.setVisible(true);
        teamNameTF.setVisible(true);
        horseNameTF.setVisible(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        //hide this GUI and open home gui again
        this.setVisible(false);
        new appGUI().setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void placeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeBtnActionPerformed
        
        if(s instanceof Bet){
            if(sportCB.getSelectedItem().equals("Football")){// user wants to bet on football
                if(teamNameTF.getText().equals("") ||teamNameTF.getText().equals(" ")){//ensuring fields are filled out
                    JOptionPane.showMessageDialog(null,"Please fill out the required sections.");//error popup
                }else{
                    //retrieving the values inputted into the customer App
                    ((Bet)s).setTeamName(teamNameTF.getText());
                    ((Bet)s).setBet(Double.parseDouble(betAmountTF.getText()));
                }
            }     
        
            else if(sportCB.getSelectedItem().equals("Horse Racing")){
                if(horseNameTF.getText().equals("") ||horseNameTF.getText().equals(" ")){
                    JOptionPane.showMessageDialog(null,"Please fill out the required sections.");//error popup
                }else{
                    //retrieving the values inputted into the customer App
                    ((Bet)s).setHorseName(horseNameTF.getText());
                    ((Bet)s).setBet(Double.parseDouble(betAmountTF.getText()));
                }
            }

        }//instanceof bracket
        
        customerBet.add(s);//add to the array list
        writeToFile();//write method created below
        
        JOptionPane.showMessageDialog(null,"You Bet has been placed, Good Luck!");
    }//GEN-LAST:event_placeBtnActionPerformed

    private void viewHorseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHorseBtnActionPerformed
        readFromBookieFile();
        for (Fixture i : fList){
            JOptionPane.showMessageDialong(null,"Horse Name: "+getName(i)+"\n"+"Odds: "+getOdds(i)+"\n");
        }
    }//GEN-LAST:event_viewHorseBtnActionPerformed

    private void viewTeamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTeamBtnActionPerformed
        readFromBookieFile();
        for (Fixture i : fList){
            JOptionPane.showMessageDialong(null,"Team Name: "+getName(i)+"\n"+"Odds: "+getOdds(i)+"\n");
        }
    }//GEN-LAST:event_viewTeamBtnActionPerformed

    
    //write method
    public void writeToFile(){//write the customers bet 
        try{
        File f = new File("betHistory.dat");//creating file called betHistory to store customer arrayList
        FileOutputStream fStream = new FileOutputStream(f);//calling output stream and inserting the file into
        ObjectOutputStream oStream = new ObjectOutputStream(fStream);
        
        oStream.writeObject(customerBet);//insert customerBet into objStream and Write it to the file "betHistory.dat"
        oStream.close();//cloing the object stream
        }catch(IOException ex){//if any IO errors catch them
            JOptionPane.showMessageDialog(null, ex);//print them in Joption PopUp
        }
    }
    
    public void readFromFile(){//read method
        try{
        File f = new File("betHistory.dat"); 
        FileInputStream fStream = new FileInputStream(f);
        ObjectInputStream oStream = new ObjectInputStream(fStream);
        
        customerBet = (ArrayList <SuperClass>) oStream.readObject();//reading the arrayList fList
        oStream.close();//closing the object stream
        }catch(IOException | ClassNotFoundException ex){//multi catch for any IO errors
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void readFromBookieFile(){
        try{
        File f = new File("fixtures.dat"); 
        FileInputStream fStream = new FileInputStream(f);
        ObjectInputStream oStream = new ObjectInputStream(fStream);
        
        fList = (ArrayList <Fixture>) oStream.readObject();//reading the arrayList fList
        oStream.close();//closing the object stream
        }catch(IOException | ClassNotFoundException ex){//multi catch for any IO errors
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
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
            Fixture.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(Fixture.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Fixture.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(Fixture.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Fixture.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(Fixture.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Fixture.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(Fixture.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        Fixture.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField betAmountTF;
    private javax.swing.JCheckBox doubleDownCheckBox;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel horseLb;
    private javax.swing.JTextField horseNameTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane oddsTP;
    private javax.swing.JButton placeBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JComboBox<String> sportCB;
    private javax.swing.JLabel teamLb;
    private javax.swing.JTextField teamNameTF;
    private javax.swing.JButton viewBtn;
    private javax.swing.JButton viewHorseBtn;
    private javax.swing.JButton viewTeamBtn;
    // End of variables declaration//GEN-END:variables
}
