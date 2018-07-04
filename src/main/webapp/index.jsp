<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<body>
	<h2>Bienvenue sur proxiBanqueSI</h2>
	<s:form action="authentification">
		<s:textfield key="login" label="Identifiant" type="text" />
		<s:password key="password" label="Mot de passe" />
		<s:submit value="entrer"/>
	</s:form>

</body>
</html>
