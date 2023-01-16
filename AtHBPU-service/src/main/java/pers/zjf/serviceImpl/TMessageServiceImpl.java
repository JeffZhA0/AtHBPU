package pers.zjf.serviceImpl;

import pers.zjf.entity.TMessage;
import pers.zjf.mapper.TMessageMapper;
import pers.zjf.service.TMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 私信表 服务实现类
 * </p>
 *
 * @author zhaojunfu
 * @since 2023-01-16
 */
@Service
public class TMessageServiceImpl extends ServiceImpl<TMessageMapper, TMessage> implements TMessageService {

}
