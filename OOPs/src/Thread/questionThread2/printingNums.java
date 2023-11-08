package Thread.questionThread2;

class OddNUms implements Runnable{
    public void run(){
        for (int i = 1; i < 10; i+=2) {
            if(i%2 != 0){
                System.out.println("OddNUms :"+i);
            }
        }
    }
}
class EvenNums implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            if(i%2 == 0){
                System.out.println("EvenNums :"+i);
            }
        }
    }
}
public class printingNums {
    public static void main(String[] args) {

        OddNUms obj1 = new OddNUms();
        EvenNums obj2 = new EvenNums();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try{
            t1.join();
        }catch(Exception e){}
        t2.start();
    }
}
