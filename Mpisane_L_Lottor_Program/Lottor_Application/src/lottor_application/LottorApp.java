/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottor_application;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author SONY
 */
public class LottorApp extends javax.swing.JFrame {
 
    /**
     * Creates new form LottorApp
     */
    public LottorApp() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDisplayArea = new javax.swing.JTextArea();
        btnGenerate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jLottor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Lottor Generator");

        txtDisplayArea.setColumns(20);
        txtDisplayArea.setRows(5);
        jScrollPane1.setViewportView(txtDisplayArea);

        btnGenerate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerate.setText("Generate");
        btnGenerate.setToolTipText("click to view the randomly generated numbers");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setToolTipText("clear text area box");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Tattslotto-balls.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jMenu1.setText("Menu");

        jExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jMenu1.add(jExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jLottor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jLottor.setText("About App");
        jLottor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLottorActionPerformed(evt);
            }
        });
        jMenu2.add(jLottor);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void createTable() throws Exception
    {
         try
         {
            Connection con = getConnection();
            PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS lotto_T(LottoNumbers varchar(1000))");
            create.executeUpdate();
         }
         catch (Exception e)
         {
             JOptionPane.showMessageDialog(null, e.toString());
         }         
    }
    public static Connection getConnection()throws Exception
    {
           try 
           { 
             String driver = "com.mysql.jdbc.Driver";
             String url = "jdbc:derby://localhost:1527/lottor_DB";
             String username = "adminz";
             String password ="";   
             Class.forName(driver);
             Connection con = DriverManager.getConnection(url,username,password);
             
           } 
           catch (ClassNotFoundException e)
           {
               JOptionPane.showMessageDialog(null, e.toString());
           } 
           return null;
    }
    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
         
        int[] lotteryGenerator = new int[50];
        Random rgen = new Random();

        //Creating an Array of 50 Integers 
        for (int i=0; i < lotteryGenerator.length; i++) 
        {   
            lotteryGenerator[i] = i + 1;
        }
        // Shuffling the numbers in the array
        for (int i=0; i < lotteryGenerator.length; i++) 
        {
            int randomPosition = rgen.nextInt(lotteryGenerator.length);
            int temp = lotteryGenerator[i];
            lotteryGenerator[i] = lotteryGenerator[randomPosition];
            lotteryGenerator[randomPosition] = temp;
        }    
        // Printing the numbers out
        for (int i = 0; i < 6; i++)
        {
            txtDisplayArea.append(" " + lotteryGenerator[i]);
        }
        try
        {
            createTable();
            Connection con = getConnection();
            PreparedStatement posted = con.prepareStatement("INSERT INTO lottorT(LottoNumbers) VALUES('"+txtDisplayArea.getText()+"')");
            posted.executeQuery();
        }   
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        } 
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //clearing output fields
        txtDisplayArea.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
      System.exit(0);
        
    }//GEN-LAST:event_jExitActionPerformed

    private void jLottorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLottorActionPerformed
       JOptionPane.showMessageDialog(null, "Click the Generate button to display/show randomly\n"
               + "Generated numbers in the text area box/field.\n"
               + "Click button clear to clear/erase data on the text area box/field.\n");
    }//GEN-LAST:event_jLottorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        LottorApp lottor =  new LottorApp();
        lottor.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JMenuItem jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jLottor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDisplayArea;
    // End of variables declaration//GEN-END:variables
}
