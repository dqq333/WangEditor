<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>粘贴文本</title>
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
        // 关闭粘贴样式的过滤
        editor.customConfig.pasteFilterStyle = false;
        // 忽略粘贴内容中的图片
        editor.customConfig.pasteIgnoreImg = true;
        // 自定义处理粘贴的文本内容
        editor.customConfig.pasteTextHandle = function (content) {
            // content 即粘贴过来的内容
            return content + "<p>添加一行</p>";
        }

        //调用create（）方法来创建富文本框编辑器
        editor.create();
    </script>
</body>
</html>