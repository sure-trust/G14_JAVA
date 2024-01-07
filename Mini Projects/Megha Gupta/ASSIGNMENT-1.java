ASSIGNMENT-1

Q1- public class ComplexExample1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b;
        System.out.println(a + " " + b + " " + c);
    }
}
Ans:    5 	3	 14
Explanation:	c=5*2+2*6/3=14
		a=5	b=3



Q2-public class ComplexExample2 {
    public static void main(String[] args) {
        int x = 8;
        int y = 2;
        int z = x++ * --y + 2 * x-- / ++y - x++;
        System.out.println(x + " " + y + " " + z);
    }
}
Ans: 	  9	2	9
Explanation: z=8*1+2*9/2-8
		X=9	z=2


Q3-
public class ComplexExample3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = ++a * b-- + 2 * a++ / --b - a--;
        System.out.println(a + " " + b + " " + c);
    }
}
Ans:	 6	 8	 54
Explanation:	c=6*10+2*6/8-7



Q-4
public class ComplexExample4 {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y--;
        System.out.println(x + " " + y + " " + z);
    }
}
Ans: 	7	2	13
Explanation:	z=6*2+2*7/3-6+3



Q-5
public class ComplexExample4 {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y--;
        System.out.println(x + " " + y + " " + z);
    }
}
Ans:	7	2	13
Explanation:	z=6*2+2*7/3-6+3



Q-6
public class ComplexExample5 {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int c = a-- * --b + 2 * a++ / ++b - a-- + b++;
        System.out.println(a + " " + b + " " + c);
    }
}
Ans:	6	3	8
Explanation:	c=7*1+2*6/2-7+2



Q7
public class ComplexExample6 {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3;
        System.out.println(x + " " + y + " " + z);
    }
}
Ans:	6	1	12
Explanation:	z=5*1+2*6/2-5+2*3



Q-8
public class ComplexExample7 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2;
        System.out.println(a + " " + b + " " + c);
    }
}
Ans:	3	4	13
Explanation:	c=4*2+2*5/3-3+3*4/2



Q-9
public class ComplexExample8 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2;
        System.out.println(x + " " + y + " " + z);
    }
}
Ans:	6	2	13
Explanation:	z=5*2+2*6/3-5+3*3/2



Q-10
public class ComplexExample9 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 - --a;
        System.out.println(a + " " + b + " " + c);
    }
}
Ans:	4	4	12
Explanation:	c=6*2+2*7/3-6+3*4/2-3



Q-11
public class ComplexExample10 {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 - --x;
        System.out.println(x + " " + y + " " + z);
    }
}
Ans:	7	1	4
Explanation:	 7*1+2*8/2-7+2*3/2-7



Q-12
public class AdvancedExample1 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 + --a;
        System.out.println(a + " " + b + " " + c);
    }
}
Ans:	6	4	26
Explanation:	8*2+2*7/3-6+3*4/2+4



Q-13
public class AdvancedExample2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 + --x;
        System.out.println(x + " " + y + " " + z);
    }
}
Ans:	5	2	18
Explanation:	5*2+2*6/3-5+3*3/2+5



Q-14
public class AdvancedExample3 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 + --a;
        System.out.println(a + " " + b + " " + c);
    }
}
Ans:	4	4	20
Explanation:	6*2+2*7/3-6+3*4/2+4



Q-15
public class AdvancedExample3 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 + --a;
        System.out.println(a + " " + b + " " + c);
    }
}
Ans:	4	4	20
Explanation:	c=6*2+2*7/3-6+3*4/2+4



Q-16
public class AdvancedExample4 {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 + --x;
        System.out.println(x + " " + y + " " + z);
    }
}
Ans:	7	1	18
Explanation:	z=7*1+2*8/2-7+2*3/2+7



Q-17
public class AdvancedExample5 {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        int c = a-- * ++b + 2 * a++ / --b - a-- + b++ * 4 / 2 + ++a;
        System.out.println(a + " " + b + " " + c);
    }
}
Ans: 	8	3	35
Explanation:	c=8*3+2*7/2-8+2*4/2+8



Q-18
public class AdvancedExample7 {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int c = a-- * ++b + 2 * a++ / --b - a-- + b++ * 4 / 2 + ++a;
        System.out.println(a + " " + b + " " + c);
    }
}
Ans:	7	3	31
Explanation:	c=7*3+2*6/2-7+2*4/2+7



Q-19
public class AdvancedExample10 {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 + --x;
        System.out.println(x + " " + y + " " + z);
    }
}
Ans:	10	2	31
Explanation:	z=10+2+2*11/3-10+3*3/2+10



Q-20
Give the output of this code
int a = 9;
a++;
System.out.println (a);
a -= a – - – a;
System .out.println (a);
Ans: 	10
8
Explanation:	a=10
		a=a-(a-- - --a)
		a=10-(10-8)=8
