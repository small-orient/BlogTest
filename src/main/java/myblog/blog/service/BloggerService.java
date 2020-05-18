package myblog.blog.service;

import myblog.blog.domain.Blogger;

public interface BloggerService {
    /**
     * 查询博主信息
     *
     * @return
     */
    Blogger findBloggerData();
}
