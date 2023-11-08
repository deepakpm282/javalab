package OOPsprops.inheritence;

public class Boxprice extends Boxweight{

    double cost;
    Boxprice(double side,double weight,double cost){
        super(side,weight);
        this.cost=cost;
    }
    Boxprice(){
        this.cost=80;
    }
}
