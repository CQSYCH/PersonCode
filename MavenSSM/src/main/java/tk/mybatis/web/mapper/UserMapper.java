package tk.mybatis.web.mapper;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.web.model.User;

public interface UserMapper {
    public int InsertUser(@Param("user") User user);
}
