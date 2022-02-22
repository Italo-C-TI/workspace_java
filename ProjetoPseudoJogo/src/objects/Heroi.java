package objects;

public class Heroi extends GameObject {
	private int dirH;
	private int dirV;
	
	public int getDirH() {
		return dirH;
	}

	public void setDirH(int dirH) {
		this.dirH = dirH;
	}

	public int getDirV() {
		return dirV;
	}

	public void setDirV(int dirV) {
		this.dirV = dirV;
	}

	

	public Heroi(String filename, int x, int y) {
		super(filename, x, y);
	}

	@Override
	public void update() {
		this.x = this.x + 5 * dirH;
		this.y = this.y + 5 * dirV;
	}
	
	
	
	
	
}
