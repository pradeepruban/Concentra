<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.syntel.isap.provisioning.bean.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <% 
   User userSession= (User) session.getAttribute("userValue");
   int username=0;
   if(userSession!=null){
	   username=userSession.getUsr_id();
         response.setHeader("Cache-Control","no-cache"); //Forces caches to obtain a new copy of the page from the origin server
          response.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
            response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
            response.setHeader("Pragma","no-cache"); //HTTP 1.0 backward compatibility
   } 
    if (0 == username )
    {
        request.setAttribute("Error", "Session has ended.  Please login.");
        session.removeAttribute("userValue");
        session.invalidate();
        response.sendRedirect("./sessionExpire.jsp");
    }   
        %> 
</body>
</html>