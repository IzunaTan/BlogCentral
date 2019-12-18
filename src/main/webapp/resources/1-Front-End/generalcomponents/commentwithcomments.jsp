<li class="comment" style="padding-bottom: 15px">
  <div style="border: 2px solid; padding: 0.35em 0.75em 0.625em">
    <div class="avatar">
      <a href="#">
        <img src="https://www.phplivesupport.com/pics/icons/avatars/public/avatar_53.png" alt="Eva photo avatar"
          class="avatar__img">
      </a>
    </div>
    <div class="comment__content">
      <div>
        <a href="#">
          <span class="user__link">${requestScope.comment.author.username}</span>
        </a>
        <span class="comment__pub-date"> - posted 1 week ago</span>
        <a href="#" title="report abuse" class="comment__action"><i
            class="fa fa-exclamation-triangle comment__action--report-abuse" aria-hidden="true"></i></a>
      </div>
      <p>${requestScope.comment.message}</p>
      <footer class="comment__action--footer">
        <a href="#" title="like" class="comment__action">like</a>
        <a href="#" title="reply" class="comment__action">reply</a>
      </footer>
    </div>
  </div>
  <ul class="comment__replies">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <c:forEach items="${requestScope.comment.comments}" var="comment">
      <c:set var="comment" value="${comment}" scope="request" />
      <c:import url="../generalcomponents/commentwithcomments.jsp" />
    </c:forEach>
  </ul>
</li>