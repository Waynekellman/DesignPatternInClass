package com.nyc.designpatterninclass.builders;

/**
 * Created by Wayne Kellman on 1/7/18.
 */

public class CarParts {
    /**
     * I definitely don't know 20 car parts and in fact I didn't know cars had 20 parts.
     * I will be replacing that with carPart#.
     */
    private String carPart1;
    private String carPart2;
    private String carPart3;
    private String carPart4;
    private String carPart5;
    private String carPart6;
    private String carPart7;
    private String carPart8;
    private String carPart9;
    private String carPart10;
    private boolean carPart11;
    private boolean carPart12;
    private boolean carPart13;
    private boolean carPart14;
    private boolean carPart15;
    private boolean carPart16;
    private int carPart17;
    private int carPart18;
    private int carPart19;
    private int carPart20;

    private CarParts(String carPart1, String carPart2, String carPart3, String carPart4, String carPart5, String carPart6, String carPart7, String carPart8, String carPart9, String carPart10, boolean carPart11, boolean carPart12, boolean carPart13, boolean carPart14, boolean carPart15, boolean carPart16, int carPart17, int carPart18, int carPart19, int carPart20) {
        this.carPart1 = carPart1;
        this.carPart2 = carPart2;
        this.carPart3 = carPart3;
        this.carPart4 = carPart4;
        this.carPart5 = carPart5;
        this.carPart6 = carPart6;
        this.carPart7 = carPart7;
        this.carPart8 = carPart8;
        this.carPart9 = carPart9;
        this.carPart10 = carPart10;
        this.carPart11 = carPart11;
        this.carPart12 = carPart12;
        this.carPart13 = carPart13;
        this.carPart14 = carPart14;
        this.carPart15 = carPart15;
        this.carPart16 = carPart16;
        this.carPart17 = carPart17;
        this.carPart18 = carPart18;
        this.carPart19 = carPart19;
        this.carPart20 = carPart20;
    }

    public String getCarPart1() {
        return carPart1;
    }

    public String getCarPart2() {
        return carPart2;
    }

    public String getCarPart3() {
        return carPart3;
    }

    public String getCarPart4() {
        return carPart4;
    }

    public String getCarPart5() {
        return carPart5;
    }

    public String getCarPart6() {
        return carPart6;
    }

    public String getCarPart7() {
        return carPart7;
    }

    public String getCarPart8() {
        return carPart8;
    }

    public String getCarPart9() {
        return carPart9;
    }

    public String getCarPart10() {
        return carPart10;
    }

    public boolean isCarPart11() {
        return carPart11;
    }

    public boolean isCarPart12() {
        return carPart12;
    }

    public boolean isCarPart13() {
        return carPart13;
    }

    public boolean isCarPart14() {
        return carPart14;
    }

    public boolean isCarPart15() {
        return carPart15;
    }

    public boolean isCarPart16() {
        return carPart16;
    }

    public int getCarPart17() {
        return carPart17;
    }

    public int getCarPart18() {
        return carPart18;
    }

    public int getCarPart19() {
        return carPart19;
    }

    public int getCarPart20() {
        return carPart20;
    }

    public static class CarPartsBuilder{
        private String carPart1;
        private String carPart2;
        private String carPart3;
        private String carPart4;
        private String carPart5;
        private String carPart6;
        private String carPart7;
        private String carPart8;
        private String carPart9;
        private String carPart10;
        private boolean carPart11;
        private boolean carPart12;
        private boolean carPart13;
        private boolean carPart14;
        private boolean carPart15;
        private boolean carPart16;
        private int carPart17;
        private int carPart18;
        private int carPart19;
        private int carPart20;

        public CarPartsBuilder setCarPart1(String carPart1){
            this.carPart1 = carPart1;
            return this;
        }
        public CarPartsBuilder setCarPart2(String carPart2){
            this.carPart2 = carPart2;
            return this;
        }
        public CarPartsBuilder setCarPart3(String carPart3){
            this.carPart3 = carPart3;
            return this;
        }
        public CarPartsBuilder setCarPart4(String carPart4){
            this.carPart4 = carPart4;
            return this;
        }
        public CarPartsBuilder setCarPart5(String carPart5){
            this.carPart5 = carPart5;
            return this;
        }
        public CarPartsBuilder setCarPart6(String carPart6){
            this.carPart6 = carPart6;
            return this;
        }
        public CarPartsBuilder setCarPart7(String carPart7){
            this.carPart7 = carPart7;
            return this;
        }
        public CarPartsBuilder setCarPart8(String carPart8){
            this.carPart8 = carPart8;
            return this;
        }
        public CarPartsBuilder setCarPart9(String carPart9){
            this.carPart9 = carPart9;
            return this;
        }
        public CarPartsBuilder setCarPart10(String carPart10){
            this.carPart10 = carPart10;
            return this;
        }
        public CarPartsBuilder setCarPart11(boolean carPart11){
            this.carPart11 = carPart11;
            return this;
        }
        public CarPartsBuilder setCarPart12(boolean carPart12){
            this.carPart12 = carPart12;
            return this;
        }
        public CarPartsBuilder setCarPart13(boolean carPart13){
            this.carPart13 = carPart13;
            return this;
        }
        public CarPartsBuilder setCarPart14(boolean carPart14){
            this.carPart14 = carPart14;
            return this;
        }
        public CarPartsBuilder setCarPart15(boolean carPart15){
            this.carPart15 = carPart15;
            return this;
        }
        public CarPartsBuilder setCarPart16(boolean carPart16){
            this.carPart16 = carPart16;
            return this;
        }
        public CarPartsBuilder setCarPart17(int carPart17){
            this.carPart17 = carPart17;
            return this;
        }
        public CarPartsBuilder setCarPart18(int carPart18){
            this.carPart18 = carPart18;
            return this;
        }
        public CarPartsBuilder setCarPart19(int carPart19){
            this.carPart19 = carPart19;
            return this;
        }
        public CarPartsBuilder setCarPart20(int carPart20){
            this.carPart20 = carPart20;
            return this;
        }

        public CarParts build(){
            return new CarParts(carPart1,carPart2,carPart3,carPart4,carPart5,carPart6,carPart7,carPart8,carPart9,carPart10,carPart11,carPart12,carPart13,carPart14,carPart15,carPart16,carPart17,carPart18,carPart19,carPart20);
        }
    }
}
