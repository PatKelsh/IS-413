package gameOfLife;

public class golCell {

	int x_coordinate;
	int y_coordinate;
	private boolean alive;
	private boolean newborn;
	private boolean corpse;
	protected gameBoard home;

	public golCell(int x, int y, gameBoard home) {
		x_coordinate = x;
		y_coordinate = y;
		this.home = home;
	}

	public void neighborCount() {
		int neighbors = 0;

		if (neighbors == 0) {
			if (alive) {
				kill();
			}
		} else if (neighbors > 0 && neighbors < 3) {
			if (!alive) {
				birth();
			}
		} else {
			if (alive) {
				kill();
			}
		}
	}

	public void birth() {
		this.alive = true;
		this.newborn = true;
		this.corpse = false;
	}

	public void kill() {
		this.alive = false;
		this.newborn = false;
		this.corpse = true;
	}

	public boolean getAlive() {
		return alive;
	}

	public boolean getNewborn() {
		return newborn;
	}

	public boolean getRecentlyDead() {
		return corpse;
	}
}
