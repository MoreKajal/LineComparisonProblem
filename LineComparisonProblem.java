import java.util.Scanner;

public class LineComparisonProblem
{
        public static void main(String args[]) {
                System.out.println("Welcome to Line Comparison Program");
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter First Line First Co-ordinates");
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();
                System.out.println("Enter First Line Second Co-ordinates");
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();

                double length_L1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
                System.out.println("Length od Line is :" + length_L1);

	}
}

