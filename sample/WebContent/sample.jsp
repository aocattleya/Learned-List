<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>		<!-- Struts2のタグライブラリを使用可能にする( s: を使えるようにする) -->
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>index</title>
	</head>
	<body>

		<s:property value="id" />
		<s:property value="name" />

		<s:property value="session.sample" />
		<s:property value="#session.sample" />


	</body>
</html>