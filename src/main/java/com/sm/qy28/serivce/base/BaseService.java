package com.sm.qy28.serivce.base;

import com.baomidou.mybatisplus.core.conditions.Wrapper;

import java.util.List;

public interface BaseService<T> {


    //查询所有
    List<T> list();

    //通过条件查询所有
    List<T> search(Wrapper<T> wrapper);

    //根据id查询
    T getById(Long id);

    //添加
    int save(T t);

    //修改
    int update(T t);

    //删除
    int delete(Long id);

    //批量删除
    int batchDeleteByIds(List<Long> ids);




}
