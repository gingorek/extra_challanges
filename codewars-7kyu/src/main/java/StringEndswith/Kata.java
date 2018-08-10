package StringEndswith;

public class Kata {
    public static boolean solution(String str, String ending) {
        if(str.endsWith(ending))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
//        String str = "aloha";
//        char test = str.charAt(str.length()-2);
////        System.out.println(test);
//        String newS = str.substring(str.length()-2);
//        System.out.println(newS);
        boolean check = solution("alky", "ky");
        if(check){
            System.out.println("true");
        }else {
            System.out.println("false");

        }
    }
}
