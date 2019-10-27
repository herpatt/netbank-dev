<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@include file="./layout/pageTemplate.jsp"%>
<!DOCTYPE html>
<html class="no-js" lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
<%@include file="./layout/css-include.jsp"%>
</head>
<body>
  <div class="login-wrapper">
    <div class="container">
      <form class="login-form text-center p-5 login-border" name="loginform" action="<%=baseURL%>/perform_login" method="post">
        <p class="h4 mb-4">Login</p>
        <input type="text" class="form-control mb-4" placeholder="User Name" name="userName"/> 
        <input type="password" class="form-control mb-4" placeholder="Password" name="password"/>
        <button class="btn btn-danger btn-block my-4" type="submit">Login</button>
        <p>
          Don't have an Account? <a href="<%=baseURL%>/signup">Sign Up</a>
        </p>
      </form>
    </div>
  </div>
</body>
<%@include file="./layout/js-include.jsp"%>
</html>