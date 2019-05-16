package visao;
import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import java.io.File;

import java.io.IOException;

import java.util.logging.Level;

import java.util.logging.Logger;

import javax.imageio.ImageIO;

import javax.swing.JPanel;

 

public class JPanelWithBackground extends JPanel{

 

   private String pathImage = ""; // vari�vel que vai receber o caminho da imagem

 

   // construtor vazio

   public JPanelWithBackground() {

   }

   // m�todo construtor com par�metro

   public JPanelWithBackground(String pathImage) {

       this.pathImage = pathImage;

   }

 

   // o m�todo abaixo sobrescreve o m�todo de: javax.swing.JComponent

   @Override

   // "Graphics" � a classe base abstrata para todos os contextos de

   // gr�ficos que permitem um aplicativo desenhar sobre os componentes.

   public void paintComponent(Graphics g) {

 

       // A classe Graphics2D estende a Graphics para fornecer um controle

       // mais sofisticado sobre a geometria, transforma��o de coordenadas

       // e gerenciamento de cores e layout de textos e imagens.

       Graphics2D gr = ( Graphics2D )g.create();

 

       try {

 

          // O BufferedImage � uma subclasse Image que representa uma imagem carregada na mem�ria.

          // Ela permite que a imagem seja manipulada.

 

          // A Imagem � carregada atrav�s da classe ImageIO

 

          BufferedImage buffer = ImageIO.read( new File(pathImage) );

          gr.drawImage(buffer, null, 0, 0 ); // desenha a imagem

 

       } catch (IOException ex) {

          Logger.getLogger(JPanelWithBackground.class.getName()).log(Level.SEVERE, null, ex);

       }

 

   }

}