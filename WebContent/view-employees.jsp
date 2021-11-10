<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/header.jsp"%>


<div class="content-wrapper">

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-12">
				<!-- Breadcrumbs-->
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="#">Dashboard</a></li>
					<li class="breadcrumb-item active">employees</li>
				</ol>
			</div>
		</div>

		<div class="row mb-1">
			<div class="col-4">
				<button title="add" class="btn btn-primary btn-sm"><i class="fa fa-plus-square-o mr-1"></i>Add Employee</button>
			</div>
			<div class="col-sm-8 ">
				<form class="ml-auto">
					<label class="sr-only">search</label> <input type="text"
						name="search" id="search"
						class="form-control form-control-sm col-4 ml-auto mr-5 " placeholder="search">
				</form>
			</div>
		</div>

		<!-- Employee table Card-->

		<div class="table-responsive">
			<table class="table table-hovered ">
				<thead>
					<tr>
						<th>#</th>
						<th>name</th>
						<th>email</th>
						<th>username</th>
						<th>emp_id</th>
						<th>Action</th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<td>1</td>
						<td>Galiwango Fahad</td>
						<td>wanfadger@gmail.com</td>
						<td>Wanfadger</td>
						<td>12eed</td>
						<td><a role="button" href="confirm-delete.jsp" class="btn btn-sm btn-danger">delete</a>
							<a role="button" href="update.jsp" class="btn btn-sm btn-warning">update</a>
						</td>
					</tr>
				</tbody>

			</table>
		</div>



	</div>



</div>
<!-- /.container-fluid-->
<!-- /.content-wrapper-->




<%@ include file="/footer.jsp"%>

