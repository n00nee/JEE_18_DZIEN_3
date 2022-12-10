package com.coderslab.dzien3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addToCookies")
public class Cookie2 extends HttpServlet {

//    W projekcie stwórz servlet Cookie2, dostępny pod adresem /addToCookies,
//    oraz plik cookie2.html, który wyświetli następujący formularz:


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String key = req.getParameter("key");
        String value = req.getParameter("value");

        Cookie cookie = new Cookie(key, value);
        resp.addCookie(cookie);
    }
}
