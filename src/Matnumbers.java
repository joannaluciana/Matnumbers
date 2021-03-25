import java.lang.Object;
import java.util.Random;

public class Matnumbers {

	private int arrlength;

	public Matnumbers() {
		super();

	}

	public static int[] makeArray(int arrlength) {

		int[] nuMbers = new int[arrlength];

		for (int i = 0; i < arrlength; i++) {
			nuMbers[i] = i + 1;

		}
		return nuMbers;
	}

	public void printArray(int[] x) {

		for (int s : x) {
			System.out.println(s);
		}

	}

	public static int[] shuffleArray(int[] x) {

		Random ran = new Random();

		for (int i = 0; i < x.length; i++) {

			int ranPos = ran.nextInt(x.length);
			int temp = x[i];
			x[i] = x[ranPos];
			x[ranPos] = temp;
		}

		return x;

	}

}
