package com.sm.qy28.serivce.base.impl;

import com.sm.qy28.domain.entity.Good;
import com.sm.qy28.serivce.GoodService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GoodServiceImpl extends BaseServiceImpl<Good> implements GoodService {

}
