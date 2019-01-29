class  MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }
 public void run()
 {  for(int i=0;i<10;i++)
 {
    System.out.println("child");
    System.out.println(Thread.currentThread().getName());
 }
 }
}
public class ThreadDemo1 {

    public static void main(String[] args) {
     MyThread t=new MyThread("t1");
      t.start();
      MyThread t1=new MyThread("t1");
      t1.start();
      MyThread t2=new MyThread("t1");
      t2.start();
      t2.setPriority(10);
      //t.setName("vijay");
      for(int i=0;i<10;i++)
      {
      System.out.println("parent");
      //System.out.println(Thread.currentThread().getName());
      }
    }
    
}
