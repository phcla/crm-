package com.sm.qy28.controller;


import com.sm.qy28.common.http.AxiosResult;
import com.sm.qy28.controller.base.BaseController;
import com.sm.qy28.domain.entity.Dept;
import com.sm.qy28.domain.entity.Good;
import com.sm.qy28.serivce.DeptService;
import com.sm.qy28.serivce.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("good")
public class GoodController extends BaseController {


    @Autowired
    private GoodService goodService;


    @GetMapping
    public AxiosResult<List<Good>> list(){
        List<Good> list = goodService.list();
        return AxiosResult.success(list);
    }

    @PostMapping
    public AxiosResult<Void> add(@RequestBody Good good){
        goodService.save(good);
        return AxiosResult.success(null);
    }

    @PutMapping
    public AxiosResult<Void> update(@RequestBody Good good){
        goodService.update(good);
        return AxiosResult.success(null);
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> delete(@PathVariable Long id){
        goodService.delete(id);
        return AxiosResult.success(null);
    }
}
