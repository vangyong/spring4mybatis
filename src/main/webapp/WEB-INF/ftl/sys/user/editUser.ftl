<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="zh-cn">
<head>
</head>
<body>
	<form class="form-horizontal" role="form" method="post" action="${base}/sys/user">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
			<h4 class="modal-title" id="myModalLabel">编辑</h4>
		</div>
		<div class="modal-body">
			<input type="hidden" name="_method" value="put"> <input type="hidden" name="userId" value="${user.userId}">
			<div class="form-group">
				<label for="loginName" class="col-md-2 control-label">登录名</label>
				<div class="col-md-5">
					<input type="text" name="loginName" class="form-control" value="${user.loginName}" id="loginName" placeholder="登录名">
				</div>
			</div>
			<div class="form-group">
				<label for="password" class="col-md-2 control-label">密码</label>
				<div class="col-md-5">
					<input type="text" name="password" class="form-control" value="${user.password}" id="password" placeholder="密码">
				</div>
			</div>
			<div class="form-group">
				<label for="nickName" class="col-md-2 control-label">昵称</label>
				<div class="col-md-5">
					<input type="text" name="nickName" class="form-control" value="${user.nickName}" id="nickName" placeholder="昵称">
				</div>
			</div>
			<div class="form-group">
				<label for="mobileNumber" class="col-md-2 control-label">手机号</label>
				<div class="col-md-5">
					<input type="text" name="mobileNumber" class="form-control" value="${user.mobileNumber}" id="mobileNumber" placeholder="手机号">
				</div>
			</div>
			<div class="form-group">
				<label for="gender" class="col-md-2 control-label">性别</label>
				<div class="col-md-5">
					<select name="gender" id="gender">
    					<option name="${user.gender}" <#if user.gender=="MALE">selected</#if> value="MALE">男</option>
    					<option name="${user.gender}" <#if user.gender=="FEMALE">selected</#if> value="FEMALE">女</option>
    					<option name="${user.gender}" <#if user.gender=="SECRET">selected</#if> value="SECRET">保密</option>
					</select>
				
				</div>
			</div>
			<div class="form-group">
				<label for="bornAddress" class="col-md-2 control-label">出生地址</label>
				<div class="col-md-5">
					<input type="text" name="bornAddress" class="form-control" value="${user.bornAddress}" id="bornAddress" placeholder="出生地址">
				</div>
			</div>
		</div>
		<div class="modal-footer">
			<button type="button" id="saveBtn" class="btn btn-primary">保存</button>
			<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		</div>
	</form>
</body>
<script type="text/javascript">
	$(function() {
		$("#saveBtn").click(function() {
			$.post($('form').attr('action'), $('form').serialize(), function(data) {
				$('[data-dismiss]').click();
			}, 'json');
		});
	});
</script>
</html>
