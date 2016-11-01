<%@page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ include file="../common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="renderer" content="webkit">
<meta name="description" content="{$web_description}">
<meta name="keywords" content="{$web_keywords}">
<title>页面出错页面</title>

<style>
* {
	margin-left: 10px;
    margin-right: 10px;
}

body {
	background-color: #ECECEC;
	font-family: 'Open Sans', sans-serif;
	font-size: 14px;
	color: #3c3c3c;
}

.content {
	border: 1px solid #ccc;
	width: 650px;
	height: 500px;
	overflow: hidden;
	margin: 0 auto;
	margin-top: -275px;
	margin-left: -275px;
	position: fixed;
	top: 50%;
	left: 50%;
	background: #fff;
	box-shadow: 0 0 25px #999;
	border-bottom-right-radius: 20px;
	border-top-left-radius: 20px;
	border-bottom-left-radius: 20px;
	border-top-right-radius: 20px;
}

.demo p:first-child {
	text-align: center;
	font-family: cursive;
	font-size: 150px;
	font-weight: bold;
	letter-spacing: 5px;
	color: #fff;
}

.demo p:first-child span {
	cursor: default;
	text-shadow: 0px 0px 2px #686868, 0px 1px 1px #ddd, 0px 2px 1px #d6d6d6,
		0px 3px 1px #ccc, 0px 4px 1px #c5c5c5, 0px 5px 1px #c1c1c1, 0px 6px
		1px #bbb, 0px 7px 1px #777, 0px 8px 3px rgba(100, 100, 100, 0.4), 0px
		9px 5px rgba(100, 100, 100, 0.1), 0px 10px 7px
		rgba(100, 100, 100, 0.15), 0px 11px 9px rgba(100, 100, 100, 0.2), 0px
		12px 11px rgba(100, 100, 100, 0.25), 0px 13px 15px
		rgba(100, 100, 100, 0.3);
	-webkit-transition: all .1s linear;
	transition: all .1s linear;
}

.demo p:first-child span:hover {
	text-shadow: 0px 0px 2px #686868, 0px 1px 1px #fff, 0px 2px 1px #fff,
		0px 3px 1px #fff, 0px 4px 1px #fff, 0px 5px 1px #fff, 0px 6px 1px #fff,
		0px 7px 1px #777, 0px 8px 3px #fff, 0px 9px 5px #fff, 0px 10px 7px
		#fff, 0px 11px 9px #fff, 0px 12px 11px #fff, 0px 13px 15px #fff;
	-webkit-transition: all .1s linear;
	transition: all .1s linear;
}

.loading {
	width: 400px;
	margin: 0px auto;
	display: block;
	color: #666;
	font-size: 20px;
	text-shadow: 0 1px 0 white;
	font-family: 'microsoft yahei';
	text-align: center;
}

.loading p {
	line-height: 2;
}

.loading input {
	border: none;
	background: #ECECEC;
	color: #555;
	background: #ececec;
	padding: 2px 5px;
}

.loading a {
	text-decoration: none;
	background-color: #3BB3E0;
	text-shadow: none;
	padding: 10px;
	font-family: 'Open Sans', sans-serif;
	font-size: 12px;
	color: white;
	background-image: linear-gradient(bottom, #2CA0CA 0%, #3EB8E5 100%);
	background-image: -o-linear-gradient(bottom, #2CA0CA 0%, #3EB8E5 100%);
	background-image: -moz-linear-gradient(bottom, #2CA0CA 0%, #3EB8E5 100%);
	background-image: -webkit-linear-gradient(bottom, #2CA0CA 0%, #3EB8E5 100%);
	background-image: -ms-linear-gradient(bottom, #2CA0CA 0%, #3EB8E5 100%);
	background-image: -webkit-gradient(linear, left bottom, left top, color-stop(0, #2CA0CA),
		color-stop(1, #3EB8E5));
	box-shadow: inset 0px 1px 0px #7FD2F1, 0px 5px 0px #156785;
	border-radius: 5px;
}

.loading a:active {
	box-shadow: inset 0px 1px 0px #7FD2F1, 0px 0px 0px #156785;
}
</style>
<script>
	var bar = 0;
	var line = "|"
	var amount = "|"
	function count() {
		bar = bar + 1
		amount = amount + line;
		document.loading.chart.value = amount;
		document.loading.percent.value = bar + "%"
		if (bar < 99) {
			setTimeout("count()", 30);
		}//这里修改载入时间
		else {
			window.location = "${cp}/";
		}//这里改成你的网站地址
	}
	window.onload = count;
</script>

</head>


<body>
	<div class="content">
		<div class="demo">
			<p>
				<span>4</span><span>0</span><span>4</span>
			</p>
		</div>
		<form name="loading" class="loading">
			<p>该页面不存在(´･ω･`)</p>
			<p>正在返回网站首页，请稍候…</p>
			<p>
				<input type="text" name="chart" size="35" disabled="true">
			</p>
			<p>
				<input type="text" name="percent" size="35" disabled="true"
					style="text-align: center; margin-bottom: 15px;">
			</p>
			<a href="${cp}/">点击返回首页</a>
		</form>
	</div>
</body>
</html>
