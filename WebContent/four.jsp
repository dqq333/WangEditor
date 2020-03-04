<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>获得json格式的数据</title>
</head>
<body>
	<div id="editor">
		<b>电话费房间号</b>
		<h2>监护费或集合</h2>
	</div>
	<button id="btn">获得内容</button>
	<!-- 引入WangEditor的JS文件 -->
	<script src="js/wangEditor.min.js"type="text/javascript"></script>
	<script src="js/jquery-3.4.1.js"type="text/javascript"></script>
	<!-- 使用WangEditor富文本框编辑器 -->
	<script type="text/javascript">
    	//获得富文本框编辑器的对象
        var U = window.wangEditor;
   	 	//通过构造函数的形式创建要操作的对象
        var editor= new U("#editor");  
        //调用create（）方法来创建富文本框编辑器
        editor.create()
        //获得富文本框编辑器的内容
         $(function(){
   			 $("#btn").click(function(){
   				 //获得json格式的数据
   				 //获得数据并转换成json格式
    			var json=editor.txt.getJSON();
    			var jsonStr=JSON.stringify(json);
    			alert(jsonStr);
   			 });
 		});
   	</script> 
</body>
</html>