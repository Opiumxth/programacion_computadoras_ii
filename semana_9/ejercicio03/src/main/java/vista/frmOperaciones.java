package vista;

public class frmOperaciones extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmOperaciones.class.getName());
    public frmOperaciones() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        lblNumero1 = new javax.swing.JLabel();
        lblNumero2 = new javax.swing.JLabel();
        txtNumero1 = new javax.swing.JTextField();
        txtNumero2 = new javax.swing.JTextField();
        btnSumar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        lblTextoResultado = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        titulo.setText("OPERACIONES");

        lblNumero1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblNumero1.setText("Ingrese un número");

        lblNumero2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblNumero2.setText("Ingrese un número");

        txtNumero1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero1ActionPerformed(evt);
            }
        });

        txtNumero2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        btnSumar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnSumar.setText("Sumar");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnMultiplicar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnMultiplicar.setText("Multiplicar");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnDividir.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnDividir.setText("Dividir");

        lblTextoResultado.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblTextoResultado.setText("Resultado:");

        lblResultado.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        btnSalir.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumero1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNumero2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumero2)
                                    .addComponent(txtNumero1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSumar)
                                .addGap(18, 18, 18)
                                .addComponent(btnMultiplicar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDividir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSalir)
                                    .addComponent(lblTextoResultado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblResultado))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(titulo)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero1)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero2)
                    .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplicar)
                    .addComponent(btnDividir)
                    .addComponent(btnSumar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTextoResultado)
                    .addComponent(lblResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
    }//GEN-LAST:event_btnMultiplicarActionPerformed
    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
    }//GEN-LAST:event_btnSumarActionPerformed
    private void txtNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero1ActionPerformed
    }//GEN-LAST:event_txtNumero1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new frmOperaciones().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDividir;
    public javax.swing.JButton btnMultiplicar;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnSumar;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero2;
    public javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTextoResultado;
    private javax.swing.JLabel titulo;
    public javax.swing.JTextField txtNumero1;
    public javax.swing.JTextField txtNumero2;
    // End of variables declaration//GEN-END:variables
}