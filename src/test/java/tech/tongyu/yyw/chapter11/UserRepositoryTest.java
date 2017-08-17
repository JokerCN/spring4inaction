package tech.tongyu.yyw.chapter11;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import tech.tongyu.yyw.chapter11.domain.User;
import tech.tongyu.yyw.chapter11.repo.CustomUserRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = PersistenceConfig.class)
public class UserRepositoryTest {

	@Autowired
	private CustomUserRepository userRepository;

	@Test
	public void testUserPersistence(){
		User user = new User(
				"yangyiwei",
				"Swaggy",
				"or1oles1nG",
				"superyangyw@126.com"
		);

		userRepository.create(user);
		userRepository.updateUsername(1L, "yyw");

	}
}
