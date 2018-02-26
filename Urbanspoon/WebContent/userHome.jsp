<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="page">
		<div class="header"></div>
		<div>
			<div id="restaurants">
				
			</div>
			<div id="branch_feedback">
				<h3>Branch Feedback</h3>
				<form name="branch_feedback_form" method="post"
					action="UrbanspoonController">
					<input type="hidden" name="action" value="branch_feedback"><br>
					Restaurant:
					<h3>${restaurant.name}</h3>
					<br> Branch:
					<h3>${branch.location}</h3>
					<input type="hidden" name="branch_id" value="${branch.id}">
					<br> <label>Comments</label>
					<textarea rows="5" cols="5" name="comments"></textarea>
					<br><label>rating</label> <select name="rating">
						<option value=1>1</option>
						<option value=2>2</option>
						<option value=3>3</option>
						<option value=4>4</option>
						<option value=5>5</option>
					</select> <br>
					<label>Visited Date</label><input type="date" name="visited_Date"><br>
					<label>FeedbackType</label> <select name="feedback_type_id">
						<c:forEach items="${feedbackTypeList}" var="feedbackType">
							<option value="${feedbackType.id}">${feedbackType.description}</option>
						</c:forEach>
					</select><br> <input type="submit" value="submit">
				</form>
			</div>


			<div id="recipe_feedback">
				<h3>Recipe Feedback</h3>
				<form name="recipe_feedback_form" method="post"
					action="UrbanspoonController">
					<input type="hidden" name="action" value="recipe_feedback"><br>
					Restaurant:
					<h3>${restaurant.name}</h3>
					<input type="hidden" name="branch_id" value="${branch.id}">
					<input type="hidden" name="recipe_id" value="${recipe.id}">
					<br> Branch:
					<h3>${branch.location}</h3>
					<br> Recipe:
					<h3>${recipe.name}</h3>
					<label>Comments</label>
					<textarea rows="5" cols="5" name="comments"></textarea>
					<br> <label>rating</label> <select name="rating">
						<option value=1>1</option>
						<option value=2>2</option>
						<option value=3>3</option>
						<option value=4>4</option>
						<option value=5>5</option>
					</select> <br>
					<label>Visited Date</label><input type="date" name="visited_Date"><br>


					<input type="submit" value="submit">
				</form>
			</div>
		</div>
	</div>
</body>
</html>