package projeto;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Entrada extends JFrame implements ActionListener {


	JButton btJogo1 = new JButton("Escolha um diretorio");


	public Entrada () {
		this.setTitle("Bem-vindo a Tc&j veiculos");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(400, 200);

		this.add(btJogo1);

		btJogo1.addActionListener(this);
	

		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		Entrada ju = new Entrada();
	}
	@Override
	
	

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btJogo1) {
			 JFileChooser fc = new JFileChooser(); 
	          fc.setFileSelectionMode(JFileChooser. DIRECTORIES_ONLY);
	          int res= fc.showOpenDialog(null);
	         
	          
	          if(res == JFileChooser.APPROVE_OPTION) {   	  
	        	  File diretorio = fc.getSelectedFile();
	        	 
	        	  JOptionPane.showMessageDialog(null, "Seu diretorio é "+diretorio.getName());
	        	  String nome = diretorio.getAbsolutePath();
	        	  
	        	  File ju = new File(nome+"//juliana");
	        	  ju.mkdir();
	        	  nome=ju.getAbsolutePath();
	        	 
	        	  Principal pd = new Principal(nome);
	        	  this.dispose();
	          }
	          else {
	        	  JOptionPane.showMessageDialog(null, "voce nao escolheu o diretorio seu chato");
	        	  
	          }

		}
	





	}

}
