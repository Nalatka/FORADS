import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println((isDigit(s)) ? "YES" : "NO");
    }
    public static boolean checkDigit(String s,int Ind) {
        if(s.length()==Ind) {
            return true;
        }
        if(!Character.isDigit(s.charAt(Ind))) {
            return false;
        }
        return checkDigit(s,Ind+1);
    }
    public static boolean isDigit(String s){
        return checkDigit(s,0);
    }
}
