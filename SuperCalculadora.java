/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author gabri
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        panCalc.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JSpinner();
        btnCalcular = new javax.swing.JButton();
        panCalc = new javax.swing.JPanel();
        lblRestDiv = new javax.swing.JLabel();
        lblElevCubo = new javax.swing.JLabel();
        lblRaizQ = new javax.swing.JLabel();
        lblRaizC = new javax.swing.JLabel();
        lblVlrAbs = new javax.swing.JLabel();
        lblRestDiv2 = new javax.swing.JLabel();
        lblElevCubo2 = new javax.swing.JLabel();
        lblRaizQ2 = new javax.swing.JLabel();
        lblRaizC2 = new javax.swing.JLabel();
        lblVlrAbs2 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Super Calculadora");

        jLabel2.setText("Informe um valor: ");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblRestDiv.setText("Resto da Divisão por 2: ");

        lblElevCubo.setText("Elevado ao Cubo: ");

        lblRaizQ.setText("Raiza Quadrada: ");

        lblRaizC.setText("Raiz Cúbica: ");

        lblVlrAbs.setText("Valor absoluto: ");

        lblRestDiv2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRestDiv2.setForeground(new java.awt.Color(255, 102, 102));
        lblRestDiv2.setText("0");

        lblElevCubo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblElevCubo2.setForeground(new java.awt.Color(255, 102, 102));
        lblElevCubo2.setText("0");

        lblRaizQ2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRaizQ2.setForeground(new java.awt.Color(255, 102, 102));
        lblRaizQ2.setText("0");

        lblRaizC2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRaizC2.setForeground(new java.awt.Color(255, 102, 102));
        lblRaizC2.setText("0");

        lblVlrAbs2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVlrAbs2.setForeground(new java.awt.Color(255, 102, 102));
        lblVlrAbs2.setText("0");

        javax.swing.GroupLayout panCalcLayout = new javax.swing.GroupLayout(panCalc);
        panCalc.setLayout(panCalcLayout);
        panCalcLayout.setHorizontalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVlrAbs)
                            .addComponent(lblRaizC)
                            .addComponent(lblRaizQ)
                            .addComponent(lblElevCubo))
                        .addGap(80, 80, 80)
                        .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRaizQ2)
                            .addComponent(lblElevCubo2)
                            .addComponent(lblRaizC2)
                            .addComponent(lblVlrAbs2)))
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addComponent(lblRestDiv)
                        .addGap(53, 53, 53)
                        .addComponent(lblRestDiv2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panCalcLayout.setVerticalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestDiv)
                    .addComponent(lblRestDiv2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElevCubo)
                    .addComponent(lblElevCubo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaizQ)
                    .addComponent(lblRaizQ2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaizC)
                    .addComponent(lblRaizC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVlrAbs)
                    .addComponent(lblVlrAbs2))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCalcular))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addGap(18, 18, 18)
                .addComponent(panCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        panCalc.setVisible(true);
        int valor = Integer.parseInt(txtValor.getValue().toString());
        
        int restDiv = valor % 2;
        double elev3 = Math.pow(valor, 3);
        double raiz2 = Math.sqrt(valor);
        double raiz3 = Math.cbrt(valor);
        int vlrAbs = Math.abs(valor);
        
        lblRestDiv2.setText(Integer.toString(restDiv));
        lblElevCubo2.setText(String.format("%.2f", elev3));
        lblRaizQ2.setText(String.format("%.2f", raiz2));
        lblRaizC2.setText(String.format("%.2f", raiz3));
        lblVlrAbs2.setText(Integer.toString(vlrAbs));
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblElevCubo;
    private javax.swing.JLabel lblElevCubo2;
    private javax.swing.JLabel lblRaizC;
    private javax.swing.JLabel lblRaizC2;
    private javax.swing.JLabel lblRaizQ;
    private javax.swing.JLabel lblRaizQ2;
    private javax.swing.JLabel lblRestDiv;
    private javax.swing.JLabel lblRestDiv2;
    private javax.swing.JLabel lblVlrAbs;
    private javax.swing.JLabel lblVlrAbs2;
    private javax.swing.JPanel panCalc;
    private javax.swing.JSpinner txtValor;
    // End of variables declaration//GEN-END:variables
}
