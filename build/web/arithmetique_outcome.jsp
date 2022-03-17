<%-- 
    Document   : arithmetique_outcome
    Created on : Mar 8, 2022, 2:20:33 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>this arithmetics outcome page</title>
    </head>
    <body>
        <h1>Arithmetics outcome</h1>
        <%
         String num1 = (String)request.getAttribute("num1");
         String num2 =(String)request.getAttribute("num2");
         String op =(String)request.getAttribute("op");
         String outcome=(String)request.getAttribute("outcome");
         
        %>
        
        <p>
             the outcome of  <%=num2%> <%=op%> <%=num2%> = <%=outcome%>
        </p>
        <p>
            please click<a href="index.html">here</a> to go back to the main page
        </p>
    </body>
</html>
