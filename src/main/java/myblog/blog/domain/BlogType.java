package myblog.blog.domain;

import java.io.Serializable;

/**
 * 博客类别实体类
 */
public class BlogType implements Serializable {

    private Integer id;
    private String typeName;
    private Integer orderNum;

    public BlogType(Integer id, String typeName, Integer orderNum) {
        this.id = id;
        this.typeName = typeName;
        this.orderNum = orderNum;
    }

    public BlogType(String typeName, Integer orderNum) {
        this.typeName = typeName;
        this.orderNum = orderNum;
    }

    public Integer getId() {
        return id;
    }

    public String gettypeName() {
        return typeName;
    }

    public Integer getorderNum() {
        return orderNum;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void settypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setorderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "BlogType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", orderNum=" + orderNum +
                '}';
    }
}
