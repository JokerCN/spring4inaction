package tech.tongyu.yyw.chapter11.repo;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tech.tongyu.yyw.chapter11.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class JpaIUserRepositoryImpl implements IUserRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void addUser(User user) {
		em.persist(user);
	}

	@Override
	public User getUserById(Long id) {
		return em.find(User.class, id);
	}

	@Override
	public void saveUser(User user) {
		em.merge(user);
	}
}
