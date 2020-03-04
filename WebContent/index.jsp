<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WangEditor的简单操作</title>
</head>
<body>
	<div id="editor"></div>
	<!-- 引入WangEditor的JS文件 -->
	<script src="js/wangEditor.min.js"type="text/javascript"></script>
	<script type="text/javascript">
		var E=window.wangEditor;//获得一个富文本编辑器对象
		var editor=new E("#editor");
		//创建出编辑器
		editor.create();
	</script>
</body>
</html>