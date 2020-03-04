<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="" method="post">
		<div id="content" ></div>
		<input type="submit" value="提交"id="save"/>
	</form>
	<!-- 引入WangEditor的JS文件 -->
	<script src="js/wangEditor.min.js" type="text/javascript"></script>
	<script src="js/jquery-3.4.1.js"type="text/javascript"></script>
	<!-- 使用WangEditor富文本框编辑器 -->
	<script type="text/javascript">
    	//获得富文本框编辑器的对象
        var U = window.wangEditor;
   	 	//通过构造函数的形式创建要操作的对象
        var editor= new U("#content");  
        //调用create（）方法来创建富文本框编辑器
        editor.create()
         $(function(){
   			 $("#save").click(function(){
   				//获得富文本框编辑器的内容
    			var content=editor.txt.html();
   				//向servlet提交数据
    			$.post("Test",{"con":content},function(){
    				alert("执行成功！！！");
    			});
   			 });
 		});
     </script>
</body>
</html>