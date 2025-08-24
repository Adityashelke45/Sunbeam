// import java.util.*;
// public class Question_6
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int matrix1[][] = new int[3][3];
//         System.out.println("Enter the matrix elements: ");
//         for(int i = 0 ; i < 3 ; i++)
//         {
//             for(int j = 0 ; j < 3 ; j++)
//             {
//                 matrix1[i][j]= sc.nextInt();
//             }
//         }

//         int matrix2[][] = new int[3][3];
//         System.out.println("Enter second matrix elements: ");
//         for(int i=0;i<3;i++)
//         {
//             for(int j=0;j<3;j++){
//                 matrix2[i][j] = sc.nextInt();
//             }
//         }

//         int mul[][] = new int[3][3];
//         for(int i=0;i<3;i++)
//         {
//             for(int j=i;j<3;j++)
//             {
//                 if(i == j)
//                 {
//                     continue;
//                 }
//                 int temp = matrix2[i][j];
//                 matrix2[i][j] = matrix2[j][i];
//                 matrix2[j][i] = temp;
//             }
//         }
//         int new_j =0;
//         for(int i=0;i<3;i++)
//         {
//             for(int j=0;j<3;j++)
//             {
//                 mul[i][new_j]+=matrix1[i][j] * matrix2[i][j];
//             }
//             new_j++;
//         }

//         sc.close();
//     }
// }


import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();
        sc.close();
        // Check if multiplication is possible
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible. Columns of first must equal rows of second.");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2]; // Result matrix

        // Input first matrix
        System.out.println("\nEnter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("\nEnter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Perform multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < c1; k++) { 
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display result
        System.out.println("\nResultant Matrix (Multiplication):");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
