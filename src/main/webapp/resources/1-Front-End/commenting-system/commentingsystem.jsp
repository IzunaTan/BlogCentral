<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Commenting System</title>
    <meta name="viewport" content="width=device-width">
    <link rel="icon" type="image/png" href="http://www.favicon.cc/logo3d/430212.png" />
    <!--===============================================================================================-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"
        integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css"
        href="${pageContext.request.contextPath}/resources/1-Front-End/commenting-system/css/commenting-system.css">


</head>

<body>
    <h1>Commenting System</h1>

    <div id="comments-container">



        <a class="home-icon" href="/home/index.html" title="Back Home"><i class="fa fa-home fa-lg"></i></a>

        <section id="comment--new" class="comment">
            <div class="avatar comment__avatar">
                <span class="user">
                    <img src="images/default.png" alt="Avatar" class="avatar__img">
                </span>
            </div>
            <form id="comment__form">
                <textarea id="comment__textarea" placeholder="Join the discussion…" cols="30" rows="4"
                    maxlength="132"></textarea>
                <button type="submit" id="comment--send">Comment</button>


            </form>
        </section>
        <ul id="comments">
            <li class="comment">
                <div class="avatar">
                    <a href="#">
                        <img src="https://secure.gravatar.com/avatar/de764cb701641bd5ca3419fda6186edb?d=retro&s=55"
                            alt="Ger photo avatar" class="avatar__img">
                    </a>
                </div>
                <div class="comment__content">
                    <header>
                        <a href="#">
                            <span class="user__link">Ger</span>
                        </a>
                        <span class="comment__pub-date"> - posted 1 week ago</span>
                        <a href="#" title="report abuse" class="comment__action"><i
                                class="fa fa-exclamation-triangle comment__action--report-abuse"
                                aria-hidden="true"></i></a>
                    </header>
                    <p>
                        Sed felis lorem, venenatis sed malesuada vitae, tempor vel turpis. Mauris in dui velit, vitae
                        mollis
                        risus.
                    </p>
                    <footer class="comment__action--footer">
                        <a href="#" title="like" class="comment__action"> <i class="fa fa-thumbs-up"></i></a>
                        <a href="#" title="reply" class="comment__action"><i class="fa fa-comment"></i></a>
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
                                Sed felis lorem, venenatis sed malesuada vitae, tempor vel turpis. Mauris in dui velit,
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
                                Sed felis lorem, venenatis sed malesuada vitae, tempor vel turpis. Mauris in dui velit,
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
                                Sed felis lorem, venenatis sed malesuada vitae, tempor vel turpis. Mauris in dui velit,
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
                        Sed felis lorem, venenatis sed malesuada vitae, tempor vel turpis. Mauris in dui velit, vitae
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

</body>

</html>