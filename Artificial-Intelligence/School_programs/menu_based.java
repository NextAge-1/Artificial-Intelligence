import java.util.Scanner;
public class menu_based{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1 fo digit check and 2 for square or cube root.");
        int i = sc.nextInt();
        if(i == 1){
            int num = sc.nextInt();
            if (num/1000==0){
                if (num/100==0){
                    if (num/10==0)
                        System.out.print("1 digits");
                    else 
                        System.out.print("2  digits");
                }
                else
                    System.out.print("3 digits  digit");
            }
            else
                System.out.print("many digits");
        }
        if(i == 2){
            int num = sc.nextInt();
            System.out.print("Suareroot is "+(Math.sqrt(num)));
            System.out.print("cuberoot is "+(Math.cbrt(num)));
        }
    }

}