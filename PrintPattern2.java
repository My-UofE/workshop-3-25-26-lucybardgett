import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintPattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;

        while (true){

        System.out.print("Please enter the size: ");
        size = in.nextInt();

        if (size <1){
            System.out.println("too small!");
        }
        if (size>5){
            System.out.println("too big!");
        }
        else{
            break;
        }
        int total = 2*size;

        for(int row = 1;row<=total;row++){
            int base = (row<=size)? row:(2*size-row+1);

            for (int col = 0;col<size;col++){
                System.out.print(base+col);
            }
            for(int col=size-1;col>=0;col--){
                System.out.print(base+col);
            }
        System.out.println();
        }}
        }
}