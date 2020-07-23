package org.springexample.foodtypes;

import org.springframework.beans.factory.annotation.Required;

public class Pizza implements Food {
    private int size;
    private Ingredients ingredients;
    private boolean optionMeat;

    /**
     * prints what type of food is being served and its ingredients.
     */
    public void serveFood() {
        System.out.println("Pizza is Italian fast food");
        System.out.println(getIngredients().toString());
    }

    public boolean isOptionMeat() {
        return optionMeat;
    }

    public void setOptionMeat(boolean optionMeat) {
        this.optionMeat = optionMeat;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public int getSize() {
        return size;
    }

    @Required
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza.class: [ size: " + getSize() + " is Meat: " + isOptionMeat() +
                "]";
    }


}
