class L extends Thread {
    
}
public class M14
{
    public static void main(String[] args) {
       L o1=new L();
       L o2=new L();
        System.out.println(o1.getName());
        System.out.println(o2.getName());
        System.out.println(o1.getId());
        System.out.println(o2.getId());
        System.out.println(o2.getId());
        System.out.println(o1.isDaemon());
        System.out.println(o2.isDaemon());
        System.out.println(o1.getPriority());
        System.out.println(o2.getPriority());
        
        
    }
}

