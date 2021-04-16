package com.sm.qy28.serivce.base.impl;

import com.sm.qy28.domain.entity.Brand;
import com.sm.qy28.serivce.BrandService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BrandServiceImpl extends BaseServiceImpl<Brand> implements BrandService {

}
