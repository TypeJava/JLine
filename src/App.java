
//Made By BioShot
import java.util.Scanner;

public class App {
    String[] Varubles = {};

    public static void print(String output) {
        System.out.println(output);
    }

    public static void printInt(int output) {
        System.out.println(output);
    }

    public static void main(String[] args) throws Exception {
        print("Enter code: ");
        Scanner input = new Scanner(System.in);
        if (input.next().contains("print")) {
            String str = input.next();
            String split[] = str.split("print", 5);
            for (String s : split) {
                String spacing = s.replace("-", " ");
                print(spacing);
            }

        } else {
            print("invaild command");
        }
    }
}
