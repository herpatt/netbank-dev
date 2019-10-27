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
          <form class="signup-form" name="signupform" action="<%=baseURL%>/signup" method="post">
            <div class="form-row">
              <div class="form-group col">
                <label for="First Name">First Name</label> <input type="text" class="form-control" name="firstName" />
              </div>
              <div class="form-group col">
                <label for="Last Name">Last Name</label> <input type="text" class="form-control" name="lastName" />
              </div>
              <div class="form-group col">
                <label for="DOB">DOB</label> <input type="text" class="form-control" name="DOB" placeholder="mm/dd/yyyy" />
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col">
                <label for="Address Line 1">Address Line 1</label> <input type="text" class="form-control" name="addressLine1" />
              </div>
              <div class="form-group col">
                <label for="Address Line 2">Address Line 2</label> <input type="text" class="form-control" name="addressLine1" />
              </div>
              <div class="form-group col">
                <label for="City">City</label> <input type="text" class="form-control" name="city" />
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col">
                <label for="State">State</label> <input type="text" class="form-control" name="state" />
              </div>
              <div class="form-group col">
                <label for="Pincode">Pincode</label> <input type="text" class="form-control" name="pincode" />
              </div>
              <div class="form-group col">
                <label for="Mobile Number">Mobile Number</label> <input type="text" class="form-control" name="mobileNumber" />
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col">
                <label for="Email">Email</label> <input type="text" class="form-control" name="email" />
              </div>
              <div class="form-group col">
                <label for="Aadhar">Aadhar</label> <input type="text" class="form-control" name="aadhar" />
              </div>
              <div class="form-group col">
                <label for="PAN">PAN</label> <input type="text" class="form-control" name="pan" />
              </div>
            </div>
            <div class="form-row">
              <div class="form-group col">
                <label for="User Name">User Name</label> <input type="text" class="form-control" name="userName" />
              </div>
              <div class="form-group col">
                <label for="Password">Password</label> <input type="text" class="form-control" name="password" />
              </div>
              <div class="form-group col">
                <label for="Confirm Password">Confirm Password</label> <input type="text" class="form-control" name="confirmpassword" />
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
          </form>
        </div>
      </div>
    </div>
  </div>
</body>
<%@include file="./layout/js-include.jsp"%>
</html>