package myblog.blog.test;

import myblog.blog.dao.BloggerDao;
import myblog.blog.domain.Blogger;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;


/**
 * 测试Mybatis
 */
public class TestMybatis {
    @Test
    public void run1() throws Exception {
        //加载Mybatis配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapperConf.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        BloggerDao dao = session.getMapper(BloggerDao.class);
        //查询博主数据
        Blogger data = dao.findBloggerData();
        System.out.println(data);
        //释放资源
        session.close();
        in.close();
    }
}
