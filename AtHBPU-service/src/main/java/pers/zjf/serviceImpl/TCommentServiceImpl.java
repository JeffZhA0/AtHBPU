package pers.zjf.serviceImpl;

import pers.zjf.entity.TComment;
import pers.zjf.mapper.TCommentMapper;
import pers.zjf.service.TCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论表 服务实现类
 * </p>
 *
 * @author zhaojunfu
 * @since 2023-01-16
 */
@Service
public class TCommentServiceImpl extends ServiceImpl<TCommentMapper, TComment> implements TCommentService {

}
