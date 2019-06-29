package projeto;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class Principal extends JFrame implements ActionListener {
	ImageIcon fundo = new ImageIcon(getClass().getResource("Fundo5.png"));
	ImageIcon nomes = new ImageIcon(getClass().getResource("Grupo.png"));
	ImageIcon botao3 = new ImageIcon(getClass().getResource("2013-Honda-Accord-Sedan-PNG-redi.png"));
	ImageIcon botao = new ImageIcon(getClass().getResource("corolavermelho-redu.png"));
	ImageIcon botao2 = new ImageIcon(getClass().getResource("amarelo.png"));
	ImageIcon botao4 = new ImageIcon(getClass().getResource("marron.png"));
	ImageIcon botao5 = new ImageIcon(getClass().getResource("preto.png"));
	ImageIcon botao6 = new ImageIcon(getClass().getResource("verde.png"));

	JMenuBar barra = new JMenuBar();

	JMenu jogo = new JMenu("CADASTRO");
	JMenuItem ki = new JMenuItem("BUSCAR");
	JMenuItem miFuncionario = new JMenuItem("Funcionario");
	JMenuItem micliente = new JMenuItem("Cliente");
	JLabel Fundo = new JLabel();
	JButton btTeste = new JButton();


	ImageIcon img1 = new ImageIcon(getClass().getResource("Grupo.png"));


	JButton btJogo1 = new JButton();
	JButton btJogo2 = new JButton();
	JButton btJogo3 = new JButton();
	JButton btJogo4 = new JButton();
	JButton btJogo5 = new JButton();
	JButton btJogo6 = new JButton();
	String diretorio;
	public Principal (String direct) {
		diretorio = direct;
		this.setTitle("Bem-vindo a Tc&j veiculos");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1400, 800);

		this.add(Fundo);

		ki.setFont(new Font("arial", 1, 14));

		Fundo.add(barra);
		barra.setBounds(0, 50, 1400, 25);
		jogo.add(miFuncionario);
		jogo.add(micliente);
	
		barra.add(jogo);
		barra.add(ki);
		jogo.setFont(new Font("Arial", Font.BOLD,14));

		Fundo.setIcon(fundo);
		Fundo.setBounds(0, -50, 1400, 800);
		Fundo.add(btJogo1);

		Fundo.add(btTeste);
		btTeste.setBounds(680, 55, 1000, 40);
		btTeste.setIcon(img1);
		btTeste.addActionListener(this);
		btTeste.addActionListener(this);
		btTeste.setBorder(null);
		btTeste.setBorderPainted(false);
		btTeste.setContentAreaFilled(false);
		btTeste.setOpaque(false);


		btJogo1.setIcon(botao3);
		btJogo1.setBounds(50, 655, 200, 100);
		btJogo1.setBorder(null);
		btJogo1.setBorderPainted(false);
		btJogo1.setContentAreaFilled(false);
		btJogo1.setOpaque(false);


		Fundo.add(btJogo2);
		btJogo2.setIcon(botao);
		btJogo2.setBounds(263, 655, 200, 100);
		btJogo2.setBorder(null);
		btJogo2.setBorderPainted(false);
		btJogo2.setContentAreaFilled(false);
		btJogo2.setOpaque(false);


		Fundo.add(btJogo3);
		btJogo3.setIcon(botao4);
		btJogo3.setBounds(488, 655, 200, 100);
		btJogo3.setBorder(null);
		btJogo3.setBorderPainted(false);
		btJogo3.setContentAreaFilled(false);
		btJogo3.setOpaque(false);

		btJogo4.setIcon(botao2);
		btJogo4.setBounds(698, 655, 200, 100);
		btJogo4.setBorder(null);
		btJogo4.setBorderPainted(false);
		btJogo4.setContentAreaFilled(false);
		btJogo4.setOpaque(false);
		Fundo.add(btJogo4);

		btJogo5.setIcon(botao5);
		btJogo5.setBounds(898, 655, 200, 100);
		btJogo5.setBorder(null);
		btJogo5.setBorderPainted(false);
		btJogo5.setContentAreaFilled(false);
		btJogo5.setOpaque(false);
		Fundo.add(btJogo5);

		btJogo6.setIcon(botao6);
		btJogo6.setBounds(1120, 655, 200, 100);
		btJogo6.setBorder(null);
		btJogo6.setBorderPainted(false);
		btJogo6.setContentAreaFilled(false);
		btJogo6.setOpaque(false);
		Fundo.add(btJogo6);

		btJogo1.addActionListener(this);
		btJogo2.addActionListener(this);
		btJogo3.addActionListener(this);
		btJogo4.addActionListener(this);
		btJogo5.addActionListener(this);
		btJogo6.addActionListener(this);
		miFuncionario.addActionListener(this);
		micliente.addActionListener(this);
		ki.addActionListener(this);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		Principal tclagmf = new Principal("cade o bebe achooou");
	}
	Carrospromocionais carropro = new Carrospromocionais();
	carrosimples carrosim = new carrosimples();
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btJogo1) {
			carrosim.setModelo("Honda Accord");
			carrosim.setRecado1("Pensado para impressionar.");
			carrosim.setRecado2("Motor 3.5l V6 i-VTEC de 280cv com sistema VCM®;");
			carrosim.setRecado3("Multimídia de 7\\\" multi-touchscreen com navegador integrado; ");
			carrosim.setRecado4("Smart Key com Smart Entry; ");
			carrosim.setRecado5("Sistema Honda LaneWatch™. ");
			carrosim.setCor("");
			carrosim.setValor(400.000);
			Especificacoes_carros outra = new Especificacoes_carros(carrosim, diretorio);
		}

		if(e.getSource()==btJogo2) {
			carrosim.setModelo("Toyota Corolla");
			carrosim.setRecado1("CVT com modo manual;");
			carrosim.setRecado2("136 cv Velocidade máxima 187 km/h;");
			carrosim.setRecado3("Direção elétrica; ");
			carrosim.setRecado4("Quatro freios à disco com dois discos ventilados;");
			carrosim.setRecado5("Roda tipo semi-independente e molas helicoidal.");
			carrosim.setCor("");
			carrosim.setValor((long) 800000.00);
			Especificacoes_carros outra = new Especificacoes_carros(carrosim, diretorio);

		}
		if(e.getSource()==btJogo3) {
			carrosim.setModelo("HYUNDAI HB20");
			carrosim.setRecado1("Grade frontal hexagonal com borda cromada;");
			carrosim.setRecado2("Faróis com máscara negra;");
			carrosim.setRecado3("Freios: Discos ventilados (diant.) e tambores (tras.);");
			carrosim.setRecado4("Comprimento 3,92 m; Largura 1,68 m; Altura 1,47 m; Entre-eixos: 2,50 m;");
			carrosim.setRecado5("Roda tipo semi-independente e molas helicoidal.");
			carrosim.setCor("");
			carrosim.setValor(95000.00);
			Especificacoes_carros outra = new Especificacoes_carros(carrosim, diretorio);
		}
		if(e.getSource()==btJogo4) {
			carropro.setModelo("lamborghini");
			carropro.setRecado1("Velocidade Máxima 350 km/h;");
			carropro.setRecado2("Aceleração (0-100 km/h)2.9s;");
			carropro.setRecado3("Cilindrada 6498 cc;");
			carropro.setRecado4("Distribuição Dupla árvore de cames à cabeça;");
			carropro.setRecado5("Combustível Gasolina.");
			carropro.setCor("");
			carropro.setValor(3000000.00);
			Especificacoes_carros2 outra = new Especificacoes_carros2(carropro, diretorio);
		}
		if(e.getSource()==btJogo5) {
			carropro.setModelo("Ranger");
			carropro.setRecado1("Velocidade Máxima 350 km/h;");
			carropro.setRecado2("Aceleração (0-100 km/h)2.9s;");
			carropro.setRecado3("Cilindrada 6498 cc;");
			carropro.setRecado4("Distribuição Dupla árvore de cames à cabeça;");
			carropro.setRecado5("Combustível Gasolina.");
			carropro.setCor("");
			carropro.setValor(2000000.00);
			Especificacoes_carros2 outra = new Especificacoes_carros2(carropro, diretorio);
		}
		if(e.getSource()==btJogo6) {
			carrosim.setModelo("S10");
			carrosim.setRecado1("Suspensão tipo eixo transversal (beam);");
			carrosim.setRecado2("Roda tipo rígida e molas feixe de lâminas;");
			carrosim.setRecado3("Dois freios à disco com dois discos ventilados.;");
			carrosim.setRecado4("Automático");
			carrosim.setRecado5("Cabine Dupla.");
			carrosim.setCor("");
			carrosim.setValor(4000000);
			Especificacoes_carros outra = new Especificacoes_carros(carrosim , diretorio);
		}
		if(e.getSource()== miFuncionario) {
				Novocadastrofuncionario tglamgi = new Novocadastrofuncionario(diretorio);
		}
		if(e.getSource()== micliente) {
			Novocadastroclesn ju = new Novocadastroclesn(diretorio);
		}
		if(e.getSource()==ki) {
			Buscar kiko = new Buscar(diretorio);
		}


	}

}
