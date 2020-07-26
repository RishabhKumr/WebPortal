<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>

    
    <!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LTI Larsen and Toubro Infotech</title>
    <link href="https://fonts.googleapis.com/css?family=Muli&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="styleIndex.css">
</head>

<body>
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidated");
if(session.getAttribute("userName")==null)
{
	response.sendRedirect("login.jsp");
}
%>
    <div class="header">
        <h1>Welcome to LTI</h1>
    </div>

    <div class="topnav">
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="register.html">Register</a></li>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="about.jsp">About</a></li>
            <li><span  style="color:white; float:right; padding-right:10px; padding-top:5px;">Hi, ${userName}</span></li>
            <li>><img src="images/lti.jpg" style="float: right; height: 50px; padding-right: 20px;"  alt="Image not Found"></li>
        </ul>
    </div>

    <div class="row">
        <div class="main">
            <div class="card">
                <p>
                LTI (NSE:LTI) is a global technology consulting and digital solutions company 
                helping more than 420 clients succeed in a converging world. With operations 
                in 32 countries, we go the extra mile for our clients and accelerate their digital
                 transformation with LTI’s Mosaic platform enabling their mobile, social, analytics,
                  IoT and cloud journeys.
              </p>
              <p>
                Founded 20 years ago as the information technology arm of the Larsen & Toubro group, 
                our unique heritage gives us unrivaled real-world expertise to solve the most complex 
                challenges of enterprises across all industries.
              </p>
              <p>
                Each day, our team of more than 30,000 LTItes enable our clients to improve the effectiveness 
                of their business and technology operations and deliver value to their customers, employees 
                and shareholders.
            </div>
            <div class="card">
                <h1 style="text-align: center">Our Beliefs</h1>
              <div class="cc">
                <img src="images/extra-mile-237x300.png">
                <p>Go the Extra Mile</p>
              </div>
              <div class="cc">
                <img src="images/Be-agile-237x300.png">
                <p>Be Agile</p>
              </div>
              <div class="cc">
                <img src="images/push-frontiers-of-innovation-237x300_robo.jpg">
                <p>Push Frontiers of Innovation</p>
              </div>
              <div class="cc">
                <img src="images/keep-learning-237x300.png">
                <p>Keep Learning</p>
              </div>
              <div class="cc">
                <img src="images/solve-for-society-237x300_new-237x300.png">
                <p>Solve For Society</p>
              </div>

            </div>
        </div>
    </div>


    <div class="footer">
        <p>© 2020 Larsen & Toubro Infotech Limited</p>
      </div>  
    
</body>

</html>