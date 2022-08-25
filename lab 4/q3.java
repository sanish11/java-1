import java.util.*;
class q3{
    public static void main(String[] args)
    {
        Scanner sa=new Scanner(System.in);
        int i,array[],size,number;
        array=new int[20];
        System.out.println("Mention the size of array:");
        size=sa.nextInt();
        System.out.println("enter the numbers:");
        for(i=1;i<=size;i++)
        {
            array[i]=sa.nextInt();
        }
        System.out.println("enter the numbers:");
        number=sa.nextInt();
        for(i=1;i<=size;i++)
        {
            if(array[i]==number)
            {
                System.out.println("Found the number="+array[i] + "index:"+i);
                break;
            }
            
        }

    }
}
