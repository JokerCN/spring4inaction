package tech.tongyu.yyw.chapter11.repo;

import tech.tongyu.yyw.chapter11.domain.User;

public interface IUserRepository {

	void addUser(User user);

	User getUserById(Long id);

	void saveUser(User user);
}
