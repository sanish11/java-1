import java.util.*;
class q7{
    public static void main(String[] args)
    {
        Scanner sa=new Scanner(System.in);
        int a[][],b[][],i,j;
        a=new int[2][3];
        b=new int[2][3];
        System.out.println("enter elements of A matrix:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sa.nextInt();
            }
        }
        System.out.println("enter elements of B matrix:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j]=sa.nextInt();
            }
        }
        System.out.println("Matrix A + Matrix B:\n");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print((a[i][j]+b[i][j])+"\t");
            }
            System.out.print("\n");
        }

        System.out.println("\nMatrix A - Matrix B:\n");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print((a[i][j]-b[i][j])+"\t");
            }
            System.out.print("\n");
        }

        System.out.println("\nMatrix A * Matrix B:\n");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print((a[i][j]*b[i][j])+"\t");
            }
            System.out.print("\n");
        }

        System.out.println("\n2*(Matrix A + Matrix B):\n");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(+(2*(a[i][j]+b[i][j]))+"\t");
            }
            System.out.print("\n");
        }
    }
}