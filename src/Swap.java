public class Swap {
    public static void main(String [] args) {
        int x = 10;
        int y = 20;
        int z;

        System.out.println("Values before swapping");
        System.out.println("X :" +x);
        System.out.println("Y :" +y);

       z = x;
       x = y;
       y = z;

       System.out.println("Values after swapping");
       System.out.println("X :" +x);
       System.out.println("Y :" +y);
    }
}