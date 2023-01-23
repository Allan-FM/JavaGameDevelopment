package Game;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Enemy> enemies = new ArrayList<>();

        enemies.add(new Troll(100));
        enemies.add(new Troll(100));
        enemies.add(new Troll(100));

        for (int i = 0; i < enemies.size(); i++) {
            Enemy localEnemy = enemies.get(i);
            if(i == 0){
               localEnemy.Damage();
               System.out.println(localEnemy.life); 
            }
            else{
                System.out.println(localEnemy.life);
            }
        }
    }
}
