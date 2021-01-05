package com.sarahshusband.practicebackend.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class IngredientsControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    IngredientsController ingredientsController;

    @Test
    @DisplayName("Get back list of ingredients")
    void getIngredients() throws Exception {
        mvc.perform(get("/"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(jsonPath("$[0].name").value("Flour"))
            .andExpect(jsonPath("$[1].name").value("Milk"))
            .andExpect(jsonPath("$[2].name").value("Eggs"));
    }
}
