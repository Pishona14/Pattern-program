import java.util.*;
class Main {
public static void pattern(int n) { for (int i = n; i >= 1; i -= 2) {
for (int k = n; k > i; k -= 2) { 
System.out.print(" ");
}
for (int j = 1; j <= i; j++) { 
  System.out.print("*");
}
System.out.println();
}
}
public static void main(String[] args) { 
  Scanner sc = new Scanner(System.in); 
  int n = sc.nextInt();
pattern(n);
}
}
