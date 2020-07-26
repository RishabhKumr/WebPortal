<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LTI Larsen and Toubro Infotech</title>
    <link href="https://fonts.googleapis.com/css?family=Muli&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="styleIndex.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <!--    <script>
      $(document).ready(function(){
          $("#loginForm").submit(function(){
            var uname = $("#uname").val();
            var pass = $("#psw").val();
            
            if(uname.length == 0)
            {
              $("#UserName").html("UserName Empty");
            }
            if(pass.length == 0)
            {
              $("#PasswordText").html("Password Empty");
            }
            
          });
      });
    </script> -->
</head>

<body>
    <div class="header">
        <h1>Welcome to LTI</h1>
    </div>
    
    <p>
<%

if(session.getAttribute("username")!=null)
{
	response.sendRedirect("index.jsp");
}
%>
    </p>
    <div class="topnav">
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="register.html">Register</a></li>
            <li><a href="login.jsp">Login</a></li>
            <li>><img src="images/lti.jpg" style="float: right; height: 50px; padding-right: 20px;"  alt="Image not Found"></li>
        </ul>
    </div>

    <div class="row">
        <div class="main">
            <div class="card">
                <h2 style="text-align: center;">Login to a world of opportunities!</h2>
                <form id="loginForm" method="post" action="loginUser">
                  
                    <div class="container">
                      <label for="unametxt"><b>Username</b></label>
                      <input type="text" placeholder="Enter Username" name="uname">
                      <span id="UserName" style="color:red"></span>
                      <label for="pswTxt"><b>Password</b></label>
                      <input type="password" placeholder="Enter Password" name="psw">
                      <span id="PasswordText"></span>
                      <button type="submit">Login</button>
                      <p id="successful"></p>
                      <label>
                        <input type="checkbox" checked="checked" name="remember"> Remember me
                      </label>
                    </div>
                  
                    <div class="container" style="background-color:#f1f1f1">
                      <button type="button" class="cancelbtn">Cancel</button>
                      <span class="psw">Forgot <a href="#">password?</a></span>
                    </div>
                  </form>
              </div>
        </div>
    </div>


    <div class="footer">
        <p>© 2020 Larsen & Toubro Infotech Limited</p>
      </div>  
    
</body>

</html>