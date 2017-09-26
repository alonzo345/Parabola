import java.util.Scanner;

/**
 * The class containing a main method and eventually, GUI.
 * 
 * @author Alon Zohar
 */
public class ParabolaCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Parabola parabola;

		char keepAsking;

		do {
			System.out.println("Enter your Parabola type: ");
			System.out.println("1 - Standard");
			System.out.println("2 - Vertex");
			System.out.println("3 - Intercept");
			int choice = scan.nextInt();

			while (!(choice == 1 || choice == 2 || choice == 3)) {
				System.out.println("You entered an invalid number.");
				choice = scan.nextInt();
			}

			if (choice == 1) {
				System.out
						.println("You chose the \"ax^2 + bx + c\" Parabola form.");
				System.out.print("Enter a: ");
				double a = scan.nextDouble();
				System.out.print("Enter b: ");
				double b = scan.nextDouble();
				System.out.print("Enter c: ");
				double c = scan.nextDouble();
				parabola = new StandardForm(a, b, c);
			} else {
				if (choice == 2) {
					System.out
							.println("You chose the \"a(x - p)^2 + k\" Parabola form.");
					System.out.print("Enter a: ");
					double a = scan.nextDouble();
					System.out.print("Enter p: ");
					double p = scan.nextDouble();
					System.out.print("Enter k: ");
					double k = scan.nextDouble();
					parabola = new VertexForm(a, p, k);
				} else {
					System.out
							.println("You chose the \"a(x - x1)(x - x2)\" Parabola form.");
					System.out.print("Enter a: ");
					double a = scan.nextDouble();
					System.out.print("Enter x1: ");
					double x1 = scan.nextDouble();
					System.out.print("Enter x2: ");
					double x2 = scan.nextDouble();
					parabola = new InterceptForm(a, x1, x2);
				}
			}

			System.out.println(parabola);

			System.out.print("Enter another one?(y/n) ");
			keepAsking = scan.next().charAt(0);
		} while (keepAsking == 'y');
		scan.close();
	}
}