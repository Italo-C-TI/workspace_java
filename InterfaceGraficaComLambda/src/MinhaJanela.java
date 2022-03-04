import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MinhaJanela extends JFrame {

	public MinhaJanela() {
		setTitle("Exemplo de Lambda");
		setBounds(0, 0, 320, 240);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);

		JButton botao = new JButton();
		botao.setBounds(20, 20, 80, 50);
		botao.setText("Clique!");

		getContentPane().add(botao);

		/* na versão anterior - pré-lambda */
		botao.addActionListener((e) -> {
			JOptionPane.showMessageDialog(MinhaJanela.this, "Clicou!");
		});
	}
}
