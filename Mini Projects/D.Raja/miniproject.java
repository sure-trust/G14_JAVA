/*public class Assignment1{
     public static void main(String args[]){
        int a = 5;
        int b = 3;
         int c = a++ * --b + 2 * a-- / ++b;
         System.out.println(a + " " + b + " " + c);
     }
 }

// 5 3 14

/*Q2
 public class Assignment1{
     public static void main(String args[]){
         int x = 8;
         int y = 2;
         int z = x++ * --y + 2 * x-- / ++y - x++;
         System.out.println(x + " " + y + " " + z);
     }
 }

 9 2 9

 Q3
 public class Assignment1{
     public static void main(String args[]){
         int a = 5;
         int b = 10;
         int c = ++a * b-- + 2 * a++ / --b - a--;
         System.out.println(a + " " + b + " " + c);
     }
 }

 6 8 54

 Q4
 public class Assignment1{
     public static void main(String args[]){
         int x = 6;
         int y = 3;
         int z = x++ * --y + 2 * x-- / ++y - x++ + y--;
         System.out.println(x + " " + y + " " + z);
     }
 }

 7 2 13

 Q5
 public class Assignment1{
     public static void main(String args[]){
         int x = 6;
         int y = 3;	
         int z = x++ * --y + 2 * x-- / ++y - x++ + y--;
         System.out.println(x + " " + y + " " + z);
     }
 }

 7 2 13

 Q6
 public class Assignment1{
     public static void main(String args[]){
         int a = 7;
         int b = 2;
         int c = a-- * --b + 2 * a++ / ++b - a-- + b++;
         System.out.println(a + " " + b + " " + c);
     }
 }
 
 6 3 8

 Q7
 public class Assignment1{
     public static void main(String args[]){
         int x = 5;
         int y = 2;
         int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3;
         System.out.println(x + " " + y + " " + z);
     }
 }
 
 6 1 12

 Q8
 public class Assignment1{
     public static void main(String args[]){
         int a = 4;
         int b = 3;
         int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2;
         System.out.println(a + " " + b + " " + c);
     }
 }
 
 3 4 13

 Q9
 public class Assignment1{
     public static void main(String args[]){
         int x = 5;
         int y = 3;
         int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2;
         System.out.println(x + " " + y + " " + z);
     }
 }
 
 6 2 13


 Q10
 public class Assignment1{
     public static void main(String args[]){
         int a = 6;
         int b = 3;
         int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 - --a;
         System.out.println(a + " " + b + " " + c);
     }
 }

 4 4 12

 Q11
 public class Assignment1{
     public static void main(String args[]){
         int x = 7;
         int y = 2;
         int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 - --x;
         System.out.println(x + " " + y + " " + z);
     }
 }
 
 7 1 4

 Q12
 public class Assignment1{
     public static void main(String args[]){
         int a = 8;
         int b = 3;
         int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 + --a;
         System.out.println(a + " " + b + " " + c);
     }
 }
 
 6 4 26

Q13 
 public class Assignment1{
     public static void main(String args[]){
         int x = 5;
         int y = 3;
         int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 + --x;
         System.out.println(x + " " + y + " " + z);
     }
 }
 
 5 2 18

 Q14
 public class Assignment1{
     public static void main(String args[]){
         int a = 6;
         int b = 3;
         int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 + --a;
         System.out.println(a + " " + b + " " + c);
     }
 }
 
 4 4 20

Q15
 public class Assignment1{
     public static void main(String args[]){
         int x = 7;
         int y = 2;
         int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 - --x;
         System.out.println(x + " " + y + " " + z);
     }
 }
 
 7 1 4

 Q16
 public class Assignment1{
     public static void main(String args[]){
         int a = 6;
         int b = 3;
         int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 + --a;
         System.out.println(a + " " + b + " " + c);
     }
 }
 
 4 4 20

 Q17
 public class Assignment1{
     public static void main(String args[]){
         int a = 8;
         int b = 2;
         int c = a-- * ++b + 2 * a++ / --b - a-- + b++ * 4 / 2 + ++a;
         System.out.println(a + " " + b + " " + c);
     }
 }
 
 8 3 35

 Q18
 public class Assignment1{
     public static void main(String args[]){
         int a = 7;
         int b = 2;
         int c = a-- * ++b + 2 * a++ / --b - a-- + b++ * 4 / 2 + ++a;
         System.out.println(a + " " + b + " " + c);
     }
 }
 
 7 3 31

 Q19
 public class Assignment1{
     public static void main(String args[]){
         int a = 8;
         int b = 2;
         int c = a-- * ++b + 2 * a++ / --b - a-- + b++ * 4 / 2 + ++a;
         System.out.println(a + " " + b + " " + c);
     }
 }
 
 8 3 35

 Q20
public class Assignment1{
    public static void main(String args[]){
        int a = 9;
            a++;
            System.out.println (a);
            a-= a-- - --a;
            System .out.println (a);

    }
}
 
 10
 8*/