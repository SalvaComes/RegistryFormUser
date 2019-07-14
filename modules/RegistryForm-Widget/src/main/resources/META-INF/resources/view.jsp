<%@ page import="java.util.Date" %>
<%@include file="init.jsp" %>


<div class="container">
 	<h1><liferay-ui:message key="form.EnterUser"/></h1>
	<liferay-portlet:actionURL name="addUser" var="addUserUrl" />
	<portlet:resourceURL id="/login/captcha" var="captchaURL"/>

	
	<aui:form action="${addUserUrl}">
	
	 	<aui:input name="name" label ="Name" type="text" style="width: 50%;" />
	 	<aui:input name="lastname" label ="Lastname" type="text" style="width: 50%;" />
	 	<aui:input name="birthday" label ="Birthday" type="text" style="width: 50%;" />
	 	<aui:input name="email" label ="Email" type="text" style="width: 50%;" />
		<liferay-captcha:captcha url="<%=captchaURL%>" />
	 	<aui:button type="submit" label="submit" value="submit"/>
	</aui:form>
	

</div>
