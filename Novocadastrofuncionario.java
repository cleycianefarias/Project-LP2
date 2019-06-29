package projeto;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
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

public class Novocadastrofuncionario extends JFrame implements ActionListener {


	JPanel jpainel5A = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel jpainel5B = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel jpainel5C = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel jpainel5D = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel jpainel8 = new JPanel(new FlowLayout());

	JLabel jl2= new JLabel("Nome: ");
	JTextField jtf2 = new JTextField(50);


	JLabel jl3= new JLabel("codigo do vendedo: ");
	JTextField jtf3 = new JTextField(11);

	JLabel jl4= new JLabel("cpf: ");
	JTextField jtf4 = new JTextField(9);

	JLabel jl5= new JLabel("endereço: ");
	JTextField jtf5 = new JTextField(30);

	JLabel jl6= new JLabel("Telefone: ");
	JTextField jtf6 = new JTextField(11);


	JButton btJogo1 = new JButton("Cadastrar");


	public Novocadastrofuncionario () {
		this.setTitle("Tc&j veiculos- Funcionarios");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout( new GridLayout(5, 1));
		this.setSize(650, 300);

		this.add(jpainel5A);
		this.add(jpainel5B);
		this.add(jpainel5C);
		this.add(jpainel5D);
		this.add(jpainel8);

		jpainel5A.add(jl2);
		jpainel5A.add(jtf2);


		jpainel5B.add(jl3);
		jpainel5B.add(jtf3);

		jpainel5B.add(jl4);
		jpainel5B.add(jtf4);

		jpainel5C.add(jl5);
		jpainel5C.add(jtf5);



		jpainel5D.add(jl6);
		jpainel5D.add(jtf6);



		jpainel8.add(btJogo1);
		btJogo1.addActionListener(this);

		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);



	}
	String diretorio;
	public Novocadastrofuncionario(String nome) {
		this();
		diretorio=nome;
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btJogo1) {
			File ju = new File(diretorio+"//juliana");
			// ju.mkdir();
			File arquivo = new File(ju,"TC&J-Funcionario.txt");
			try {
				arquivo.createNewFile();
			}catch (IOException e1) {
				System.out.println("Arquivo existente!");	
			}
			File arquivo2 = new File(diretorio+"\\TC&J-Funcionario.txt");
			//com o true ele vai escrever no fim do arquivo

			//ele exclui o que está lá e escreve em cima 
			try {
				OutputStream os = new FileOutputStream(arquivo2, true);
				OutputStreamWriter osw = new OutputStreamWriter(os);
				String v1 = jtf2.getText();
				String v2 = jtf3.getText();
				String v3 = jtf4.getText();
				String v4 = jtf5.getText();
				String v5 = jtf6.getText();
				if(v1==null || v1.equals("")||v2.equals("")||v2 ==null ||v3.equals("")|| v3==null || v4.equals("")||v4==null || v5.equals("")||v5==null) {
					throw new IllegalArgumentException();
				}
				osw.write(v1+","+v2+","+v3+","+v4+","+v5+"\r\n");

				osw.close();
				JOptionPane.showMessageDialog(null, "Funcionario Cadastrado com sucesso");


				//his.Novo();
				this.dispose();
			}catch (IllegalArgumentException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Campos vazio(s)");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}


		}

	}
}

