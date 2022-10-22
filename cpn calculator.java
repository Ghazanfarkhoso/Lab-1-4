import java.util.*;
 class cpn program {
    public static void main(String[] args) {
        double a,b,cpn;
        int c;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter matriculation percentage ");
        a=obj.nextInt();
        System.out.println("enter intermediate percentage ");
        b=obj.nextInt();
        System.out.println("enter test marks ");
        c=obj.nextInt();
        cpn=(a*0.10)(b*0.30)+(c*0.60);
        System.out.print("the cpn is"+cpn);
    }
}
