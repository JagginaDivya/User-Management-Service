package com.example.UserManagementService.Util;

import com.example.food.Model.MenuModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value="FoodFeignClientDemo",url="http://localhost:8080/food")
public interface FoodUtil {

    @GetMapping("/displayMenu/")
    public List<MenuModel> displayMenu();
}
