<header class="section">
    <div class="container">
        <div class="header-top">
            <!-- LOGO  Btn -->
            <h1 class="logo"><a href="home">BlogCentral</a></h1>
            <!-- LOGIN -->
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <c:choose>
            <c:when test="${isLoggedIn == false}">
            <a class="sign-in" href="login">LOGIN &nbsp;<i class="fa fa-sign-in" aria-hidden="true"></i></a>
            </c:when>
            <c:otherwise>
            <a class="sign-in" href="logout">LOGOUT &nbsp;<i class="fa fa-sign-in" aria-hidden="true"></i></a>
            </c:otherwise>
            </c:choose>
        </div>
        <!-- SEARCH Wrapper -->
        <div class="search-wrapper">
            <input type="text" name="query" autocomplete="off" placeholder="Search for&hellip;">
            <a href=""> &nbsp;<i class="fa fa-search" aria-hidden="true"></i></a>
        </div>
        <!-- REGISTER  Btn -->
        <div>
            <c:choose>
            <c:when test="${isLoggedIn == false}">
            <a class="sign-in" href="register">REGISTER&nbsp;<i class="fa fa-sign-in" aria-hidden="true"></i></a>
            </c:when>
            <c:otherwise>
            <a class="sign-in" href="register">${author.username} &nbsp;<i class="fa fa-sign-in" aria-hidden="true"></i></a>
            </c:otherwise>
            </c:choose>
        </div>
    </div>
</header>