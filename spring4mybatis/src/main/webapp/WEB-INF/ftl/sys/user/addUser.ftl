<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="zh-cn">
<head>
</head>
<body>
	<form class="form-horizontal" role="form" method="post" action="${base}/sys/user">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
			<h4 class="modal-title" id="myModalLabel">新增</h4>
		</div>

		<div class="modal-body">
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
				<label for="nickName" class="col-md-2 control-label">组</label>
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
    					<option name="${user.gender}" value="MALE">男</option>
    					<option name="${user.gender}" value="FEMALE">女</option>
    					<option name="${user.gender}" value="SECRET">保密</option>
					</select>
				
				</div>
			</div>
			<div class="form-group">
				<label for="bornAddress" class="col-md-2 control-label">出生地址</label>
				<div class="col-md-5">
					<input type="text" name="bornAddress" class="form-control" value="${user.bornAddress}" id="bornAddress" placeholder="出生地址">
				</div>
			</div>
			<div class="form-group">
				<label for="bornDate" class="col-md-2 control-label">出生时间</label>
				<div class="col-md-5">
					<input type="text" name="bornDate" class="form-control" value="${user.bornDate}" id="bornDate" placeholder="出生时间">
				</div>
			</div>
			<div class="form-group">
				<label for="weight" class="col-md-2 control-label">体重</label>
				<div class="col-md-5">
					<input type="text" name="weight" class="form-control" value="${user.weight}" id="weight" placeholder="体重">
				</div>
			</div>
			
			<div class="form-group">
				<label for="height" class="col-md-2 control-label">身高</label>
				<div class="col-md-5">
					<input type="text" name="height" class="form-control" value="${user.height}" id="height" placeholder="身高">
				</div>
			</div>
			
			<div class="form-group">
				<label for="bloodType" class="col-md-2 control-label">状态</label>
				<div class="col-md-5">
					<select name="bloodType" id="bloodType">
    					<option name="${user.bloodType}" value="A">A型</option>
    					<option name="${user.bloodType}" value="B">B型</option>
    					<option name="${user.bloodType}" value="AB">AB型</option>
    					<option name="${user.bloodType}" value="O">O型</option>
    					<option name="${user.bloodType}" value="RH">RH型</option>
					</select>
				</div>
			</div>
			
			<div class="form-group">
				<label for="email" class="col-md-2 control-label">电子邮件</label>
				<div class="col-md-5">
					<input type="text" name="email" class="form-control" value="${user.email}" id="email" placeholder="电子邮件">
				</div>
			</div>
			<div class="form-group">
				<label for="address" class="col-md-2 control-label">地址</label>
				<div class="col-md-5">
					<input type="text" name="address" class="form-control" value="${user.address}" id="address" placeholder="地址">
				</div>
			</div>
			<div class="form-group">
				<label for="groupId" class="col-md-2 control-label">组Id</label>
				<div class="col-md-5">
					<input type="text" name="groupId" class="form-control" value="${user.groupId}" id="groupId" placeholder="组Id">
				</div>
			</div>
			
		</div>
		<div class="modal-footer">
			<button type="submit" class="btn btn-primary">保存</button>
			<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		</div>
	</form>
</body>
</html>
