<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@page import="com.crud.BoardDAO, com.crud.BoardVO,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>

<html>
<body>
<h2>Hello World!</h2>
<P>The time on the server is ${serverTime}.</P>
<P> <a href="board/list">게시판으로 이동</a> </P>
</body>
</html>
