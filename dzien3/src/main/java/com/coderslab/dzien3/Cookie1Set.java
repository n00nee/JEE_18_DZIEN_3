package com.coderslab.dzien3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/setCookie")
public class Cookie1Set extends HttpServlet {
//    Servlet Cookie1Set ma być dostępny pod adresem /setCookie.
//    Ma nastawiać ciasteczko o nazwie User na CodersLab, z ważnością 24h.


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Cookie cookie = new Cookie("User", "CodersLab");
        cookie.setMaxAge(60 * 60 * 24);
        resp.addCookie(cookie);


    }
}
