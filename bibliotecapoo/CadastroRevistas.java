import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class CadastroRevistas extends JFrame {

	private JPanel contentPane;
	private JTextField tituloRevista;
	private JTextField orgRevista;
	private JTextField volRevista;
	private JTextField nroRevista;
	private JTextField anoRevista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroRevistas frame = new CadastroRevistas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroRevistas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Revistas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EDtulo:");
		
		JLabel lblNewLabel_2 = new JLabel("Org:");
		
		JLabel lblNewLabel_3 = new JLabel("Vol:");
		
		JLabel lblNewLabel_4 = new JLabel("Nro:");
		
		JLabel lblNewLabel_5 = new JLabel("Ano:");
		
		tituloRevista = new JTextField();
		tituloRevista.setColumns(10);
		
		orgRevista = new JTextField();
		orgRevista.setColumns(10);
		
		volRevista = new JTextField();
		volRevista.setColumns(10);
		
		nroRevista = new JTextField();
		nroRevista.setColumns(10);
		
		anoRevista = new JTextField();
		anoRevista.setColumns(10);
		
		JButton btnIncluirRevista = new JButton("Incluir");
		btnIncluirRevista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    cadastrarRevistas();
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
			
		});
		
		JButton btnLivros = new JButton("Livros");
		btnLivros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroLivros cadastrolivros = new CadastroLivros();
				cadastrolivros.setVisible(true);
				setVisible(false);
				
			}
		});
		
		JButton btnListagem = new JButton("Listagem");
		btnListagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listagem listagem = new Listagem();
				listagem.setVisible(true);
				setVisible(false);
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(orgRevista))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(volRevista, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addGap(65)
									.addComponent(lblNewLabel_4)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(nroRevista, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addGap(30)
									.addComponent(lblNewLabel_5)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(anoRevista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblNewLabel_1)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(tituloRevista, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))))
							.addContainerGap(51, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnIncluirRevista)
							.addGap(70)
							.addComponent(btnLivros)
							.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
							.addComponent(btnListagem)
							.addGap(30))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(tituloRevista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(orgRevista, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(volRevista, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4)
						.addComponent(nroRevista, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5)
						.addComponent(anoRevista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIncluirRevista)
						.addComponent(btnLivros)
						.addComponent(btnListagem))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void cadastrarRevistas() throws Exception{
		try {
			String org;
			String titulo;
			String vol;
			String nro;
			String ano;
			org = orgRevista.getText();
			titulo = tituloRevista.getText();
			nro = nroRevista.getText();
			vol = volRevista.getText();
			ano = anoRevista.getText();
			
			if(org.equals("")|| titulo.equals("")|| ano.equals("")|| nro.equals("")|| vol.equals(""))  {
				throw new Exception ("preencha todos os campos");
				
			}
			else {
				Revistas revistas = new Revistas(org, Integer.parseInt(vol),Integer.parseInt(nro), titulo,Integer.parseInt(ano));
				
				Revistas.incluirRevistas(revistas);
				JOptionPane.showMessageDialog(null, "Revista criado!", "", JOptionPane.INFORMATION_MESSAGE);
				
			}
				
				
				
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e + "\nNao foi possivel cadastrar sua Revista", "Cliente Error", JOptionPane.ERROR_MESSAGE);
			
		}
	}

}
