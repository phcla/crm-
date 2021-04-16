package com.sm.qy28.controller;


import com.sm.qy28.common.http.AxiosResult;
import com.sm.qy28.controller.base.BaseController;
import com.sm.qy28.domain.entity.Admin;
import com.sm.qy28.domain.entity.Brand;
import com.sm.qy28.serivce.AdminService;
import com.sm.qy28.serivce.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController extends BaseController {


    @Autowired
    private AdminService adminService;


    @GetMapping
    public AxiosResult<List<Admin>> list(){
        List<Admin> list = adminService.list();
        return AxiosResult.success(list);
    }

    @PostMapping
    public AxiosResult<Void> add(@RequestBody Admin admin){
        adminService.save(admin);
        return AxiosResult.success(null);
    }

    @PutMapping
    public AxiosResult<Void> update(@RequestBody Admin admin){
        adminService.update(admin);
        return AxiosResult.success(null);
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> delete(@PathVariable Long id){
        adminService.delete(id);
        return AxiosResult.success(null);
    }
}
