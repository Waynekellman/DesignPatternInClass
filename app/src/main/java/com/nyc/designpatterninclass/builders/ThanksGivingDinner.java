package com.nyc.designpatterninclass.builders;

/**
 * Created by Wayne Kellman on 1/7/18.
 */

public class ThanksGivingDinner {
    /**I don't know that many thanksgiving fod nor do I think my coding ability would improve knowing.
     * I'll replace them with foodItem#
     * I'm truly sorry, I just can't waste time looking up food items online or asking around class.
     * Class time is limited.
     */
    private String foodItem1;
    private String foodItem2;
    private String foodItem3;
    private String foodItem4;
    private String foodItem5;
    private String foodItem6;
    private String foodItem7;
    private String foodItem8;
    private String foodItem9;
    private boolean foodItem10;
    private boolean foodItem11;
    private boolean foodItem12;
    private boolean foodItem13;
    private boolean foodItem14;
    private boolean foodItem15;

    private ThanksGivingDinner(String foodItem1, String foodItem2, String foodItem3, String foodItem4, String foodItem5, String foodItem6, String foodItem7, String foodItem8, String foodItem9, boolean foodItem10, boolean foodItem11, boolean foodItem12, boolean foodItem13, boolean foodItem14, boolean foodItem15) {
        this.foodItem1 = foodItem1;
        this.foodItem2 = foodItem2;
        this.foodItem3 = foodItem3;
        this.foodItem4 = foodItem4;
        this.foodItem5 = foodItem5;
        this.foodItem6 = foodItem6;
        this.foodItem7 = foodItem7;
        this.foodItem8 = foodItem8;
        this.foodItem9 = foodItem9;
        this.foodItem10 = foodItem10;
        this.foodItem11 = foodItem11;
        this.foodItem12 = foodItem12;
        this.foodItem13 = foodItem13;
        this.foodItem14 = foodItem14;
        this.foodItem15 = foodItem15;
    }

    public String getFoodItem1() {
        return foodItem1;
    }

    public String getFoodItem2() {
        return foodItem2;
    }

    public String getFoodItem3() {
        return foodItem3;
    }

    public String getFoodItem4() {
        return foodItem4;
    }

    public String getFoodItem5() {
        return foodItem5;
    }

    public String getFoodItem6() {
        return foodItem6;
    }

    public String getFoodItem7() {
        return foodItem7;
    }

    public String getFoodItem8() {
        return foodItem8;
    }

    public String getFoodItem9() {
        return foodItem9;
    }

    public boolean isFoodItem10() {
        return foodItem10;
    }

    public boolean isFoodItem11() {
        return foodItem11;
    }

    public boolean isFoodItem12() {
        return foodItem12;
    }

    public boolean isFoodItem13() {
        return foodItem13;
    }

    public boolean isFoodItem14() {
        return foodItem14;
    }

    public boolean isFoodItem15() {
        return foodItem15;
    }

    public static class DinnerBuilder{
        private String foodItem1;
        private String foodItem2;
        private String foodItem3;
        private String foodItem4;
        private String foodItem5;
        private String foodItem6;
        private String foodItem7;
        private String foodItem8;
        private String foodItem9;
        private boolean foodItem10;
        private boolean foodItem11;
        private boolean foodItem12;
        private boolean foodItem13;
        private boolean foodItem14;
        private boolean foodItem15;

        public DinnerBuilder() {
        }

        public DinnerBuilder setFoodItem1(String foodItem1){
            this.foodItem1 = foodItem1;
            return this;
        }
        public DinnerBuilder setFoodItem2(String foodItem2){
            this.foodItem2 = foodItem2;
            return this;
        }
        public DinnerBuilder setFoodItem3(String foodItem3){
            this.foodItem3 = foodItem3;
            return this;
        }
        public DinnerBuilder setFoodItem4(String foodItem4){
            this.foodItem4 = foodItem4;
            return this;
        }
        public DinnerBuilder setFoodItem5(String foodItem5){
            this.foodItem5 = foodItem5;
            return this;
        }
        public DinnerBuilder setFoodItem6(String foodItem6){
            this.foodItem6 = foodItem6;
            return this;
        }
        public DinnerBuilder setFoodItem7(String foodItem7){
            this.foodItem7 = foodItem7;
            return this;
        }
        public DinnerBuilder setFoodItem8(String foodItem8){
            this.foodItem8 = foodItem8;
            return this;
        }
        public DinnerBuilder setFoodItem9(String foodItem9){
            this.foodItem9 = foodItem9;
            return this;
        }
        public DinnerBuilder setFoodItem10(boolean foodItem10){
            this.foodItem10 = foodItem10;
            return this;
        }
        public DinnerBuilder setFoodItem11(boolean foodItem11){
            this.foodItem11 = foodItem11;
            return this;
        }
        public DinnerBuilder setFoodItem12(boolean foodItem12){
            this.foodItem12 = foodItem12;
            return this;
        }
        public DinnerBuilder setFoodItem13(boolean foodItem13){
            this.foodItem13 = foodItem13;
            return this;
        }
        public DinnerBuilder setFoodItem14(boolean foodItem14){
            this.foodItem14 = foodItem14;
            return this;
        }
        public DinnerBuilder setFoodItem15(boolean foodItem15){
            this.foodItem15 = foodItem15;
            return this;
        }
        public ThanksGivingDinner build(){
            return new ThanksGivingDinner(foodItem1,foodItem2,foodItem3,foodItem4,foodItem5,foodItem6,foodItem7,foodItem8,foodItem9,foodItem10,foodItem11,foodItem12,foodItem13,foodItem14,foodItem15);
        }
    }
}
