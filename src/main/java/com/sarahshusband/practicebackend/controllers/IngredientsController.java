package com.sarahshusband.practicebackend.controllers;

import com.sarahshusband.practicebackend.objects.Ingredients;
import com.sarahshusband.practicebackend.services.IngredientsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class IngredientsController {

    private final IngredientsService ingredientsService;

    public IngredientsController(IngredientsService ingredientsService) {
        this.ingredientsService = ingredientsService;
    }

    @GetMapping("/")
    public List<Ingredients> getIngredients() {
        return ingredientsService.getIngredients();
    }
}
