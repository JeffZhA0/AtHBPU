package pers.zjf.serviceImpl;

import pers.zjf.entity.TBlog;
import pers.zjf.mapper.TBlogMapper;
import pers.zjf.service.TBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博客表 服务实现类
 * </p>
 *
 * @author zhaojunfu
 * @since 2023-01-16
 */
@Service
public class TBlogServiceImpl extends ServiceImpl<TBlogMapper, TBlog> implements TBlogService {

}
