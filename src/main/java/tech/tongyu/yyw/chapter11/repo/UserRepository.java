package tech.tongyu.yyw.chapter11.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.tongyu.yyw.chapter11.domain.User;

public interface UserRepository extends JpaRepository<User, Long>, CustomUserRepository{
}
