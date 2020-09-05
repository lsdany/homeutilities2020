package com.ld.homeutilities.repository;

import com.ld.homeutilities.domain.Food;
import org.springframework.data.repository.CrudRepository;

/**
 * @author luisdany
 */

public interface FoodRepo extends CrudRepository<Food, Long> {
}
