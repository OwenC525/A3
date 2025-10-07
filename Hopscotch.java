public class Hopscotch {
    /*************************************************************************
 *  Compilation:  javac Hopscotch.java
 *  Execution:    java Hopscotch size
 *
 *  @author Ram Buditi
 *
    *************************************************************************/
    
    /* Prints all rectangles on the hopscotch path with first 
       the center rectangles, then the left rectangles,
       and lastly the right rectangles as a sequence of
       integers.

       size: The size of the hopscotch path(the total number of rectangles)
     */
    public static void main(String[] args) {

        int given = Integer.parseInt(args[0]);

        int center = 0;
        int left = 0;
        int right = 0;

        for (int i = 1; i <= given; i = i + 3) {
            center = i;
            System.out.print(center + " ");
        }

        for (int i = 2; i <= given; i = i + 3) {
            left = i;
            System.out.print(left + " ");
        }

        for (int i = 3; i <= given; i = i + 3) {
            right = i;
            System.out.print(right + " ");
        }

    }

}