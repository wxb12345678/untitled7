<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
<div class="d">

    <form action="all" method="get">
        <input type="text" name="stuName" placeholder="请输入查询名称">
        <input type="submit" value="查询">
    </form>
    <form action="add.jsp" method="post">
        <input type="submit" value="新增">
    </form>

    <c:if test="${user!=null}">
        <table border="1" width="300" >
            <tr class="t">
                <td>用户名:</td>
                <td>年龄:</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${user}" var="u">
                <tr>
                    <td>${u.stuName}</td>
                    <td>${u.stuAge}</td>
                    <td>
                        <a href="del?id=${u.id}">删除</a>
                        <a href="update?id=${u.id}">修改</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>
</body>
</html>
