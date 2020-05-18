package myblog.blog.controller;


import myblog.blog.domain.Blogger;
import myblog.blog.service.BloggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 博主前端控制器
 */
@Controller
@RequestMapping("/bloggerController")
public class BloggerController {

    @Autowired
    private BloggerService bloggerService;

    @RequestMapping("/findAll")
    public String findAll() {
        System.out.println("表现层输出......");
        Blogger data = bloggerService.findBloggerData();
        System.out.println(data);
        return "list";
    }

}
