import java.util.Scanner;

public class Encoding {

    public static void Eawn(String text, int[] arr){
        for(int i = 0; i < text.length(); i++){
            if((int) text.charAt(i) + arr[i] > (int) 'Z'){
                int num = arr[i] - ( (int)'Z' - (int) text.charAt(i));
                System.out.print( (char) ('A'- 1 + num));
            }
            else {
                System.out.print((char) (text.charAt(i) + arr[i]));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] arr = new int[text.length()];
        for(int i = 0; i < text.length(); i++){
            arr[i] = sc.nextInt();
        }
        Eawn(text, arr);
    }
}
