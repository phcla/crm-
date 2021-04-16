package com.sm.qy28.serivce.base.impl;

import com.sm.qy28.domain.entity.Admin;
import com.sm.qy28.serivce.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl extends BaseServiceImpl<Admin> implements AdminService {

}
