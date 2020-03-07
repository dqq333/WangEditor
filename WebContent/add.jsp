<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>富文本框的应用</title>
<style type="text/css">
		#container{
			width:900px;
			margin:0px auto;
			border:1px solid red;
		}
		#container table{
			width:100%;
			height:100%;
		}
		.first{
			width:120px;
		}
		#text{
			display:none;
		}
</style>
</head>
<body>
	<div id="container">
	<!-- 定义一个显示增加成功还是失败的容器 -->
	<p>
		<c:if test="${empty msg}" var="isNo"></c:if>
		<c:if test="${!isNo }">
			<c:if test="${msg eq 'true' }">添加成功！</c:if>
			<c:if test="${msg eq 'false'}">添加失败！</c:if>
		</c:if>
	</p>
	<form action="AddRec" method="post">
		<table>
			<tr>
				<td class="first">招聘岗位</td>
				<td><input type="text" name="recruitname" value=""/></td>
			</tr>
			<tr>
				<td>招聘人数</td>
				<td><input type="text" name="recruitnum" value=""/></td>
			</tr>
			<tr>
				<td>工作地点</td>
				<td><input type="text" name="address" value=""/></td>
			</tr>
			<tr>
				<td>薪资</td>
				<td><input type="text" name="salary" value=""/></td>
			</tr>
			<tr>
				<td>发布日期</td>
				<td><input type="text" name="releasetime" value=""/></td>
			</tr>
			<tr>
				<td>有效时间</td>
				<td><input type="text" name="validityperiod" value=""/></td>
			</tr>
			<tr>
				<td>招聘条件</td>
				<td>
				<div id="editor"></div>
				<textarea name="requirements" id="text"></textarea> 
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit"value="增加"/></td>
			</tr>
			<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
			<script src="js/wangEditor.min.js"type="text/javascript"></script>
			<script type="text/javascript">
				var E=window.wangEditor;
				var editor=new E("#editor");
				var text=$("#text");
				editor.customConfig.onchange=function(html){
					text.val(html);
				}
				editor.create();
			</script>
		</table>
	</form>
	</div>
</body>
</html>