package com.coderslab.dzien3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/deleteCookie")
public class Cookie1Del extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        boolean isCookieUser = false;
        Cookie[] cookies = req.getCookies();
        if (Objects.nonNull(cookies)) {
            for (Cookie cookie : cookies) {
                if ("User".equals(cookie.getName())) {
                    cookie.setMaxAge(0);
                    resp.addCookie(cookie);
                    isCookieUser = true;
                }
            }
        }
        if (!isCookieUser) {
            resp.getWriter().println("BRAK");
        }

    }

    //    Servlet Cookie1Del ma być dostępny pod adresem /deleteCookie ma kasować ciasteczko o nazwie User.
//    Jeżeli nie ma takiego ciasteczka, to powinien wyświetlić się napis: BRAK.
}
