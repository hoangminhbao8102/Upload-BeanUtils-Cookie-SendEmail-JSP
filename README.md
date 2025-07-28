# Upload-BeanUtils-Cookie-SendEmail-JSP

Dự án mẫu cho môn **Lập trình Java nâng cao** với các chức năng:
- Upload file (ảnh đại diện)
- Đổ dữ liệu form vào JavaBean bằng **Apache BeanUtils**
- Lưu thông tin đăng nhập bằng **Cookie**
- Gửi email xác nhận bằng **Jakarta Mail API**

---

## 1. Công nghệ sử dụng
- **Java Servlet/JSP (Jakarta EE)**
- **Maven** để quản lý dependencies
- **Tomcat 9+** (hoặc Glassfish)
- **Apache Commons FileUpload / BeanUtils**
- **Jakarta Mail API**

---

## 2. Cấu trúc thư mục

WebUploadEmail/
├── pom.xml
├── src/
│ ├── main/java/com/example/controller
│ │ ├── UploadServlet.java
│ │ └── RegisterServlet.java
│ ├── main/java/com/example/model
│ │ └── User.java
│ ├── main/java/com/example/utils
│ │ └── MailUtils.java
│ └── main/webapp
│ ├── index.jsp
│ ├── register.jsp
│ ├── result.jsp
│ ├── upload/ (folder lưu file upload)
│ └── WEB-INF/web.xml

---

## 3. Cài đặt và chạy

### Bước 1: Import project vào NetBeans
- Giải nén file ZIP.
- Mở NetBeans → `File → Open Project` → chọn thư mục `WebUploadEmail`.

### Bước 2: Cấu hình Maven & Server
- Maven sẽ tự động tải dependencies (BeanUtils, FileUpload, Mail API…).
- Thêm **Tomcat Server** vào NetBeans nếu chưa có.

### Bước 3: Cấu hình gửi Email
- Mở file `MailUtils.java`:
```java
final String username = "your_email@gmail.com";
final String password = "your_app_password";
```
- Dùng App Password (không dùng mật khẩu thường).

### Bước 4: Chạy dự án
- Chuột phải project → Run.
- Mở trình duyệt:
+ Upload file: http://localhost:8080/WebUploadEmail/index.jsp
+ Gửi email: http://localhost:8080/WebUploadEmail/register.jsp

---

## 4. Chức năng chính
- Upload file
+ Nhập tên, email, chọn ảnh → Submit → hiển thị ảnh đã upload.
+ Lưu tên đăng nhập vào Cookie.
- Gửi email
+ Nhập email → gửi mail chào mừng.

---

## 5. Thư viện chính (pom.xml)
- commons-fileupload
- commons-beanutils
- commons-io
- jakarta.mail
- jakarta.servlet-api
- jakarta.servlet.jsp.jstl

---

## 6. Ghi chú
- Thư mục upload/ phải có quyền ghi (write permission).
- Nếu lỗi gửi mail: kiểm tra App Password hoặc bật Less secure apps trong Gmail.

---

## 7. Tác giả
- Họ tên: Hoàng Nghĩa Minh Bảo
- Môn học: Lập trình Java nâng cao
- Đề tài: Tìm hiểu về Upload, BeanUtils, Cookie và gửi email

---
