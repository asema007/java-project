public class Year {

    public static void main(String[] args) {
       int year = (int) (Math.random() * 4);
  
       if (year == 0) {
          System.out.println("Spring");
       } else if (year == 1) {
          System.out.println("Summer");
       } else if (year == 2) {
          System.out.println("Autumn");
       }else if (year == 3) {
          System.out.println("Winter");
       }
    }
 }