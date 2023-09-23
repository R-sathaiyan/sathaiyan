import java.util.Scanner;
class asci1{
public static void main(String[] args){
char ch;
System.out.println("enter any alphabet");
Scanner r=new Scanner(System.in);
ch= r.next().charAT(0);
int a=ch;
System.out.println("ASCII value of"+ch+"is"+a);
}
}