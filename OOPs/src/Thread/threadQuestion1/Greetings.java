package Thread.threadQuestion1;

class greeting1 extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println("welcome..");
        }
    }
}
class greeting2 extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Good morning..");
        }
    }
}
public class Greetings {
    public static void main(String[] args) {
        greeting1 obj1 = new greeting1();
        greeting2 obj2 = new greeting2();

        obj1.start();
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
            System.out.println(e);
        }
        obj2.start();
    }
}
