package Game;

public class Player {
    public static int life = 10;
    public static String name = "Allan";

    public void comeToLife(){
        life++;
    }
    public void loseLife(){
        life--;
    }

}
