import java.util.*;
class Transpose{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int i,array[][],size,j;
        array=new int[10][10];
        System.out.println("enter any 4 numbers:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                array[i][j]=scan.nextInt();
            } 
        }
        System.out.println("The numbers are:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(+array[i][j]+" ");
            }
            System.out.print("\n"); 

        }

    }
}
