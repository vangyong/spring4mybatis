<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ taglib prifix="t" uri="http://www.springframework.org/tags"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${result}" var="item">
		<c:forEach items="${item}" var="m">
			<c:if test="${m.key eq 'realName' }">
				${m.value }
			</c:if>
			
		</c:forEach>
	</c:forEach>
	
	<c:forEach items="${list}" var="item">
		<c:forEach items="${item}" var="m">
			||${m.key}<br/>
			||${m.value}<br/>
		</c:forEach>
	</c:forEach>
</body>
</html>