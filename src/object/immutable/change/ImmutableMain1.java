package object.immutable.change;

public class ImmutableMain1 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(20);
        ImmutableObj obj2 = obj1.add(30);


        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());


    }
}
