<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>产品管理</title>
<style>
	#all{
			width:737px;
			margin:0px auto;
			border:1px solid red;
		}
	.one{
		background:gray;
	}
</style>
</head>
<body>
	<div id="all">
		<!-- 定义一个显示增加成功还是失败的容器 -->
		<p>
		<c:if test="${empty msg}" var="isNo"></c:if>
		<c:if test="${!isNo }">
			<c:if test="${msg eq 'true' }">添加成功！</c:if>
			<c:if test="${msg eq 'false'}">添加失败！</c:if>
		</c:if>
		</p>
		<form action="AddPro" method="post">
		<div>
			<input type="submit" value="中文产品列表"/>
			<input type="submit" value="搜索"/>
		</div>
		<div>
			<input type="submit" value="中文产品列表"/>
		</div>
			<table>
				<tr>
					<td class="one">选择语言：</td>
					<td><select name="lange">
						<option value="chinese">中文</option>
						<option value="English">英文</option>
					</select></td>
				</tr>
				<tr>
					<td class="one">产品分类:</td>
					<td>
					<select name="feilei">
						<option>请选择产品类别</option>
						<option value="YSI">YSI水质分析仪</option>
						<option value="MAC">MAC口红</option>
						<option value="YSL">圣罗兰金管</option>
					</select>
					</td>
				</tr>
				<tr>
					<td class="one">产品名称：</td>
					<td><input type="text" name="pname" value=""/></td>
				</tr>
				<tr>
					<td class="one">添加附件：</td>
					<td><input type="text" name="fujian" value=""/></td>
				</tr>
				<tr>
					<td class="one">简要介绍</br><font color="red"  size="1">(少于800个字)</font></td>
					<td><textarea type="text" name="jieshao" value="" cols="20" rows="7"></textarea></td>
				</tr>
				<tr>
					<td class="one">发布时间：</td>
					<td><input type="text" name="fabutime" value=""/></td>
				</tr>
				<tr>
					<td class="one">附件名称：</td>
					<td><input type="text" name="fujianname" value=""/></td>
				</tr>
				<tr>
					<td class="one">&nbsp;</td>
					<td><input type="submit" value="删除"><input type="submit" value="查看"></td>
				</tr>
				<tr>
					<td class="one">产品图片：</td>
					<td><textarea type="text" name="pimg" value="" cols="20" rows="5"></textarea></br>
					<input type="submit" value="删除"/>
					</td>
				</tr>
				</table>
				<table>
				<tr>
					<td class="one"><center>产品内容</center></td>
				</tr>
				<tr>
					<td>
						<div id="editor"></div>
						<textarea name="productinform" id="text"></textarea> 
					</td>
				</tr>
				<tr>
					<td align="center" class="one"><input type="submit" value="添加"></td>
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