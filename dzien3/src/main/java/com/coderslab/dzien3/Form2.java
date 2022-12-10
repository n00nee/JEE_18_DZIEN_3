package com.coderslab.dzien3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@WebServlet("/post2")
public class Form2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sentence = req.getParameter("input");
        String consequences = req.getParameter("consequences");

        List<String> swears = new ArrayList<>();
        swears.add("dupa");
        swears.add("kurde");
        swears.add("cholera");

        if (Objects.nonNull(consequences)) {    // zaznaczył checkbox
            resp.getWriter().append(sentence);
        } else {                                // nie zaznaczył consequeces -> null
            for (String swear : swears) {
                sentence = sentence.replaceAll(swear, swear.replaceAll(".", "*"));
            }
            resp.getWriter().append(sentence);
        }
    }

    //    Dopisz funkcjonalność, która po przesłaniu formularza sprawdzi, czy
//    wpisany przez użytkownika tekst zawiera wulgaryzmy. Jeżeli tak, to nasz kod
//    powinien zastąpić wulgarne słowo znakami: ****.
//    Na przykład frazę cholera, znowu ta JAVA powinien zastąpić frazą *******,
//    znów ta JAVA . Jeżeli użytkownik zaznaczy checkbox Jestem świadomy konsekwencji,
//    to program nie sprawdzi wulgaryzmów i wyświetli wpisany tekst. Liczba gwiazdek ma
//    odpowiadać liczbie znaków w cenzurowanym słowie.
//
//            Hint: listę wulgaryzmów możesz stworzyć samodzielnie w postaci tablicy,
//            lub poszukać gotowych tablic w internecie.
}
