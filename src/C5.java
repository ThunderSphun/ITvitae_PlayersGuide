import java.util.Scanner;

public class C5 {
    public static void main(String[] args) {
        System.out.println("What kind of thing are we talking about?");

        Scanner input = new Scanner(System.in);
        String a = input.next(); // describes the type of thing

        System.out.println("How would you describe it? Big? Azure? Tattered?");
        /*
        * The descriptor of the object
        * */
        String b = input.next();
        String c = "of Doom";
        String d = "3000";

        System.out.println("The " + b + " " + a + " " + c + " " + d + "!");
    }
}
