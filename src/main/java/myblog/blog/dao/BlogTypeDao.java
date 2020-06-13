package myblog.blog.dao;

import myblog.blog.domain.BlogType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 博客类别Dao
 */
@Repository
public interface BlogTypeDao {

    /**
     * 添加博客类别信息
     *
     * @param blogType
     * @return
     */
    Integer addBlogType(BlogType blogType);

    /**
     * 删除博客类别信息
     *
     * @param id
     * @return
     */
    Integer deleteBlogType(Integer id);

    /**
     * 修改博客类别信息
     *
     * @param blogType
     * @return
     */
    Integer updateBlogType(BlogType blogType);

    /**
     * 根据Id查询博客类别信息
     *
     * @param id
     * @return
     */
    BlogType getById(Integer id);

    /**
     * 分页查询博客类别信息
     */
    List<BlogType> listByPage(@Param("start") Integer start, @Param("end") Integer end);

    /**
     * 查询总记录数
     */
    Long getTotal();

}
