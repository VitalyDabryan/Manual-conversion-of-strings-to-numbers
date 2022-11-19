import java.util.Scanner;
//        Введем два неотрицательных целых числа num1 и num2,
//        представленных в виде строк, верните произведение num1 и num2,
//        также представленное в виде строки,
//        не используя встроенную функцию Integer.parseInt(str);

public class MultiplyString {
    public static void main(String[] args) {
        int num1=0, num2=0, answer = 0;
        String str;

        System.out.print("Enter num1: ");
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();

        System.out.print("Enter num2: ");
        String str2 = scan.nextLine();

        str = str1;
        num1 = extracted(answer, str); answer = 0;

        str = str2;
        num2 = extracted(answer, str);

        str = "" + num1*num2;
        System.out.println("Product num1 and num2 is: " + str);

    }

    private static int extracted(int answer, String str) {
        int factor = 1;
        for (int i = str.length()-1; i >= 0; i--) {
            answer += (str.charAt(i) - '0') * factor;
            factor *= 10;
        }
        return answer;
    }
}
