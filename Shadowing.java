package enthuware;

public class Shadowing {
	int x = 5;
	int getX() {
		return x;
	}

	public void looper() {
		int x = 0;
		while ((x = getX()) != 0) {
			for (int m = 10; m >= 0; m--) {
				x = m;
			}
		}
	}
	
	public static void main(String args[]) throws Exception {
		Shadowing tc = new Shadowing();
		tc.looper();
		System.out.println(tc.x);
	}
}

