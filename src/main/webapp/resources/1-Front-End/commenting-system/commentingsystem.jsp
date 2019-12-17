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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/style.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/header.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/sidebar.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/1-Front-End/home/css/card_style.css" />
    <style>
        body {
            width: 100%;
            display: inline-block;
        }

        .box {
            display: flex;
            flex-direction: column;
            justify-content: center;
            /* padding-top: -90px; */
            padding-left: auto;
            padding-right: auto;
            margin-left: auto;
            margin-right: 50%;
        }

        .collapsible {
            visibility: hidden;
        }

        .collapse {
            margin-top: -1%;
        }

        .comments__form_form {
            padding-bottom: 20px;
        }
    </style>
</head>

<body>

    <header>
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
                    <a class="sign-in" href="/login/login.html">LOGIN &nbsp;<i class="fa fa-sign-in"
                            aria-hidden="true"></i></a>
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
    </div>s
    </header>
    <div>
        <a href="/home/index.html" title="Back Home"><i class="fa fa-home "></i></a>
    </div>
    <div id="comments-container">
        <div id="comment--new" class="comment">
            <div class="avatar comment__avatar">
                <span class="user">
                </span>
            </div>

            <a href="" onclick="topFunction()" id="myBtn" title="Back to top"><i class="fa fa-arrow-up"></i></a>

            <!-- POST Card -->
            <div class="box">
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
                            <p class="card-message">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci,
                                ad.
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

                                <form id="comment__form" class="comments__form_form">
                                    <textarea id="comment__textarea" placeholder="Join the discussion…" cols="30"
                                        rows="4" maxlength="132"></textarea>
                                </form>

                                <a class="like-icon" title="Like" href=""> <i class="fa fa-thumbs-up fa-lg"></i> </a>
                                <span class="likes-count" title="Likes">111</span>
                                <a class="reply-icon" title="Comment" href=""><i class="fa fa-comment fa-lg"></i></a>
                                <a class="tags-icon" title="Tags" href=""><i class="fa fa-tags fa-lg"></i></a>&nbsp;
                                <a title="Bookmark" href=""><i class="fa fa-bookmark fa-lg" aria-hidden="true"></i></a>
                                <button> Click me</button>
                        </fieldset>
                        <ul id="comments">
                            <li class="comment">
                                <div class="avatar">
                                    <a href="#">
                                        <img src="https://secure.gravatar.com/avatar/de764cb701641bd5ca3419fda6186edb?d=retro&s=55"
                                            alt="Ger photo avatar" class="avatar__img">
                                    </a>
                                </div>
                                <div class="comment__content">
                                    <!-- <header> -->
                                    <a href="#">
                                        <span class="user__link">Ger</span>
                                    </a>
                                    <span class="comment__pub-date"> - posted 1 week ago</span>
                                    <a href="#" title="report abuse" class="comment__action"><i
                                            class="fa fa-exclamation-triangle comment__action--report-abuse  fa-lg"
                                            aria-hidden="true"></i></a>
                                    <!-- </header> -->
                                    <p>
                                        Sed felis lorem, venenatis sed malesuada vitae, tempor vel turpis. Mauris in dui
                                        velit, vitae
                                        mollis
                                        risus.
                                    </p>
                                    <footer class="comment__action--footer">
                                        <a href="#" title="like" class="comment__action"> <i
                                                class="fa fa-thumbs-up fa-lg"></i></a>
                                        <a href="#" title="reply" class="comment__action"><i
                                                class="fa fa-comment"></i></a>
                                    </footer>
                                </div>
                                <ul class="comment__replies">
                                    <li class="comment">
                                        <div class="avatar">
                                            <a href="#">
                                                <img src="https://www.phplivesupport.com/pics/icons/avatars/public/avatar_53.png"
                                                    alt="Eva photo avatar" class="avatar__img">
                                            </a>
                                        </div>
                                        <div class="comment__content">
                                            <header>
                                                <a href="#">
                                                    <span class="user__link">Eva</span>
                                                </a>
                                                <span class="comment__pub-date"> - posted 1 week ago</span>
                                                <a href="#" title="report abuse" class="comment__action"><i
                                                        class="fa fa-exclamation-triangle comment__action--report-abuse"
                                                        aria-hidden="true"></i></a>
                                            </header>
                                            <p>
                                                Sed felis lorem, venenatis sed malesuada vitae, tempor vel turpis.
                                                Mauris in
                                                dui velit,
                                                vitae mollis
                                                risus.
                                            </p>
                                            <footer class="comment__action--footer">
                                                <a href="#" title="like" class="comment__action">like</a>
                                                <a href="#" title="reply" class="comment__action">reply</a>
                                            </footer>
                                        </div>
                                    </li>
                                    <li class="comment">
                                        <div class="avatar">
                                            <a href="#">
                                                <img src="http://numbersarelife.com/nal/wp-content/uploads/2012/10/youre-faking-55x55.jpg"
                                                    alt="Joe photo avatar" class="avatar__img">
                                            </a>
                                        </div>
                                        <div class="comment__content">
                                            <header>
                                                <a href="#">
                                                    <span class="user__link">Joe</span>
                                                </a>
                                                <span class="comment__pub-date"> - posted 1 week ago</span>
                                                <a href="#" title="report abuse" class="comment__action"><i
                                                        class="fa fa-exclamation-triangle comment__action--report-abuse"
                                                        aria-hidden="true"></i></a>
                                            </header>
                                            <p>
                                                Sed felis lorem, venenatis sed malesuada vitae, tempor vel turpis.
                                                Mauris in
                                                dui velit,
                                                vitae mollis
                                                risus.
                                            </p>
                                            <footer class="comment__action--footer">
                                                <a href="#" title="like" class="comment__action">like</a>
                                                <a href="#" title="reply" class="comment__action">reply</a>
                                            </footer>
                                        </div>
                                    </li>
                                    <li class="comment">
                                        <div class="avatar">
                                            <a href="#">
                                                <img src="https://www.phplivesupport.com/pics/icons/avatars/public/avatar_53.png"
                                                    alt="Eva photo avatar" class="avatar__img">
                                            </a>
                                        </div>
                                        <div class="comment__content">
                                            <header>
                                                <a href="#">
                                                    <span class="user__link">Eva</span>
                                                </a>
                                                <span class="comment__pub-date"> - posted 1 week ago</span>
                                                <a href="#" title="report abuse" class="comment__action"><i
                                                        class="fa fa-exclamation-triangle comment__action--report-abuse"
                                                        aria-hidden="true"></i></a>
                                            </header>
                                            <p>
                                                Sed felis lorem, venenatis sed malesuada vitae, tempor vel turpis.
                                                Mauris in
                                                dui velit,
                                                vitae mollis
                                                risus.
                                            </p>
                                            <footer class="comment__action--footer">
                                                <a href="#" title="like" class="comment__action">like</a>
                                                <a href="#" title="reply" class="comment__action">reply</a>
                                            </footer>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                            <li class="comment">
                                <div class="avatar">
                                    <a href="#">
                                        <img src="https://www.phplivesupport.com/pics/icons/avatars/public/avatar_53.png"
                                            alt="Eva photo avatar" class="avatar__img">
                                    </a>
                                </div>
                                <div class="comment__content">
                                    <header>
                                        <a href="#">
                                            <span class="user__link">Eva</span>
                                        </a>
                                        <span class="comment__pub-date"> - posted 1 week ago</span>
                                        <a href="#" title="report abuse" class="comment__action"><i
                                                class="fa fa-exclamation-triangle comment__action--report-abuse"
                                                aria-hidden="true"></i></a>
                                    </header>
                                    <p>
                                        Sed felis lorem, venenatis sed malesuada vitae, tempor vel turpis. Mauris in dui
                                        velit, vitae
                                        mollis
                                        risus.
                                    </p>
                                    <footer class="comment__action--footer">
                                        <a href="#" title="like" class="comment__action">like</a>
                                        <a href="#" title="reply" class="comment__action">reply</a>
                                    </footer>
                                </div>
                            </li>
                        </ul>

                    </div>
                </div>
            </div>
        </div> -->

    </div>

</body>