// multithreading by implementing runnable interface

class mythread1 implements Runnable {
    
    public void run(){
    
    
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");

         System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");

         System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        
    }
    }


class mythread2 implements Runnable {

    public void run(){
        
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
          
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");

          
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
      
   
    }
}



public class mt {
    public static void main(String[] args) {
        mythread1 t1=new mythread1();
        Thread a1=new Thread(t1);
        mythread2 t2=new mythread2();
        Thread a2=new Thread(t2);

        a1.start();
        a2.start();

    }
}
