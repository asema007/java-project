import java.util.Scanner;

public class Link {
    public static void main(String[] args) {
        // int rolan = (int) (Math.random() * 5); 
        // int arstan= (int) (Math.random() * 3); 

        Scanner scanner = new Scanner(System.in);

        int rolan = scanner.nextInt();
        int arstan = scanner.nextInt();

        if(rolan == 5 && arstan == 5){
            System.out.println( "Excellent");
        }else if(rolan == 4 && arstan == 4){
            System.out.println( " Good");
        }else if(arstan == 3 && rolan == 3){
            System.out.println(" ok");
        }else {
            System.out.println("bad");
        }
    }
}
