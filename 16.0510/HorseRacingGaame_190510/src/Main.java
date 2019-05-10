
public class Main {
	public static void main(String[] args) {
		String star = "★";
		String star_2 = "☆";
		String move = "..";
		String move_2 = ".....";
		String print = "";
		String reset = "";

		for (int i = 0; i < 100; i++) {
			star = star + move;
			star_2 = star_2 + move_2;
			System.out.println(new StringBuffer(star).reverse().toString());
			System.out.print(new StringBuffer(star_2).reverse().toString());

			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}

			for (int j = 0; j < 80; j++)
				System.out.println();

		}
	}
}
