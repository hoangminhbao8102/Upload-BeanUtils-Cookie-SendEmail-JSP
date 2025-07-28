/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.webuploademail.controller;

import com.mycompany.webuploademail.utils.MailUtils;
import jakarta.mail.MessagingException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

/**
 *
 * @author 20113
 */
public class RegisterServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        try {
            MailUtils.sendEmail(email, "Xác nhận đăng ký", "Chào mừng bạn đã đăng ký thành công!");
            request.setAttribute("message", "Email đã được gửi!");
        } catch (MessagingException e) {
            request.setAttribute("message", "Gửi email thất bại!");
        }
        request.getRequestDispatcher("/register.jsp").forward(request, response);
    }
}
