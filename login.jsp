<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <!--===============================================================================================-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/normalize.css"/>
    <!--===============================================================================================-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/login/css/style.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/utils.css"/>
    <title>Register</title>
</head>

<a href="index.html" title="Back Home"><i class="fa fa-home fa-lg"></i></a>

<body>

<div class="container">
    <form class="login100-form validate-form" method="post" action="login">
            <span class="login100-form-title">
                Enter your username and password to login
            </span>

        <div class="wrap-input100 validate-input" data-validate="Valid email is required: ex@abc.xyz">
            <input class="input100" id="email" type="email" name="email" placeholder="Email" required>
            <span class="focus-input100"></span>
            <span class="symbol-input100">
                    <!-- <i class="fa fa-envelope" aria-hidden="true"></i> -->
                </span>
        </div>

        <div class="wrap-input100 validate-input" data-validate="Password is required">
            <input class="input100" id="password" type="password" name="pass" placeholder="Password"
                   pattern=".{8,}" required title="8 characters minimum">
            <span class="focus-input100"></span>
            <span class="symbol-input100">
                    <!-- <i class="fa fa-lock" aria-hidden="true"></i> -->
                </span>
        </div>


        <%--            <div class="wrap-input100 validate-input" data-validate="user-name is required" aria-required="user-name">--%>
        <%--                <input class="input100" id="username" type="text" name="user-name" placeholder="User Name" required>--%>
        <%--                <span class="focus-input100"></span>--%>
        <%--                <span class="symbol-input100">--%>
        <%--                    <!-- <i class="fa fa-lock" aria-hidden="true"></i> -->--%>
        <%--                </span>--%>
        <%--            </div>--%>


<div class="attributes">
    <div class="container-login100-form-btn">
        <input type="submit" onclick="removeChars()" value="Send" title="we did it reddit"
               class="login100-form-btn">
    </div>

    <div class="utility">
        <div class="forgot text-center p-t-12">
                        <span class="txt1">
                            Forgot
                        </span>
            <a class="txt2" href="/login/recovery.html">
                Username / Password?
            </a>
        </div>

        <div class="create text-center p-t-136">
            <a class="txt2" href="/login/login.html">Login
                <i class="fa fa-sign-in" aria-hidden="true"></i>
            </a>
        </div>
    </div>
</div>
</form>

</div>
<%--<script type="text/javascript" src="resources/1-Front-End/signup/js/password-checker.js"></script>--%>

</body>

</html>