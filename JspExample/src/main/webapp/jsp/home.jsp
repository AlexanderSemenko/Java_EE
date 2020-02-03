<%--
  Created by IntelliJ IDEA.
  User: alexander
  Date: 12.01.20
  Time: 00:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--Цвет текста берем из значения куки color --%>
<h1 style="color: ${cookie.color.value}">Hello</h1>

<form method="post" action="/home">
    <label for="color">
        <select name="color" id="color">
            <option value="red">Красный</option>
            <option value="black">Черный</option>
            <option value="white">Белый</option>
            <option value="green">Зелений</option>
            <option value="pink">Рожевий</option>
        </select>
    </label>
    <input type="submit" value="Color send">
</form>
</body>