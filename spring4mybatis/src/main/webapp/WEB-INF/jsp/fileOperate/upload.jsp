<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
</body>
<form enctype="multipart/form-data" action="<c:url value="/fileOperate/upload" />"method="post">
	<input type="file" name="file1" /> <input type="text" name="alais" /><br />
	<input type="file" name="file2" /> <input type="text" name="alais" /><br />
	<input type="file" name="file3" /> <input type="text" name="alais" /><br />
	<input type="submit" value="上传" />
</form>
</html>