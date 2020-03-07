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
   	 	// 不显示网络图片，禁止添加网络图片  true可以添加网络图片，false禁止添加网络图片
    	 editor.customConfig.showLinkImg = false;
    	// 设置图片上传的文件夹(项目中定义好的文件夹)
    	// 调用服务器中的servlet实现本地图片的上传
    	// upload就是servlet的名称，${pageContext.request.contextPath}/upload
    	editor.customConfig.uploadImgServer = 'upload';
    	// 限制上传图片的大小 3M
    	//editor.customConfig.uploadImgMaxSize = 3 * 1024 * 1024;
    	 
    	// 讲服务器得到的json数据进行解析
    	editor.customConfig.uploadImgHooks = {
    			// 如果服务器端返回的不是 {errno:0, data: [...]} 这种格式，可使用该配置
    	    	// （但是，服务器端返回的必须是一个 JSON 格式字符串！！！否则会报错）
    	    	// 图片上传并返回结果，自定义插入图片的事件（而不是编辑器自动插入图片！！！）
    	    	customInsert: function (insertImg, result, editor) {
    	        	// insertImg 是插入图片的函数，editor 是编辑器对象，result 是服务器端返回的结果
    	        	// 举例：假如上传图片成功后，服务器端返回的是 [url,url,...] 这种格式，即可这样插入图片：
    	        	for(var i in result){// result 必须是一个 JSON 格式字符串！！！否则报错
    	        		insertImg('${pageContext.request.contextPath}/file/'+result[i]);
    	        	}
    	    	}
    	    }
        editor.create();
    </script>
</body>
</html>