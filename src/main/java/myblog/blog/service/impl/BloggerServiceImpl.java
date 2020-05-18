package myblog.blog.service.impl;

import myblog.blog.dao.BloggerDao;
import myblog.blog.domain.Blogger;
import myblog.blog.service.BloggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService {

    @Autowired
    private BloggerDao bloggerDao;

    @Override
    public Blogger findBloggerData() {
        System.out.println("业务层查询博主测试...");
        Blogger data = bloggerDao.findBloggerData();
        System.out.println(data);
        return data;
    }
}
