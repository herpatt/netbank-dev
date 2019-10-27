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
  <div class="beneficiary-wrapper">
    <div class="container">
      <div class="panel">
        <div class="panel-heading panel-primary">Add Beneficiary</div>
        <div class="panel-body">
          <form:form method="POST" action="addbeneficiary" modelAttribute="beneficiary" class="beneficiary-form">
            <div class="form-group row">
              <label class="col-sm-2 col-form-label">Transfer Type</label>
              <div class="col-sm-6">
                <form:select path="beneficiaryType" class="col-form-label w-100 js-transfer-type">
                  <form:option value="I" label="Transfer within Bank" />
                  <form:option value="E" label="Transfer to Other bank" />
                </form:select>
              </div>
            </div>
            <div class="form-group row js-external-bank-type d-none">
              <label class="col-sm-2 col-form-label">Bank Name</label>
              <div class="col-sm-6">
                <form:input class="form-control" path="beneficiaryBankName" />
              </div>
            </div>
            <div class="form-group row js-external-bank-type d-none">
              <label class="col-sm-2 col-form-label">Bank Name IFSC Code</label>
              <div class="col-sm-6">
                <form:input class="form-control" path="beneficiaryBankIfsc" maxlength="11"/>
              </div>
            </div>
            <div class="form-group row">
              <label class="col-sm-2 col-form-label">Beneficiary Nick Name</label>
              <div class="col-sm-6">
                <form:input class="form-control" path="beneficiaryNickName" />
              </div>
            </div>
            <div class="form-group row">
              <label class="col-sm-2 col-form-label">Beneficiary Name</label>
              <div class="col-sm-6">
                <form:input class="form-control" path="beneficiaryName"/>
              </div>
            </div>
            <div class="form-group row">
              <label class="col-sm-2 col-form-label">Beneficiary Acc Number</label>
              <div class="col-sm-6">
                <form:input class="form-control" path="beneficiaryAccountNumber" maxlength="11"/>
              </div>
            </div>
            <div class="form-group row">
              <div class="col-sm-2"></div>
              <div class="col-sm-6"><button type="submit" class="btn btn-primary">Add Beneficiary</button></div>
            </div>
          </form:form>
        </div>
      </div>
    </div>
  </div>
</body>
<%@include file="./layout/js-include.jsp"%>
</html>