package com.sm.qy28.serivce.base.impl;

import com.sm.qy28.domain.entity.Dept;
import com.sm.qy28.serivce.DeptService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeptServiceImpl extends BaseServiceImpl<Dept> implements DeptService {

}
