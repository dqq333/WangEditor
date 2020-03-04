<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>上传和隐藏图片</title>
</head>
<body>
	<div id="editor"></div>
	<!-- 引入WangEditor的JS文件 -->
	<script src="js/wangEditor.min.js"type="text/javascript"></script>
    <script type="text/javascript">
    	//获得富文本框编辑器的对象
        var U = window.wangEditor;
   	 	////通过构造函数的形式创建要操作的对象
        var editor= new U("#editor");
   	 	//上传图片
       // editor.customConfig.uploadImgServer = "/upload" ;
   	 	//隐藏图片
   	 	editor.customConfig.showLinkImg = false;
        //调用create（）方法来创建富文本框编辑器
        editor.create();
    </script>
</body>
</html>