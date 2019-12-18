<div class="card">

  <!-- CARD Left -->
  <div class="card-left">
    <a class="card-left-title" href="#">${requestScope.blog_username}</a>
    <i class="fa fa-user fa-lg"></i>
    <!-- <img src="https://switchfully.com/img/switchfully_small_logo.png"> -->
    <span>Some sub-text</span>
  </div>
  <!-- CARD-Right -->
  <div class="right">
    <fieldset>
      <legend>
        <h3><a class="card-title" href="#">${requestScope.blog_title}</a></h3>
      </legend>

      <p class="card-message">${requestScope.blog_message}</p>
      <div class="card-icons">
        <a class="like-icon" title="Like" href="#">
          <i class="fa fa-thumbs-up"></i>
        </a>

        <span class="likes-count" title="Likes">${requestScope.blog_likes}</span>
        <a class="reply-icon" title="Comment" href="" onclick="alertFunction()"><i class="fa fa-comment"></i></a>
        <a class="tags-icon" title="Tags" href="" onclick="alertFunction()"><i class="fa fa-tags"></i></a>&nbsp;
        <a class="tags-icon" title="Bookmark" href="" onclick="alertFunction()"><i class="fa fa-bookmark"
            aria-hidden="true"></i></a>

      </div>
    </fieldset>

    <ul id="comments" style="padding-left: 0px; padding-right: 20px;">
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

      <c:forEach items="${requestScope.blog_comments}" var="comment">
        <c:set var="comment" value="${comment}" scope="request" />
        <c:import url="../generalcomponents/commentwithcomments.jsp" />
      </c:forEach>
    </ul>

  </div>
</div>