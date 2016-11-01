<%@page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ include file="/framework/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="renderer" content="webkit">
<meta name="description" content="{$web_description}">
<meta name="keywords" content="{$web_keywords}">
<title>页面出错页面</title>

<style>
body{ background:url(${ctxStatic}/images/error-bg.gif) 0 0 repeat-x;}
.content{ width:1000px; margin:0 auto; text-align:center;}
.content p{ font-family:"微软雅黑"; font-size:30px; color:#333; padding:0; margin:0;}
.content img{ margin-top:100px;}
</style>

</head>


<body>

<div class="content">
<img src="${ctxStatic}/images/error-pic1.png">
<p>操作权限不足，请联系管理员！</p>
</div>
</body>
</html>
