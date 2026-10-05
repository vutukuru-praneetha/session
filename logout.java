package org.example.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/logout")
public class logout extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        HttpSession session= req.getSession(false);
        if(session!=null){
            session.invalidate();
        }
        try {
            resp.sendRedirect("login.html");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}