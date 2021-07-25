class C1
 { int i;
 double d;
 C1(int i,double d)
 {this.i=i;
 this.d=d;}
 }
 
public class M3 {
    public static void main(String[] args) {
        C1 b1=new C1(10,20.2);
        C1 b2=null;
        String s1=new String();
        s1=b1.toString();
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        
    }
}
