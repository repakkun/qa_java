package com.example;

import java.util.List;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        if ("Травоядное".equals(animalKind)) {
            return List.of("Трава", "Различные растения");
        } else if ("predator".equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else {
            throw new Exception("Unexpected");
        }
    }

    public String getFamily() {
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    }

    public int getKittens() {
        return 1;
    }
}
