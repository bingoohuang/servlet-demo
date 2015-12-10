package com.github.bingoohuang.servletdemo;

import com.github.bingoohuang.logback.more.utils.WeblogicEnvUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LogDemoServlet extends HttpServlet {
    Logger log = LoggerFactory.getLogger(LogDemoServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        log.info("get {}", req.getRequestURI());
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello Servlet Get getRequestURI" + req.getRequestURI()
                + ", port:" + WeblogicEnvUtils.getListenPort() +
                "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
