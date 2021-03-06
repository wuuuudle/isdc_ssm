package isdc.isdcssm.dao;

import isdc.isdcssm.model.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * 通用 Mapper 代码生成器
 *
 * @author mapper-generator
 */
@Component
@Mapper
public interface BlogDAO extends tk.mybatis.mapper.common.Mapper<Blog>
{
    @Select("select writer from blog where id = #{id}")
    String getWriterById(int id);
}




