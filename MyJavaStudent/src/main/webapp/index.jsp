<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.jsp"%>
<%@include file="head.html" %>
<body>
<%@include file="header.html" %>
  <section class="section-one">
    <aside class="top-aside">
      <h2>student</h2>
		<div class="div">
            <img src="student.jpg" alt="">
        </div>
    </aside>
    <section class="top-article-section">
      <article class="top-article">
        <h2>ut labore et</h2>
        <div class="div">
            <form action="Submit.jsp" method="POST">
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
    </section>
  </section>
  <section class="section-two">
    <article class="mid-article-two">
      <hgroup>
        <h2>right</h2>
      </hgroup>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
      eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut e
      nim ad minim veniam, quis nostrud exercitation ullamco laboris nisi
      Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
      eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut e
      nim ad minim veniam, quis nostrud exercitation ullamco laboris nisi
       ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit
      in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
      Excepteur sint occaecat cupidatat non proident,
      sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
    </article>
  </section>
  <%@include file="footer.html" %>
</body>
</html>
