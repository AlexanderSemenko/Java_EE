package com.example.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/home")
public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        // смотрим, есть ли сессия для данного запроса (проверяется наличие Cookie с названием JSESSIONID
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("user") == null) {
            servletRequest.getServletContext().getRequestDispatcher("/login").forward(request, response);
        }
        // отдаем запрос дальше в цепочку фильтров
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}