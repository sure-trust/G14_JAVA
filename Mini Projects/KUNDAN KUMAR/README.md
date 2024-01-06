QNo.1 
public class ComplexExample1 {
 public static void main(String[] args) {
 int a = 5;
 int b = 3;
 int c = a++ * --b + 2 * a-- / ++b;
 System.out.println(a + " " + b + " " + c);
 }
}
Output:- 5 3 14


QNo.2
public class ComplexExample2 {
 public static void main(String[] args) {
 int x = 8;
 int y = 2;
 int z = x++ * --y + 2 * x-- / ++y - x++;
 System.out.println(x + " " + y + " " + z);
 }
}
Output:-9 2 9


QNo. 3
Code:
public class ComplexExample3 {
 public static void main(String[] args) {
 int a = 5;
 int b = 10;
 int c = ++a * b-- + 2 * a++ / --b - a--;
 System.out.println(a + " " + b + " " + c);
 }
}
Output: 6 8 54


QNo. 4
Code:
public class ComplexExample4 {
 public static void main(String[] args) {
 int x = 6;
 int y = 3;
 int z = x++ * --y + 2 * x-- / ++y - x++ + y--;
 System.out.println(x + " " + y + " " + z);
 }
}
Output:5 3 14


QNo.5
Code:
public class ComplexExample4 {
 public static void main(String[] args) {
 int x = 6;
 int y = 3;
 int z = x++ * --y + 2 * x-- / ++y - x++ + y--;
 System.out.println(x + " " + y + " " + z);
 }
}
Output:5 3 14


QNo.6
Code:
public class ComplexExample5 {
 public static void main(String[] args) {
 int a = 7;
 int b = 2;
 int c = a-- * --b + 2 * a++ / ++b - a-- + b++;
 System.out.println(a + " " + b + " " + c);
 }
}
Output:5 3 14


QNo.7
Code:
public class ComplexExample6 {
 public static void main(String[] args) {
 int x = 5;
 int y = 2;
 int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3;
 System.out.println(x + " " + y + " " + z);
 }
}
Output: 6 1 12


QNo.8
Code:
public class ComplexExample7 {
 public static void main(String[] args) {
 int a = 4;
 int b = 3;
 int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2;
 System.out.println(a + " " + b + " " + c);
 }
}
Output:3 4 13


QNo.9
Code:
public class ComplexExample8 {
 public static void main(String[] args) {
 int x = 5;
 int y = 3;
 int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2;
 System.out.println(x + " " + y + " " + z);
 }
}
Output:6 2 13


QNo.10
Code:
public class ComplexExample9 {
 public static void main(String[] args) {
 int a = 6;
 int b = 3;
 int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 - --a;
 System.out.println(a + " " + b + " " + c);
 }
}
Output: 4 4 12


QNo.11
Code:
public class ComplexExample10 {
 public static void main(String[] args) {
 int x = 7;
 int y = 2;
 int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 - --x;
 System.out.println(x + " " + y + " " + z);
 }
}
Output:7 1 4


QNo.12
Code:
public class AdvancedExample1 {
 public static void main(String[] args) {
 int a = 8;
 int b = 3;
 int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 + --a;
 System.out.println(a + " " + b + " " + c);
 }
}
Output:6 4 26


QNo. 13
Code:
public class AdvancedExample2 {
 public static void main(String[] args) {
 int x = 5;
 int y = 3;
 int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 + --x;
 System.out.println(x + " " + y + " " + z);
 }
}
Output:5 2 18  


QNo.14
Code:
public class AdvancedExample3 {
 public static void main(String[] args) {
 int a = 6;
 int b = 3;
 int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 + --a;
 System.out.println(a + " " + b + " " + c);
 }
}
Output:4 4 20


QNo.15
Code:
public class AdvancedExample3 {
 public static void main(String[] args) {
 int a = 6;
 int b = 3;
 int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 + --a;
 System.out.println(a + " " + b + " " + c);
 }
}
Output:4 4 20


QNo. 16
Code:
public class AdvancedExample4 {
 public static void main(String[] args) {
 int x = 7;
 int y = 2;
 int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 + --x;
 System.out.println(x + " " + y + " " + z);
 }
}
Output: 7 1 18


QNo. 17
Code:
public class AdvancedExample5 {
 public static void main(String[] args) {
 int a = 8;
 int b = 2;
 int c = a-- * ++b + 2 * a++ / --b - a-- + b++ * 4 / 2 + ++a;
 System.out.println(a + " " + b + " " + c);
 }
}
Output:8 3 35


QNo. 18
Code:
public class AdvancedExample7 {
 public static void main(String[] args) {
 int a = 7;
 int b = 2;
 int c = a-- * ++b + 2 * a++ / --b - a-- + b++ * 4 / 2 + ++a;
 System.out.println(a + " " + b + " " + c);
 }
}
Output:
QNo. 19
Code:
public class AdvancedExample10 {
 public static void main(String[] args) {
 int x = 10;
 int y = 3;
 int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 + --x;
 System.out.println(x + " " + y + " " + z);
 }
}
Output:7 3 31


QNo. 20
Code:
Give the output of this code
int a = 9;
a++;
System.out.println (a);
a -= a – - – a;
System .out.println (a);

Output: 
10
10
