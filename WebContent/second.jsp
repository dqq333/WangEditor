<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>菜单栏和编辑区分离</title>
<style type="text/css">
	#div1{
		height:50px;
		width:100%;
	    border: 1px solid red;
	}	
	.bootbar{
		height:20px;
		width:100%;
		border: 1px solid green;
	}
	#div2{
		height:300px;
		width:100%;
	    border: 1px solid blue;
	}	
</style>
</head>
<body>
	<!-- 放菜单栏 -->
	<div id="div1"></div>
	<div class="bootbar">分割区</div>
	<!-- 放编辑区 -->
	<div id="div2"></div>
	<!-- 引入WangEditor的JS文件 -->
	<script src="js/wangEditor.min.js"type="text/javascript"></script>
    <script type="text/javascript">
    	//获得富文本框编辑器的对象
        var U = window.wangEditor;
   	 	////通过构造函数的形式创建要操作的对象
        var editor= new U('#div1', '#div2');  
        //调用create（）方法来创建富文本框编辑器
        editor.create();
    </script>
		
</body>
</html>