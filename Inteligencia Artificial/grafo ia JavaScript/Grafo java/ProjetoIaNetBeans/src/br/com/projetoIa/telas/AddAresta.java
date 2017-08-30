/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIa.telas;

import br.com.projeto.entity.Grafo;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class AddAresta extends javax.swing.JFrame {
    Grafo grafo;
    /**
     * Creates new form NewJFrame
     */
    public AddAresta(Grafo grafo1) {
        initComponents();
        grafo = grafo1;
    }

    private AddAresta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_addAresta = new java.awt.Button();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        txt_a1 = new java.awt.TextField();
        txt_a2 = new java.awt.TextField();
        btn_sair = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_addAresta.setLabel("Adicionar");
        btn_addAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addArestaActionPerformed(evt);
            }
        });

        label1.setText("Vertice 1");

        label2.setText("Vertice2");

        btn_sair.setLabel("Voltar");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_a1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_a2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_addAresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(txt_a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addAresta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addArestaActionPerformed
        int peso;
        try{
            if(Integer.parseInt(txt_a1.getText()) > grafo.getNumeroDeNodos() -1 || Integer.parseInt(txt_a2.getText()) > grafo.getNumeroDeNodos() -1){
                JOptionPane.showMessageDialog(null, "Digite numeros entre 0 e " + (grafo.getNumeroDeNodos() - 1));
            }else{
                if(Integer.parseInt(txt_a1.getText()) == Integer.parseInt(txt_a2.getText())){
                    JOptionPane.showMessageDialog(null, "Vertice não pode se ligar com sigo mesmo");
                }else{
                    if(Integer.parseInt(txt_a1.getText()) > Integer.parseInt(txt_a2.getText()) + 3 || Integer.parseInt(txt_a1.getText()) < Integer.parseInt(txt_a2.getText()) - 3){
                        JOptionPane.showMessageDialog(null, "Vertices estão muito longe");
                        
                    }else{
                        if(Integer.parseInt(txt_a1.getText()) < Integer.parseInt(txt_a2.getText())){
                            if(Integer.parseInt(txt_a1.getText())%2 == 1 && Integer.parseInt(txt_a1.getText()) == Integer.parseInt(txt_a2.getText()) -3)
                                JOptionPane.showMessageDialog(null, "Vertices estão muito longe");
                            else
                                adicionarAresta();
                        }else{
                            if(Integer.parseInt(txt_a2.getText())%2 != 1 && Integer.parseInt(txt_a2.getText()) == Integer.parseInt(txt_a1.getText()) -3)
                                JOptionPane.showMessageDialog(null, "Vertices estão muito longe");
                            else
                                adicionarAresta();
                        }
                        
                    }    
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Digite apenas numeros");
        }
        
    }//GEN-LAST:event_btn_addArestaActionPerformed
    private void adicionarAresta(){
        int peso = 0;
        if(Integer.parseInt(txt_a1.getText())%2 == 0)
           if(Integer.parseInt(txt_a1.getText()) == Integer.parseInt(txt_a2.getText()) + 3 || Integer.parseInt(txt_a2.getText()) == Integer.parseInt(txt_a1.getText()) + 3)
                peso = 2;
            else
                peso = 1;
        else
        if(Integer.parseInt(txt_a1.getText()) == Integer.parseInt(txt_a2.getText()) + 1 || Integer.parseInt(txt_a2.getText()) == Integer.parseInt(txt_a1.getText()) + 1)
            peso = 2;
        else
            peso = 1;
            grafo.addAresta(Integer.parseInt(txt_a1.getText()), Integer.parseInt(txt_a2.getText()), peso);
            JOptionPane.showMessageDialog(null, "Aresta Adicionada");
        
    }
    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        Menu m = new Menu(grafo);
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_sairActionPerformed

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
            java.util.logging.Logger.getLogger(AddAresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAresta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_addAresta;
    private java.awt.Button btn_sair;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextField txt_a1;
    private java.awt.TextField txt_a2;
    // End of variables declaration//GEN-END:variables
}
