package photocryptfinal;

import algoritmos.RC4;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joseluisllinaresanton
 */
public class PantallaDesencriptacion extends javax.swing.JFrame {

    /**
     * Creates new form PantallaDesencriptacion
     */
    private String rutica;
    
    public PantallaDesencriptacion() {
        initComponents();
    }
    public PantallaDesencriptacion(String rutaImagen) {
        setResizable(false);
        this.rutica=rutaImagen;
        setTitle("Descifrar");
        initComponents();
        VerImagen(rutaImagen);
    }

    
    public void VerImagen(String ruta)
    {
        BufferedImage imagenEscalada = EscalarImagen(label_imagen.getWidth(), label_imagen.getHeight(), ruta);
        label_imagen.setIcon(new ImageIcon((Image)imagenEscalada));
    }
    
    public BufferedImage EscalarImagen(int WIDTH, int HEIGHT, String filename)
    {
        BufferedImage bi = null;
        try
        {
            ImageIcon icono = new ImageIcon(filename);
            bi = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = (Graphics2D) bi.createGraphics();
            g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY));
            g2d.drawImage(icono.getImage(), 0, 0, WIDTH, HEIGHT, null);
        }
        catch (Exception e)
        {
            return null;
        }
        return bi;
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
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        img_candado = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        label_imagen = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Imagen codificada");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Tipo de cifrado");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        img_candado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lock77.png"))); // NOI18N

        jRadioButton2.setSelected(true);
        jRadioButton2.setText("RC4");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_candado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(img_candado))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jRadioButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("El mensaje desencriptado se copiara al portapapeles");

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jButton1.setText("Obtener Imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label_imagen.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Clave");

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(label_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPasswordField1)
                                    .addGap(57, 57, 57))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jButton1))
                                    .addGap(176, 176, 176)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel6)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(label_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    public int valorDeClave(String clave)
    {
        int valor = 0;
        for(int i = 0; i<clave.length(); i++)
        {
            valor += clave.charAt(i);
        }
        return valor;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        File imgPath = new File(rutica);
        String clave = jPasswordField1.getText();
        int valorClave = valorDeClave(clave);
        //Ahora hay que hacer la inversa. Sacar la cadena de la imagen.
        
        BufferedImage bufferedImage = null;
        
        try {
            bufferedImage = ImageIO.read(imgPath);
        } catch (IOException ex) {
            Logger.getLogger(PantallaDesencriptacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        int height = bufferedImage.getHeight();
        int width = bufferedImage.getWidth();

        WritableRaster raster = bufferedImage.getRaster();
        DataBufferByte data   = (DataBufferByte) raster.getDataBuffer();
        
        
        Random rnd = new Random();
        rnd.setSeed(data.getData().length+valorClave);  //la semilla será el valor de la clave + los datos.
        
       
        int i =0;
        String mensajeBinario = "";
        String mensaje="";
        Random posiH = new Random();
        posiH.setSeed(valorClave);
        int posicionTamTextH = posiH.nextInt((bufferedImage.getHeight() - 1) + 1)+ 1;
        
        Random posiW = new Random();
        posiW.setSeed(valorClave);
        int posicionTamTextW = posiW.nextInt((bufferedImage.getWidth() - 1) + 1)+ 1;
        
        Color mycolor = new Color(bufferedImage.getRGB(posicionTamTextH/2, posicionTamTextW/2));
        int tamMensaje = mycolor.getRed();
        
        String mensajeFinal="";
        while(i<tamMensaje*8)
        {
            int posicion = rnd.nextInt(((data.getData().length-1) - 1) + 1)+ 1;
            mensajeBinario += getLSB(data.getData()[posicion]);
            if(mensajeBinario.length()==8)
            {
                mensajeFinal +=convertirBinarioALetra(mensajeBinario);
                mensajeBinario="";
            }
            i++;
        }
        char[] desencriptado = null;
        //Y despues desencriptarla
        RC4 algoritmo = new RC4();        
        try {
            algoritmo.setKey(clave);
            
            desencriptado = algoritmo.decrypt(mensajeFinal.toCharArray());
        } catch (Exception ex) {
            Logger.getLogger(PantallaDesencriptacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        String copy = new String(desencriptado);
        StringSelection stringSelection = new StringSelection (copy);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents (stringSelection, null);
       
        JOptionPane.showMessageDialog(null, copy);
    }//GEN-LAST:event_jButton1ActionPerformed

    public char convertirBinarioALetra(String caracter)
    {
        int num=Integer.parseInt(caracter,2);
        return (char)num;
    }
    
    public char getLSB(byte s)
    {
     String binario = byteABinario(s);  
     return binario.charAt(binario.length()-1);
    }
    
    public String byteABinario(byte s)
    {
            int i2 = s & 0xFF;
            String binario = "";
            for (int i = 0; i < 8; i++)
            {
                binario = "" + (i2 % 2) + binario;
                i2 = i2/ 2;
            }
            return binario;
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
            java.util.logging.Logger.getLogger(PantallaDesencriptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaDesencriptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaDesencriptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaDesencriptacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaDesencriptacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img_candado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel label_imagen;
    // End of variables declaration//GEN-END:variables
}
