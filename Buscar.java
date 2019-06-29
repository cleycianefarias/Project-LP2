package projeto;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class Buscar extends JFrame implements ActionListener {

	JPanel painelbusca = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JLabel jlbbusca = new JLabel("Procurar: ");
	JTextField jtfbusca = new JTextField(40);
	JTextArea tabuscas = new JTextArea(300,300);
	JButton btJogo1 = new JButton("Busca");
	carrosimples car1 = new carrosimples();
	String dire;
	
	public Buscar (String diretorio) {
		dire=diretorio;
		this.setTitle("Tc&j veiculo-Especificações");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(1200, 800);
		this.add(tabuscas);
		this.add(painelbusca, BorderLayout.PAGE_START);
		painelbusca.add(jlbbusca);
		painelbusca.add(jtfbusca);
		painelbusca.add(btJogo1);
		tabuscas.setEditable(false);
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
			File arquivo = new File(dire+"\\TC&J-Vendas.txt");
			try {
				InputStream is = new FileInputStream(arquivo);
				//fluxo de entrada de dados isr
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				String s = br.readLine();
				System.out.println(s);
				while(s!=null) {
					System.out.println(dire);
						String [] vet =s.split(",");
						System.out.println(vet[4]+" "+jlbbusca.getText());
					if(jtfbusca.getText().equalsIgnoreCase(vet[0]) || jtfbusca.getText().equalsIgnoreCase(vet[1])|| jtfbusca.getText().equalsIgnoreCase(vet[2]) ||jtfbusca.getText().equalsIgnoreCase(vet[3]) ||jtfbusca.getText().equalsIgnoreCase(vet[4]) ||jtfbusca.getText().equalsIgnoreCase(vet[5]) ||jtfbusca.getText().equalsIgnoreCase(vet[6])) {
						tabuscas.setText(tabuscas.getText()+vet[0]+" "+vet[1]+" "+vet[2]+" "+vet[3]+" "+vet[4]+" "+vet[5]+" "+vet[6]+"\n");
					}
					
	
					s = br.readLine();
				}
				
				
			}catch (FileNotFoundException nfe) {
				JOptionPane.showMessageDialog(null, "Arquivo não existe");
			}catch (IOException ioe) {
				System.out.println("vc nao tem permissao para ler");
			}
			arquivo.toString();
		}
	
		
	}

}



