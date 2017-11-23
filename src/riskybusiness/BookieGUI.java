/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskybusiness;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author robertbrown
 */
public class BookieGUI extends javax.swing.JFrame {

    /**
     * Creates new form BookieGUI
     */
    
    Fixture fixture;
    ArrayList<Fixture> fList;
    
    public BookieGUI() {
        initComponents();
        teamNameTF.setEditable(false);
        horseNameTF.setEditable(false);
        oddsTF.setEditable(false);
        fList = new ArrayList<>();
        readFile();
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
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sportCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        teamLb = new javax.swing.JLabel();
        teamNameTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        oddsTF = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        horseLb = new javax.swing.JLabel();
        horseNameTF = new javax.swing.JTextField();
        homeBtn = new javax.swing.JButton();
        fixturesComboBox = new javax.swing.JComboBox<>();
        deleteBtn = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextField1.setText("Select a Sport");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList2);

        jScrollPane5.setViewportView(jTextPane2);

        jTextField2.setText("jTextField2");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Administrative Panel");

        sportCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Sport", "Football", "Horse Racing" }));
        sportCB.addActionListener(new Fixture.awt.event.ActionListener() {
            public void actionPerformed(Fixture.awt.event.ActionEvent evt) {
                sportCBActionPerformed(evt);
            }
        });

        jLabel3.setText("Select a Sport:");

        teamLb.setText("Team Name:");

        jLabel5.setText("Odds:");

        addBtn.setText("Add to System");
        addBtn.addActionListener(new Fixture.awt.event.ActionListener() {
            public void actionPerformed(Fixture.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        viewBtn.setText("View System");
        viewBtn.addActionListener(new Fixture.awt.event.ActionListener() {
            public void actionPerformed(Fixture.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        horseLb.setText("Horse Name:");

        homeBtn.setText("Home");
        homeBtn.addActionListener(new Fixture.awt.event.ActionListener() {
            public void actionPerformed(Fixture.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Remove Fixture");
        deleteBtn.addActionListener(new Fixture.awt.event.ActionListener() {
            public void actionPerformed(Fixture.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oddsTF, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(horseLb)
                                    .addComponent(teamLb))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sportCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(teamNameTF)
                                    .addComponent(horseNameTF))))))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(92, 92, 92))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(homeBtn)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fixturesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 286, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBtn)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sportCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamLb)
                    .addComponent(teamNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horseLb)
                    .addComponent(horseNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oddsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(14, 14, 14)
                .addComponent(addBtn)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBtn)
                    .addComponent(deleteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fixturesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(homeBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sportCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportCBActionPerformed

        if(sportCB.getSelectedItem().equals("Choose Sport")){
            teamNameTF.setEditable(false);
            horseNameTF.setEditable(false);
            oddsTF.setEditable(false);
            
            teamNameTF.setVisible(true);
            teamLb.setVisible(true);
            horseNameTF.setVisible(true);
            horseLb.setVisible(true);
        } else if(sportCB.getSelectedItem().equals("Football")){
            teamNameTF.setEditable(true);
            oddsTF.setEditable(true);
            horseNameTF.setEditable(false);
            
            teamNameTF.setVisible(true);
            teamLb.setVisible(true);
            horseNameTF.setVisible(false);
            horseLb.setVisible(false);
        } else if(sportCB.getSelectedItem().equals("Horse Racing")){
            teamNameTF.setEditable(false);
            oddsTF.setEditable(true);
            horseNameTF.setEditable(true);
            
            horseNameTF.setVisible(true);
            horseLb.setVisible(true);
            teamNameTF.setVisible(false);
            teamLb.setVisible(false);
        }
    }//GEN-LAST:event_sportCBActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new appGUI().setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if(sportCB.getSelectedItem().equals("Football")){
            if(teamNameTF.getText().equals("") || oddsTF.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Team name and odds are required");
            } else {
                fixture = new FootballFixture();
                String teamName = teamNameTF.getText();
                double odds = Double.parseDouble(oddsTF.getText());

                ((FootballFixture)fixture).setTeamName(teamName);
                fixture.setOdds(odds);
                
                fList.add(fixture);
                writeFile(fList);
                teamNameTF.setText("");
                oddsTF.setText("");
            }
        } else if(sportCB.getSelectedItem().equals("Horse Racing")){
            if(horseNameTF.getText().equals("") || oddsTF.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Horse name and odds are required");
            } else {
                fixture = new HorseRacingFixture();
                String horseName = horseNameTF.getText();
                double odds = Double.parseDouble(oddsTF.getText());

                ((HorseRacingFixture)fixture).setHorseName(horseName);
                fixture.setOdds(odds);
                
                fList.add(fixture);
                writeFile(fList);
                oddsTF.setText("");
                horseNameTF.setText("");
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed
    
    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        fixturesComboBox.removeAllItems();
        for(Fixture f : fList){
            if(f instanceof FootballFixture){
                fixturesComboBox.addItem("Football - " + "Team: " + ((FootballFixture) f).getTeamName() + " - odds: " + f.getOdds());
            } else if(f instanceof HorseRacingFixture){
                fixturesComboBox.addItem("Horse racing - " + " Horse: " + ((HorseRacingFixture) f).getHorseName() + " - odds: " + f.getOdds() );
            }
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        fList.remove(fixturesComboBox.getSelectedIndex());
        writeFile(fList);
        viewBtnActionPerformed(evt);
    }//GEN-LAST:event_deleteBtnActionPerformed

    public void writeFile(ArrayList list){
        File f;
        FileOutputStream fout;
        ObjectOutputStream out;
        try {
            f = new File("fixtures.dat");
            fout = new FileOutputStream(f);
            out = new ObjectOutputStream(fout);
            out.writeObject(list);
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void readFile(){
        fList.clear();
        File f;
        FileInputStream fin;
        ObjectInputStream oin;
        try {
            f = new File("fixtures.dat");
            fin = new FileInputStream(f);
            oin = new ObjectInputStream(fin);
            fList = (ArrayList<Fixture>)oin.readObject();
            oin.close();
        } catch (Exception e) {
            System.out.println(e);
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
            Fixture.util.logging.Logger.getLogger(BookieGUI.class.getName()).log(Fixture.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Fixture.util.logging.Logger.getLogger(BookieGUI.class.getName()).log(Fixture.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Fixture.util.logging.Logger.getLogger(BookieGUI.class.getName()).log(Fixture.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Fixture.util.logging.Logger.getLogger(BookieGUI.class.getName()).log(Fixture.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Fixture.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookieGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> fixturesComboBox;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel horseLb;
    private javax.swing.JTextField horseNameTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextField oddsTF;
    private javax.swing.JComboBox<String> sportCB;
    private javax.swing.JLabel teamLb;
    private javax.swing.JTextField teamNameTF;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
