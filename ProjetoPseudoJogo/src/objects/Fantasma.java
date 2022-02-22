package objects;

public class Fantasma extends GameObject {
	
	private int modoV;
	private int velocidade; 
	
	public Fantasma(String filename, int x, int y, int modoV, int velocidade) {
		super(filename, x, y);
		// TODO Auto-generated constructor stub
		this.modoV = modoV;
		this.velocidade = velocidade;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.y = this.y + velocidade * modoV;
		if (this.y > 450 || this.y <= 0) {
			modoV = modoV * -1;
		}
	}

	

}
