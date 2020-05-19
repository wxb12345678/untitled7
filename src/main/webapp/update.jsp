<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<div id="bo">
    <form action="update2">
        <input type="hidden" name="id" value="${us.id}">
        <table border="1" width="300" align="center">
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="stuName" value="${us.stuName}"></td>
            </tr>
            <tr>
                <td>年龄:</td>
                <td><input type="text" name="stuAge" value="${us.stuAge}"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="修改"></td>
            </tr>

        </table>
    </form>
</div>
</body>
</html>
