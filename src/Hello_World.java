import java.util.Scanner;
public class Hello_World {

    public static void main(String[] args) {
        //en simpel hello world som printer Andras hvis indtastet, eller Hello World! hvis ikke.
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv dit navn");
        String name = input.nextLine();
        if(name.equals("Andras"))
            System.out.println("Hello Andras!");
        else
            System.out.println("Hello World!");

        }
    }


