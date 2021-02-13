import java.util.Scanner;

public class LineComparisonProblem
{
	private final double x1;
	private final double y1;
	private final double x2;
	private final double y2;

	public LineComparisonProblem(double x1, double y1, double x2, double y2){
		this.x1 = x1;
		this.y1 = y1;
      		this.x2 = x2;
      		this.y2 = y2;
   	}
        
	public double calLengthOfLine(){
		double length = Math.sqrt(Math.pow((x2 - x1),2) +  Math.pow((y2 - y1),2));
     		return length;
   	}

	public static void compareTo(double length_L1, double length_L2) {
		System.out.println(" distance of Line1 :" + length_L1 + " \n distance of Line2 :" + length_L2);
		if (length_L1 > length_L2)
                      System.out.println("Line1 Length is Greater than Line2");
                if (length_L1 < length_L2)
                        System.out.println("Line1 Length is Smaller than Line2");
                else
                        System.out.println("Line1 Length is Equal to Line2");

	}
	
	public static void main(String[] args){
		System.out.println("Welcome to Line Comparison Program");
		LineComparisonProblem length1_coor = new LineComparisonProblem(3,4,5,6);
		LineComparisonProblem length2_coor = new LineComparisonProblem(3.2,4.1,5.5,6.8);
		double length_L1 = length1_coor.calLengthOfLine();
		double length_L2 = length2_coor.calLengthOfLine();
		compareTo(length_L1, length_L2);
	}
}

