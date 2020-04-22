package com.example.funfactswednesday;

import java.util.Random;

public class FactBook {
    private String[] facts = {
            "Ravens in captivity speak better than parrots",
            "There is no dinosaur fossils found in Florida",
            "India has more than 20 different spoken languages",
            "The dodo birds were flightless birds",
            "The first ever microphone was created by a German"

    };

    public String getFact(){
        Random random = new Random();
        return facts[random.nextInt(facts.length)];

    }


}
