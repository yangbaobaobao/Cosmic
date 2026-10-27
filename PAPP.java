import java.util.Scanner;

class PAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(papp( "I have a Ethan, I have a u" ));
    }

    public static String papp(String str) {
        String objA = str.substring(9, str.indexOf(","));
        String objB = str.substring(str.indexOf(", I have a ")+11);
        return("Uh! " + objB.substring(0,1).toUpperCase() + objB.substring(1) + " " + objA);
    }
}
