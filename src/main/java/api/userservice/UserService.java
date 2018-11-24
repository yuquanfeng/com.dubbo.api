package api.userservice;

import bean.NFResult;
import bean.User;

public interface UserService {
    NFResult<User> selectUser(String userName);
}
