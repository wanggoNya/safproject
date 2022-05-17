<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>스트릿애니멀파인더</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/mainpage/main.css'>
    <script src='${pageContext.request.contextPath}/mainpage/main.js'></script>
    <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
 
</head>
<body>
  <jsp:include page="/header/header.jsp"/>
    <div id="header"></div>
    <div id="headers"></div>
    <section class="announcement_container">
        <div class="announcement">
            <div class="announce" style="width: 100%;">
                <!-- <ul class="nav_bar">
                    <li class="nav_item">
                        <a href="">공지사항</a>
                    </li>
                    <li class="nav_item">
                        <a href="">보도자료</a>
                    </li>
                    <li class="nav_item">
                        <a href="">자료실</a>
                    </li>
                    <li class="nav_item">
                        <a href="">실시간이슈참여</a>
                    </li>
                </ul> -->
                <div class="contents">
                    <div class="content">
                        <p>
                            <a href="">인수위 게시물의 허위사실 유포에 대해 사실관계...</a>
                        </p>
                        <hr class="bottom_line">
                        <p>
                            <a href="">인수위 게시물의 허위사실 유포에 대해 사실관계...</a>
                        </p>
                        <hr class="bottom_line">
                        <p>
                            <a href="">인수위 게시물의 허위사실 유포에 대해 사실관계...</a>
                        </p>
                        <hr class="bottom_line">
                        <p>
                            <a href="">인수위 게시물의 허위사실 유포에 대해 사실관계...</a>
                        </p>
                        <hr class="bottom_line">
                    </div>
                </div>
            </div>
            <!-- <div class="notice_wrap">
                <div class="slideshow-container">
                    <div class="mySlides fade">
                        <a href="#"><img src="1.jpg" style="width:100%; height:280px"></a>
                    </div>
                        
                    <div class="mySlides fade">
                        <a href="#"><img src="2.png" style="width:100%; height:280px"></a>
                    </div>
                </div>
                <div style="text-align:center">
                    <span class="dot"></span> 
                    <span class="dot"></span> 
                    <span class="dot"></span> 
                </div>
            </div> -->
        </div>
    </section>

    <section class="make_change" style="background-color: #FDFFA9;">
        <div class="ch_tit">
            <p>함께 만드는 변화</p>
            <div class="row">
                <div class="col">
                    <div class="info">
                        <a href="#">
                            <span class="block0">녹두</span>
                            <span class="block1">개(진도)</span>
                            <span class="block2">
                                암컷 (중성화) <br>
                                6살 6개월 / 25.0kg / 화이트
                            </span>
                        </a>
                    </div>

                </div>
                <div class="col">
                    <div class="info">
                        <a href="#">
                            <span class="block0">또자</span>
                            <span class="block1">개(믹스)</span>
                            <span class="block2">
                                암컷(중성화X) <br>
                                5개월 / 5.5kg / 화이트
                            </span>
                        </a>
                    </div>

                    
                </div>
                <div class="col">
                    <div class="info">
                        <a href="#">
                            <span class="block0">미일</span>
                            <span class="block1">개(진도)</span>
                            <span class="block2">
                                암컷(중성화 O) <br>
                                6살 6개월 / 20.0kg / 화이트
                            </span>
                        </a>
                    </div>
                    
                </div>
            </div>
        </div>

        <div class="subs_container">
            <a href="${pageContext.request.contextPath}/lostpet/LostPet.jsp" class="subs_btn" style="background-color: #6AAAE4;">실종동물 더 찾아보기</a>
        </div>
    </section>
    <div id="footer"></div>
    <script>
        var slideIndex = 0;
        showSlides();
        showSlides2();
    
        function showSlides() {
            var i;
            var slides = document.getElementsByClassName("mySlides");
            var dots = document.getElementsByClassName("dot");
            for (i = 0; i < slides.length; i++) {
                slides[i].style.display = "none";
            }
            slideIndex++;
            if (slideIndex > slides.length) { slideIndex = 1 }
            for (i = 0; i < dots.length; i++) {
                dots[i].className = dots[i].className.replace(" active", "");
            }
            slides[slideIndex - 1].style.display = "block";
            dots[slideIndex - 1].className += " active";
            setTimeout(showSlides, 2000); // Change image every 2 seconds
        }

        function showSlides2() {
            var i;
            var slides = document.getElementsByClassName("mySlides2");
            var dots = document.getElementsByClassName("dot2");
            for (i = 0; i < slides.length; i++) {
                slides[i].style.display = "none";
            }
            slideIndex++;
            if (slideIndex > slides.length) { slideIndex = 1 }
            for (i = 0; i < dots.length; i++) {
                dots[i].className = dots[i].className.replace(" active", "");
            }
            slides[slideIndex - 1].style.display = "block";
            dots[slideIndex - 1].className += " active";
            setTimeout(showSlides2, 2000); // Change image every 2 seconds
        }

    </script>
      <jsp:include page="/footer/footer.jsp"/>
    
</body>
</html>