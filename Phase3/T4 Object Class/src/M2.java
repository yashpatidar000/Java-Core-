class Bb
 { int i,j;
 Bb(int i,int j)
 {this.i=i;
 this.j=j;}
 }
 
public class M2 {
    public static void main(String[] args) {
        Bb b1=new Bb(10,20);
        Bb b2=new Bb(10,20);
        Bb b3=b2;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
