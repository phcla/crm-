package com.sm.qy28.controller;


import com.sm.qy28.common.http.AxiosResult;
import com.sm.qy28.controller.base.BaseController;
import com.sm.qy28.domain.entity.Category;
import com.sm.qy28.domain.entity.Dept;
import com.sm.qy28.serivce.CategoryService;
import com.sm.qy28.serivce.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController extends BaseController {


    @Autowired
    private DeptService deptService;


    @GetMapping
    public AxiosResult<List<Dept>> list(){
        List<Dept> list = deptService.list();
        return AxiosResult.success(list);
    }

    @PostMapping
    public AxiosResult<Void> add(@RequestBody Dept dept){
        deptService.save(dept);
        return AxiosResult.success(null);
    }

    @PutMapping
    public AxiosResult<Void> update(@RequestBody Dept dept){
        deptService.update(dept);
        return AxiosResult.success(null);
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> delete(@PathVariable Long id){
        deptService.delete(id);
        return AxiosResult.success(null);
    }
}
