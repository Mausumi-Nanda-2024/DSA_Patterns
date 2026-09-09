import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        for(int row = 1; row <= n; row++){
            
            for(int space = 1; space <=n-row; space++){
                System.out.print(" ");
            }
            
            for(int star = 1; star <= row; star++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        for(int row = n; row>=1; row--){
            
            for(int space = 1; space <= n-row; space++){
                System.out.print(" ");
            }
            
            for(int star = 1; star <= row; star++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}