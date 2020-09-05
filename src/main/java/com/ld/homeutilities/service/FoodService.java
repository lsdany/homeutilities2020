package com.ld.homeutilities.service;

import com.ld.homeutilities.domain.Food;
import com.ld.homeutilities.repository.FoodRepo;
import org.springframework.stereotype.Service;

/**
 * @author luisdany
 */

@Service
public class FoodService {

    private FoodRepo foodRepo;

    public FoodService(FoodRepo foodRepo) {
        this.foodRepo = foodRepo;
    }

    public void addFood(Food food){
        foodRepo.save(food);
    }

}
