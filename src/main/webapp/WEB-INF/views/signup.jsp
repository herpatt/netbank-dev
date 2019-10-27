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
  <div class="signup-wrapper">
    <div class="container">
      <div class="panel">
        <div class="panel-heading panel-primary">Customer Registration</div>
        <div class="panel-body">
          <form:form method="POST" modelAttribute="user" class="signup-form">
            <div class="form-row">
              <div class="form-group col">
                <label for="First Name">First Name</label> 
                <form:input class="form-control" path="firstName"/>
              </div>
              <div class="form-group col">
                <label for="Last Name">Last Name</label> <form:input class="form-control" path="lastName"/>
              </div>
              <div class="form-group col">
                <label for="DOB">DOB</label> <form:input class="form-control" path="dob" placeholder="mm/dd/yyyy"/>
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col">
                <label for="Address Line 1">Address Line 1</label>  <form:input class="form-control" path="addressLine1"/>
              </div>
              <div class="form-group col">
                <label for="Address Line 2">Address Line 2</label>  <form:input class="form-control" path="addressLine2"/>
              </div>
              <div class="form-group col">
                <label for="City">City</label>  <form:input class="form-control" path="city"/>
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col">
                <label for="State">State</label> <form:input class="form-control" path="state"/> 
              </div>
              <div class="form-group col">
                <label for="Pincode">Pincode</label> <form:input class="form-control" path="pin" maxlength="6"/>
              </div>
              <div class="form-group col">
                <label for="Mobile Number">Mobile Number</label> <form:input class="form-control" path="mobileNumber" maxlength="10"/> 
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col">
                <label for="Email">Email</label>  <form:input class="form-control" path="emailId"/> 
              </div>
              <div class="form-group col">
                <label for="Aadhar">Aadhar</label> <form:input class="form-control" path="aadharId" maxlength="16"/>
              </div>
              <div class="form-group col">
                <label for="PAN">PAN</label> <form:input class="form-control" path="pan" maxlength="10"/>
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col">
                <label for="User Name">User Name</label> <form:input class="form-control" path="userName"/>
              </div>
              <div class="form-group col">
                <label for="Password">Password</label> <form:password path="password" class="form-control"/> 
              </div>
              <div class="form-group col">
                <label for="Confirm Password">Confirm Password</label> <form:password path="confirmPassword" class="form-control"/> 
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col">
                <label for="Date Of Birth Proof">Date Of Birth Proof</label>
              </div>
              <div class="form-group col">
                <input type="file" class="form-control" name="dobProof" />
              </div>
              <div class="form-group col">
                <label for="Date Of Birth Proof">Ex: Passport,Birth Certificate Upload Only PDF,JPG,JPEG Documents</label>
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col">
                <label for="Date Of Birth Proof">Address Proof</label>
              </div>
              <div class="form-group col">
                <input type="file" class="form-control" name="addressProof" />
              </div>
              <div class="form-group col">
                <label for="Address Proof">Ex: License,Voter ID Upload Only PDF,JPG,JPEG Documents</label>
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col">
                <label for="Aadhar Proof">Aadhar</label>
              </div>
              <div class="form-group col">
                <input type="file" class="form-control" name="aadharProof" />
              </div>
              <div class="form-group col">
                <label for="Aadhar Proof">Upload Only PDF,JPG,JPEG Documents</label>
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col">
                <label for="PAN Proof">Date Of Birth Proof</label>
              </div>
              <div class="form-group col">
                <input type="file" class="form-control" name="panProof" />
              </div>
              <div class="form-group col">
                <label for="PAN Proof">Upload Only PDF,JPG,JPEG Documents</label>
              </div>
            </div>
            <div class="form-row">
              <div class="form-group mx-auto">
                <button type="reset" class="btn btn-primary btn-warning">Reset</button>
                <button type="submit" class="btn btn-primary ml-2">Register</button>
              </div>
            </div>
          </form:form>
        </div>
      </div>
    </div>
  </div>
</body>
<%@include file="./layout/js-include.jsp"%>
</html>