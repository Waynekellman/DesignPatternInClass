package com.nyc.designpatterninclass.builders;

/**
 * Created by Wayne Kellman on 1/7/18.
 */

public class Burger {
    private String bread;
    private String meat;
    private String rarity;
    private String dressing;
    private boolean lettuce;
    private boolean cheese;
    private boolean tomatoe;
    private boolean onions;
    private boolean pickles;
    private boolean bacon;

    private Burger(String bread, String meat, String rarity, String dressing, boolean lettuce, boolean cheese, boolean tomatoe, boolean onions, boolean pickles, boolean bacon) {
        this.bread = bread;
        this.meat = meat;
        this.rarity = rarity;
        this.dressing = dressing;
        this.lettuce = lettuce;
        this.cheese = cheese;
        this.tomatoe = tomatoe;
        this.onions = onions;
        this.pickles = pickles;
        this.bacon = bacon;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getRarity() {
        return rarity;
    }

    public String getDressing() {
        return dressing;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isTomatoe() {
        return tomatoe;
    }

    public boolean isOnions() {
        return onions;
    }

    public boolean isPickles() {
        return pickles;
    }

    public boolean isBacon() {
        return bacon;
    }

    public static class BurgerBuilder{
        private String bread;
        private String meat;
        private String rarity;
        private String dressing;
        private boolean lettuce;
        private boolean cheese;
        private boolean tomato;
        private boolean onions;
        private boolean pickles;
        private boolean bacon;

        public BurgerBuilder() {
        }

        public BurgerBuilder setBread(String bread){
            this.bread = bread;
            return this;
        }
        public BurgerBuilder setMeat(String meat){
            this.meat = meat;
            return this;
        }
        public BurgerBuilder setRarity(String rarity){
            this.rarity = rarity;
            return this;
        }
        public BurgerBuilder setDressing(String dressing){
            this.dressing = dressing;
            return this;
        }
        public BurgerBuilder setLettuce(boolean lettuce){
            this.lettuce = lettuce;
            return this;
        }
        public BurgerBuilder setCheese(boolean cheese){
            this.cheese = cheese;
            return this;
        }
        public BurgerBuilder setTomato(boolean tomato){
            this.tomato = tomato;
            return this;
        }
        public BurgerBuilder setOnions(boolean onions){
            this.onions = onions;
            return this;
        }
        public BurgerBuilder setPickles(boolean pickles){
            this.pickles = pickles;
            return this;
        }
        public BurgerBuilder setBacon(boolean bacon){
            this.bacon = bacon;
            return this;
        }

        public Burger build(){
            return new Burger(bread,meat,rarity,dressing,lettuce,cheese,tomato,onions,pickles,bacon);
        }
    }
}
