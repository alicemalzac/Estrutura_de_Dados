package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import Controle.ControleDoPainelPrincipal;







public class PainelPrincipal extends JFrame implements Visao   {

private JPanel painel1,painel2,painel3,painel4,painel5,painel6; //** quatro painel cada um para serem distribuidos com as funcionalidades do sistema */
private JScrollPane JScrollPane1;	//** aticional a tabela de pedidos  */
private JButton butao1,butao2,butao3,butao4; //** botes de Produtos,clientes e cardapio  */
private JLabel rotulo1,rotulo2; //** tilos do sistema e da tabela de pedidos */
private static JTable tabela1; //** tabela de pedido */
JPanelWithBackground background = null;
private ControleDoPainelPrincipal Controle;


public PainelPrincipal(ControleDoPainelPrincipal controle) {
	this.Controle = Controle;
    iniciarComponentes();
	setupe();
	componetes();
	executar();
    
}


private void executar() {
	setTitle("SISTEMA DE CONTROLE");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(690, 499);
	setLocationRelativeTo(null);
	
}

private void componetes() {
	painel1.add(painel2);
	painel2.add(rotulo1);
	painel1.add(painel3);
	painel3.add(painel5);
	painel5.add(butao1);
	painel5.add(butao2);
	painel5.add(butao3);
	painel5.add(painel6);
	painel6.add(background);
	painel5.add(butao4);
	
	painel3.add(painel4);
	painel4.add(rotulo2);
	painel4.add(JScrollPane1);
	
	
	add(painel1);
	
}

private void setupe() {
	painel1.setLayout(new FlowLayout(FlowLayout.CENTER));
	painel6.setLayout(null);
	painel1.setBackground(new Color(51,255,51));
	painel2.setBackground(new Color(51,255,51));
	painel4.setBackground(new Color(128,128,128));
	//painel6.setBackground(new Color(255,255,255));
	
	background = new JPanelWithBackground("src/foodtruck.png");
	background.setSize(160, 190);
}

private void iniciarComponentes() {
	  
	  painel1 = new JPanel();
	  
	  
	  painel2 = new JPanel();
	  painel2.setPreferredSize(new Dimension(690, 43));
	  
	  painel3 = new JPanel();
	  painel3.setPreferredSize(new Dimension(680, 400));
	  
	  painel4 = new JPanel();
	  painel4.setPreferredSize(new Dimension(500, 400));
	  
	  painel5 = new JPanel();
	  painel5.setPreferredSize(new Dimension(160, 400));
	  
	  painel6 = new JPanel();
	  painel6.setPreferredSize(new Dimension(160, 190));
	  /// ----------------------------Estrutura da tabela----------
	  tabela1 = new JTable();
	  JScrollPane1 = new JScrollPane();
	  tabela1.setModel(new DefaultTableModel(new Object[][] {
			  {null, null, null, null},
              {null, null, null, null},
			  {null, null, null, null},
              {null, null, null, null}

		}, new String[] { "NºPedido", "Produto", "Preço" , "Tempo"}));

		JScrollPane1.setViewportView(tabela1);
		JScrollPane1.setPreferredSize(new Dimension(500, 400));
	  ////----------------------------------
	  
	  
	  
	  

	  
	  
	  
	  
	  rotulo1 = new JLabel("SISTEMA DE FOOD TRUCK");
	  rotulo1.setFont(new Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // FONTE DO TEXTO JLABEL
	  rotulo1.setBackground(new Color(255, 0, 51));
	  rotulo1.setHorizontalAlignment(SwingConstants.CENTER);


    
	  
	  rotulo2 = new JLabel("LISTA DE PEDIDOS");
	  rotulo2.setFont(new Font("Tw Cen MT Condensed Extra Bold", 109, 16)); // FONTE DO TEXTO JLABEL
	  rotulo2.setHorizontalAlignment(SwingConstants.CENTER);
	  
	  butao1 = new JButton("PRODUTOS");
	  butao1.setPreferredSize(new Dimension(150, 50));
	  //butao1.addActionListener((ActionListener) this);
	  
	  butao2 = new JButton("CLIENTE");
	  butao2.setPreferredSize(new Dimension(150, 50));
	  //butao1.addActionListener((ActionListener) this);
	  
	  butao3 = new JButton("CADASTRO");
	  butao3.setPreferredSize(new Dimension(150, 50));
	  //butao3.addActionListener((ActionListener) this);
	  
	  butao4 = new JButton("Sair");
	  butao4.setPreferredSize(new Dimension(150, 20));
	  butao4.addActionListener(Controle);
 
}

//mostra a a exteção do painel principal
public void close() {
	dispose();
}
public void mostra() {
	setVisible(true);
}



}