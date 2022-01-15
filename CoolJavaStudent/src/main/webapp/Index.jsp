<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, java.lang.*" errorPage="Error.jsp"%>
<%@include file="Head.html" %>
<body>
    <div class="box">
        <div class="div">
            <form action="Answer.jsp" method="POST">
                <div class="divq">
                    tell the question:<input class="inpt" type="text" name="question"><br>    
                </div>
                <div class="divq">
                    teach the answer:<input class="inpt" type="text" name="answer"><br>
                </div>
                <div class="divq">
                    ask a question:<input class="inpt" type="text" name="askedquestion"><br>
                </div>
                <input type="submit">
            </form>
        </div>
        <div class="div">
            <img src="student.jpg" alt="">
        </div>
    </div>
    <div class="answerbox">

    </div>
</body>
</html>