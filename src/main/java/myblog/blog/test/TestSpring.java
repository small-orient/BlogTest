package myblog.blog.test;

import myblog.blog.service.BloggerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试Spring
 */
public class TestSpring {

    @Test
    public void run1() {
        //加载spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-beans.xml");
        //获取对象
        BloggerService bs = (BloggerService) ac.getBean("bloggerService");
        //调用方法
        bs.findBloggerData();
    }
}
