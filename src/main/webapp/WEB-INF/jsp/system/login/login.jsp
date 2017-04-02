<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<style type="text/css">
</style>
</head>
<body>
	<div class="formLogin">
		<div class="tip">
			<input class="loginName" name="loginName" type="text" id="loginName"
				title="" iscookie="true" value="admin" nullmsg="" />
		</div>
		<div class="tip">
			<input class="password" name="password" type="password"
				id="password" title="" value="123456" nullmsg="" />
		</div>
	</div>
	<button class="loginButton" onclick="login()">登录 </button>
	<a href="sys/login/main"> main</a>
	<script type="text/javascript" src="./resources/plugins/jquery/1.11.0/jquery-1.11.0.js"></script>
	<script type="text/javascript" src="./resources/plugins/jquery/1.11.0/jquery-1.11.0.min.js"></script>
	<script type="text/javascript" src="./resources/js/login/login.js"></script>

</body>
</html>