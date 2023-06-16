import java.util.Scanner;	
class Array
{
public static void main(String args[])
{
int a[]=new int[5]; int sum=0;
Scanner r=new Scanner(System.in);
System.out.println("enter elements in array");
for(int i=0;i<a.length;i++)
{
a[i]=r.nextInt();
}
System.out.print("array elements");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]+" ");
sum=a[i]+sum;	
}
System.out.println("\naddition of array elements "+sum);
}
}

