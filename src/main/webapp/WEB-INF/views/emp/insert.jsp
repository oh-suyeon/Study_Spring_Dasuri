<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="body">
	
	<!-- Content Wrapper. Contains page content -->
  	<div class="content-wrapper">
		
		<!-- Content Header (Page header) -->
	    <div class="content-header">
	      <div class="container-fluid">
	        <div class="row mb-2">
	          <div class="col-sm-6">
	            <h1 class="m-0">직원 등록</h1>
	          </div><!-- /.col -->
	        </div><!-- /.row -->
	      </div><!-- /.container-fluid -->
	    </div>
	    <!-- /.content-header -->
		
		<!-- Main content -->
	    <section class="content">
	    	<div class="container-fluid">
				<div class="card card-primary">
	              <div class="card-header">
	                <h3 class="card-title">다수리 직원을 등록합니다.</h3>
	              </div>
	              <!-- /.card-header -->
	              <!-- form start -->
	              <form action="/emp/insert" method="post">
	                <div class="card-body">
	                  <div class="form-group">
	                    <label for="empNm">이름</label>
	                    <input type="text" class="form-control" name="empNm" id="empNm" placeholder="이름을 입력하세요">
	                  </div>
	                  
	                  <p style="margin-bottom: 8px; font-weight: bold;">우편 번호</p>
	                  <div class="input-group mb-3">
		                  <input type="text" class="form-control" name="zipcode" id="zipcode" placeholder="우편번호를 검색하세요">
		                  <div class="input-group-append">
		                    <button type="button" class="btn btn-default" onclick="searchZipcode();">
		                    	<i class="fas fa-search fa-fw"></i>검색
		                    </button>
		                  </div>
		              </div>
		              
	                  <div class="form-group">
	                    <label for="addr1">주소</label>
	                    <input type="text" class="form-control" name="addr1" id="addr1" placeholder="주소를 입력하세요">
	                  </div>
	                  
	                  <div class="form-group">
	                    <label for="addr2">상세 주소</label>
	                    <input type="text" class="form-control" name="addr2" id="addr2" placeholder="상세 주소를 입력하세요">
	                  </div>
	                  
	                  <div class="form-group">
	                    <label for="phoneNum">연락처</label>
	                    <input type="text" class="form-control" name="phoneNum" id="phoneNum" placeholder="연락처를 입력하세요">
	                  </div>
	                  
	                  <div class="form-group">
	                    <label for="salary">월급</label>
	                    <input type="number" class="form-control" name="salary" id="salary" placeholder="월급을 입력하세요">
	                  </div>
	                  
	                </div>
	                <!-- /.card-body -->
	                <div class="card-footer text-right">
	                  <button type="button" class="btn btn-primary" id="btnSubmit">등록</button>
	                  <button type="button" class="btn btn-default" onclick="location.href='/emp/list'">취소</button>
	                </div>
	              </form>
	            </div>
			</div>
		</section>
	
	</div>
	
</div>