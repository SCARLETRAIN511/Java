package class01;

import com.sun.source.tree.NewArrayTree;

import javax.net.ssl.SNIHostName;
import javax.xml.namespace.QName;

public class ADHero extends Hero{
    //方法重载
    public void attack() {
        System.out.println(name + " uses one attack");
    }
    public void attack(Hero h1) {
        System.out.println(name + " uses one attack on " + h1.name);
    }
    public void attack(Hero h1, Hero h2) {
        System.out.println(name + "uses attack on both " + h1.name + " and " + h2.name);
    }
    public void heal(){
        System.out.println(name + " is doing healing");
    }
    public void heal(Hero... heroes){
        for (int i = 0; i<heroes.length; i++){
            System.out.println(name + " is healing the hero " + heroes[i].name);
        }
    }
    public ADHero(String HName){
        name = HName;
    }
    public ADHero(int Hp,String HName){
        hp = Hp;
        name = HName;
    }

    public static void main(String[] args) {
        ADHero Timo = new ADHero("Timm ");//如果提供一个有参的构造方法，就无法使用无参的应用
        ADHero T2 = new ADHero(12,"Faker");//对象构造重载；
        Hero Ad1 = new Hero();
        Hero Ad2 = new Hero();
        Ad1.name = "G";
        Ad2.name = "TT";
        Timo.attack(Ad1,Ad2);
        Timo.heal(Ad1,Ad2);
    }
}
