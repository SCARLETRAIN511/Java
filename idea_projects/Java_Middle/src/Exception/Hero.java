package Exception;

public class Hero {
    String name;
    float hp;
    public void attackHero(Hero h) throws EnemyIsDead{
        if (h.hp == 0){
            throw new EnemyIsDead(h.name+"has dead");
        }
    }
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        Hero garen =new Hero();
        garen.name="Garen";
        garen.hp=32;
        Hero Timo = new Hero();
        Timo.name = "Timo";
        Timo.hp=0;
        try{
            garen.attackHero(Timo);
        } catch (EnemyIsDead e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
