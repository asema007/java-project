import java.net.Socket;

public class Main2 {
    public static void main(String[] args) {
        int petya = (int)(Math.random() * 3);
        int vasia = (int)(Math.random() * 3);
        if(petya == 0){
            if(vasia == 0){
           System.out.println("Ничья");     
            } else if (petya == 2){
                System.out.println("petya");
            }else if(vasia == 3){
                System.out.println("vasia");
            }
        }
    }
}
