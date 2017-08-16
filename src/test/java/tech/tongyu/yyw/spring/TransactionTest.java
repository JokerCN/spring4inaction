package tech.tongyu.yyw.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import tech.tongyu.yyw.spring.transaction.TransactionConfig;
import tech.tongyu.yyw.spring.transaction.domain.Foo;
import tech.tongyu.yyw.spring.transaction.service.FooService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TransactionConfig.class)
public class TransactionTest {

	@Autowired
	private FooService fooService;

	@Test
	public void testFooService(){
		fooService.insertFoo(new Foo());
	}

}
