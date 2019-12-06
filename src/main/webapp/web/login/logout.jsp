<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/11/25
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>退出系统</title>
</head>
<body>
    <%
        // 销毁session对象
        session.removeAttribute("userId");
        session.removeAttribute("username");
        session.invalidate();

        // 获取请求路径(全)
        StringBuffer uri = request.getRequestURL();

        // 获取请求资源路径(资源路径)
        String servletPath = request.getServletPath();

        uri.setLength(uri.length() - servletPath.length());

        String url = uri.toString();

        response.sendRedirect("/web/login.jsp");
    %>
</body>
</html>
