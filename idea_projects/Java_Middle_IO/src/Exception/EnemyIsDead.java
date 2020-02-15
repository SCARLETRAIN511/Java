package Exception;

public class EnemyIsDead extends Exception {
    public EnemyIsDead() {
    }
    public EnemyIsDead(String msg){
        super(msg);
    }
}
