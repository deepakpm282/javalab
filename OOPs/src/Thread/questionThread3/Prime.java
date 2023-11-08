package Thread.questionThread3;

class primenum extends Thread{
    public int n;
    primenum(int n){
        this.n=n;
    }
    int count;
    public void run(){
        for (int i = 0; i <=this.n ; i++) {
            count=0;
            for (int j = 2; j < i/2; j++) {
                if(i%j == 0){
                count++;
                }
            }
            if(count == 0){
            System.out.println(i);}
        }

    }
}
class fibo extends Thread{
    int n;
    fibo(int n){
        this.n=n;
    }
    int n1=0,n2=1;
    public void run(){
        System.out.println("Fibonnaci series: ");
        for (int i = 0; i <this.n ; i++) {
            System.out.print(n1+" ");
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}

public class Prime {
    public static void main(String[] args) {

        primenum obj1 = new primenum(30);
        obj1.start();

        fibo obj2 = new fibo(30 );
        obj2.start();
        try{
            obj1.join();
            obj2.join();
        }catch(Exception e){}
    }
}
