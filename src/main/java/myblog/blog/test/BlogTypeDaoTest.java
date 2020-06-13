package myblog.blog.test;

import myblog.blog.dao.BlogTypeDao;
import myblog.blog.domain.BlogType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class BlogTypeDaoTest {
    @Resource
    private BlogTypeDao blogTypeDao;

    @Test
    public void addBlogType() throws Exception {
        BlogType blogType = new BlogType("Mysql", 10);
        System.out.println(blogType);
        int num = blogTypeDao.addBlogType(blogType);
        System.out.println(num);
    }

    @Test
    public void deleteBlogType() throws Exception {

        int num = blogTypeDao.deleteBlogType(16);
        System.out.println(num);

    }

    @Test
    public void getById() throws Exception {
        BlogType blogType = blogTypeDao.getById(17);
        System.out.println(blogType);

    }

    @Test
    public void updateBlogType() throws Exception {

        BlogType byId = blogTypeDao.getById(17);

        byId.settypeName("更新mysql");

        Integer num = blogTypeDao.updateBlogType(byId);

        System.out.println(num);

    }


    @Test
    public void listByPage() throws Exception {
        //设置页数为第一页
        Integer page = 1;
        //设置每页显示数量
        Integer pageSize = 2;
        //数据库搜索起始位置
        Integer start = (page - 1) * pageSize;
        //数据库搜索结束位置
        Integer end = page * pageSize;
        List<BlogType> blogTypeList = blogTypeDao.listByPage(start, end);
        for (BlogType list : blogTypeList) {
            System.out.println(list);
        }

    }

    @Test
    public void getTotal() throws Exception {
        long total = blogTypeDao.getTotal();
        System.out.println(total);

    }

}
