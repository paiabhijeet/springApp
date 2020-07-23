import org.springexample.foodtypes.Food;
import org.springexample.foodtypes.Fries;
import org.springexample.foodtypes.Pizza;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RestaurantOrders {
    public static void main(String[] args) {
//        ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Food food = (Food) context.getBean("pizza");
        Food food = (Pizza) context.getBean("pizza");

        food.serveFood();
        System.out.println(food.toString());

        Food p = (Pizza) context.getBean("pizza");
        ((Pizza) p).getIngredients().setIngredient1("Chicken");
        ((Pizza) p).setOptionMeat(true);
        p.serveFood();
        System.out.println(p.toString());

        Food burger = (Food) context.getBean("burger");
        burger.serveFood();
        System.out.println(burger.toString());


    }
}
