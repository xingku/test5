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
<<<<<<< HEAD
        System.out.println("您好，servlet阿撒地方规划局阿深层次2019-7-25");
=======
        System.out.println("我又改了");
>>>>>>> 3bf6def05d49e15a68b51f117185180dfdbec99f
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
