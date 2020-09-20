package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Node {
    public Node leftNode;
    public Node rightNode;
    public Object value;
    public void add(Object v){
        if (value == null){
            value = v;
        }
        else{
            //判断当前值比父节点小放入左节点
            if ((Integer) v <= (Integer)value){
                if (null == leftNode){
                    leftNode = new Node();
                }
                leftNode.add(v);
            }
            else {
                if (rightNode == null){
                    rightNode = new Node();
                }
                rightNode.add(v);
            }
        }
    }

    //遍历获得values
    public List<Object> values(){
        List<Object> values = new ArrayList<>();
        if (leftNode != null){
            values.addAll(leftNode.values());
        }
        values.add(value);
        if (rightNode != null){
            values.addAll(rightNode.values());
        }
        return  values;
    }

    public static void main(String[] args) {
        int randoms[] = new int[] {67,3,30,231,1,3,4,13,34,141};
        Node roots = new Node();
        for (int number:randoms){
            roots.add(number);
        }
        System.out.println(roots.values());
    }

}
