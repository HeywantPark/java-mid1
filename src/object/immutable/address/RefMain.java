package object.immutable.address;

public class RefMain {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법은 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        b.setValue("부산") //b의 값을 부산으로 변경 불가
        b = new ImmutableAddress("부산"); //새로운 객체 생성
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
