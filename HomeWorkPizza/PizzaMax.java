package HomeWorkPizza;
public class PizzaMax {
    public double result1, result2, result3;
    public PizzaMax(double max) {
        mul1(max);
        mul2();
        mul3();
    }
    public void mul1(double max){
        result1 = max * max ;
    }
    public void mul2(){
        result2 = Math.PI * result1;
    }
    public void mul3(){
        result3 = result2 * 40;
    }
}
