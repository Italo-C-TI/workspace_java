package scene;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import objects.Fantasma;
import objects.GameObject;
import objects.Heroi;

public class Fase extends JFrame implements Runnable, KeyListener {
	private GameObject objetos[];
	private Heroi heroi;
	
	private static final int ESQUERDA = 37;
	private static final int DIREITA  = 39;
	private static final int CIMA     = 38;
	private static final int BAIXO    = 40;
	
	public Fase() {
		addKeyListener(this);
		setTitle("Meu Peceudo Jogo");		
		setBounds(0, 0, 640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		
		objetos = new GameObject[5];
		objetos[0] = new Heroi("c:\\users\\isidro\\Desktop\\workspace_ifood\\ProjetoPseudoJogo\\mario.png", 100, 100);
		objetos[1] = new Fantasma("c:\\users\\isidro\\Desktop\\workspace_ifood\\ProjetoPseudoJogo\\ghost.png", 10, 10, 1, 10);
		objetos[2] = new Fantasma("c:\\users\\isidro\\Desktop\\workspace_ifood\\ProjetoPseudoJogo\\ghost2.png", 150, 10, 1, 15);
		objetos[3] = new Fantasma("c:\\users\\isidro\\Desktop\\workspace_ifood\\ProjetoPseudoJogo\\ghost3.png", 250, 10, 1, 25);
		objetos[4] = new Fantasma("c:\\users\\isidro\\Desktop\\workspace_ifood\\ProjetoPseudoJogo\\ghost.png", 350, 10, 1, 10);
		//objetos[5] = new Heroi("c:\\users\\isidro\\Desktop\\workspace_ifood\\ProjetoPseudoJogo\\mario.png", 100, 200,1);
		heroi = (Heroi)objetos[0];
		
		for (GameObject g: objetos) {
			getContentPane().add(g.getImagem());
		}
		Thread t= new Thread(this);
		t.start();
		
		
	}
	
	public void update() {
		for(GameObject g: objetos) {
			g.update();
		}
	}
	
	public void draw() {
		getContentPane().removeAll();
		for(GameObject g: objetos) {
			g.draw();
			getContentPane().add(g.getImagem());
		}
		repaint();
		
	}

	@Override
	public void run() {

		// fará o loop do jogo
		while (true) {
			try {
				Thread.sleep(50);
				update();
				draw();
			}
			catch(InterruptedException ex) {
				System.err.println("erro ao atualizar o jogo");
			}
		}		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == ESQUERDA) {
			heroi.setDirH(-1);
		}
		else if (code == DIREITA) {
			heroi.setDirH(1);
		}
		
		if (code == CIMA) {
			heroi.setDirV(-1);
		}
		else if (code == BAIXO) {
			heroi.setDirV(1);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == ESQUERDA || code == DIREITA) {
			heroi.setDirH(0);
		}
		if (code == CIMA || code == BAIXO) {
			heroi.setDirV(0);
		}
		
	}

	
	
}
