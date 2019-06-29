package projeto;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class Comprar extends JFrame implements ActionListener {

	JPanel jpainel1 = new JPanel(new GridLayout(4, 1));
	JPanel jpainel2 = new JPanel(new GridLayout(1, 3));
	JPanel jpainel3b = new JPanel(new GridLayout(3, 1));
	JPanel jpainel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel jpainel3c = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel jpainel3d = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel jpainel4 = new JPanel(new GridLayout(1, 3));
	JPanel jpainel5 = new JPanel(new GridLayout(4,1));
	JPanel jpainel5A = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel jpainel5B = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel jpainel5C = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel jpainel5D = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel jpainel6 = new JPanel(new GridLayout(1, 3));
	JPanel jpainel7 = new JPanel(new GridLayout(3, 1));
	JPanel jpainel7B = new JPanel(new GridLayout(1, 2));
	JPanel jpainel7C = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel jpainel7D = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel jpainel8 = new JPanel(new FlowLayout());
	JLabel jl1= new JLabel("Codigo do vendedor: ");
	JTextField jtf1 = new JTextField(50);

	JLabel jl2= new JLabel("Nome: ");
	JTextField jtf2 = new JTextField(50);

	JLabel aff1= new JLabel("Valor: ");
	JTextField aff2 = new JTextField(50);
	JLabel abba= new JLabel("Modelo: ");
	JTextField abba2 = new JTextField(50);

	JLabel jl3= new JLabel("CPF: ");
	JTextField jtf3 = new JTextField(11);

	JLabel jl4= new JLabel("RG: ");
	JTextField jtf4 = new JTextField(9);

	JLabel jl5= new JLabel("Renda Per Capita: ");
	JTextField jtf5 = new JTextField(50);

	JLabel jl6= new JLabel("Telefone: ");
	JTextField jtf6 = new JTextField(11);

	JLabel jl7= new JLabel("Numero do Cart„o: ");
	JTextField jtf7 = new JTextField(16);

	JLabel jl8= new JLabel("Senha: ");
	JTextField jtf8 = new JTextField(6);

	JButton vaiquecola = new JButton("Tente a sorte");

	JLabel jbnome = new JLabel("Verssıes: ");
	JLabel jlcor= new JLabel("Cor: ");

	JRadioButton rb1modelo = new JRadioButton("Sport");
	JRadioButton rb1modelo2 = new JRadioButton("EXL");
	JRadioButton rb1modelo3 = new JRadioButton("EX");
	ButtonGroup bgtipo = new ButtonGroup();

	JRadioButton rb1cor = new JRadioButton("Preto");
	JRadioButton rb1cor2 = new JRadioButton("Vermelho");
	JRadioButton rb1cor3 = new JRadioButton("Branco");
	ButtonGroup bgcor = new ButtonGroup();

	JRadioButton rb1pg = new JRadioButton("Cart„o");
	JRadioButton rb1pg2 = new JRadioButton("Dinheiro");

	ButtonGroup bgpg = new ButtonGroup();


	JMenuBar barra = new JMenuBar();

	JButton btJogo1 = new JButton("Comprar");


	public Comprar () {
		this.setTitle("Em Busca da Luz");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout( new GridLayout(5, 1));
		this.setSize(750, 600);

		this.add(jpainel3b);
		jpainel3b.add(jpainel3);
		jpainel3b.add(jpainel3d);
		jpainel3b.add(jpainel3c);
		jpainel3c.add(aff1);
		jpainel3c.add(aff2);
		aff2.setEditable(false);

		jpainel3d.add(abba);
		jpainel3d.add(abba2);
		abba2.setEditable(false);
		this.add(jpainel5);
		this.add(jpainel1);

		jpainel5.add(jpainel5A);
		jpainel5A.add(jl2);
		jpainel5A.add(jtf2);




		jpainel5.add(jpainel5B);
		jpainel5B.add(jl3);
		jpainel5B.add(jtf3);

		jpainel5B.add(jl4);
		jpainel5B.add(jtf4);



		jpainel5.add(jpainel5C);
		jpainel5C.add(jl5);
		jpainel5C.add(jtf5);





		jpainel5.add(jpainel5D);

		jpainel5D.add(jl6);
		jpainel5D.add(jtf6);


		//jpainel5.add(jbnome);
		this.add(jpainel7);
		jpainel7.add(jpainel7B);
		jpainel7B.add(rb1pg);
		jpainel7B.add(rb1pg2);

		jpainel7.add(jpainel7C);
		jpainel7.add(jpainel7D);
		jpainel7C.add(jl7);
		jpainel7C.add(jtf7);
		jpainel7D.add(jl8);
		jpainel7D.add(jtf8);

		jpainel3.add(jl1);
		jpainel3.add(jtf1);
		jpainel1.add(jbnome);


		//jpainel1.add(btJogo1);
		jpainel1.add(jpainel2);
		jpainel1.add(jlcor);
		jpainel1.add(jpainel6);
		jpainel6.add(rb1cor);
		jpainel6.add(rb1cor2);
		jpainel6.add(rb1cor3);
		bgcor.add(rb1cor);
		bgcor.add(rb1cor2);
		bgcor.add(rb1cor3);

		bgtipo.add(rb1modelo);
		bgtipo.add(rb1modelo2);
		bgtipo.add(rb1modelo3);
		bgpg.add(rb1pg);
		bgpg.add(rb1pg2);
		jpainel2.add(rb1modelo);
		jpainel2.add(rb1modelo2);
		jpainel2.add(rb1modelo3);
		this.add(jpainel8);
		jpainel8.add(btJogo1);
		jpainel8.add(vaiquecola);
		vaiquecola.setEnabled(false);
		vaiquecola.addActionListener(this);
		btJogo1.addActionListener(this);
		rb1pg.addActionListener(this);
		rb1pg2.addActionListener(this);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		//ver se 


	}
	String diretorio;
	Carrospromocionais carro = new Carrospromocionais();
	carrosimples ka = new carrosimples();
	public Comprar(Carrospromocionais car, String ki) {
		this();
		diretorio = ki;
		carro=car;
		abba2.setText(car.getModelo());
		car.ipva();
		aff2.setText(""+car.getValor());
		vaiquecola.setEnabled(true);
	}
	public Comprar(Carro car2, String ki) {
		this();
		diretorio = ki;
		ka=(carrosimples) car2;
		car2.ipva();
		abba2.setText(ka.getModelo());
		aff2.setText(""+ka.getValor());
	}String cor;
	String modelo;
	String formadepagamento;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btJogo1) {

			if(rb1cor.isSelected()) {
				cor = rb1cor.getText();
			}else {
				if(rb1cor2.isSelected()) {
					cor = rb1cor2.getText();
				}else {
					if(rb1cor3.isSelected()) {
						cor = rb1cor3.getText();
					}
				}
			}

			if(rb1modelo.isSelected()) {
				modelo = rb1modelo.getText();
			}else {
				if(rb1modelo2.isSelected()) {
					modelo= rb1modelo2.getText();
				}else {
					if(rb1modelo3.isSelected()) {
						modelo = rb1modelo3.getText();
					}
				}
			}

			if(rb1cor.isSelected()) {
				formadepagamento = rb1pg.getText();
			}else {
				if(rb1cor2.isSelected()) {
					formadepagamento = rb1pg2.getText();
				}
			}
			System.out.println(cor+" "+modelo+" "+formadepagamento);
			File ju = new File(diretorio+"//juliana");
			//ju.mkdir();
			File arquivo = new File(ju,"TC&J-Vendas.txt");
			try {
				arquivo.createNewFile();
			}catch (IOException e1) {
				System.out.println("nao foi possivel criar o arquivo!");	
			}
			File arquivo2 = new File(diretorio+"\\TC&J-Vendas.txt");
			//com o true ele vai escrever no fim do arquivo

			//ele exclui o que est√° l√° e escreve em cima 
			try {
				OutputStream os = new FileOutputStream(arquivo2, true);
				OutputStreamWriter osw = new OutputStreamWriter(os);
				String v1 = jtf1.getText();
				String v2 = jtf2.getText();
				String v3 =abba2.getText();
				String v4 = aff2.getText();
				String v5 = cor;
				String v6 =modelo;
				String v7 = formadepagamento;
				if(v1==null || v1.equals("")||v2.equals("")||v2 ==null ||v3.equals("")|| v3==null || v4.equals("")||v4==null || v5.equals("")||v5==null|| v6.equals("")||v6==null|| v7.equals("")||v7==null) {
					throw new IllegalArgumentException();
				}

				osw.write(v1+","+v2+","+v3+","+v4+","+v5+","+v6+","+v7+"\r\n");
				osw.close();
				JOptionPane.showMessageDialog(null, "Parabens voce ganhou um sonho durma para poder usar seu carro");
				this.dispose();
			} catch (IllegalArgumentException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Campos vazio(s)");
			}
			catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}



		}
		if(e.getSource()==vaiquecola) {
			if(carro.sorteio()) {
				JOptionPane.showMessageDialog(null, "Parabens voce ganhou um super desconto");
				aff2.setText(""+carro.getValor());
			}else {
				JOptionPane.showMessageDialog(null, "Que pena n„o foi dessa vez :-) (1971)");
			}
		}
		if(e.getSource()==rb1pg2) {
			this.jtf8.setEnabled(false);
			this.jtf7.setEnabled(false);
		}
		if(e.getSource()==rb1pg) {
			this.jtf8.setEnabled(true);
			this.jtf7.setEnabled(true);
		}
	}

}



