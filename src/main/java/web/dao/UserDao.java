package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    public void saveUser(User user);

    public void deleteUser(Long id);

    public void changeUser(User user, Long id);

    public User getUser(Long id);

    public List<User> getUsersList();

}
