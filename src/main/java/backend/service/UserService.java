package backend.service;


import backend.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAll();
    public void addUser(User user);
}
