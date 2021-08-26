<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="body">

	<div class="content-wrapper">

		<div class="content-header">
			<div class="container-fluid">
				<div class="row mb-2">
					<div class="col-sm-6">
						<h1 class="m-0">직원 목록</h1>
					</div><!-- /.col -->
				</div><!-- /.row -->
			</div><!-- /.container-fluid -->
		</div><!-- /.content-header -->

		<!-- Main content -->
		<section class="content">
			<div class="container-fluid">
				<div class="card card-primary">
					<div class="card-header">
						<h3 class="card-title">다수리 직원 목록을 조회합니다.</h3>
					</div>
					<!-- /.card-header -->
					
					<div class="card-body">
						<div class="dataTables_wrapper dt-bootstrap4">
							<div class="row">
								<div class="col-sm-12 col-md-6">
									<a class="btn btn-default" id="makePdf">
					                  <i class="fas fa-file-pdf"></i> PDF 내려받기
					                </a>
								</div>
								<div class="col-sm-12 col-md-6">
									<!-- 검색 -->
									<form action="/emp/list" method="get">
										<div id="searchBtn">
											<button type="submit" class="btn btn-default">검색</button>
										</div>
										<div id="searchInput">
											<input class="form-control" type="text" name="keyword" placeholder="검색어 입력" value="${keyword}"/>
										</div>
										<div id="searchSelect">
											<select class="form-control" name="category">
												<option value="all"   <c:if test="${category=='all'}"   >selected</c:if>>전체</option>
												<option value="empNum"<c:if test="${category=='empNum'}">selected</c:if>>직원 번호</option>
												<option value="empNm" <c:if test="${category=='empNm'}" >selected</c:if>>이름</option>
												<option value="addr"  <c:if test="${category=='addr'}"  >selected</c:if>>주소</option>
											</select>
										</div>
									</form><!--/ 검색 끝-->
								</div>
							</div>
							<div class="row">
								<div class="col-sm-12">
									<table class="table table-bordered table-hover dataTable dtr-inline" role="grid">
										<thead>
											<tr>
												<th>직원 번호</th>
												<th>직원 이름</th>
												<th>주소</th>
												<th>연락처</th>
												<th>월급</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach var="emp" items="${empList}">
												<tr onclick="location.href='/emp/detail?empNum=${emp.empNum}'" class="pointer">
													<td>${emp.empNum}</td>
													<td>${emp.empNm}</td>
													<td>[ ${emp.zipcode} ] ${emp.addr1} ${emp.addr2}</td>
													<td>${emp.phoneNum}</td>
													<td>${emp.salary}</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
							
							<!-- 페이징 처리 -->
							<c:set var="view" value="emp"/>
							<jsp:include page="/WEB-INF/views/util/listPaging.jsp">
								<jsp:param name="view" value="emp"/>
							</jsp:include><!-- /.페이징 처리 -->
							
						</div>
					</div>
					<!-- /.card-body -->
					
					<!-- card-footer -->
					<div class="card-footer text-right">
						<button type="button" class="btn btn-primary" onclick="location.href='/emp/insert'">등록</button>
					</div>
				</div>
			</div>
		</section>

	</div>

</div>