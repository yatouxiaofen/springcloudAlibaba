package com.leyou.user.mapper;

import com.leyou.user.entity.TUser;

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
public interface TUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
    
    List<TUser> selectUserList();
}