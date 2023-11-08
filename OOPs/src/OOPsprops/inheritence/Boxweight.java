package OOPsprops.inheritence;

public class Boxweight extends Box{
    double weight;
    Boxweight(){
        this.weight=20;
    }
    public Boxweight(double l,double w,double h, double weight){
        super(l,w,h);
        this.weight=weight;
    }
    Boxweight(double side,double weight){
        super(side);
        this.weight=weight;
    }
}
