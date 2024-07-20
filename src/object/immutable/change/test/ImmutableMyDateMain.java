package object.immutable.change.test;

public class ImmutableMyDateMain {
    public static void main(String[] args){
        ImmutableMyDate date1 = new ImmutableMyDate(2024,7,20);
        ImmutableMyDate date2 = date1;
        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);

        System.out.println("2025 -> date1");
        ImmutableMyDate updateYear =  date1.WithYear(2025);
        System.out.println("date1: " + updateYear);
        ImmutableMyDate updateMonth = date1.WithMonth(8);
        System.out.println("date1: " + updateMonth);


    }
}
