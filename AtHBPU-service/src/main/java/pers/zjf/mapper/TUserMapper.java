package pers.zjf.mapper;

import pers.zjf.entity.TUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author zhaojunfu
 * @since 2023-01-16
 */
@Mapper
public interface TUserMapper extends BaseMapper<TUser> {

}
