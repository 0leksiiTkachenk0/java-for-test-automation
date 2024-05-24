package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {

        String food;

        switch (animal) {
            case "Cat":
                food = (isPremium) ? "Salmon" : "Tuna";
                break;
            case "Dog":
                food = (isPremium) ? "Deluxe Dog Food" : "Dog Food";
                break;
            case "Hamster":
                food = (isPremium) ? "Lettuce" : "Cabbage";
                break;
            default:
                food = "Don't know this animal - don't know the food";
        }

        return food;
    }
}

        //        if (animal.equals("Cat")) {
////            if (isPremium) {
////                return "Salmon";
////            } else {
////                return "Tuna";
////            }
//            return (isPremium) ? "Salmon" : "Tuna";
//        } else if (animal.equals("Dog")) {
//            return "Dog Food";
//        } else {
//            return "Cabbage";
//        }

