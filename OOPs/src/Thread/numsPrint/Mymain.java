package Thread.numsPrint;

class printNum implements Runnable{
    String name;
        printNum(String name){
            this.name=name;
        }
        public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println(this.name+" "+i);
            }
        }
}
public class Mymain{
    public static void main(String[] args) {
        printNum obj = new printNum("first");
        Thread t1 = new Thread(obj);

        t1.start();
    }
}