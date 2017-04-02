<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<html>
<head>
<style> 
.divcss5{text-align:center} 
</style> 
<script type="text/javascript" src="./resources/js/common/webtoolkit.base64.js"></script>
<script type="text/javascript" src="./resources/js/jquery/1.11.0/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="./resources/js/index.js" charset="utf-8"></script>
</head>
<body>
<div class="divcss5">
<input type=button value="testJason" onclick="testJason();"/>
<h2><a href="sys/user/testJason/123">测试testJason</a></h2>
<h2><a href="sys/user/listGroupUser?nickNameLike=jesse">测试listGroupUser</a></h2>
<h2><a href="sys/dictionary?sort=dicOrder">查看字典信息</a></h2>
<h2><a href="sys/sample?sort=sampleOrder">查看样品信息</a></h2>
<h2><a href="sys/sample/testSelectList">测试</a></h2>
<h2><a href="sys/sample/testSelectList2">测试2</a></h2>
<h2><a href="fileOperate/to_upload">to_upload</a></h2>
<h2><a href="sys/sample/getFavUser?userName=1&userId=123">getFavUser</a></h2>
<h2><a href="fileOperate/download">下载</a></h2>
</div>

<div class="divcss5">
<form enctype="multipart/form-data" action="fileOperate/upload" method="post">
	<input type="file" name="file1" /> <input type="text" name="alais" /><br />
	<input type="file" name="file2" /> <input type="text" name="alais" /><br />
	<input type="file" name="file3" /> <input type="text" name="alais" /><br />
	<input type="submit" value="上传" />
</form>
</div>


</body>
</html>
