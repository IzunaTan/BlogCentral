<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <meta http-equiv="X-UA-Compatible" content="ie=edge" />
  <link href="https://fonts.googleapis.com/css?family=Yeon+Sung&display=swap" rel="stylesheet" />
  <!--===============================================================================================-->
  <link href="https://fonts.googleapis.com/css?family=McLaren|Yeon+Sung&display=swap" rel="stylesheet" />
  <!--===============================================================================================-->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <!--===============================================================================================-->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/normalize.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/style.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/header.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/sortBtn.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/sidebar.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/card_style.css" />


  <title>CentralBlog</title>
</head>


<body>
  <!-- Main-Section -->
  <div class="container">
    <!-- SIDE Function -->
    <jsp:include page="../generalcomponents/sidebar.jsp"></jsp:include>

    <!-- HEADER Section -->
    <jsp:include page="../generalcomponents/header.jsp"></jsp:include>

    <!-- End Header-Section  -->
    <!-- SORT Header -->
    <jsp:include page="homecomponents/sortheader.jsp"></jsp:include>
    <!-- POST Card -->
    <jsp:include page="homecomponents/postcard.jsp"></jsp:include>

    <a href="" onclick="topFunction()" id="myBtn" title="Back to top"><i class="fa fa-arrow-up"></i></a>
    <!-- <button onclick="topFunction()" id="myBtn" title="Go to top">Top</button> -->

    <script src="resources/1-Front-End/home/js/collapsible.js"></script>

</body>

</html>