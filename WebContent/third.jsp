<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>为富文本框中设置值</title>
</head>
<body>
	<div id="editor"></div>
	<button id="btn">点击为div中添加内容</button>
	<!-- 引入WangEditor的JS文件 -->
	<script src="js/wangEditor.min.js"type="text/javascript"></script>
	<!-- 使用WangEditor富文本框编辑器 -->
	<!--<script type="text/javascript">
    	//获得富文本框编辑器的对象
        var U = window.wangEditor;
   	 	//通过构造函数的形式创建要操作的对象
        var editor= new U("#editor");  
        //调用create（）方法来创建富文本框编辑器
        editor.create()
        //获得按钮并为按钮添加一个点击事件
        document.getElementById("btn").addEventListener('click', function () {
       		//alert("进入到这个方法");
       		//要为富文本框中添加内容都需要使用一对标签来实现
       		editor.txt.html("<h1>添加内容</h1>");
        	editor.txt.append("<p>用append追加内容</p>");
        	editor.txt.text("<>用text添加内容</>");
    });

    </script> -->
    <script src="js/jquery-3.4.1.js"type="text/javascript"></script>
    <script type="text/javascript">
    $(function(){
  //获得富文本框编辑器的对象
    var U = window.wangEditor;
	 	//通过构造函数的形式创建要操作的对象
    var editor= new U("#editor");  
    //调用create（）方法来创建富文本框编辑器
    editor.create()
    $("#btn").click(function(){
    	//将服务器返回的数据展示到富文本框中
    	editor.txt.html("<h1>添加内容</h1>");
    });
});
    </script>
</body>
</html>