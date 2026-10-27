import java.util.Scanner;

class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(convertToBinary(7));
    }

    public static String convertToBinary (int num) {
        String str = "";
        while (num != 0) {
            str = (num % 2) + str;
            num = num / 2;
        }
        return str;
    }
}
