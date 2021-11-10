<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/header.jsp"%>

<div class="content-wrapper">
	<div class="container-fluid">
		<h4>Are u sure to update me</h4>


		<div class="card card-register mx-auto mt-5">
			<div class="card-header">Update Employee Details</div>
			<div class="card-body">
				<form>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">First name</label> <input
									class="form-control" id="exampleInputName" type="text"
									aria-describedby="nameHelp" placeholder="Enter first name">
							</div>
							<div class="col-md-6">
								<label for="exampleInputLastName">Last name</label> <input
									class="form-control" id="exampleInputLastName" type="text"
									aria-describedby="nameHelp" value=""
									style="border:none;
	border-bottom:1px solid black;boxshadow:none"
									>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Email address</label> <input
							class="form-control" id="exampleInputEmail1" type="email"
							aria-describedby="emailHelp" value="" >
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputPassword1">Password</label> <input
									class="form-control" id="exampleInputPassword1" type="password"
									value="" >
							</div>
							<!--  div class="col-md-6">
								<label for="exampleConfirmPassword">Confirm password</label> <input
									class="form-control" id="exampleConfirmPassword"
									type="password" placeholder="Confirm password">
							</div-->
						</div>
					</div>
					<a class="btn btn-primary btn-block" href="#">Update</a>
				</form>
				
			</div>
		</div>
	</div>
</div>


<%@ include file="/footer.jsp"%>
