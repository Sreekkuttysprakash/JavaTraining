import java.util.Scanner;
class SwitchCase{
public static void main(String args[]){
int rollno;
Scanner sc=new Scanner(System.in);
rollno = sc.nextInt();
switch(rollno){
case 1:
System.out.println("Krishna");
break;
case 2:
System.out.println("Marion");
break;
case 3:
System.out.println("Preetha"+rollno);
break;
case 4:
System.out.println("Sobin");
break;
case 5:
System.out.println("Sreekkutty");
break;
default:
System.out.println("end of the person");
}
}}