package com.sm.qy28.controller;


import com.sm.qy28.common.http.AxiosResult;
import com.sm.qy28.controller.base.BaseController;
import com.sm.qy28.domain.entity.Admin;
import com.sm.qy28.domain.entity.Category;
import com.sm.qy28.serivce.AdminService;
import com.sm.qy28.serivce.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController extends BaseController {


    @Autowired
    private CategoryService categoryService;


    @GetMapping
    public AxiosResult<List<Category>> list(){
        List<Category> list = categoryService.list();
        return AxiosResult.success(list);
    }

    @PostMapping
    public AxiosResult<Void> add(@RequestBody Category category){
        categoryService.save(category);
        return AxiosResult.success(null);
    }

    @PutMapping
    public AxiosResult<Void> update(@RequestBody Category category){
        categoryService.update(category);
        return AxiosResult.success(null);
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> delete(@PathVariable Long id){
        categoryService.delete(id);
        return AxiosResult.success(null);
    }
}
