package com.sarahshusband.practicebackend.services;

import com.sarahshusband.practicebackend.objects.Ingredients;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static com.sarahshusband.practicebackend.objects.MassType.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IngredientsServiceTest {

    IngredientsService ingredientsService;

    @BeforeEach
    public void setUp() {
        ingredientsService = new IngredientsService();
    }

    @Test
    public void getIngredients() {
        List<Ingredients> actual = ingredientsService.getIngredients();
        assertEquals(actual.size(), 3);
        assertEquals(actual.get(0).getName(), "Flour");
        assertEquals(actual.get(1).getName(), "Milk");
        assertEquals(actual.get(2).getName(), "Eggs");
    }
}
