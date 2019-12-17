<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/normalize.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/style.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/header.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/sortBtn.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/sidebar.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/card_style.css" />

</head>

<header class="">
    <div class="header-top">
        <!-- LOGO  Btn -->
        <h1 class="logo"><a href="Logo">BlogCentral</a></h1>
        <!-- LOGIN -->
        <c:choose>
            <c:when test="${!isLoggedIn}">
                <a class="sign-in" href="login">LOGIN &nbsp;<i class="fa fa-sign-in" aria-hidden="true"></i></a>
            </c:when>
            <c:otherwise>
                <a class="sign-in" href="logout">LOGOUT &nbsp;<i class="fa fa-sign-in" aria-hidden="true"></i></a>
            </c:otherwise>
        </c:choose>
    </div>
    <!-- SEARCH Wrapper -->
    <div class="search-wrapper">
        <input type="text" name="query" autocomplete="off" placeholder="Search for&hellip;" type="submit">
        <a class="mysearchicon" href=""> &nbsp;<i class="fa fa-search fa-lg" aria-hidden="true"></i></a>
    </div>
    <!-- REGISTER  Btn -->
    <div>
        <c:choose>
            <c:when test="${!isLoggedIn}">
                <a class="register" href="register">REGISTER&nbsp;<i class="fa fa-user-plus"></i></a>
            </c:when>
            <c:otherwise>
                <a class="register" href="register">UPDATE PROFILE&nbsp;<i class="fa fa-user-plus"></i></a>
            </c:otherwise>
        </c:choose>
    </div>
</header>