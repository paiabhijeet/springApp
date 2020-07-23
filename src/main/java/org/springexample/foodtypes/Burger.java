package org.springexample.foodtypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Burger implements Food {

    private Ingredients ingredients;

    public void serveFood() {
        System.out.println(" pattie is places in the bread along with cheese and onion");
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    @Autowired
    @Qualifier("BurgerStuff")
    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "ingredients=" + ingredients +
                '}';
    }
}
