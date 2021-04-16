package com.sm.qy28.controller;


import com.sm.qy28.common.http.AxiosResult;
import com.sm.qy28.controller.base.BaseController;
import com.sm.qy28.domain.entity.Brand;
import com.sm.qy28.serivce.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("brand")
public class BrandController extends BaseController {


    @Autowired
    private BrandService brandService;


    @GetMapping
    public AxiosResult<List<Brand>> list(){
        List<Brand> list = brandService.list();
        return AxiosResult.success(list);
    }

    @PostMapping
    public AxiosResult<Void> add(@RequestBody Brand brand){
        brandService.save(brand);
        return AxiosResult.success(null);
    }

    @PutMapping
    public AxiosResult<Void> update(@RequestBody Brand brand){
        brandService.update(brand);
        return AxiosResult.success(null);
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> delete(@PathVariable Long id){
        brandService.delete(id);
        return AxiosResult.success(null);
    }
}
