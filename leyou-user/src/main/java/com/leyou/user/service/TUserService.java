package com.leyou.user.service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.leyou.user.entity.TUser;
import com.leyou.user.mapper.TUserMapper;

import java.util.List;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  lenovo
 * @version  [版本号, 2024/12/27]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Service
public class TUserService{

    @Autowired
    private TUserMapper tUserMapper;

    
    public int deleteByPrimaryKey(Integer userId) {
        return tUserMapper.deleteByPrimaryKey(userId);
    }

    
    public int insert(TUser record) {
        return tUserMapper.insert(record);
    }

    
    public int insertSelective(TUser record) {
        return tUserMapper.insertSelective(record);
    }

    
    public TUser selectByPrimaryKey(Integer userId) {
        return tUserMapper.selectByPrimaryKey(userId);
    }

    
    public int updateByPrimaryKeySelective(TUser record) {
        return tUserMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TUser record) {
        return tUserMapper.updateByPrimaryKey(record);
    }
    
    public List<TUser> listUser()
    {
        return tUserMapper.selectUserList();
    }
    
    public TUser queryUser(Integer userId)
    {
        return tUserMapper.selectByPrimaryKey(userId);
    }
}
