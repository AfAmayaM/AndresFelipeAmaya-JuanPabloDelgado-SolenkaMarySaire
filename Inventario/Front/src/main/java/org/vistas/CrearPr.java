package org.vistas;

public class CrearPr extends javax.swing.JFrame{
    /**
     * Creates new form actualizarC
     */


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        PrecioMaximo = new javax.swing.JTextField();
        Codigo = new javax.swing.JTextField();
        ConfimarcionContraseña = new javax.swing.JTextField();
        Categoria = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        PrecioMinimo = new javax.swing.JTextField();
        nombreUsuario = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        Registrar = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        PrecioMaximo.setBackground(new java.awt.Color(255, 255, 255));
        PrecioMaximo.setForeground(new java.awt.Color(0, 0, 0));
        PrecioMaximo.setBorder(null);
        PrecioMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioMaximoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(PrecioMaximo);
        PrecioMaximo.setBounds(260, 400, 190, 20);

        Codigo.setBackground(new java.awt.Color(255, 255, 255));
        Codigo.setForeground(new java.awt.Color(0, 0, 0));
        Codigo.setBorder(null);
        Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Codigo);
        Codigo.setBounds(260, 310, 180, 20);

        ConfimarcionContraseña.setBackground(new java.awt.Color(255, 255, 255));
        ConfimarcionContraseña.setForeground(new java.awt.Color(0, 0, 0));
        ConfimarcionContraseña.setBorder(null);
        ConfimarcionContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfimarcionContraseñaActionPerformed(evt);
            }
        });
        jLayeredPane1.add(ConfimarcionContraseña);
        ConfimarcionContraseña.setBounds(760, 500, 250, 20);

        Categoria.setBackground(new java.awt.Color(255, 255, 255));
        Categoria.setForeground(new java.awt.Color(0, 0, 0));
        Categoria.setBorder(null);
        Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Categoria);
        Categoria.setBounds(710, 310, 180, 20);

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setBorder(null);
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Nombre);
        Nombre.setBounds(260, 220, 180, 20);

        PrecioMinimo.setBackground(new java.awt.Color(255, 255, 255));
        PrecioMinimo.setForeground(new java.awt.Color(0, 0, 0));
        PrecioMinimo.setBorder(null);
        PrecioMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioMinimoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(PrecioMinimo);
        PrecioMinimo.setBounds(700, 220, 190, 20);

        nombreUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(163, 58, 175));
        nombreUsuario.setText("Nombre usuario");
        jLayeredPane1.add(nombreUsuario);
        nombreUsuario.setBounds(1150, 10, 100, 19);

        fecha.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(163, 58, 175));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("Fecha-hora");
        jLayeredPane1.add(fecha);
        fecha.setBounds(1080, 30, 140, 19);

        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Registrar);
        Registrar.setBounds(710, 410, 110, 40);

        fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\OneDrive\\Desktop\\software 3\\AndresFelipeAmaya-JuanPabloDelgado-SolenkaMarySaire\\Inventario\\Imagenes\\Crear producto.jpg")); // NOI18N
        fondo.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jLayeredPane1.add(fondo);
        fondo.setBounds(0, 0, 1260, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void CategoriaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void PrecioMinimoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void RegistrarMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void PrecioMaximoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void CodigoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ConfimarcionContraseñaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(actualizarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actualizarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actualizarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actualizarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearPr().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify
    private javax.swing.JTextField Categoria;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField ConfimarcionContraseña;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField PrecioMaximo;
    private javax.swing.JTextField PrecioMinimo;
    private javax.swing.JLabel Registrar;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fondo;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel nombreUsuario;
    // End of variables declaration
    public CrearPr() {
        initComponents();

        jLayeredPane1.setBounds(0, 0,getWidth(), getHeight());

    }
}