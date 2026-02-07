public class Operations {
    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println("Arithmetic operations");
        System.out.println("Addition:"+(a+b));
        System.out.println("Substraction:"+(a-b));
        System.out.println("Multipliation:"+(a*b));
        System.out.println("Division:"+(a/b));
        System.out.println("Modular division:"+(a%b));
        System.out.println("Relational operators");
        System.out.println("a<b:"+(a<b));
        System.out.println("a<=b:"+(a<=b));
        System.out.println("a>b:"+(a>b));
        System.out.println("a>=b:"+(a>=b));
        System.out.println("a==b:"+(a==b));
        System.out.println("a!=b:"+(a!=b));
        int c=5;
        System.out.println("Unary operators");
        System.out.println("c++:"+(c++));
        System.out.println("++c:"+(++c));
        System.out.println("c--:"+(c--));
        System.out.println("--c:"+(--c));
        System.out.println("Bitwise Operators");
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println("Logical operations");
        System.out.println((a>b)&&(b<a));
        System.out.println((b<a)||(a>b));
        System.out.println(~a);
        int x=4;
        System.out.println("Assignment operator");
        x+=5;
        System.out.println(x);
        x-=3;
        System.out.println(x);
        x*=2;
        System.out.println(x);
        x/=6;
        System.out.println(x);
        System.out.println("Ternary operators");
        System.out.println(a==b?a:b);
    }   
}
