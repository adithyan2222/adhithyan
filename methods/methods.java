import java.util.*;
public class methods{
    void add(int x, int y){
        System.out.println("answer is "+(x+y));
    }
        void add(int x, int y, int z){
            System.out.println("answer is "+(x+y+z));
        }
    public static void main(String args[]){
            methods obj = new methods();
            obj.add(22,3);
            obj.add(11,22,33);
    }
}