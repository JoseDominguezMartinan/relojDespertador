/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojdespertador;

import java.awt.Font;
import javax.swing.JTextField;


/**
 *
 * @author jose
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        setVisible(true);
        setLocation(300,200);
        setResizable(false);
        Font fuente=new Font("Dialog",Font.BOLD,60);
        Font fuente_indicador=new Font("Dialog",Font.BOLD,50);
        pantalla.setFont(fuente);
        pantalla.setHorizontalAlignment(JTextField.CENTER);
        indicadorAlarma.setFont(fuente_indicador);
        indicadorAlarma.setHorizontalAlignment(JTextField.CENTER);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        cambiarHora = new javax.swing.JButton();
        cambiarMinutos = new javax.swing.JButton();
        snooze = new javax.swing.JButton();
        horaSiNo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pantalla = new javax.swing.JTextField();
        indicadorAlarma = new javax.swing.JTextField();
        encenderAlarma = new javax.swing.JButton();
        indicadorHoraAlarma = new javax.swing.JTextField();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selectedButtonForeground"));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cambiarHora.setText("cambiar hora");
        cambiarHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarHoraMouseClicked(evt);
            }
        });
        cambiarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarHoraActionPerformed(evt);
            }
        });

        cambiarMinutos.setText("cambiar minutos");
        cambiarMinutos.setMaximumSize(new java.awt.Dimension(101, 32));
        cambiarMinutos.setPreferredSize(new java.awt.Dimension(101, 32));
        cambiarMinutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarMinutosMouseClicked(evt);
            }
        });

        snooze.setText("snooze");
        snooze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                snoozeMouseClicked(evt);
            }
        });
        snooze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snoozeActionPerformed(evt);
            }
        });

        horaSiNo.setText("Hora/Alarma");
        horaSiNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horaSiNoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                horaSiNoMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                horaSiNoMouseReleased(evt);
            }
        });
        horaSiNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaSiNoActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/altavoz.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        pantalla.setEditable(false);
        pantalla.setCaretColor(new java.awt.Color(204, 204, 255));
        pantalla.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        pantalla.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaActionPerformed(evt);
            }
        });

        indicadorAlarma.setEditable(false);

        encenderAlarma.setText("Alarma ON/OFF");
        encenderAlarma.setPreferredSize(new java.awt.Dimension(101, 32));
        encenderAlarma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encenderAlarmaMouseClicked(evt);
            }
        });
        encenderAlarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encenderAlarmaActionPerformed(evt);
            }
        });

        indicadorHoraAlarma.setEditable(false);
        indicadorHoraAlarma.setText("  HORA");
        indicadorHoraAlarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicadorHoraAlarmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(indicadorAlarma)
                            .addComponent(indicadorHoraAlarma, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                    .addComponent(snooze, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cambiarMinutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cambiarHora, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horaSiNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(encenderAlarma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(snooze)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(indicadorHoraAlarma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(indicadorAlarma, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(horaSiNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cambiarHora, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(encenderAlarma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiarMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        pantalla.getAccessibleContext().setAccessibleName("");

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

    private void cambiarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarHoraActionPerformed

    private void pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pantallaActionPerformed
/**
 * metodo para subir la hora o la hora de la alarma cuando se pulsa el boton correspondiente 
 * @param evt 
 */
    private void cambiarHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarHoraMouseClicked
        // TODO add your handling code here:
        if(Alarma.isEnPantalla()==false){
        Reloj.subirHoraActual();
        Reloj.VisualizarHoraPantalla();
        }
        else{
        Alarma.subirHoraAlarma();
        Alarma.VisualizarAlarmaPantalla();
        }
    }//GEN-LAST:event_cambiarHoraMouseClicked
/**
 * metodo para, cuando se pulse el boton correspondiente, incrementar el minuto de la hora si esta es la que se esta mostrando, o de la alarma en caso contrario 
 * @param evt 
 */
    private void cambiarMinutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarMinutosMouseClicked
        // TODO add your handling code here:
        if(Alarma.isEnPantalla()==false){
        Reloj.subirMinutoActual();
        Reloj.VisualizarHoraPantalla();
        }
        else{
        Alarma.subirMinutoAlarma();
        Alarma.VisualizarAlarmaPantalla();
        }
    }//GEN-LAST:event_cambiarMinutosMouseClicked
/**
 * 
 * @param evt 
 */
    private void encenderAlarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encenderAlarmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encenderAlarmaActionPerformed
/**
 * cunado se pulsa el boton encender alarma llamamos al metodo que marca la bancera como true 
 * @param evt 
 */
    private void encenderAlarmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encenderAlarmaMouseClicked
        // TODO add your handling code here:
        Alarma.encender();
        
        
    }//GEN-LAST:event_encenderAlarmaMouseClicked
/**
 * metodo que, cuando se pulsa el boton hora/alarma, en funcion de lo que se este mostrando en pantalla cambia a hora o alarma y cambia tanto el texto de la caja que indica que estas viendo , como la bandera 
 * @param evt 
 */
    private void horaSiNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaSiNoMouseClicked
        
       if(Alarma.isEnPantalla()==false){
           Alarma.VisualizarAlarmaPantalla();
           indicadorHoraAlarma.setText("  ALARMA");
       }
      
       else {
           Reloj.VisualizarHoraPantalla();
           Alarma.setEnPantalla(false);
           indicadorHoraAlarma.setText("  HORA");
       }             
  
    }//GEN-LAST:event_horaSiNoMouseClicked

    private void horaSiNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaSiNoActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_horaSiNoActionPerformed

    private void horaSiNoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaSiNoMouseReleased
        // TODO add your handling code here:
      
    }//GEN-LAST:event_horaSiNoMouseReleased

    private void horaSiNoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaSiNoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_horaSiNoMouseExited

    private void indicadorHoraAlarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicadorHoraAlarmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indicadorHoraAlarmaActionPerformed

    private void snoozeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snoozeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snoozeActionPerformed
/**
 * en caso de que se cumpla la condicion para que suene la alarma, al ser pulsado este boton, pospone la alarma cinco minutos, si no cumple los requisitos este boton no hace nada
 * @param evt 
 */
    private void snoozeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snoozeMouseClicked
        // TODO add your handling code here:
        if(Alarma.getHoraAlarma()==Reloj.devolverHoraActual() && Alarma.getMinutoAlarma()==Reloj.devolverMinutoActual() && Alarma.isEncendida()==true)
        Alarma.posponerAlarma();
    }//GEN-LAST:event_snoozeMouseClicked

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton cambiarHora;
    private javax.swing.JButton cambiarMinutos;
    static javax.swing.JButton encenderAlarma;
    private javax.swing.JButton horaSiNo;
    static javax.swing.JTextField indicadorAlarma;
    private javax.swing.JTextField indicadorHoraAlarma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    public static javax.swing.JTextField pantalla;
    private javax.swing.JButton snooze;
    // End of variables declaration//GEN-END:variables



}
