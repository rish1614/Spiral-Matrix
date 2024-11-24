import java.util.Scanner;

public class spiralmatrix {
    public static void main(String args[]){
        System.out.print("Enter No. of Rows :");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter No. of Columns :");
        int m=sc.nextInt();
        int a[][]=new int [n][m];
        System.out.print("Enter "+n*m+" Elemnt for 2-D Matrix :");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
            a[i][j]=sc.nextInt(); 
            }
        }
        System.out.println("2-D Matrix :");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
           System.out.print(a[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println("Spiral Matrix :");
        int srw=0,scl=0; // Starting Row And Column
        int erw=n-1,ecl=m-1;// Ending Row And Column
        while((srw<=erw) && (scl<=ecl)){
            // Printing Top Part
            for(int j=scl;j<=ecl;j++){
                System.out.print(a[srw][j]+" ");
            }
         // Printing Right Part
        for(int i=srw+1;i<=erw;i++){
         System.out.print(a[i][ecl]+" ");
         }
         // Printing Bottom Part
         for(int j=ecl-1;j>=scl;j--){
            if(scl==ecl){
                break;
            }
            System.out.print(a[erw][j]+" ");
            }
        // Printing Left Part
        for(int i=erw-1;i>=srw+1;i--){
            System.out.print(a[i][scl]+" ");
            }
            srw++;
            scl++;
            erw--;
            ecl--;                    
        }
        System.out.println();
    }
}
