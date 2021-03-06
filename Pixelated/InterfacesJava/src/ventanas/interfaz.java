 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//GILBERTO ROGEL GARCÍA A01630171
//interfaz.java
//06/28/2018
package ventanas;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gilbe
 */
public class interfaz extends javax.swing.JFrame {
    JPanel[][] celdas = new JPanel[10][10];
    Color[] colores = { Color.blue, Color.red, Color.green, Color.cyan, Color.orange, Color.pink };
    int intentos, cuadrosIguales;
    
    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(null); //para que aparezca en el centro de la pantalla
        iniciarJuego();
        
    }
    
    public void iniciarJuego(){
        jPanel1.removeAll();
        this.cuadrosIguales = 0;
        this.intentos=0;
        Random rn = new Random();
        int x;
        for(int i = 0; i<this.celdas.length;i++){
            for(int j = 0; j<this.celdas[i].length;j++){
                x = rn.nextInt(this.colores.length);
                this.celdas[i][j] = new JPanel();
                this.celdas[i][j].setBackground(colores[x]);
                jPanel1.add(this.celdas[i][j]);
                
            }
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

        title = new javax.swing.JLabel();
        botonAzul = new javax.swing.JButton();
        botonRojo = new javax.swing.JButton();
        botonVerde = new javax.swing.JButton();
        botonNaranja = new javax.swing.JButton();
        botonMorado = new javax.swing.JButton();
        botonCyan = new javax.swing.JButton();
        trys = new javax.swing.JLabel();
        maxtrys = new javax.swing.JLabel();
        reiniciar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pixelated");
        setMaximumSize(new java.awt.Dimension(960, 685));
        setMinimumSize(new java.awt.Dimension(960, 685));
        setPreferredSize(new java.awt.Dimension(960, 685));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Pixelated");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, -1));

        botonAzul.setBackground(new java.awt.Color(0, 0, 255));
        botonAzul.setForeground(new java.awt.Color(0, 0, 255));
        botonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAzulActionPerformed(evt);
            }
        });
        getContentPane().add(botonAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 160, 90));

        botonRojo.setBackground(new java.awt.Color(255, 0, 0));
        botonRojo.setForeground(new java.awt.Color(255, 0, 0));
        botonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRojoActionPerformed(evt);
            }
        });
        getContentPane().add(botonRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 160, 90));

        botonVerde.setBackground(new java.awt.Color(0, 153, 51));
        botonVerde.setForeground(new java.awt.Color(0, 153, 51));
        botonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerdeActionPerformed(evt);
            }
        });
        getContentPane().add(botonVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 160, 90));

        botonNaranja.setBackground(new java.awt.Color(255, 153, 0));
        botonNaranja.setForeground(new java.awt.Color(255, 153, 0));
        botonNaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNaranjaActionPerformed(evt);
            }
        });
        getContentPane().add(botonNaranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, 160, 90));

        botonMorado.setBackground(new java.awt.Color(255, 153, 153));
        botonMorado.setForeground(new java.awt.Color(255, 153, 153));
        botonMorado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMoradoActionPerformed(evt);
            }
        });
        getContentPane().add(botonMorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 160, 90));

        botonCyan.setBackground(new java.awt.Color(0, 255, 255));
        botonCyan.setForeground(new java.awt.Color(0, 255, 255));
        botonCyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCyanActionPerformed(evt);
            }
        });
        getContentPane().add(botonCyan, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 160, 90));

        trys.setForeground(new java.awt.Color(255, 255, 255));
        trys.setText("Intentos :");
        getContentPane().add(trys, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, -1, -1));

        maxtrys.setForeground(new java.awt.Color(255, 255, 255));
        maxtrys.setText("Max intentos : 20");
        getContentPane().add(maxtrys, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, -1));

        reiniciar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        reiniciar.setText("Reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, 70, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(10, 10));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 660));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blackbg.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 0, 180, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void perdiste(){
     trys.setText("Intentos : " + this.intentos);
     if(this.intentos>=20 && this.cuadrosIguales!=100){
            JOptionPane.showMessageDialog(null,"Intentos agotados, perdiste" );
     }
    
    }

    public void ganaste(){
        this.cuadrosIguales= 0;
        for(int i = 0; i <this.celdas.length; i++){
            for(int j = 0; j<this.celdas[i].length; j++){
                if(this.celdas[0][0].getBackground()==this.celdas[i][j].getBackground()){
                    this.cuadrosIguales++;
                }
                if(this.cuadrosIguales==100){
                    JOptionPane.showMessageDialog(null,"Ganaste en "+this.intentos+" intentos" );
                   
                }
            }
        }
        
    }    
    
    
    private void botonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRojoActionPerformed
        // TODO add your handling code here:
        pintaCuadros(Color.red, this.celdas[0][0].getBackground(), 0, 0);
        this.intentos++;
        ganaste();
        perdiste();
    }//GEN-LAST:event_botonRojoActionPerformed

    private void botonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerdeActionPerformed
        // TODO add your handling code here:
        pintaCuadros(Color.green,this.celdas[0][0].getBackground(), 0, 0);
        this.intentos++;
        ganaste();
        perdiste();       
    }//GEN-LAST:event_botonVerdeActionPerformed

    private void botonNaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNaranjaActionPerformed
        // TODO add your handling code here:
        pintaCuadros(Color.orange, this.celdas[0][0].getBackground(), 0, 0);
        this.intentos++;
        ganaste();
        perdiste();
        
    }//GEN-LAST:event_botonNaranjaActionPerformed

    private void botonMoradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMoradoActionPerformed
        // TODO add your handling code here:
        pintaCuadros(Color.pink,this.celdas[0][0].getBackground(), 0, 0);
        this.intentos++;
        ganaste();
        perdiste();      
    }//GEN-LAST:event_botonMoradoActionPerformed

    private void botonCyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCyanActionPerformed
        // TODO add your handling code here:
         pintaCuadros(Color.cyan, this.celdas[0][0].getBackground(), 0, 0);
         this.intentos++;
         ganaste();
         perdiste();  
    }//GEN-LAST:event_botonCyanActionPerformed

    private void botonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAzulActionPerformed
        // TODO add your handling code here:
         pintaCuadros(Color.blue, this.celdas[0][0].getBackground(), 0, 0);
         this.intentos++;
         ganaste();
         perdiste();         
    }//GEN-LAST:event_botonAzulActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        // TODO add your handling code here:
        if(this.intentos>=20 || this.cuadrosIguales==100){
            iniciarJuego();
            trys.setText("Intentos : " + this.intentos);
        }else{
            JOptionPane.showMessageDialog(null,"Solo puedes reiniciar al terminar el juego" );
        }
        
    }//GEN-LAST:event_reiniciarActionPerformed

    public void pintaCuadros(Color colorNuevo,Color colorViejo, int x, int y){
        if(colorNuevo==colorViejo){
           return;
        }
        if((x>=0 && x<=9) && (y>=0 && y<=9)){           
                if(this.celdas[x][y].getBackground().equals(colorViejo)){
                    this.celdas[x][y].setBackground(colorNuevo);
                    pintaCuadros(colorNuevo, colorViejo, x+1, y);
                    pintaCuadros(colorNuevo, colorViejo, x-1, y);
                    pintaCuadros(colorNuevo, colorViejo, x, y+1);
                    pintaCuadros(colorNuevo, colorViejo, x, y-1);
                }
        }
      
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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAzul;
    private javax.swing.JButton botonCyan;
    private javax.swing.JButton botonMorado;
    private javax.swing.JButton botonNaranja;
    private javax.swing.JButton botonRojo;
    private javax.swing.JButton botonVerde;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel maxtrys;
    private javax.swing.JButton reiniciar;
    private javax.swing.JLabel title;
    private javax.swing.JLabel trys;
    // End of variables declaration//GEN-END:variables
}
