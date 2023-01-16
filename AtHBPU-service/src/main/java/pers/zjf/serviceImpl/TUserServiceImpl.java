package pers.zjf.serviceImpl;

import pers.zjf.entity.TUser;
import pers.zjf.mapper.TUserMapper;
import pers.zjf.service.TUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author zhaojunfu
 * @since 2023-01-16
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

}
