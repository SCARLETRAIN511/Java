package Class_and_object02;

//声明抽象类 不能直接被实例化
public class Hero {
    public String name;
    float hp;
    float armor;
    int moveSpeed;

    class BattleScore {
        int kill;
        int die;
        int assist;

        public void legendary(){
            if (kill >=9)
                System.out.println(name + "超神");
            else
                System.out.println(name + "还没超神");
        }
    }

    public static void battleWin(){
        System.out.println("battle win");
    }

    static class EnemyCrystal{
        int hp = 0;
        public void checkIfVictory(){
            if (hp==0){
                Hero.battleWin();//System.out.println(name + " win this game "); 无法访问外部对象属性
            }
        }
    }
        public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "Garen";
        BattleScore score=garen.new BattleScore();
        score.kill=8;
        score.legendary();

        Hero.EnemyCrystal crystal = new Hero.EnemyCrystal();
        crystal.checkIfVictory();
        //抽象类不能直接被实例化
    }
}
