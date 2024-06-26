package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    public void saveUser(User user);

    public void deleteUser(Long id);

    public void changeUser(User user);

    public User getUser(Long id);

    public List<User> getUsersList();

}
