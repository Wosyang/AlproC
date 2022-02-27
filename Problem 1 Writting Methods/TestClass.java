import java.util.Scanner;

public class TestClass {
    public static void main(String[] args){

        ComputeMethods comet = new ComputeMethods();
        Scanner sc = new Scanner(System.in);

        //user input
        System.out.print("Insert Celcius : ");
        double degreeC = sc.nextDouble();
        System.out.print("Insert a value : ");
        int a = sc.nextInt();
        System.out.print("Insert b value : ");
        int b = sc.nextInt();

        //output
        System.out.println("Temp in celsius is " + comet.fToC(degreeC));
        System.out.println("Hypotenuse is  " + comet.hypotenuse(a, b));
        System.out.println("The sum of the dice values is " + comet.roll());
    }
}
