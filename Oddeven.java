import java.util.Scanner;

class Oddeven
 {
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
String input = sc.next();
String oddPart = "";
String evenPart = "";
for (int i = 0; i < input.length(); i++) 
{
char ch = input.charAt(i);
int digit = ch;
if (digit % 2 != 0) 
{
oddPart += ch;
}
else 
{
evenPart += ch;
}
}
System.out.println(oddPart + evenPart);
}
}

