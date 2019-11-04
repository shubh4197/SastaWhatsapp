
		$("#loginForm").validate({
			rules : {
				loginEmail : {
					required : true,
					email : true
				},
				loginPassword : {
					required : true,
					minlength : 4
				},
			},
			messages : {
				loginEmail : {
					required : "Email is required",
					email : "Email should be in someone@domain.com"
				},
				loginPassword : {
					required : "Password is mandatory",
					minlength : "Password must be minimum 8 charecters long."
				},
			},
			errorElement : 'div',
		});

		//registration form
		$("#registerForm").validate({
			rules : {
				first_name : {
					required : true,
					lettersonly : true
				},
				last_name : {
					required : true,
					lettersonly : true
				},
				email : {
					required : true,
					email : true
				},
				password : {
					required : true,
					minlength : 8
				},
				confirm_password : {
					required : true,
					equalTo : "#password",
					minlength : 8
				},
			},
			messages : {
				first_name : {
					required : "First name is required",
					lettersonly : "First name can have only letters"
				},
				last_name : {
					required : "Last name is required",
					lettersonly : "last name can have only letters"
				},
				email : {
					required : "Email is required",
					email : "Email should be in someone@domain.com"
				},
				password : {
					required : "Password is mandatory",
					minlength : "Password must be minimum 8 charecters long."
				},
				confirm_password : {
					required : "Password confirmation is mandatory",
					equalTo : "Passwords do not match",
					minlength : "Password must be minimum 8 charecters long."
				},
			},
			errorElement : 'div',
		});
