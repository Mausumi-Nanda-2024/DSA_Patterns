import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // code here
        for(int row = 1; row<=n; row++){
                  for(int space = 1; space<=row - 1; space++){
                      System.out.print(" ");
                  }

                  for(int star = 1; star<= 2*(n - row)+1; star++){
                      System.out.print("*");
                  }

                  System.out.println();
              }

    }
}