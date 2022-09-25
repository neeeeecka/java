import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, this is Java parrot, type 'bye' to exit.");

        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("Your input: ");
            String line = in.nextLine();
            if(line.equals("bye")){
                return;
            }
            System.out.println("Java parrot: " + line);
        }
    }
}