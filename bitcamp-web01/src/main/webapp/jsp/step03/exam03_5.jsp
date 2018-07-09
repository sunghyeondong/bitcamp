<%@page import="java.util.ArrayList"%>
<%@page import="jsp.Member"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam01</title>
</head>
<body>
<h1>JSP 전용 태그: useBean + type + class </h1>
<pre>
type과 class 속성을 모두 지정 했을 때 동작 원리

type 속성
  generic 속성을
</pre>

<%
Member obj = new Member();
obj.setId("홍길동");
obj.setEmail("홍길동@test.com");
obj.setPassword("1111");

Member obj2 = new Member();
obj2.setId("임꺽정");
obj2.setEmail("임꺽정@test.com");
obj2.setPassword("2222");

ArrayList<Member> arr = new ArrayList<>();
arr.add(obj);
arr.add(obj2);

//pageContext.setAttribute("list", arr);
%>

<h2>type과 class 속성을 동시에 설정하기</h2>
<jsp:useBean id="list" type="java.util.ArrayList<Member>"></jsp:useBean>

<%-- 자바 코드:
java.util.ArrayList list = (jsp.Member)pageContext.getAttribute("member");
if (member == null) {
    throw new Exception();
     --%>
<%
for (Member member : list) {
%>
<%=member.getId()%>, <%=member.getEmail()%>, <%=member.getPassword()%><br>
<%}%>
</body>
</html>