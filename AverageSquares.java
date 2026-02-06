import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the start value: ");
        double startNum = in.nextInt(); // Reads in an int from standard input
        in.nextLine();

        System.out.print("Please enter the end value: ");
        double endNum = in.nextInt();

        System.out.println("You entered: " + startNum + " and " + endNum);
        System.out.println("average of squares from "+startNum+" to "+endNum);
        double total = 0;
        double i = startNum;
        while(i<endNum+1) {
        double square = i*i;
        total = total + square;
        ++i;
     }
        
        double average= total/(endNum-startNum);
         System.out.print(average);
         System.out.println();

    }
}