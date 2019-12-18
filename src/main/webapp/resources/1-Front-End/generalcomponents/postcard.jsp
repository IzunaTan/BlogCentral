<div class="card">

  <!-- CARD Left -->
  <div class="card-left">
    <a class="card-left-title" href="#"><%=request.getParameter("username")%></a>
    <i class="fa fa-user fa-lg"></i>
    <!-- <img src="https://switchfully.com/img/switchfully_small_logo.png"> -->
    <span>Some sub-text</span>
  </div>
  <!-- CARD-Right -->
  <div class="right">
    <fieldset>
      <legend>
        <h3><a class="card-title" href="#"><%=request.getParameter("title")%></a></h3>
      </legend>

      <p class="card-message"><%=request.getParameter("message")%></p>
      <div class="card-icons">
        <a class="like-icon" title="Like" href="#">
          <i class="fa fa-thumbs-up"></i>
        </a>

        <span class="likes-count" title="Likes"><%=request.getParameter("likes")%></span>
        <a class="reply-icon" title="Comment" href="" onclick="alertFunction()"><i class="fa fa-comment"></i></a>
        <a class="tags-icon" title="Tags" href="" onclick="alertFunction()"><i class="fa fa-tags"></i></a>&nbsp;
        <a class="tags-icon" title="Bookmark" href="" onclick="alertFunction()"><i class="fa fa-bookmark"
            aria-hidden="true"></i></a>

      </div>
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
          <div>
            <a href="#">
              <span class="user__link">Ger</span>
            </a>
            <span class="comment__pub-date"> - posted 1 week ago</span>
            <a href="#" title="report abuse" class="comment__action"><i
                class="fa fa-exclamation-triangle comment__action--report-abuse  fa-lg" aria-hidden="true"></i></a>
          </div>
          <p>
            Sed felis lorem, venenatis sed malesuada vitae, tempor vel turpis. Mauris in dui
            velit, vitae
            mollis
            risus.
          </p>
          <footer class="comment__action--footer">
            <a href="#" title="like" class="comment__action"> <i class="fa fa-thumbs-up fa-lg"></i></a>
            <a href="#" title="reply" class="comment__action"><i class="fa fa-comment"></i></a>
          </footer>
        </div>
        <ul class="comment__replies">
          <li class="comment">
            <div class="avatar">
              <a href="#">
                <img src="https://www.phplivesupport.com/pics/icons/avatars/public/avatar_53.png" alt="Eva photo avatar"
                  class="avatar__img">
              </a>
            </div>
            <div class="comment__content">
              <div>
                <a href="#">
                  <span class="user__link">Eva</span>
                </a>
                <span class="comment__pub-date"> - posted 1 week ago</span>
                <a href="#" title="report abuse" class="comment__action"><i
                    class="fa fa-exclamation-triangle comment__action--report-abuse" aria-hidden="true"></i></a>
              </div>
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
              <div>
                <a href="#">
                  <span class="user__link">Joe</span>
                </a>
                <span class="comment__pub-date"> - posted 1 week ago</span>
                <a href="#" title="report abuse" class="comment__action"><i
                    class="fa fa-exclamation-triangle comment__action--report-abuse" aria-hidden="true"></i></a>
              </div>
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
                <img src="https://www.phplivesupport.com/pics/icons/avatars/public/avatar_53.png" alt="Eva photo avatar"
                  class="avatar__img">
              </a>
            </div>
            <div class="comment__content">
              <div>
                <a href="#">
                  <span class="user__link">Eva</span>
                </a>
                <span class="comment__pub-date"> - posted 1 week ago</span>
                <a href="#" title="report abuse" class="comment__action"><i
                    class="fa fa-exclamation-triangle comment__action--report-abuse" aria-hidden="true"></i></a>
              </div>
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
            <img src="https://www.phplivesupport.com/pics/icons/avatars/public/avatar_53.png" alt="Eva photo avatar"
              class="avatar__img">
          </a>
        </div>
        <div class="comment__content">
          <div>
            <a href="#">
              <span class="user__link">Eva</span>
            </a>
            <span class="comment__pub-date"> - posted 1 week ago</span>
            <a href="#" title="report abuse" class="comment__action"><i
                class="fa fa-exclamation-triangle comment__action--report-abuse" aria-hidden="true"></i></a>
          </div>
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