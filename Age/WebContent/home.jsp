<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>年齢判定フォーム</title>
</head>
<body>

	<s:form action="AgeAction">
		<s:textfield name="age" />
		<s:submit value="送信" />
	</s:form>

</body>
</html>