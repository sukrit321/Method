import java.util.Scanner;

public class AQIMeaning {

    public static void aqimeaning(int aqi){
        if(aqi <= 50){
            System.out.println("Good");
        }
        else if (aqi <= 100){
            System.out.println("Moderate");
        }
        else if (aqi <= 150){
            System.out.println("Unhealthy for Sensitive Groups");
        }
        else if (aqi <= 200){
            System.out.println("Unhealthy");
        }
        else if (aqi <= 300){
            System.out.println("Very Unhealthy");
        }
        else {
            System.out.println("Hazardous");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aqi = sc.nextInt();
        aqimeaning(aqi);
    }
}