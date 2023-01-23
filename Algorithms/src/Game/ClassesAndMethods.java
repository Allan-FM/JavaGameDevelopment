package Game;

public class ClassesAndMethods {
    public static void main(String[] args) {
        /*
         * Player player = new Player();
         * 
         * player.comeToLife();
         * 
         * System.out.println(Player.life);
         */

        Troll troll = new Troll(200);

        troll.Damage();
        System.out.println(troll.life);

    }
}
