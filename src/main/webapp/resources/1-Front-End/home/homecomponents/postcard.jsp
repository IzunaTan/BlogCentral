<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:forEach items="${blogsDynamic}" var="blogloaded">

      <c:set var="iteratedusername" value="${blogloaded.author.username}" />
      <c:set var="iteratedtitle" value="${blogloaded.title}" />
      <c:set var="iteratedlike" value="${blogloaded.likeCount}" />
      <c:set var="iteratedmessage" value="${blogloaded.message}" />
      <div class="card">

        <!-- CARD Left -->
        <div class="card-left">
          <a class="card-left-title" href="#">${iteratedusername}</a>
          <i class="fa fa-user fa-lg"></i>
          <!-- <img src="https://switchfully.com/img/switchfully_small_logo.png"> -->
          <span>Some sub-text</span>
        </div>
        <!-- CARD-Right -->
        <div class="right">
          <fieldset>
            <legend>
              <h3><a class="card-title" href="#">${iteratedtitle}</a></h3>
            </legend>

            <p class="card-message">
              ${iteratedmessage}
            </p>
            <div class="card-icons">
              <a class="like-icon" title="Like" href="#">
                <i class="fa fa-thumbs-up"></i>
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
    </c:forEach>