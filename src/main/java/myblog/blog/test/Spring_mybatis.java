package myblog.blog.test;

import myblog.blog.dao.BloggerDao;
import myblog.blog.domain.Blogger;
import myblog.blog.service.BloggerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class) //使用spring测试
@ContextConfiguration(locations = "classpath:spring-beans.xml") //配置spring文件路径
public class Spring_mybatis {


    @Test
    public void findBloggerData() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-beans.xml");
        BloggerService bs = (BloggerService) ac.getBean("bloggerService");
        bs.findBloggerData();
    }

}
