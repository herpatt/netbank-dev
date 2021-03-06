<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
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
  <%@include file="./layout/navigation.jsp"%>   
  <div class="home-wrapper">
    <div class="container">
      <security:authorize access="hasRole('ROLE_CUSTOMER')">
        <c:if test="${ status == 'SUCCESS' }">
          <div class="alert alert-success">
            <c:out value="${displayMessage}"/>  
          </div>
        </c:if>
        
        <c:if test="${ status == 'ERROR' }">
          <div class="alert alert-danger">
            <c:out value="${displayMessage}"/>  
          </div>
        </c:if>         
        <div class="panel">
          <div class="panel-heading panel-primary">Customer Dashboard</div>
          <div class="panel-body">
            <ul class="list-group">
              <li class="list-group-item"><a href="<%=baseURL%>/beneficiary">Add Beneficiary</a></li>
              <li class="list-group-item">Open new account</li>
              <li class="list-group-item">Check account balance</li>
              <li class="list-group-item">Funds transfer</li>
              <li class="list-group-item">Request Chequebook</li>
              <li class="list-group-item">View monthly transaction statements</li>
            </ul>
          </div>
        </div>
      </security:authorize>
      <security:authorize access="hasRole('ROLE_MANAGER')">
        <div class="panel">
          <div class="panel-heading panel-primary">Manager Dashboard</div>
          <div class="panel-body">
            <ul class="list-group">
              <li class="list-group-item"><a href="<%=baseURL%>/user-list">Approve User Registrations</a></li>
            </ul>
          </div>
        </div>
      </security:authorize>
    </div>
  </div>
</body>
<%@include file="./layout/js-include.jsp"%>
</html>