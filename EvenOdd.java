import java.util.Scanner;
public class EvenOdd {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
     System.out.print("Enter a number: ");
        int num = reader.nextInt();
    if(num % 2 == 0)
            System.out.println("number is"+num);
        else
            System.out.println("number is"+ num);
    }
}
