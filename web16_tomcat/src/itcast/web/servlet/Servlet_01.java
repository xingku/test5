package itcast.web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class Servlet_01 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("111111111111111111111111111111");
		 System.out.println("111111111111111111111111111111");
		  System.out.println("111111111111111111111111111111");
		   System.out.println("111111111111111111111111111111");


    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
