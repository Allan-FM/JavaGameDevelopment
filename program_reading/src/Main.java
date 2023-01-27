import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String name, age, weight, city, state, coutry;
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Age: ");
        age = input.nextLine();
        System.out.print("weigth: ");
        weight = input.nextLine();
        System.out.print("City: ");
        city = input.nextLine();
        System.out.print("State: ");
        state = input.nextLine();
        System.out.print("Coutry: ");
        coutry = input.nextLine();
        System.out.println("--------------");
        System.out.println("Results: ");
        System.out.println("Name -> " + name);
        System.out.println("Age -> " + age + " years old.");
        System.out.println("Weight -> " + weight + " kg.");
        System.out.println("City -> " + city);
        System.out.println("State -> " + state);
        System.out.println("Coutry -> " + coutry);

        input.close();
    }
}
