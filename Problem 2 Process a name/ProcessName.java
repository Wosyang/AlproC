import java.util.Scanner;

public class ProcessName {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        //string manipulation
        int idspace = name.indexOf(' ');
        String realname = name.substring(idspace+1);

        //output
        System.out.println("Enter your name: " + name);
        System.out.println(idspace);
        System.out.println("Your name is: "+ realname + " ," + name.charAt(0));

        }

}
