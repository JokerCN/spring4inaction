package tech.tongyu.yyw.chapter11.repo;

import tech.tongyu.yyw.chapter11.domain.User;

public interface CustomUserRepository {
	void updateUsername(Long id, String username);
	void create(User user);
}
