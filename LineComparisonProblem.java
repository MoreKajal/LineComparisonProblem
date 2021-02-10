import java.util.Scanner;

public class LineComparisonProblem
{
        public static void main(String args[]) {
                System.out.println("Welcome to Line Comparison Program");
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter First Line First Co-ordinates");
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();
                System.out.println("Enter First Line First Co-ordinates");
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();
                System.out.println("Enter Second Line First Co-ordinate");
                int x3 = sc.nextInt();
                int y3 = sc.nextInt();
                System.out.println("Enter Second Line Second Co-ordinate");
                int x4 = sc.nextInt();
                int y4 = sc.nextInt();

                double length_L1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));
                System.out.println("disatnce of Line1 : " + length_L1);
                double length_L2 = Math.sqrt(Math.pow(x4-x3, 2) + Math.pow(y4-y3,2));
                System.out.println("distance of Line2 :" + length_L2);

                if (length_L1 == length_L2)
                        System.out.println("Both the Lines are Equal");
                else
                        System.out.println("Two lines are not equal");

	}
}

