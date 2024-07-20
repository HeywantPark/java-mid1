package object.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(20);
        obj1.add(30);

        System.out.println(obj1.getValue());



    }
}