package tech.tongyu.yyw.spring.transaction;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:spring/transaction/transaction.xml")
public class TransactionConfig {
}
