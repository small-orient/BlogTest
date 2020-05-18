package myblog.blog.dao;

import myblog.blog.domain.Blogger;
import org.springframework.stereotype.Repository;

/**
 * 博主类dao接口
 */
@Repository
public interface BloggerDao {
    /**
     * 查询博主信息
     *
     * @return
     */
    Blogger findBloggerData();
}
