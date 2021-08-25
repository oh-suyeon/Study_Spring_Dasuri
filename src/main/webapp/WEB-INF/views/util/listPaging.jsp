<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="row">
	<div class="col-sm-12 col-md-5">
		<div class="dataTables_info" role="status" aria-live="polite">
			Showing ${pagingInfo.startNum} to ${pagingInfo.endNum} of ${pagingInfo.total} entries
		</div>
	</div>
	<div class="col-sm-12 col-md-7">
		<div class="dataTables_paginate paging_simple_numbers">
			<ul class="pagination">
				<li class="paginate_button page-item previous <c:if test="${paging.startPage==1}">disabled</c:if>">
					<a href="/${param.view}/list?currentPage=${paging.startPage - 5}&selSearch=${selSearch}&keyword=${keyword}" class="page-link">
						<i class="fas fa-angle-left"></i>
					</a>
				</li>
				<c:forEach var="pNo" begin="${paging.startPage}" end="${paging.endPage}" varStatus="stat">
					<li class="paginate_button page-item <c:if test="${param.currentPage==pNo || ((param.currentPage==null || param.currentPage=='') && pNo==1)}">active</c:if>">
						<a href="/${param.view}/list?currentPage=${pNo}&selSearch=${selSearch}&keyword=${keyword}" class="page-link">
							${pNo}
						</a>
					</li>
				</c:forEach>
				<li class="paginate_button page-item next <c:if test="${paging.endPage==paging.totalPages}">disabled</c:if>">
					<a href="/${param.view}/list?currentPage=${paging.startPage + 5}&selSearch=${selSearch}&keyword=${keyword}" class="page-link">
						<i class="fas fa-angle-right"></i>
					</a>
				</li>
			</ul>
		</div>
	</div>
</div>