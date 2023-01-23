package Game;

public class Enemy {
    public int life = 100;
    public String typeEnemy = "type1";
    public int damage = 10;

    public Enemy(int life){
        this.life = life;
    }

    public void Damage(){
        life--;
    }
}
