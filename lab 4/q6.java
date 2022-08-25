import java.util.*;
class q6{
    public static void main(String[] args)
    {
        Scanner sa=new Scanner(System.in);
        int i,array[][],size,j;
        array=new int[10][10];
        System.out.println("enter  4 numbers:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                array[i][j]=sa.nextInt();
            } 
        }
        System.out.println("The numbers are:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(array[i][j]+"\t ");
            }
            System.out.print("\n"); 

        }
	System.out.println("transpose matrix=");
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			System.out.print(array[j][i]+"\t");
		}
			System.out.print("\n");
	}


    }
}
