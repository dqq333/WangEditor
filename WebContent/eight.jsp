<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>设置颜色</title>
</head>
<body>
	<div id="editor"></div>
	<!-- 引入WangEditor的JS文件 -->
	<script src="js/wangEditor.min.js"type="text/javascript"></script>
    <script type="text/javascript">
    var U=window.wangEditor;
    var editor=new U("#editor");
    editor.customConfig.colors=[
    	'red',
    	'green',
    	'blue'
    ]
    editor.create();
    </script>
</body>
</html>