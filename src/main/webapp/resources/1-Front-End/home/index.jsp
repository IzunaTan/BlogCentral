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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/normalize.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/style.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/header.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/sortBtn.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/sidebar.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/card_style.css"/>


  <title>CentralBlog</title>
</head>


<body>
  <!-- Main-Section -->
  <div class="container">
    <!-- SIDE Function -->
    <div class="sidebar">
      <div class="sidebar-item">Online &nbsp;
        <i class="fa fa-users fa-lg" aria-hidden="true"></i>
      </div>
      <div class="sidebar-item">Total &nbsp; &nbsp;
        <i class="fa fa-users fa-lg" aria-hidden="true"></i>
      </div>
      <div class="sidebar-item">Total Visits
        <i class="fa fa-calculator fa-lg" aria-hidden="true"></i>
      </div>
    </div>

    <!-- HEADER Section -->
    <header class="">
      <div class="header-top">
        <!-- LOGO  Btn -->
        <h1 class="logo"><a href="Logo">BlogCentral</a></h1>
        <!-- LOGIN -->
        <a class="sign-in" href="/login/login.html">LOGIN &nbsp;<i class="fa fa-sign-in" aria-hidden="true"></i></a>
      </div>
      <!-- SEARCH Wrapper -->
      <div class="search-wrapper">
        <input type="text" name="query" autocomplete="off" placeholder="Search for&hellip;" type="submit">
        <a href=""> &nbsp;<i class="fa fa-search fa-lg" aria-hidden="true"></i></a>
      </div>
      <!-- REGISTER  Btn -->
      <div>
        <a class="register" href="/signup/register.html">REGISTER&nbsp;<i class="fa fa-user-plus"></i></a>
      </div>
  </div>
  </header>
  <!-- End Header-Section  -->
  <!-- SORT Header -->
  <div class="collapse">
    <button type="button" class="collapsible">Sort</button>
    <div class="content">
      <div class="sortMenu">
        <li><a href="#">POPULAR</a></li>
        <li><a href="#">LATEST</a></li>
        <li><a href="#">ELDEST</a></li>
      </div>
    </div>
  </div>
  <!-- POST Card -->
  <div class="card">
    <!-- CARD Left -->
    <div class="card-left">
      <a class="card-left-title" href="#">User Name</i></a>
      <i class="fa fa-user fa-lg"></i>
      <!-- <img src="https://switchfully.com/img/switchfully_small_logo.png"> -->
      <span>Some sub-text</span>
    </div>
    <!-- CARD-Right -->
    <div class="right">
      <fieldset>
        <legend>
          <h3><a class="card-title" href="#">Title</a></h3>
        </legend>
        <p class="card-message">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, ad.
          Numquam
          deserunt debitis animi
          soluta laborum asperiores facere voluptas
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, ad. Numquam
          deserunt debitis animi
          soluta laborum asperiores facere voluptas
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, ad. Numquam

          <div class="card-icons">
            <a class="like-icon" title="Like" href="#" onclick="alertFunction()">
              <i class="fa fa-thumbs-up "></i>
            </a>

            <span class="likes-count" title="Likes">111</span>
            <a class="reply-icon" title="Comment" href="" onclick="alertFunction()"><i class="fa fa-comment"></i></a>
            <a class="tags-icon" title="Tags" href="" onclick="alertFunction()"><i class="fa fa-tags"></i></a>&nbsp;
            <a class="tags-icon" title="Bookmark" href="" onclick="alertFunction()"><i class="fa fa-bookmark"
                aria-hidden="true"></i></a>

          </div>
      </fieldset>
    </div>
  </div>

  <a href="" onclick="topFunction()" id="myBtn" title="Back to top"><i class="fa fa-arrow-up"></i></a>
  <!-- <button onclick="topFunction()" id="myBtn" title="Go to top">Top</button> -->

  <!-- POST Card -->
  <div class="card">
    <!-- CARD Left -->
    <div class="card-left">
      <a class="card-left-title" href="#">User Name</i></a>
      <i class="fa fa-user fa-lg"></i>
      <span>Some sub-text</span>
    </div>
    <!-- CARD-Right -->
    <div class="right">


      <fieldset>
        <legend>
          <h3><a class="card-title" href="#">Test</a></h3>
        </legend>
        <p class="card-message">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, ad.
          Numquam
          deserunt debitis animi
          soluta laborum asperiores facere voluptas
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, ad. Numquam
          deserunt debitis animi
          soluta laborum asperiores facere voluptas
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, ad. Numquam
          deserunt debitis animi
          soluta laborum asperiores facere voluptassoluta laborum asperiores facere voluptas
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, ad. Numquam
          deserunt debitis animi
          soluta laborum asperiores facere voluptassoluta laborum asperiores facere voluptas
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, ad. Numquam
          deserunt debitis animi
          soluta laborum asperiores facere voluptas</p>

        <div class="card-icons">
          <a class="like-icon" title="Like" href=""> <i class="fa fa-thumbs-up"></i> </a>
          <span class="likes-count" title="Likes">111</span>
          <a class="reply-icon" title="Comment" href=""><i class="fa fa-comment"></i></a>
          <a class="tags-icon" title="Tags" href=""><i class="fa fa-tags"></i></a>&nbsp;
          <a title="Bookmark" href=""><i class="fa fa-bookmark" aria-hidden="true"></i></a>

        </div>
    </div>
  </div>
  </fieldset>


  <!-- POST Card -->
  <div class="card">
    <!-- CARD Left -->
    <div class="card-left">
      <a class="card-left-title" href="#">User Name</i></a>
      <i class="fa fa-user fa-lg"></i>
      <span>Some sub-text</span>
    </div>
    <!-- CARD-Right -->
    <div class="right">
      <h3><a class="card-title" href="#">Test</a></h3>

      <fieldset>
        <p class="card-message">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, ad.
          Numquam
          deserunt debitis animi
          soluta laborum asperiores facere voluptas
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, ad. Numquam
          deserunt debitis animi
          soluta laborum asperiores facere voluptas
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, ad. Numquam
          deserunt debitis animi
          soluta laborum asperiores facere voluptassoluta laborum asperiores facere voluptas
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, ad. Numquam
          deserunt debitis animi
          soluta laborum asperiores facere voluptassoluta laborum asperiores facere voluptas
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, ad. Numquam
          deserunt debitis animi
          soluta laborum asperiores facere voluptas</p>

        <div class="card-icons">
          <a class="like-icon" title="Like" href=""> <i class="fa fa-thumbs-up"></i> </a>
          <span class="likes-count" title="Likes">111</span>
          <a class="reply-icon" title="Comment" href=""><i class="fa fa-comment"></i></a>
          <a class="tags-icon" title="Tags" href=""><i class="fa fa-tags"></i></a>&nbsp;
          <a title="Bookmark" href=""><i class="fa fa-bookmark" aria-hidden="true"></i></a>
      </fieldset>

    </div>
  </div>
  </div>
  </div>


<script src="resources/1-Front-End/home/js/collapsible.js"></script>

</body>

</html>