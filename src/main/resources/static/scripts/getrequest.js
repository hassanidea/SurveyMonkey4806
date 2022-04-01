GET: $(document).ready(
		function() {
			// GET REQUEST
			$("#getAllQuestions").click(function(event) {
				event.preventDefault();
				ajaxGet();
			});

			// DO GET
			function ajaxGet() {
				$.ajax({
					type : "GET",
					url : "getQuestions",
					success : function(result) {
						if (result.status == "success") {
							$('#getResultDiv ul').empty();
							var custList = "";
							$.each(result.data,
									function(i, book) {
										var user = "Question:  "
												+ book.surveyQuestion
												+ " Choice 1: " + book.choiceOne
												+ " Choice 2: " + book.choiceTwo
												+ " Choice 3: " + book.choiceThree
												+ " Choice 4: " + book.choiceFour
											+ "<br>";
										$('#getResultDiv .list-group').append(
												user)
									});
							console.log("Success: ", result);
						} else {
							$("#getResultDiv").html("<strong>Error</strong>");
							console.log("Fail: ", result);
						}
					},
					error : function(e) {
						$("#getResultDiv").html("<strong>Error</strong>");
						console.log("ERROR: ", e);
					}
				});
			}
		})