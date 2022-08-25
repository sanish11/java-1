import java.util.*;
class Order{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int i,array[],ascend,descend,j;
        array=new int[10];
        ascend=descend=0;
        System.out.println("enter the numbers:");
        for(i=0;i<10;i++)
        {
            array[i]=scan.nextInt();
        }
        System.out.println("The numbers in ascending order are:\n");
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(array[i]<array[j])
                {
                    ascend=array[i];
                    array[i]=array[j];
                    array[j]=ascend;
                }
            }
        }
        for(i=0;i<10;i++)
        {
            System.out.print(+array[i]+" ");
        }  
        System.out.println("\nThe numbers in descending are:\n");
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(array[i]>array[j])
                {
                    descend=array[i];
                    array[i]=array[j];
                    array[j]=descend;
                }
                
            }
        }
        for(i=0;i<10;i++)
        {
            System.out.print(+array[i]+" ");
        }
    }
}