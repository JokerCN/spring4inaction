package tech.tongyu.yyw.chapter11.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tech.tongyu.yyw.chapter11.domain.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long>, CustomUserRepository{
}
