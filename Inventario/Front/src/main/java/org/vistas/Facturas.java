package org.vistas;

public class Facturas extends javax.swing.JFrame{
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
        Anio = new javax.swing.JTextField();
        ProductoName = new javax.swing.JTextField();
        Id = new javax.swing.JTextField();
        Codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Dia = new javax.swing.JSpinner();
        Mes = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Inventario = new javax.swing.JLabel();
        Actualizar = new javax.swing.JLabel();
        Historial = new javax.swing.JLabel();
        Facturas = new javax.swing.JLabel();
        Proveedores = new javax.swing.JLabel();
        Producto = new javax.swing.JLabel();
        Empleados = new javax.swing.JLabel();
        Clientes1 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        Eliminar = new javax.swing.JLabel();
        Buscar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        Anio.setBackground(new java.awt.Color(255, 255, 255));
        Anio.setForeground(new java.awt.Color(0, 0, 0));
        Anio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        Anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnioActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Anio);
        Anio.setBounds(830, 160, 80, 20);

        ProductoName.setBackground(new java.awt.Color(255, 255, 255));
        ProductoName.setForeground(new java.awt.Color(0, 0, 0));
        ProductoName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        ProductoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoNameActionPerformed(evt);
            }
        });
        jLayeredPane1.add(ProductoName);
        ProductoName.setBounds(560, 160, 120, 30);

        Id.setBackground(new java.awt.Color(255, 255, 255));
        Id.setForeground(new java.awt.Color(0, 0, 0));
        Id.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Id);
        Id.setBounds(420, 160, 120, 30);

        Codigo.setBackground(new java.awt.Color(255, 255, 255));
        Codigo.setForeground(new java.awt.Color(0, 0, 0));
        Codigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Codigo);
        Codigo.setBounds(290, 160, 120, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Año");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(860, 180, 30, 16);
        jLayeredPane1.add(Dia);
        Dia.setBounds(710, 160, 50, 22);
        jLayeredPane1.add(Mes);
        Mes.setBounds(770, 160, 50, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dia");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(720, 180, 30, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mes");
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(780, 180, 30, 16);

        Inventario.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Inventario.setForeground(new java.awt.Color(255, 255, 51));
        Inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventarioMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Inventario);
        Inventario.setBounds(40, 126, 90, 20);

        Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Actualizar);
        Actualizar.setBounds(860, 150, 110, 30);

        Historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistorialMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Historial);
        Historial.setBounds(30, 160, 90, 30);

        Facturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacturasMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Facturas);
        Facturas.setBounds(30, 200, 90, 30);

        Proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedoresMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Proveedores);
        Proveedores.setBounds(30, 240, 120, 30);

        Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductoMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Producto);
        Producto.setBounds(30, 280, 120, 30);

        Empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpleadosMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Empleados);
        Empleados.setBounds(30, 320, 120, 30);

        Clientes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clientes1MouseClicked(evt);
            }
        });
        jLayeredPane1.add(Clientes1);
        Clientes1.setBounds(20, 360, 120, 30);

        fecha.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(163, 58, 175));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("Fecha-hora");
        jLayeredPane1.add(fecha);
        fecha.setBounds(1080, 30, 140, 19);

        nombreUsuario.setBackground(new java.awt.Color(251, 228, 234));
        nombreUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(163, 58, 175));
        nombreUsuario.setText("Nombre usuario");
        jLayeredPane1.add(nombreUsuario);
        nombreUsuario.setBounds(1150, 10, 100, 19);

        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Eliminar);
        Eliminar.setBounds(1110, 150, 110, 40);

        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Buscar);
        Buscar.setBounds(970, 160, 110, 30);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String [] {
                        "Codigo", "Cliente", "Fecha", "Valor ", "Visualizar"
                }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLayeredPane1.add(jScrollPane2);
        jScrollPane2.setBounds(270, 210, 960, 270);

        fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\OneDrive\\Desktop\\software 3\\AndresFelipeAmaya-JuanPabloDelgado-SolenkaMarySaire\\Inventario\\Imagenes\\Facturas.jpg")); // NOI18N
        fondo.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jLayeredPane1.add(fondo);
        fondo.setBounds(0, 0, 1260, 630);

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
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void InventarioMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void ActualizarMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void HistorialMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void FacturasMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void ProveedoresMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void ProductoMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void EmpleadosMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void Clientes1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void CodigoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ProductoNameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void AnioActionPerformed(java.awt.event.ActionEvent evt) {
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
                new Facturas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel Actualizar;
    private javax.swing.JTextField Anio;
    private javax.swing.JLabel Buscar;
    private javax.swing.JLabel Clientes1;
    private javax.swing.JTextField Codigo;
    private javax.swing.JSpinner Dia;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Empleados;
    private javax.swing.JLabel Facturas;
    private javax.swing.JLabel Historial;
    private javax.swing.JTextField Id;
    private javax.swing.JLabel Inventario;
    private javax.swing.JSpinner Mes;
    private javax.swing.JLabel Producto;
    private javax.swing.JTextField ProductoName;
    private javax.swing.JLabel Proveedores;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel nombreUsuario;
    // End of variables declaration
    public Facturas() {
        initComponents();

        jLayeredPane1.setBounds(0, 0,getWidth(), getHeight());

    }

}
