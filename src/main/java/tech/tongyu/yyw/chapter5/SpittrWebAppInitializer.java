package tech.tongyu.yyw.chapter5;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//任意扩展AbstractAnnotationConfigDispatcherServletInitializer的类都会自动地配置DispatcherServlet和Spring应用上下文
//Spring应用上下文回味与应用程序的Servlet上下文之中
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};//指定配置类
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"}; // 将DispatcherServlet映射到"/"
    }
}
