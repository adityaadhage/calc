import java.util.Scanner;

public class Addition{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("enter first number : ");
int num1 =sc.nextInt();

System.out.println("enter 2nd number : ");
int num2 =sc.nextInt();

int add =num1+num2;

System.out.println( " the addition of 2 numbers is " + add);
sc.close();

}}
