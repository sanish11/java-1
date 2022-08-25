import java.util.*;
class Multiply
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int matrixa[][],matrixb[][],i,j,k,matrixc[][];
        matrixa=new int[2][2];
        matrixb=new int[2][2];
        matrixc=new int[5][5];
        System.out.println("Enter the elements of 2*2 A matrix:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                matrixa[i][j]=scan.nextInt();
            }
        }
        System.out.print("\n");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(+matrixa[i][j]+ "\t");
            }
            System.out.print("\n");
        }
        System.out.println("\nEnter the elements of 2*2 B matrix:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                matrixb[i][j]=scan.nextInt();
            }
        }
        System.out.print("\n");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(+matrixb[i][j]+ "\t");
            }
            System.out.print("\n");
        }
        System.out.println("\nthe multplied matrix of A and B matrixes are:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
               matrixc[i][j]=0;
                for(k=0;k<2;k++)
                {
                    matrixc[i][j]+=matrixa[i][k]*matrixb[k][j];
                }
            }
        }

        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(+matrixc[i][j]+ "\t");
            }
            System.out.print("\n");
        }

    }
}