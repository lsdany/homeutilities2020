package com.ld.homeutilities.controller;

import com.ld.homeutilities.domain.Food;
import com.ld.homeutilities.service.FoodService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author luisdany
 */

@RestController
@RequestMapping("/food")
public class FoodController {

    private FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/")
    public String getTest(){
        return "hello test";
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void addFood(@RequestBody Food food){
        foodService.addFood(food);
    }

}
