/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.webuploademail.controller;

import com.mycompany.webuploademail.model.User;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload2.jakarta.JakartaServletFileUpload;
import org.apache.commons.fileupload2.core.DiskFileItemFactory;
import org.apache.commons.fileupload2.core.FileItem;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author 20113
 */
@WebServlet("/upload")
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = new User();
        try {
            DiskFileItemFactory factory = DiskFileItemFactory.builder().get();
            JakartaServletFileUpload upload = new JakartaServletFileUpload(factory);

            List<FileItem> items = upload.parseRequest(request);
            for (FileItem item : items) {
                if (item.isFormField()) {
                    BeanUtils.setProperty(user, item.getFieldName(), item.getString(StandardCharsets.UTF_8));
                } else {
                    String fileName = item.getName();
                    String uploadPath = getServletContext().getRealPath("") + File.separator + "upload";
                    File uploadDir = new File(uploadPath);
                    if (!uploadDir.exists()) uploadDir.mkdirs();
                    File file = new File(uploadDir, fileName);
                    item.write(file.toPath());  // CHỈNH Ở ĐÂY
                    user.setAvatar("upload/" + fileName);
                }
            }

            Cookie cookie = new Cookie("username", user.getUsername());
            cookie.setMaxAge(60 * 60 * 24);
            response.addCookie(cookie);

            request.setAttribute("user", user);
            request.getRequestDispatcher("/result.jsp").forward(request, response);
        } catch (ServletException | IOException | IllegalAccessException | InvocationTargetException e) {
        }
    }
}
