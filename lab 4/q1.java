import java.util.*;
class q1{
    public static void main(String[] args)
    {
        Scanner sa=new Scanner(System.in);
        int i,array[],size;
        array=new int[30];
        System.out.println("Mention the size of array:");
        size=sa.nextInt();
        System.out.println("enter the numbers:");
        for(i=0;i<size;i++)
        {
            array[i]=sa.nextInt();
        }
        System.out.println("The numbers are:");
        for(i=0;i<size;i++)
        {
            System.out.println(array[i]);
        }

    }
}
