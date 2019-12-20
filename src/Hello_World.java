import java.util.Scanner;
public class Hello_World {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("Who are you? please enter you name: ");
        String Andras = input.nextLine();
        if (input.equals(Andras)) {
            System.out.println("Hello " + Andras + "!");

        } else {
            System.out.println("Hello World!");
        }

    }


}
