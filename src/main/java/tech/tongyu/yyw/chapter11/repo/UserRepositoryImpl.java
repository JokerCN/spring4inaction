package tech.tongyu.yyw.chapter11.repo;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tech.tongyu.yyw.chapter11.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepositoryImpl implements CustomUserRepository{
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public void updateUsername(Long id, String username) {
		User user = em.find(User.class,id);
		user.setUsername(username);
	}

	@Override
	@Transactional
	public void create(User user){
		em.persist(user);
	}
}
