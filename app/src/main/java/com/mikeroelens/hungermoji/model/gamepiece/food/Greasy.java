package com.mikeroelens.hungermoji.model.gamepiece.food;

import com.mikeroelens.hungermoji.model.Emojis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greasy extends FoodPiece {

    @Override
    public String getName() {
        return "Greasy";
    }

    private static List<String> emojis = new ArrayList<>(
        Arrays.asList(
            Emojis.BURGER,
            Emojis.FRIES,
            Emojis.PIZZA
            //Emojis.BURRITO, // Only available on 6.0.1+ devices
            //Emojis.TACO,
            //Emojis.HOTDOG
        )
    );

    @Override
    public List<String> getEmojis() {
        return emojis;
    }
}
