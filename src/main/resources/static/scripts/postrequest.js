$(document).ready(
		function() {

			// SUBMIT FORM
			$("#questionForm").submit(function(event) {
				event.preventDefault();
				ajaxPost();
			});

			function ajaxPost() {

				// PREPARE FORM DATA
				var formData = {
					surveyQuestion : $("#surveyQuestion").val(),
					choiceOne : $("#choiceOne").val(),
					choiceTwo : $("#choiceTwo").val(),
					choiceThree : $("#choiceThree").val(),
					choiceFour : $("#choiceFour").val()

				}

				// DO POST
				$.ajax({
					type : "POST",
					contentType : "application/json",
					url : "saveQuestion",
					data : JSON.stringify(formData),
					dataType : 'json',
					success : function(result) {
						if (result.status == "success") {
							$("#postResultDiv").html(
									"Question '" + result.data.surveyQuestion + "'  "
											+ " Saved Successfully!" +
											"</p>");
						} else {
							$("#postResultDiv").html("<strong>Error</strong>");
						}
						console.log(result);
					},
					error : function(e) {
						alert("Error!")
						console.log("ERROR: ", e);
					}
				});

			}

		})