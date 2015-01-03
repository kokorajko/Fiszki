/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 *
 * @author Michu
 */
public class FiszkiGUI extends javax.swing.JFrame {

    /**
     * Creates new form FiszkiGUI
     */
    public FiszkiGUI() {
        initComponents();
    }

    FiszkiWork work = new FiszkiWork();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        buttonNext = new javax.swing.JButton();
        buttonAnswer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        answerArea = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menu2 = new javax.swing.JMenu();
        menuNauka = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuTworzenie = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fiszki");

        jLabel1.setText("Pytanie:");

        jLabel2.setText("Odpowiedź:");

        buttonSave.setText("Zapisz");
        buttonSave.setEnabled(false);
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonNext.setText("Następny");
        buttonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNextActionPerformed(evt);
            }
        });

        buttonAnswer.setText("Pokaż odpowiedź");
        buttonAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnswerActionPerformed(evt);
            }
        });

        questionArea.setColumns(20);
        questionArea.setLineWrap(true);
        questionArea.setRows(5);
        jScrollPane1.setViewportView(questionArea);

        answerArea.setColumns(20);
        answerArea.setLineWrap(true);
        answerArea.setRows(5);
        jScrollPane2.setViewportView(answerArea);

        menu1.setMnemonic('o');
        menu1.setText("Opcje");

        menu2.setText("Tryb programu");

        menuNauka.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuNauka.setText("Nauka");
        menuNauka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNaukaActionPerformed(evt);
            }
        });
        menu2.add(menuNauka);
        menu2.add(jSeparator1);

        menuTworzenie.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        menuTworzenie.setText("Tworzenie");
        menuTworzenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTworzenieActionPerformed(evt);
            }
        });
        menu2.add(menuTworzenie);

        menu1.add(menu2);

        menuBar.add(menu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55)
                        .addComponent(buttonAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(58, 58, 58)
                        .addComponent(buttonNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSave)
                    .addComponent(buttonNext)
                    .addComponent(buttonAnswer))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuNaukaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNaukaActionPerformed
        answerArea.setEditable(false);
        questionArea.setEditable(false);
        buttonSave.setEnabled(false);
        buttonNext.setEnabled(true);
        buttonAnswer.setEnabled(true);
    }//GEN-LAST:event_menuNaukaActionPerformed

    private void menuTworzenieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTworzenieActionPerformed
        answerArea.setEditable(true);
        questionArea.setEditable(true);
        buttonSave.setEnabled(true);
        buttonNext.setEnabled(false);
        buttonAnswer.setEnabled(false);

    }//GEN-LAST:event_menuTworzenieActionPerformed

    private void buttonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNextActionPerformed
        answerArea.setText(null);
        ArrayList<String> list = new ArrayList();
        try {
            File file = new File("C:\\Users\\Michu\\Documents\\NetBeansProjects\\Fiszki\\saved.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bFileReader = new BufferedReader(fileReader);

            String line = null;

            while ((line = bFileReader.readLine()) != null) {
                list.add(line);
            }
            bFileReader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        String randomLine = work.randomLine(list);
        System.out.println(randomLine);
        String question = work.question(randomLine);
        work.setAnswer(work.answer(randomLine));
        questionArea.setText(question);

    }//GEN-LAST:event_buttonNextActionPerformed

    private void buttonAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnswerActionPerformed
        answerArea.setText(work.getAnswer());
    }//GEN-LAST:event_buttonAnswerActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        String question = questionArea.getText();
        String answer = answerArea.getText();
        String last = work.produceFinalString(question, answer);

        try {
            BufferedWriter fWrite = new BufferedWriter(new FileWriter("C:\\Users\\Michu\\Documents\\NetBeansProjects\\Fiszki\\saved.txt", true));
            fWrite.newLine();
            fWrite.write(last);
            fWrite.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        questionArea.setText(null);
        answerArea.setText(null);
    }//GEN-LAST:event_buttonSaveActionPerformed

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
            java.util.logging.Logger.getLogger(FiszkiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiszkiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiszkiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiszkiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiszkiGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answerArea;
    private javax.swing.JButton buttonAnswer;
    private javax.swing.JButton buttonNext;
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuNauka;
    private javax.swing.JMenuItem menuTworzenie;
    private javax.swing.JTextArea questionArea;
    // End of variables declaration//GEN-END:variables
}
