<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<html>
<style> 
.divcss5{text-align:center} 
</style> 
<body>
<div class="divcss5">
<h2>Hello World!</h2>
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

<input id="btn_test" type="button" value="测试" />

</div>


</body>
</html>
