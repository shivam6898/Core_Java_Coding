package Java_Coding;

public class Pattern_Right_Angle_Triangle {
    public static void main(String[] args) {
        int n  = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if ((j<=n+n/2-1-i && j<=n/2+i) && (j>=n/2-i && j>=i-n/2)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


//j<=n-1-i && j<=i
/*
 *
 **
 ***
 ****
 *****
 *****
 ****
 ***
 **
 *
 */

//(j<=n+n/2-1-i && j<=n/2+i) && (j>=n/2-i && j>=i-n/2)
/*
    *
   ***
  *****
 *******
 *********
 **********
  ********
   ******
    ****
     **

 */



