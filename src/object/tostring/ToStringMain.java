package object.tostring;

public class ToStringMain {
    public static void main(String[] args) {
        Object o = new Object();
        String string = o.toString();

        //toString 반환 값 출력
        System.out.println(string);
        System.out.println(o);
    }
}
