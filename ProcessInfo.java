import java.util.Scanner;

public class ProcessInfo {

    public static boolean listProcesses(int n, String[] name, int[] ram, int ram_pc) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (ram[i] >= 10) {
                System.out.print(name[i] + "*" + " ");
                System.out.println(ram[i]);
                sum += ram[i];
            } else {
                System.out.print(name[i] + " ");
                System.out.println(ram[i]);
                sum += ram[i];
            }
        }
        System.out.println("RAM used = " + sum +" out of " + ram_pc);
        if(sum > ram_pc){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] ram = new int[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            ram[i] = sc.nextInt();
        }
        int ram_pc = sc.nextInt();
        boolean ramused = listProcesses(n, name, ram, ram_pc);
        if(ramused){
            System.out.println("Not enough RAM");
        }
        else {
            System.out.println("Sufficient RAM");
        }
    }
}
