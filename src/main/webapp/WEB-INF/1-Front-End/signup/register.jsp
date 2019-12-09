<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <!--===============================================================================================-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" href="/WEB-INF/1-Front-End/home/css/normalize.css" />
    <!--===============================================================================================-->
    <link rel="stylesheet" href="/WEB-INF/1-Front-End/login/css/style.css" />
    <link rel="stylesheet" href="/WEB-INF/1-Front-End/home/css/utils.css" />
    <title>Register</title>
</head>

<a href="/WEB-INF/index.html" title="Back Home"><i class="fa fa-home fa-lg"></i></a>

<body>

    <div class="container">
        <form class="login100-form validate-form">
            <span class="login100-form-title">
                Please fill the form to register
            </span>

            <div class="wrap-input100 validate-input" data-validate="Valid email is required: ex@abc.xyz">
                <input class="input100" type="text" name="first-name" placeholder="First Name">
                <span class="focus-input100"></span>
                <span class="symbol-input100">
                    <i class="fa fa-envelope" aria-hidden="true"></i>
                </span>
            </div>

            <div class="wrap-input100 validate-input" data-validate="Password is required">
                <input class="input100" type="text" name="last-name" placeholder="Last Name">
                <span class="focus-input100"></span>
                <span class="symbol-input100">
                    <i class="fa fa-lock" aria-hidden="true"></i>
                </span>
            </div>

            <div class="wrap-input100 validate-input" data-validate="Password is required">
                <input class="input100" type="email" name="email" placeholder="Email">
                <span class="focus-input100"></span>
                <span class="symbol-input100">
                    <i class="fa fa-lock" aria-hidden="true"></i>
                </span>
            </div>

            <div class="wrap-input100 validate-input" data-validate="Password is required">
                <input class="input100" type="text" name="street" placeholder="Street">
                <span class="focus-input100"></span>
                <span class="symbol-input100">
                    <i class="fa fa-lock" aria-hidden="true"></i>
                </span>
            </div>

            <div class="wrap-input100 validate-input" data-validate="Password is required">
                <input class="input100" type="password" name="pass" placeholder="Password">
                <span class="focus-input100"></span>
                <span class="symbol-input100">
                    <i class="fa fa-lock" aria-hidden="true"></i>
                </span>
            </div>

            <div class="container-login100-form-btn">
                <button class="login100-form-btn">
                    Login
                </button>
            </div>

            <div class="utility">
                <div class="forgot text-center p-t-12">
                    <span class="txt1">
                        Forgot
                    </span>
                    <a class="txt2" href="/WEB-INF/login/recovery.html">
                        Username / Password?
                    </a>
                </div>

                <div class="create text-center p-t-136">
                    <a class="txt2" href="/WEB-INF/login/login.html">Login
                        <i class="fa fa-sign-in" aria-hidden="true"></i>
                    </a>
                </div>
            </div>

        </form>
    </div>
</body>

</html>