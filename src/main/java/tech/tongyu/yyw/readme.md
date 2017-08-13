类型需要管理的内部域对象可以分为两类：
    一类是该对象的生命周期完全由类型掌控 => 类型
    另一类是该对象仅仅与该类型完成交互 => 接口

创建应用组件之间协作的行为通常被称为装配(wiring)

对于强依赖使用构造器注入，对于可选依赖使用属性注入

11. Spring如何使用外部配置文件?
    注解方式可以使用`@PropertySource`, 如:
    ```java
    @Configuration
    @PropertySource("classpath:/**/*.properties")
    public class ExpressiveConfig {
        
        @Autowired
        Environment env; //env.getProperty("property_name")
    }
    ```
    `@PropertySource`中引用的`.properties`文件会被加载到`Environment`中。

12. 如何使用属性占位符?
    在Spring装配中，占位符使用`${ ... }`包装属性名。
    在xml中:
    ```xml
    <bean id="..."
           class="..."
           c:0="${...}"
           c:1="${...}" />
    ```
    如果考虑要使用组件扫描的方式，可以使用`@Value`注解，如:
    ```java
    public BlandDisc(
        @Value("${disc.title}") String title,
        @Value("${disc.artiest}") String artist){
        this.title = title;
        this.artist = artist;
    }
    ```
    为了使用占位符，必须要配置一个占位符解析器，一般为:
    PropertyPlaceholderConfigurer 或
    PropertySourcesPlaceholderConfigurer(推荐)
    ```java
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
    ```
    why? => 为什么要加static修饰符?
    ```xml
    <!-- 如果使用xml配置，则可以使用context-命名空间中的context:property-placeholder -->
    <context:property-placeholder />
    ```

13. SpEL是用来解决什么问题的? 
    SpEL即Spring Expression Language，用于在运行时(Runtime)决定注入值。
    即某个bean所依赖的对象需要在运行时才能确定，比如根据具体部署的环境来判断某些bean的属性等。
    
    从这方面来看，SpEL与@Conditional具有某种程度上互相补充的功能，`@Conditional`用于
    在运行时判断某个bean是否应该被创建，而SpEL用于在运行时判断某个属性应该被注入什么内容。

