package EvenOrOdd;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
//        String str = "";
//        if(number%2 == 0){
//           str = "Even";
//        } else{
//            str = "Odd";
//        }
//        return str;

        return number%2==0 ? "Even" : "Odd";

    }

    public static void main(String[] args) {
        System.out.println(even_or_odd(8));
        System.out.println(even_or_odd(11));
    }
}
