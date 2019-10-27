$(document).ready(function() {
	$.validator.addMethod("lettersonly", function(value, element) {
		return this.optional(element) || /^[a-z]+$/i.test(value);
	}, "Please enter only alphabets");
	
	
	$(".login-form").validate({
		rules : {
			userName : {
				required : true
			},
			password : {
				required : true
			}			
		},
		messages : {
			userName : {
				required : "User Name is mandatory"
			},
			password : {
				required : "Password is mandatory"
			}			
		},
		errorPlacement: function(error,element) {
		    return true;
	    }		
	});

	$(".signup-form").validate({
		rules : {
			firstName : {
				required : true,
				lettersonly : true
			},
			lastName : {
				required : true,
				lettersonly : true
			},
			DOB : {
				required : true,
				date : true
			},	
			addressLine1 : {
				required : true
			},	
			city : {
				required : true,
				lettersonly : true
			},	
			state : {
				required : true,
				lettersonly : true
			},
			pincode : {
				required : true,
				digits : true,
				maxlength : 6
			},
			mobileNumber : {
				required : true,
				digits : true,
				maxlength : 10
			},
			email : {
				required : true,
				email : true
			},
			aadhar : {
				required : true,
				digits : true
			},
			pan : {
				digits : true
			},			
			userName : {
				required : true,
				minlength : 8,
				maxlength : 15
			},
			password : {
				required : true,
				minlength : 8,
				maxlength : 15
			},	
			confirmpassword: {
				required : true,
				equalTo: "#password"
            }			
		},
		messages : {
			firstName : {
				required : "First name is mandatory",
			},
			lastName : {
				required : "Last name is mandatory",
			},
			DOB : {
				required : "DOB is mandatory",
			},			
			addressLine1 : {
				required : "Address is mandatory"
			},	
			city : {
				required : "City is mandatory",
			},
			state : {
				required : "City is mandatory",
			},			
			pincode : {
				required : "PIN is mandatory",
				digits : "Invalid PIN Number",
				maxlength : "Max Chars allowed is 6",
			},
			mobileNumber : {
				required : "Mobile is mandatory",
				digits : "Invalid Mobile Number",
				maxlength : "Max Chars allowed is 10",
			},
			email : {
				required : "Email is mandatory",
				email : "Invalid Email"
			},
			aadhar : {
				required : "Aadhar is mandatory",
				digits : "Invalid Aadhar"
			},
			pan : {
				digits : "Invalid PAN"
			},
			userName : {
				required : "User Name is mandatory",
				minlength : "User Name Should be between 8 - 15 Characters",
				maxlength : "User Name Should be between 8 - 15 Characters",
			},
			password : {
				required : "Password is mandatory",
				minlength : "Password Shouls be between 8 - 15 Characters",
				maxlength : "Password Shouls be between 8 - 15 Characters",
			},	
			confirmpassword: {
				required : "Confirm Password is mandatory",
				equalTo: "Enter Confirm Password Same as Password"
	        }			
		},

	});
});