
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus
 */
public class InserirNomes extends javax.swing.JFrame {

    /**
     * Creates new form InserirNomes
     */
    public InserirNomes() {
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        nomeText = new javax.swing.JTextField();
        insereNomes = new javax.swing.JButton();
        sobrenomeText = new javax.swing.JTextField();
        insereSobrenome = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir Nomes e Sobrenomes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        nomeText.setText("Digite um nome");
        nomeText.setName("nome"); // NOI18N
        nomeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextActionPerformed(evt);
            }
        });

        insereNomes.setText("Inserir Nome");
        insereNomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insereNomesActionPerformed(evt);
            }
        });

        sobrenomeText.setText("Digite um sobrenome");

        insereSobrenome.setText("Inserir Sobrenome");
        insereSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insereSobrenomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insereNomes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sobrenomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insereSobrenome))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sobrenomeText, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(nomeText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(insereNomes)
                    .addComponent(insereSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      
    }//GEN-LAST:event_formWindowClosing

    private void insereNomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insereNomesActionPerformed
        
        File arquivo = new File ("nomes.txt");

        try {
            arquivo.createNewFile();
            
            BufferedWriter escrever = new BufferedWriter(new FileWriter (arquivo,true));
            
            escrever.write(nomeText.getText());
            escrever.newLine();
            
            escrever.flush();
            escrever.close();
            
        } catch (IOException ex) {
            Logger.getLogger(InserirNomes.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        JOptionPane.showMessageDialog(null, "Nome Inserido Com Sucesso");
        
    }//GEN-LAST:event_insereNomesActionPerformed

    private void nomeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextActionPerformed

    private void insereSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insereSobrenomeActionPerformed
        
        File arquivo = new File ("sobrenomes.txt");

        try {
            arquivo.createNewFile();
            
            BufferedWriter escrever = new BufferedWriter(new FileWriter (arquivo,true));
            
            escrever.write(sobrenomeText.getText());
            escrever.newLine();
            
            escrever.flush();
            escrever.close();
            
        } catch (IOException ex) {
            Logger.getLogger(InserirNomes.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        JOptionPane.showMessageDialog(null, "Sobrenome Inserido Com Sucesso");
        
        
    }//GEN-LAST:event_insereSobrenomeActionPerformed

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
            java.util.logging.Logger.getLogger(InserirNomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirNomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirNomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirNomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirNomes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insereNomes;
    private javax.swing.JButton insereSobrenome;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextField sobrenomeText;
    // End of variables declaration//GEN-END:variables
}
