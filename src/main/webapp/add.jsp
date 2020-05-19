<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<div class="d">
    <form action="add" method="post">
        <table align="center" border="1" width="250">
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="stuName"></td>
            </tr>
            <tr>
                <td>
                    年龄:
                </td>
                <td>
                    <input type="text" name="stuAge">
                </td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <input id="ad" type="submit" value="新增">
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
