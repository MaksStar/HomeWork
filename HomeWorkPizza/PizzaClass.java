package HomeWorkPizza;

public class PizzaClass {

        public static void main(String[] args) {
            double min = 24;
            double max = 28;
            HomeWorkPizza.PizzaMin pizzaMin = new HomeWorkPizza.PizzaMin(min);
            HomeWorkPizza.PizzaMax pizzaMax = new HomeWorkPizza.PizzaMax(max);
            System.out.println("Калорийность пиццы диаметром 28см: " + pizzaMax.result3 + " калорий");
            System.out.println("Калорийность пиццы диаметром 24см: " + pizzaMin.result3 + " калорий");
            System.out.print("Разница в калориях: ");
            System.out.print(pizzaMax.result3 - pizzaMin.result3);
        }
}
