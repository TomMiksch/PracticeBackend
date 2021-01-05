package com.sarahshusband.practicebackend.services;

import com.sarahshusband.practicebackend.objects.Ingredients;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.sarahshusband.practicebackend.objects.MassType.*;

@Service
public class IngredientsService {

    public List<Ingredients> getIngredients() {
        List<Ingredients> list = new ArrayList<>();
        list.add(Ingredients.builder()
                .name("Flour")
                .amount(new BigDecimal("5"))
                .massType(WEIGHT)
                .massUnit("oz")
                .build());
        list.add(Ingredients.builder()
                .name("Milk")
                .amount(new BigDecimal("1"))
                .massType(VOLUME)
                .massUnit("gallons")
                .build());
        list.add(Ingredients.builder()
                .name("Eggs")
                .amount(new BigDecimal("12"))
                .massType(COUNT)
                .massUnit("ct")
                .build());
        return list;
    }
}
