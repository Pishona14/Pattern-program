package pattern;
import java.util.*; 
public class test {
public static void main(String[] args) {
// TODO Auto-generated method stub 
  Scanner pk=new Scanner(System.in); 
  int n=pk.nextInt();
for(int row=0;row<n;row++) {
for(int col=row;col<n-1;col++) { 
  System.out.print(" ");
}
for(int col=0;col<=row;col++) { 
  System.out.print("*");
}
System.out.println();
} }}
package pattern;
import java.util.Scanner;
public class test1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); 
  System.out.print("Enter the number of rows: ");
int n = scanner.nextInt();
for (int row = 1; row <= n; row++) {
System.out.print(" ".repeat(n - row));
System.out.println("*".repeat(row));
} scanner.close();
}}
