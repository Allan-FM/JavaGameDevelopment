package Game;

public class MathOperations {
    public static void main(String[] args) {
        int vida1 = 100;
        int vida2 = 100;
        // int vidaFinal = vida1 + vida2;

        int vida3 = 200;

        int vidaFinal_1 = ((vida1 + vida2) * vida3) / vida2;
        // System.out.println(vidaFinal_1);

        String playerName = "Allan";
        int playerSkill = 100;

        if (playerName == "Allan" && playerSkill == 100) {
            System.out.println("Start!");
        } else {
            System.out.println("Erro!");
        }
        if (playerName == "Felipe" || playerSkill <= 100) {
            System.out.println("Start!");
        } else {
            System.out.println("Erro!");
        }
        if((playerName == "Allan" || playerSkill > 100) && playerSkill != 100)
        {
            System.out.println("Start!");
        }else{
            System.out.println("Erro!");
        }

    }
}
