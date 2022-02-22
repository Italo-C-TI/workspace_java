package objects;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class GameObject {
	protected JLabel imagem;
	protected int x;
	protected int y;
	
	public GameObject(String filename, int x, int y) {
		this.imagem = new JLabel(new ImageIcon(filename));
		this.x = x;
		this.y = y;
		this.getImagem().setBounds(x, y, 75,75);
		
	}

	public JLabel getImagem() {
		return imagem;
	}

	public void setImagem(JLabel imagem) {
		this.imagem = imagem;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public abstract void update();
	
	public void draw() {
		imagem.setBounds(this.x, this.y, this.imagem.getWidth(), this.imagem.getHeight());
	}
}
