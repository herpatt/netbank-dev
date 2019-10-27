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
  <div class="activateuser-wrapper">
    <div class="container">
      <div class="panel">
        <div class="panel-heading panel-primary">Activate User</div>
        <div class="panel-body">
          <table class="table">
            <thead>
              <tr>
                <th>Name</th>
                <th>User Name</th>
                <th>Status</th>
              </tr>
            </thead>
            <tbody>
              <c:forEach items="${users}" var="user">
                <tr>
                  <td>${user.firstName}&nbsp;${user.lastName}</td>
                  <td>${user.userName}</td>
                  <c:choose>
                    <c:when test="${ user.userStatus == 'A' }">
                      <td class="table-success">Active</td>
                    </c:when>
                    <c:otherwise>
                      <td class="table-warning"><a href="<%=baseURL%>/activate-user?userId=${user.userId}">Pending</a></td>
                    </c:otherwise>
                  </c:choose>
                </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </div>
</body>
<%@include file="./layout/js-include.jsp"%>
</html>