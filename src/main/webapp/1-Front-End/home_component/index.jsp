<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <!-- <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;" /> -->
  <meta http-equiv="X-UA-Compatible" content="ie=edge" />
  <link href="https://fonts.googleapis.com/css?family=Yeon+Sung&display=swap" rel="stylesheet" />
  <link href="https://fonts.googleapis.com/css?family=McLaren|Yeon+Sung&display=swap" rel="stylesheet" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="css/normalize.css" />
  <link rel="stylesheet" href="css/style.css" />
  <link rel="stylesheet" href="css/header.css" />
  <link rel="stylesheet" href="css/sortBtn.css" />
  <link rel="stylesheet" href="css/sidebar.css" />

  <title>Layout</title>
</head>

<body>
  <header class="section">
    <div class="container">
      <div class="header-top">
        <h1><a href="Logo">BlogCentral</a></h1>
        <a href="sign-in">SIGN IN</a>
        <!-- <a href="sign-in">LOGIN</a> -->

        <!-- <a style="float: right;" href="register">Register</a> -->
      </div>

      <!-- <nav style="float: right;" class="header-bottom">
        <a href="register">Register</a>
      </nav> -->
    </div>
  </header>



  <main class="grid-container">

    <!-- SIDEBAR -->
    <div class="sidebar">
      <div class="sidebar-item">Online Users</div>
      <div class="sidebar-item">Total Users</div>
      <div class="sidebar-item">Total Visits</div>
    </div>

    <div class="section">
      <!-- SORT HEADER -->
      <div class="main">
        <!-- <span>
          Age: <select name="age">
            <option value="1">&lt; 1 year old</option>
            <option value="99">1 to 99 years old</option>
            <option value="100">&gt; 99</option>
          </select>
        </span> -->



        <div class="menu">
          <li><a href="#">POPULAR</a></li>
          <li><a href="#">LATEST</a></li>
          <li><a href="#">ELDEST</a></li>
        </div>
      </div>

      <!-- CONTAINER -->
      <div class="container">
        <div class="row">
          <div class="col">
            <div class="box">
              <fieldset>
                <legend>Blog title</legend>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Sed voluptatum excepturi quasi deserunt hic
                  quos? Esse ratione
                  <br />
                  <br />
                  <button class="like"">Like <i class=" fa fa-heart-o"></i>

              </fieldset>
            </div>
          </div>
          <div class="col">
            <div class="box">
              Lorem ipsum blabla
            </div>
          </div>
        </div>

        <div class="row">
          <div class="col">
            <div class="box">
              <div class="card">
                <!-- <img src="./images/steak.jpg" /> -->
                <p>
                  Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the
                  industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type
                  and
                  scrambled it to make a type specimen book. It has survived not only five centuries, but also the
                  leap
                </p>
                <button class="like">Like <i class="fa fa-heart-o"></i>
              </div>
            </div>
          </div>
          <div class="col">
            <div class="box">
              Lorem ipsum blabla
            </div>
          </div>
        </div>

        <div class="row">
          <div class="col">
            <div class="box">
              Lorem ipsum blabla rgzegrzggr Lorem ipsum dolor sit amet consectetur adipisicing elit. Aperiam iste ipsam
              temporibus sint quas ethgethgetagfrthjzrhzerthzsthg
            </div>
          </div>
          <div class="col">
            <div class="box">
              Lorem ipsum blabla
            </div>
          </div>
        </div>
      </div>
    </div>

  </main>
</body>

</html>