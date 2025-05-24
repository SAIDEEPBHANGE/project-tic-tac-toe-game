import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saideep Bhange
 */
public class TIC_TAC_TOE_GAME extends javax.swing.JFrame {

    /**
     * Creates new form TIC_TAC_TOE_GAME
     */
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    private int xmoves = 2;
    private int ymoves = 3;
    public TIC_TAC_TOE_GAME() {
        initComponents();
    }
    private void scoregame(){
        playerx.setText(String.valueOf(xCount));
        playero.setText(String.valueOf(oCount));
    }
    private void choose_a_player(){
        if(xmoves<=0 && ymoves<=0){
            startGame = "";
        }
        else{
            if(startGame.equalsIgnoreCase("X")){
                startGame = "O";
                ymoves--;
            }
            else{
                startGame = "X";
                xmoves--;
            }
        }
    }
    private void wincheck(){
        String b1 = tttbtn1.getText();
        String b2 = tttbtn2.getText();
        String b3 = tttbtn3.getText();
        String b4 = tttbtn4.getText();
        String b5 = tttbtn5.getText();
        String b6 = tttbtn6.getText();
        String b7 = tttbtn7.getText();
        String b8 = tttbtn8.getText();
        String b9 = tttbtn9.getText();
        //player X
        if(b1==("X") && b2==("X") && b3==("X")){
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoregame();
            tttbtn1.setBackground(Color.YELLOW);
            tttbtn2.setBackground(Color.YELLOW);
            tttbtn3.setBackground(Color.YELLOW);
        }
        if(b4==("X") && b5==("X") && b6==("X")){
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoregame();
            tttbtn4.setBackground(Color.YELLOW);
            tttbtn5.setBackground(Color.YELLOW);
            tttbtn6.setBackground(Color.YELLOW);
        }
        if(b7==("X") && b8==("X") && b9==("X")){
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoregame();
            tttbtn7.setBackground(Color.YELLOW);
            tttbtn8.setBackground(Color.YELLOW);
            tttbtn9.setBackground(Color.YELLOW);
        }
        if(b1==("X") && b5==("X") && b9==("X")){
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoregame();
            tttbtn1.setBackground(Color.YELLOW);
            tttbtn5.setBackground(Color.YELLOW);
            tttbtn9.setBackground(Color.YELLOW);
        }
        if(b3==("X") && b5==("X") && b7==("X")){
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoregame();
            tttbtn3.setBackground(Color.YELLOW);
            tttbtn5.setBackground(Color.YELLOW);
            tttbtn7.setBackground(Color.YELLOW);
        }
        if(b1==("X") && b4==("X") && b7==("X")){
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoregame();
            tttbtn1.setBackground(Color.YELLOW);
            tttbtn4.setBackground(Color.YELLOW);
            tttbtn7.setBackground(Color.YELLOW);
        }
        if(b2==("X") && b5==("X") && b8==("X")){
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoregame();
            tttbtn2.setBackground(Color.YELLOW);
            tttbtn5.setBackground(Color.YELLOW);
            tttbtn8.setBackground(Color.YELLOW);
        }
        if(b3==("X") && b6==("X") && b9==("X")){
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoregame();
            tttbtn3.setBackground(Color.YELLOW);
            tttbtn6.setBackground(Color.YELLOW);
            tttbtn9.setBackground(Color.YELLOW);
        }
        //player O
        if(b1==("O") && b2==("O") && b3==("O")){
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoregame();
            tttbtn1.setBackground(Color.YELLOW);
            tttbtn2.setBackground(Color.YELLOW);
            tttbtn3.setBackground(Color.YELLOW);
        }
        if(b4==("O") && b5==("O") && b6==("O")){
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoregame();
            tttbtn4.setBackground(Color.YELLOW);
            tttbtn5.setBackground(Color.YELLOW);
            tttbtn6.setBackground(Color.YELLOW);
        }
        if(b7==("O") && b8==("O") && b9==("O")){
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoregame();
            tttbtn7.setBackground(Color.YELLOW);
            tttbtn8.setBackground(Color.YELLOW);
            tttbtn9.setBackground(Color.YELLOW);
        }
        if(b1==("O") && b5==("O") && b9==("O")){
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoregame();
            tttbtn1.setBackground(Color.YELLOW);
            tttbtn5.setBackground(Color.YELLOW);
            tttbtn9.setBackground(Color.YELLOW);
        }
        if(b3==("O") && b5==("O") && b7==("O")){
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoregame();
            tttbtn3.setBackground(Color.YELLOW);
            tttbtn5.setBackground(Color.YELLOW);
            tttbtn7.setBackground(Color.YELLOW);
        }
        if(b1==("O") && b4==("O") && b7==("O")){
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoregame();
            tttbtn1.setBackground(Color.YELLOW);
            tttbtn4.setBackground(Color.YELLOW);
            tttbtn7.setBackground(Color.YELLOW);
        }
        if(b2==("O") && b5==("O") && b8==("O")){
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoregame();
            tttbtn2.setBackground(Color.YELLOW);
            tttbtn5.setBackground(Color.YELLOW);
            tttbtn8.setBackground(Color.YELLOW);
        }
        if(b3==("O") && b6==("O") && b9==("O")){
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoregame();
            tttbtn3.setBackground(Color.YELLOW);
            tttbtn6.setBackground(Color.YELLOW);
            tttbtn9.setBackground(Color.YELLOW);
        }
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
        jLabel1 = new javax.swing.JLabel();
        tttbtn1 = new javax.swing.JButton();
        tttbtn3 = new javax.swing.JButton();
        tttbtn2 = new javax.swing.JButton();
        tttbtn4 = new javax.swing.JButton();
        tttbtn6 = new javax.swing.JButton();
        tttbtn5 = new javax.swing.JButton();
        tttbtn7 = new javax.swing.JButton();
        tttbtn9 = new javax.swing.JButton();
        tttbtn8 = new javax.swing.JButton();
        tttbtnreset = new javax.swing.JButton();
        tttbtnexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playero_2 = new javax.swing.JLabel();
        playerx_1 = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE GAME");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(jLabel1)
                .addContainerGap(386, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        tttbtn1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tttbtn1.setMaximumSize(new java.awt.Dimension(150, 150));
        tttbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tttbtn1ActionPerformed(evt);
            }
        });

        tttbtn3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tttbtn3.setMaximumSize(new java.awt.Dimension(150, 150));
        tttbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tttbtn3ActionPerformed(evt);
            }
        });

        tttbtn2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tttbtn2.setMaximumSize(new java.awt.Dimension(150, 150));
        tttbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tttbtn2ActionPerformed(evt);
            }
        });

        tttbtn4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tttbtn4.setMaximumSize(new java.awt.Dimension(150, 150));
        tttbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tttbtn4ActionPerformed(evt);
            }
        });

        tttbtn6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tttbtn6.setMaximumSize(new java.awt.Dimension(150, 150));
        tttbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tttbtn6ActionPerformed(evt);
            }
        });

        tttbtn5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tttbtn5.setMaximumSize(new java.awt.Dimension(150, 150));
        tttbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tttbtn5ActionPerformed(evt);
            }
        });

        tttbtn7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tttbtn7.setMaximumSize(new java.awt.Dimension(150, 150));
        tttbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tttbtn7ActionPerformed(evt);
            }
        });

        tttbtn9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tttbtn9.setMaximumSize(new java.awt.Dimension(150, 150));
        tttbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tttbtn9ActionPerformed(evt);
            }
        });

        tttbtn8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tttbtn8.setMaximumSize(new java.awt.Dimension(150, 150));
        tttbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tttbtn8ActionPerformed(evt);
            }
        });

        tttbtnreset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tttbtnreset.setText("RESET");
        tttbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tttbtnresetActionPerformed(evt);
            }
        });

        tttbtnexit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tttbtnexit.setText("EXIT");
        tttbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tttbtnexitActionPerformed(evt);
            }
        });

        playero_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        playero_2.setText("PLAYER O:");

        playerx_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        playerx_1.setText("PLAYER X:");

        playerx.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        playerx.setText("0");

        playero.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        playero.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(playerx_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(playero_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerx_1)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playero_2)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tttbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tttbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tttbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tttbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tttbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tttbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tttbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tttbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tttbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tttbtnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(tttbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tttbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tttbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tttbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tttbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tttbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tttbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tttbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tttbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tttbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tttbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tttbtnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 89, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tttbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tttbtn1ActionPerformed
        if(tttbtn1.getText().isEmpty() && !startGame.isEmpty()){
            tttbtn1.setText(startGame);
            if(startGame.equalsIgnoreCase("X")){
                tttbtn1.setForeground(Color.RED);
            }
            else{
                tttbtn1.setForeground(Color.MAGENTA);
            }
            choose_a_player();
            wincheck();
            
        }
        else{
            startGame = tttbtn1.getText();
            tttbtn1.setText("");
        }
    }//GEN-LAST:event_tttbtn1ActionPerformed

    private void tttbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tttbtn3ActionPerformed
        // TODO add your handling code here:
        if(tttbtn3.getText().isEmpty() && !startGame.isEmpty()){
            tttbtn3.setText(startGame);
            if(startGame.equalsIgnoreCase("X")){
                tttbtn3.setForeground(Color.RED);
            }
            else{
                tttbtn3.setForeground(Color.MAGENTA);
            }
            choose_a_player();
            wincheck();
        }
        else{
            startGame = tttbtn3.getText();
            tttbtn3.setText("");
        }
    }//GEN-LAST:event_tttbtn3ActionPerformed

    private void tttbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tttbtn2ActionPerformed
        // TODO add your handling code here:
        if(tttbtn2.getText().isEmpty() && !startGame.isEmpty()){
            tttbtn2.setText(startGame);
            if(startGame.equalsIgnoreCase("X")){
                tttbtn2.setForeground(Color.RED);
            }
            else{
                tttbtn2.setForeground(Color.MAGENTA);
            }
            choose_a_player();
            wincheck();
        }
        else{
            startGame = tttbtn2.getText();
            tttbtn2.setText("");
        }
    }//GEN-LAST:event_tttbtn2ActionPerformed

    private void tttbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tttbtn4ActionPerformed
        // TODO add your handling code here:
        if(tttbtn4.getText().isEmpty() && !startGame.isEmpty()){
            tttbtn4.setText(startGame);
            if(startGame.equalsIgnoreCase("X")){
                tttbtn4.setForeground(Color.RED);
            }
            else{
                tttbtn4.setForeground(Color.MAGENTA);
            }
            choose_a_player();
            wincheck();
        }
        else{
            startGame = tttbtn4.getText();
            tttbtn4.setText("");
        }
    }//GEN-LAST:event_tttbtn4ActionPerformed

    private void tttbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tttbtn6ActionPerformed
        // TODO add your handling code here:
        if(tttbtn6.getText().isEmpty() && !startGame.isEmpty()){
            tttbtn6.setText(startGame);
            if(startGame.equalsIgnoreCase("X")){
                tttbtn6.setForeground(Color.RED);
            }
            else{
                tttbtn6.setForeground(Color.MAGENTA);
            }
            choose_a_player();
            wincheck();
        }
        else{
            startGame = tttbtn6.getText();
            tttbtn6.setText("");
        }
    }//GEN-LAST:event_tttbtn6ActionPerformed

    private void tttbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tttbtn5ActionPerformed
        // TODO add your handling code here:
        if(tttbtn5.getText().isEmpty() && !startGame.isEmpty()){
            tttbtn5.setText(startGame);
            if(startGame.equalsIgnoreCase("X")){
                tttbtn5.setForeground(Color.RED);
            }
            else{
                tttbtn5.setForeground(Color.MAGENTA);
            }
            choose_a_player();
            wincheck();
        }
        else{
            startGame = tttbtn5.getText();
            tttbtn5.setText("");
        }
    }//GEN-LAST:event_tttbtn5ActionPerformed

    private void tttbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tttbtn7ActionPerformed
        // TODO add your handling code here:
        if(tttbtn7.getText().isEmpty() && !startGame.isEmpty()){
            tttbtn7.setText(startGame);
            if(startGame.equalsIgnoreCase("X")){
                tttbtn7.setForeground(Color.RED);
            }
            else{
                tttbtn7.setForeground(Color.MAGENTA);
            }
            choose_a_player();
            wincheck();
        }
        else{
            startGame = tttbtn7.getText();
            tttbtn7.setText("");
        }
    }//GEN-LAST:event_tttbtn7ActionPerformed

    private void tttbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tttbtn9ActionPerformed
        // TODO add your handling code here:
        if(tttbtn9.getText().isEmpty() && !startGame.isEmpty()){
            tttbtn9.setText(startGame);
            if(startGame.equalsIgnoreCase("X")){
                tttbtn9.setForeground(Color.RED);
            }
            else{
                tttbtn9.setForeground(Color.MAGENTA);
            }
            choose_a_player();
            wincheck();
        }
        else{
            startGame = tttbtn9.getText();
            tttbtn9.setText("");
        }
    }//GEN-LAST:event_tttbtn9ActionPerformed

    private void tttbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tttbtn8ActionPerformed
        // TODO add your handling code here:
        if(tttbtn8.getText().isEmpty() && !startGame.isEmpty()){
            tttbtn8.setText(startGame);
            if(startGame.equalsIgnoreCase("X")){
                tttbtn8.setForeground(Color.RED);
            }
            else{
                tttbtn8.setForeground(Color.MAGENTA);
            }
            choose_a_player();
            wincheck(); 
        }
        else{
            startGame = tttbtn8.getText();
            tttbtn8.setText("");
        }
    }//GEN-LAST:event_tttbtn8ActionPerformed

    private void tttbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tttbtnexitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("exit");
        if(JOptionPane.showConfirmDialog(frame,"do you want to exit?","tic tac toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_tttbtnexitActionPerformed

    private void tttbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tttbtnresetActionPerformed
        // TODO add your handling code here:
        tttbtn1.setText("");
        tttbtn2.setText("");
        tttbtn3.setText("");
        tttbtn4.setText("");
        tttbtn5.setText("");
        tttbtn6.setText("");
        tttbtn7.setText("");
        tttbtn8.setText("");
        tttbtn9.setText("");
        tttbtn1.setBackground(Color.LIGHT_GRAY);
        tttbtn2.setBackground(Color.LIGHT_GRAY);
        tttbtn3.setBackground(Color.LIGHT_GRAY);
        tttbtn4.setBackground(Color.LIGHT_GRAY);
        tttbtn5.setBackground(Color.LIGHT_GRAY);
        tttbtn6.setBackground(Color.LIGHT_GRAY);
        tttbtn7.setBackground(Color.LIGHT_GRAY);
        tttbtn8.setBackground(Color.LIGHT_GRAY);
        tttbtn9.setBackground(Color.LIGHT_GRAY);
        startGame = "X";
        xmoves=2;
        ymoves=3;
    }//GEN-LAST:event_tttbtnresetActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_GAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playero_2;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerx_1;
    private javax.swing.JButton tttbtn1;
    private javax.swing.JButton tttbtn2;
    private javax.swing.JButton tttbtn3;
    private javax.swing.JButton tttbtn4;
    private javax.swing.JButton tttbtn5;
    private javax.swing.JButton tttbtn6;
    private javax.swing.JButton tttbtn7;
    private javax.swing.JButton tttbtn8;
    private javax.swing.JButton tttbtn9;
    private javax.swing.JButton tttbtnexit;
    private javax.swing.JButton tttbtnreset;
    // End of variables declaration//GEN-END:variables
}
