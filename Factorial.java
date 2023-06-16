class Factorial
{
int fact=1;
public int factorialOfNumber(int n)
{
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
return fact;
}
public static void main(String args[])
{
int n=20;
Factorial o=new Factorial();
int s=o.factorialOfNumber(n);
System.out.println("factorial of "+n+ "is "+s);
}
}

