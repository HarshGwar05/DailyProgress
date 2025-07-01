

public class Patrn {
    public static void main(String[] args) {
        int n =20 ;

        for(int i =0 ; i<n; i++){
            for(int j = 0;j<n;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i =0; i<n;i++){
            for(int j = 0;j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

         for(int i =0; i<n;i++){
            for(int j = 0;j<i+1; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }

        int ct = 1;
        for(int i =0; i<n;i++){
            for(int j = 0;j<i+1; j++){
                System.out.print(ct);
            }
            ct++;
            System.out.println();
        }


        for(int i=0;i<n;i++){
            for(int j = n;j>i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        
         for(int i = 0; i<=n;i++){
            for(int j = 0; j <= n-i-1;j++){
                System.out.print(" ");
            }
            for(int k =0;k<2*i -1;k++){
                System.out.print("*");
            }
            System.out.println();
         }

         for(int i = 0; i<=n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*(n-i) -1); k++){
                System.out.print("*");
            }
             System.out.println();
        }



         for(int i= 1; i<=2*n-1; i++){
            if(i<=n){
                for(int j = 1; j<=i;j++){
                    System.out.print("*");
                }
            }else{
                for(int k = 1; k<=2*n-i; k++){
                    System.out.print("*");
                }
            }
            System.out.println();
         }

    // int b = 1;
    //      for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(b);
    //             if(b ==1 ){
    //                 b=0;
    //             }else if(b==0){
    //                 b=1;
    //             } 
    //         }
    //         System.out.println();
    //     }

         // First row starts by printing a single 1.
      int start =1;
      
      // Outer loop for the no. of rows
      for(int i=0;i<n;i++){
          
          // if the row index is even then 1 is printed first
          // in that row.
          if(i%2 ==0) start = 1;
          
          // if odd, then the first 0 will be printed in that row.
          else start = 0;
          
          // We alternatively print 1's and 0's in each row by using
          // the inner for loop.
          for(int j=0;j<=i;j++){
              System.out.print(start);
              start = 1-start;
          }
      
      
        // As soon as the numbers for each iteration are printed, we move to the
        // next row and give a line break otherwise all numbers
        // would get printed in 1 line.
        System.out.println();
      }



      int n2 = n;
      for(int i =0;i<=n; i++){
        for(int j= 1; j<=i;j++){
            System.out.print(j);
        }
        for(int k =0;k<=n2*2 -1 ; k++){
            System.out.print(" ");
        }
        n2--;
        for(int j= i; j>=1;j--){
            System.out.print(j);
        }
        System.out.println();
      }


      int y= 1;
      for(int i= 1; i<=n ;i++){
        for(int j=1; j<=i;j++){
            System.out.print(y+" ");
            y++;
        }
        System.out.println();
      }

      char c='A';
      for(int i= 1; i<=n;i++){
          c='A';
        for(int j= 1;j<=i; j++){
            System.out.print(c);
            c++;
        }
        System.out.println();
      }
System.out.println();
      int n3 = n+1;
      for(int i= 1; i<=n; i++){
          c='A';
          n3--;
        for(int j= 1;j<=n3; j++){
            System.out.print(c);
            c++;
        }System.out.println();
      }

      System.out.println();
      c='A';
      for(int i= 1; i<=n;i++){
          for(int j= 1;j<=i; j++){
              System.out.print(c);
            }
            c++;
            System.out.println();
        }
        System.out.println();


        char x = 'A';
        for(int i= 1;i<=n;i++){
            for(int j =1;j<=n-i; j++){
                System.out.print(" ");
            }
            x='A';
            for(int k= 1; k <=i ;k++){
                System.out.print(x);
                x++;
            }
            x -=2;
            for(int k = 1; k<i;k++){
                System.out.print(x);
                x--;
            }
            
            System.out.println();
        }

        System.out.println();


        for(int i= 0 ; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


int ez = n;
        for(int i= 1; i<= n ; i++){
            for(int j = 1;j <= i; j++){
                System.out.print("*");
            }
            for(int k= 1; k<= 2*ez -2 ; k++){
                System.out.print(" ");
            } ez--;
            for(int j = 1;j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
        ez = n;
        for(int i= 1; i<=n-1; i++){
            for(int j = ez-i; j>0; j-- ){
                System.out.print("*");
                // ez--;
            }
            for(int k =1; k<=i*2; k++){
                System.out.print(" ");
            }
            // ez = n;
            for(int j = ez-i; j>0; j-- ){
                System.out.print("*");
                // ez--;
            }
            System.out.println();

        }


         ez = n;
        for(int i= 1; i<=n; i++){
            for(int j = ez-i; j>0; j-- ){
                System.out.print("*");
                // ez--;
            }
            for(int k =1; k<=i*2; k++){
                System.out.print(" ");
            }
            // ez = n;
            for(int j = ez-i; j>0; j-- ){
                System.out.print("*");
                // ez--;
            }
            System.out.println();

        }
        ez = n;
        for(int i= 1; i<= n ; i++){
            for(int j = 1;j <= i; j++){
                System.out.print("*");
            }
            for(int k= 1; k<= 2*ez -2 ; k++){
                System.out.print(" ");
            } ez--;
            for(int j = 1;j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        } 










      
    }
}
