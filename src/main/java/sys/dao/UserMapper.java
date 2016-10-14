package sys.dao;

import com.github.abel533.mapper.Mapper;
import sys.model.User;
public interface UserMapper extends Mapper<User> {

    User querySingleUser(String username);
}