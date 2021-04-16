package com.sm.qy28.serivce.base.impl;

import com.sm.qy28.domain.entity.Category;
import com.sm.qy28.serivce.CategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryService {

}
