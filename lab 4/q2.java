import java.util.*;
class q2{
    public static void main(String[] args)
    {
        Scanner sa=new Scanner(System.in);
        int i,array[],size,countodd,counteven;
        array=new int[20];
        countodd=0;
	counteven=0;
        System.out.println("Mention the size of array:");
        size=sa.nextInt();
        System.out.println("enter the numbers:");
        for(i=0;i<size;i++)
        {
            array[i]=sa.nextInt();
        }
        System.out.println("The even numbers are:");
        for(i=0;i<size;i++)
        {
            if(array[i]%2==0)
            {
                System.out.println(+array[i]);
                counteven++;
            }
        }
        System.out.println("The odd numbers are:");
         for(i=0;i<size;i++)
        {
            if(array[i]%2!=0)
            {
                System.out.println(+array[i]);
                countodd++;
            }
            
        }
        System.out.println("total odd numbers:"+countodd);
        System.out.println("total even numbers:"+counteven);

    }
}