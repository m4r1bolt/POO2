import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class CadastroLivros extends JFrame {

	private JPanel contentPane;
	private JTextField tituloLivro;
	private JTextField autorLivro;
	private JTextField anoLivro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroLivros frame = new CadastroLivros();
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
	public CadastroLivros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Livros");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EDtulo:");
		
		JLabel lblNewLabel_2 = new JLabel("Autor:");
		
		JLabel lblNewLabel_3 = new JLabel("Ano:");
		
		JButton btnIncluirL = new JButton("Incluir");
		btnIncluirL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    cadastrarLivros();
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
			}
		});
		
		JButton btnRevista = new JButton("Revista");
		btnRevista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroRevistas cadastrorevistas = new CadastroRevistas();
				cadastrorevistas.setVisible(true);
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
		
		tituloLivro = new JTextField();
		tituloLivro.setColumns(10);
		
		autorLivro = new JTextField();
		autorLivro.setColumns(10);
		
		anoLivro = new JTextField();
		anoLivro.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_3)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(anoLivro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(182)
									.addComponent(lblNewLabel)
									.addGap(39))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(btnIncluirL)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnRevista)
									.addGap(27)))
							.addComponent(btnListagem))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(autorLivro))
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tituloLivro, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(73, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(tituloLivro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(autorLivro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(anoLivro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIncluirL)
						.addComponent(btnListagem)
						.addComponent(btnRevista))
					.addGap(19))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void cadastrarLivros() throws Exception{
		try {
			String autor;
			String titulo;
			String ano;
			autor = autorLivro.getText();
			titulo = tituloLivro.getText();
			ano = anoLivro.getText();
			
			if(autor.equals("")|| titulo.equals("")|| ano.equals("")) {
				throw new Exception ("preencha todos os campos");
				
			}
			else {
				Livros livros = new Livros(autor, titulo, Integer.parseInt(ano));
				Livros.incluirLivros(livros);
				JOptionPane.showMessageDialog(null, "Livro criado!", "", JOptionPane.INFORMATION_MESSAGE);
				
			}
				
				
				
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e + "\nNao foi possivel cadastrar seu livro", "Cliente Error", JOptionPane.ERROR_MESSAGE);
			
		}
	}
}
