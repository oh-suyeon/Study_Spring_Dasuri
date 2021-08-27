<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
    .swiper-container {
      width: 100%;
      height: 50vh;
    }
    .swiper-slide {
      text-align: center;
      font-size: 18px;
      background: #fff;
      border: 1px solid silver;

      /* Center slide text vertically */
      display: -webkit-box;
      display: -ms-flexbox;
      display: -webkit-flex;
      display: flex;
      -webkit-box-pack: center;
      -ms-flex-pack: center;
      -webkit-justify-content: center;
      justify-content: center;
      -webkit-box-align: center;
      -ms-flex-align: center;
      -webkit-align-items: center;
      align-items: center;
    }

.swiper-container-vertical>.swiper-pagination-bullets{
    top: unset !important;
    bottom: 10px;
    left: 0;
    width: 100%;
}

.swiper-container-vertical>.swiper-pagination-bullets .swiper-pagination-bullet{
  display : inline-block !important;
  margin: 6px 2px !important;
}
</style>

<div id="body">


	<div class="content-wrapper">

		<div class="content-header">
			<div class="container-fluid">
				<div class="row mb-2">
					<div class="col-sm-6">
						<h1 class="m-0">swiper 테스트</h1>
					</div><!-- /.col -->
				</div><!-- /.row -->
			</div><!-- /.container-fluid -->
		</div><!-- /.content-header -->

		<!-- Main content -->
		<section class="content">
			<div class="container-fluid">
				<div class="card card-primary">
					<div class="card-header">
						<h3 class="card-title">슬라이드 라이브러리 swiper 테스트</h3>
					</div>
					<!-- /.card-header -->
					
					<div class="card-body">
						<div class="dataTables_wrapper dt-bootstrap4">
							<div class="row">
								<div class="col-sm-12 col-md-6"></div>
								<div class="col-sm-12 col-md-6"></div>
							</div>
							<div class="row">
								<div class="swiper-container">
								  <!-- 보여지는 영역 -->
								  <div class="swiper-wrapper">
								    <!-- div class="swiper-slide" 를 추가하면된다 -->
								    <div class="swiper-slide">Slide 1</div>
								    <div class="swiper-slide">Slide 2</div>
								    <div class="swiper-slide">Slide 3</div>
								  </div>
								  <!-- 페이징 버튼 처리 -->
								  <div class="swiper-pagination"></div>
								
								  <!-- 방향 버튼 상황에 따라 추가 삭제가능 -->
								  <div class="swiper-button-prev"></div>
								  <div class="swiper-button-next"></div>
								</div>
							</div>
						</div>
					</div>
					<!-- /.card-body -->
					
					<!-- card-footer -->
					<div class="card-footer">
					</div>
				</div>
			</div>
		</section>

	</div>

	

<script type="text/javascript">
	
	const swiper = new Swiper('.swiper-container', {
	  //기본 셋팅
	  //방향 셋팅 vertical 수직, horizontal 수평 설정이 없으면 수평
	  direction: 'horizontal',
	  //한번에 보여지는 페이지 숫자
	  slidesPerView: 3,
	  //페이지와 페이지 사이의 간격
	  spaceBetween: 30,
	  //드레그 기능 true 사용가능 false 사용불가
	  debugger: true,
	  //마우스 휠기능 true 사용가능 false 사용불가
	  mousewheel: true,
	  //반복 기능 true 사용가능 false 사용불가
	  loop: true,
	  //선택된 슬라이드를 중심으로 true 사용가능 false 사용불가 djqt
	  centeredSlides: true,
	  // 페이지 전환효과 slidesPerView효과와 같이 사용 불가
	  // effect: 'fade',
	  
	  
	  //자동 스크를링
	  autoplay: {
	    //시간 1000 이 1초
	    delay: 2500,
	    disableOnInteraction: false,
	   },
	  
	  //페이징
	  pagination: {
	    //페이지 기능
	    el: '.swiper-pagination',
	    //클릭 가능여부
	    clickable: true,
	  },

	  //방향표
	  navigation: {
	    //다음페이지 설정
	    nextEl: '.swiper-button-next',
	    //이전페이지 설정
	    prevEl: '.swiper-button-prev',
	  },
	  
	});

</script>
</div>
