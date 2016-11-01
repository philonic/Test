<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="cns" uri="/cns" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<c:set var="cps" value="${pageContext.request.contextPath}/static"/>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" /><meta name="author" content="http://ycinfo.com/"/>
<meta name="renderer" content="webkit"><meta http-equiv="X-UA-Compatible" content="IE=8,IE=9,IE=10" />
<meta http-equiv="Expires" content="0"><meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Cache-Control" content="no-store">
<link rel="shortcut icon" href="${cps }/img/favicon.ico" type="image/x-icon"/>
<script src="${cps}/js/jquery-3.1.1.min.js" type="text/javascript"></script>
<link href="${cps}/css/select2.min.css" rel="stylesheet" />
<script src="${cps}/js/select2.min.js" type="text/javascript"></script>
<link href="${cps}/css/jquery.validate.css" type="text/css" rel="stylesheet" />
<script src="${cps}/js/jquery.validate.js" type="text/javascript"></script>
<script src="${cps}/js/jquery.validate.method.js" type="text/javascript"></script>
<link href="${cps}/css/jbox.min.css" rel="stylesheet" />
<script src="${cps}/js/jquery.jBox-2.3.min.js" type="text/javascript"></script>
<script src="${cps}/js/WdatePicker.js" type="text/javascript"></script>
<link href="${cps}/js/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<script src="${cps}/js/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<link href="${cps}/css/easyui-themes/icon.css" rel="stylesheet" type="text/css">
<link href="${cps}/css/easyui-themes/default/easyui.css" rel="stylesheet" type="text/css">
<script src="${cps}/js/jquery.easyui.min.js" type="text/javascript"></script>
<script src="${cps}/js/datagrid-cellediting.js" type="text/javascript"></script>
<script src="${cps}/js/jquery.edatagrid.js" type="text/javascript"></script>
<script src="${cps}/js/easyui-lang-zh_CN.js" type="text/javascript"></script>
<!-- 自定义公共样式 -->
<link rel="stylesheet" type="text/css" href="${cps}/css/common.css"/>
<script type="text/javascript">var cp = '${cp}',cps='${cps}';</script>