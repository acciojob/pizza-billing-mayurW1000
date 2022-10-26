package com.driver;

public class Pizza {

//    private int price;
//    private Boolean isVeg;
//    private String bill;

    private int price;
    private int extraCheesePrice;
    private int extraToppingPrice;
    private int takeAwayPrice;
    private boolean isExtraCheese;
    private boolean isExtraToppings;
    private boolean isTakeAway;
    private boolean isVeg;
    private String total_bill;
    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.isExtraCheese = false;
        this.isExtraToppings = false;
        this.isTakeAway = false;
        this.extraCheesePrice = 80;
        this.takeAwayPrice = 20;
        if(isVeg == true){
            this.price = 300;
            this.extraToppingPrice = 70;
        }
        else{
            this.price = 400;
            this.extraToppingPrice = 120;
        }
    }

    public void addExtraCheese(){
        if(!isExtraCheese){
            this.price = this.price + extraCheesePrice;
            isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppings){
            this.price = this.price + this.extraToppingPrice;
            isExtraToppings = true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAway){
            this.price = this.price + this.takeAwayPrice;
            isTakeAway = true;
        }
    }

    public String getBill(){
        if(isVeg){
            this.total_bill = "Base Price Of The Pizza: " + "300" + "\n";
        }
        else{
            this.total_bill = "Base Price Of The Pizza: " + "400" + "\n";
        }
        if(isExtraCheese){
            this.total_bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }
        if(isExtraToppings){
            this.total_bill += "Extra Toppings Added: " + extraToppingPrice + "\n";
        }
        if(isTakeAway){
            this.total_bill += "Paperbag Added: " + takeAwayPrice + "\n";
        }
        this.total_bill += "Total Price: " + price;
        return total_bill;
    }
//
//    public Pizza(Boolean isVeg){
//        this.isVeg = isVeg;
//        // your code goes here
//    }
//
    public int getPrice(){
        return this.price;
    }
//
//    public void addExtraCheese(){
//        // your code goes here
//    }
//
//    public void addExtraToppings(){
//        // your code goes here
//    }
//
//    public void addTakeaway(){
//        // your code goes here
//    }
//
//    public String getBill(){
//        // your code goes here
//        return this.bill;
//    }
}
