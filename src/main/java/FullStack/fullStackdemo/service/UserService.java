package FullStack.fullStackdemo.service;

import FullStack.fullStackdemo.entity.User;

import java.util.List;

public interface UserService {
    public User getUserById(int id);
    public User createUser(User user);

    public List<User> getAllUsers();
    public void deleteUserById(int id);
}
