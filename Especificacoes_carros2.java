package projeto;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class Especificacoes_carros2 extends JFrame implements ActionListener {

	JPanel jpainel1 = new JPanel(new GridLayout(7, 1));
 	ImageIcon botao6 = new ImageIcon(getClass().getResource("amarelo-medio.png"));
 	ImageIcon botao7 = new ImageIcon(getClass().getResource("vermelho.png"));
 	JLabel jbnome = new JLabel("");
 	JLabel jbpropaganda = new JLabel("");
 	JLabel jbespecif1 = new JLabel("");
 	JLabel jbespecif2 = new JLabel("");
 	JLabel jbespecif3 = new JLabel("");
 	JLabel jbespecif4 = new JLabel("");
	JMenuBar barra = new JMenuBar();

	JLabel carro = new JLabel();
	
	JButton btJogo1 = new JButton("Comprar");
String dire;
	Carrospromocionais car2 = new Carrospromocionais();
	public Especificacoes_carros2 (Carrospromocionais ok, String Diretorio) {
		dire= Diretorio;
		this.setTitle("Tc&j veiculo-Especificações");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout( new GridLayout(1, 2));
		this.setSize(1100, 600);
		this.add(carro);
		this.add(jpainel1);
		
		car2=ok;
		if(ok.getModelo().equals("lamborghini")) {
			carro.setIcon(botao6);
		}else {	
			carro.setIcon(botao7);
		}
		
		jpainel1.add(jbnome);
		jbnome.setText(car2.getModelo());
		jbnome.setFont(new Font("arial", 1, 20));
		
		jpainel1.add(jbpropaganda);
		jbpropaganda.setFont(new Font("arial", 0, 16));
		
		jbpropaganda.setText(car2.getRecado1());
		jpainel1.add(jbespecif1);
		jbespecif1.setFont(new Font("arial", 0, 16));
		
		jbespecif1.setText(car2.getRecado2());
		jpainel1.add(jbespecif2);
		jbespecif2.setFont(new Font("arial", 0, 16));
		
		jbespecif2.setText(car2.getRecado3());
		jpainel1.add(jbespecif3);
		jbespecif3.setFont(new Font("arial", 0, 16));
		
		jbespecif3.setText(car2.getRecado4());
		jpainel1.add(jbespecif4);
		jbespecif4.setFont(new Font("arial", 0, 16));
		
		jbespecif4.setText(car2.getRecado5());


		jpainel1.add(jbnome);
		jpainel1.add(jbpropaganda);
		jpainel1.add(jbespecif1);
		jpainel1.add(jbespecif2);
		jpainel1.add(jbespecif3);
		jpainel1.add(jbespecif4);
		
		jpainel1.add(btJogo1);
		

		btJogo1.addActionListener(this);
		
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		//ver se 
			
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btJogo1) {
				if(car2!=null) {
					Comprar abrir2 = new Comprar(car2, dire);
					this.dispose();
				}
		}
	
		
	}

}



