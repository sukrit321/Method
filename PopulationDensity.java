import java.util.Scanner;

public class PopulationDensity {

    public static long density(int npeople, double area){
        double x = npeople / area;
        return Math.round(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int npeople = sc.nextInt();
        double area =  sc.nextDouble(); 
        long d = density(npeople, area);
        System.out.println("population density is "+d);
    }
}
