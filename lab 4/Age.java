import java.util.*;
class Age{
    public static void main(String[] args)
    {
        Scanner sa=new Scanner(System.in);
        int i,array[],size,number,count;
        count=0;
        array=new int[20];
        System.out.println("Mention the number of age:");
        size=sa.nextInt();
        System.out.println("enter the age:");
        for(i=0;i<size;i++)
        {
            array[i]=sa.nextInt();
        }
        for(i=0;i<size;i++)
        {
            if(array[i]>=25 && array[i]<=40)
            {
               count++; 
            }
            
        }
        System.out.println("Total numbers of people between 25-40 age:"+count);

    }
}
