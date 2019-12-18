<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <meta charset="UTF-8">
    <title>Commenting System</title>
    <meta name="viewport" content="width=device-width">
    <!-- <link rel="icon" type="image/png" href="http://www.favicon.cc/logo3d/430212.png" /> -->
    <!--===============================================================================================-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"
        integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <!--===============================================================================================-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/normalize.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/style.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/header.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/sortBtn.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/sidebar.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/card_style.css" />
    <style>
        .collapsible {
            visibility: hidden;
        }
    </style>

</head>

<body>
    <div class="container">
        <jsp:include page="../generalcomponents/sidebar.jsp" />
        <jsp:include page="../generalcomponents/header.jsp" />
        <jsp:include page="../home/homecomponents/sortheader.jsp" />
        <jsp:include page="../generalcomponents/postcard with comments.jsp">
            <jsp:param name="id" value="${blog.id}" />
            <jsp:param name="username" value="${blog.author.username}" />
            <jsp:param name="title" value="${blog.title}" />
            <jsp:param name="likes" value="${blog.likeCount}" />
            <jsp:param name="message" value="${blog.message}" />
        </jsp:include>

    </div>
</body>