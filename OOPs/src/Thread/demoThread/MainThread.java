package Thread.demoThread;

//class hi extends Thread{
//    public void run(){
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hi");
//            try{Thread.sleep(100);}catch(Exception e){}
//
//        }
//    }
//}
//
//class hello extends  Thread{
//    public void run(){
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello");
//            try{Thread.sleep(100);}catch(Exception e){}
//
//        }
//    }
//}
//public class MainThread {
//    public static void main(String[] args) {
//
//        hi obj2 = new hi();
//        hello obj1 = new hello();
//
//        obj2.start();
//        try{Thread.sleep(10);}catch(Exception e){}
//        obj1.start();
//    }
//}
class hi implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try{Thread.sleep(100);}catch(Exception e){}

        }
    }
}

class hello implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try{Thread.sleep(100);}catch(Exception e){}

        }
    }
}
public class MainThread {
    public static void main(String[] args) {

        Runnable obj2 = new hi();
        Runnable obj1 = new hello();

        Thread t1 = new Thread(obj2);
        Thread t2 =new Thread(obj1);

        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}
        t2.start();
    }
}
