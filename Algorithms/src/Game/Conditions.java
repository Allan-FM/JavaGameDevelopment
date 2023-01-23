package Game;

public class Conditions {
    public static void main(String[] args) {
        String name = "Allan";
        int age = 19;
        if(age == 18){
            System.out.println("is 19");
        }
        else{
            System.out.println("correct -> " + age);
        }

        if(name.equals("Allan")){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
