package HomeWorkPizza;
public class PizzaMin {
    public double result1, result2, result3;
    public PizzaMin(double min) {
        mul1(min);
        mul2();
        mul3();
    }
    public void mul1(double min){
            result1 = min * min ;
        }
        public void mul2(){
            result2 = Math.PI * result1;
        }
        public void mul3(){
           result3 = result2 * 40;
        }
    }
