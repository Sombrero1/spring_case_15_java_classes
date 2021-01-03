package spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import spring.HelloController;

public class MyDispatherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() { // ссылка на класс Spring
        return new Class[]{SpringDispatcher.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
