package com.blog.Mapper;

import com.blog.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author shanhe
 * @className CommentMapper
 * @date 2020-03-16 14:32
 **/
@Mapper
public interface CommentMapper {
    Integer insert(Comment comment);

    Integer countByIArticled(Integer id);

    List<Comment> selectCommentByArticleId(Integer id);
}
