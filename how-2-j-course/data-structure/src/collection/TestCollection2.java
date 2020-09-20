package collection;
import java.util.List;
import java.util.ArrayList;

public class TestCollection2 {
    public static void main(String[] args) {
        List<LOL> lollist = new ArrayList<>();//汎型
        lollist.add(new Hero("Garen"));
        lollist.add(new Item("Recovery"));
        System.out.println(lollist.get(1));
    }
}
