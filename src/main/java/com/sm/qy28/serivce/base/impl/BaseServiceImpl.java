package com.sm.qy28.serivce.base.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.sm.qy28.mapper.base.MyMapper;
import com.sm.qy28.serivce.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private MyMapper<T> myMapper;


    protected MyMapper<T> getMyMapper(){
        return myMapper;
    }

    @Override
    public List<T> list() {
        return myMapper.selectList(null);
    }

    @Override
    public List<T> search(Wrapper<T> wrapper) {
        return myMapper.selectList(wrapper);
    }

    @Override
    public T getById(Long id) {
        return myMapper.selectById(id);
    }

    @Override
    public int save(T t) {
        return myMapper.insert(t);
    }

    @Override
    public int update(T t) {
        return myMapper.updateById(t);
    }

    @Override
    public int delete(Long id) {
        return myMapper.deleteById(id);
    }

    @Override
    public int batchDeleteByIds(List<Long> ids) {
        return myMapper.deleteBatchIds(ids);
    }
}
