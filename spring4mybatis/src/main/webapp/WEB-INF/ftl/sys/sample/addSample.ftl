<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="zh-cn">
<head>
</head>
<body>
	<form class="form-horizontal" role="form" method="post" action="${base}/sys/sample">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
			<h4 class="modal-title" id="myModalLabel">新增</h4>
		</div>

		<div class="modal-body">
			<div class="form-group">
				<label for="sampleName" class="col-md-2 control-label">名称</label>
				<div class="col-md-5">
					<input type="text" name="sampleName" class="form-control" value="${sample.sampleName}" id="sampleName" placeholder="名称">
				</div>
			</div>
			<div class="form-group">
				<label for="sampleValue" class="col-md-2 control-label">值</label>
				<div class="col-md-5">
					<input type="text" name="sampleValue" class="form-control" value="${sample.sampleValue}" id="sampleValue" placeholder="值">
				</div>
			</div>
			<div class="form-group">
				<label for="sampleGroup" class="col-md-2 control-label">组</label>
				<div class="col-md-5">
					<input type="text" name="sampleGroup" class="form-control" value="${sample.sampleGroup}" id="sampleGroup" placeholder="值">
				</div>
			</div>
			<div class="form-group">
				<label for="sampleType" class="col-md-2 control-label">类型</label>
				<div class="col-md-5">
					<select name="sampleType" id="sampleType">
    					<option name="${sample.sampleType}" value="TOOL">工具</option>
    					<option name="${sample.sampleType}" value="FOOD">食物</option>
					</select>
				
				</div>
			</div>
			<div class="form-group">
				<label for="sampleOrder" class="col-md-2 control-label">排序</label>
				<div class="col-md-5">
					<input type="text" name="sampleOrder" class="form-control" value="${sample.sampleOrder}" id="sampleOrder" placeholder="值">
				</div>
			</div>
			<div class="form-group">
				<label for="sampleStatus" class="col-md-2 control-label">状态</label>
				<div class="col-md-5">
					<select name="sampleStatus" id="sampleStatus">
    					<option name="${sample.sampleStatus}" value="ON">启用</option>
    					<option name="${sample.sampleStatus}" value="OFF">禁用</option>
					</select>
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
