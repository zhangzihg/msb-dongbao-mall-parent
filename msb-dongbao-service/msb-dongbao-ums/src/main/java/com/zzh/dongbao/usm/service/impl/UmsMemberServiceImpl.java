package com.zzh.dongbao.usm.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzh.dongbao.usm.entity.UmsMember;
import com.zzh.dongbao.usm.mapper.UmsMemberMapper;
import com.zzh.ums.api.dto.UmsMemberDTO;
import com.zzh.ums.api.service.UmsMemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author zzh
 * @since 2023-06-07
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements IService<UmsMember>, UmsMemberService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Override
    public int registerUer(UmsMemberDTO user) {
        UmsMember member = new UmsMember();
        BeanUtils.copyProperties(user,member);
        return this.save(member)?1:0;
    }
}
