package tech.tongyu.yyw.chapter11.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserRepositoryImpl implements CustomUserRepository{
	@PersistenceContext
	private EntityManager em;

	@Override
	public void updateUsername(Long id, String username) {
		String update =
				"UPDATE User user " +
						"SET user.username = 'yyw' ";

		em.createQuery(update).executeUpdate();
	}
}
