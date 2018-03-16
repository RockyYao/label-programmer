<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>注塑一期标签打印</title>

<!-- Bootstrap Core CSS -->
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet">

<!-- DataTables CSS -->
<link href="<%=basePath%>css/dataTables.bootstrap.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="<%=basePath%>css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link href="<%=basePath%>css/boot-crm.css" rel="stylesheet"
	type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.html">注塑一期标签打印</a>
		</div>
		<!-- /.navbar-header -->

	<%--	<ul class="nav navbar-top-links navbar-right">
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> <i class="fa fa-envelope fa-fw"></i>
					<i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-messages">
					<li><a href="#">
							<div>
								<strong></strong> <span class="pull-right text-muted">
									<em></em>
								</span>
							</div>
							<div></div>
					</a></li>
					<li class="divider"></li>
					<li><a class="text-center" href="#"> <strong></strong>
							<i class="fa fa-angle-right"></i>
					</a></li>
				</ul> <!-- /.dropdown-messages --></li>
			<!-- /.dropdown -->
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> <i class="fa fa-tasks fa-fw"></i>
					<i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-tasks">
					<li><a href="#">
							<div>
								<p>
									<strong></strong> <span class="pull-right text-muted"></span>
								</p>
								<div class="progress progress-striped active">
									<div class="progress-bar progress-bar-success"
										role="progressbar" aria-valuenow="40" aria-valuemin="0"
										aria-valuemax="100" style="width: 40%">
										<span class="sr-only"></span>
									</div>
								</div>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<p>
									<strong> </strong> <span class="pull-right text-muted">%</span>
								</p>
								<div class="progress progress-striped active">
									<div class="progress-bar progress-bar-info" role="progressbar"
										aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
										style="width: 20%">
										<span class="sr-only"></span>
									</div>
								</div>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a class="text-center" href="#"> <strong></strong>
							<i class="fa fa-angle-right"></i>
					</a></li>
				</ul> <!-- /.dropdown-tasks --></li>
			<!-- /.dropdown -->
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> <i class="fa fa-bell fa-fw"></i>
					<i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-alerts">
					<li><a href="#">
							<div>
								<i class="fa fa-comment fa-fw"></i> </span>
									class="pull-right text-muted small"></span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<i class="fa fa-envelope fa-fw"></i>  <span
									class="pull-right text-muted small"></span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<i class="fa fa-tasks fa-fw"></i>  <span
									class="pull-right text-muted small"></span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<i class="fa fa-upload fa-fw"></i>  <span
									class="pull-right text-muted small"></span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a class="text-center" href="#"> <strong></strong>
							<i class="fa fa-angle-right"></i>
					</a></li>
				</ul> <!-- /.dropdown-alerts --></li>
			<!-- /.dropdown -->
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
					<i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-user">
					<li><a href="#"><i class="fa fa-user fa-fw"></i> </a></li>
					<li><a href="#"><i class="fa fa-gear fa-fw"></i> </a></li>
					<li class="divider"></li>
					<li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>
							</a></li>
				</ul> <!-- /.dropdown-user --></li>
			<!-- /.dropdown -->
		</ul>--%>
		<!-- /.navbar-top-links -->

		<div class="navbar-default sidebar" role="navigation">
			<div class="sidebar-nav navbar-collapse">
				<ul class="nav" id="side-menu">
					<%--<li class="sidebar-search">
						<div class="input-group custom-search-form">
							<input type="text" class="form-control" placeholder="查询内容...">
							<span class="input-group-btn">
								<button class="btn btn-default" type="button">
									<i class="fa fa-search" style="padding: 3px 0 3px 0;"></i>
								</button>
							</span>
						</div> <!-- /input-group -->
					</li>--%>
					<li><a href="customer.action" class="active"><i
							class="fa fa-edit fa-fw"></i>标签打印</a>
					</li>
						<li><a href="config.do" class="active"><i class="fa fa-edit fa-fw"></i>标签与打印机配置</a></li>

				</ul>
			</div>
			<!-- /.sidebar-collapse -->
		</div>
		<!-- /.navbar-static-side --> </nav>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">注塑一期标签打印</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="panel panel-default">
				<div class="panel-body">
					<form class="form-inline" action="${pageContext.request.contextPath }/findall.do" method="post">
						<div class="form-group">
							<label>请输入工单</label>
							<input type="text" class="form-control" id="workorder" name="workorder">
						</div>
						<%--<div class="form-group">
							<label for="customerFrom">客户来源</label> 
							<select	class="form-control" id="customerFrom" placeholder="客户来源" name="custSource">
								<option value="">--请选择--</option>
								<c:forEach items="${fromType}" var="item">
									<option value="${item.dict_id}"<c:if test="${item.dict_id == custSource}"> selected</c:if>>${item.dict_item_name }</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<label for="custIndustry">所属行业</label> 
							<select	class="form-control" id="custIndustry"  name="custIndustry">
								<option value="">--请选择--</option>
								<c:forEach items="${industryType}" var="item">
									<option value="${item.dict_id}"<c:if test="${item.dict_id == custIndustry}"> selected</c:if>>${item.dict_item_name }</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<label for="custLevel">客户级别</label>
							<select	class="form-control" id="custLevel" name="custLevel">
								<option value="">--请选择--</option>
								<c:forEach items="${levelType}" var="item">
									<option value="${item.dict_id}"<c:if test="${item.dict_id == custLevel}"> selected</c:if>>${item.dict_item_name }</option>
								</c:forEach>
							</select>
						</div>--%>
						<div class="form-group">
							<label for="custIndustry">标签种类</label>
							<select	class="form-control" id="custIndustry"  name="custIndustry" >
								<option value="">--请选择--</option>
								<option value="TRW半成品标签" <c:if test="${type eq 'trw'}">selected</c:if>>TRW半成品标签</option>
								<option value="汽车和工业件成品标签"<c:if test="${type eq 'car'}">selected</c:if>>汽车和工业件成品标签</option>
								<option value="汽车和工业件其他标签" <c:if test="${type eq 'car2'}">selected</c:if>>汽车和工业件其他标签</option>
							</select>
						</div>
						<button type="submit" class="btn btn-primary">查询</button>
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">工单信息</div>
						<!-- /.panel-heading -->

						<table class="table table-bordered table-striped" >
							<thead>
								<tr>
									<!--汽车工业件成品 -->
									<th >收货方</th>
									<th >物料名称</th>
									<th >供应商物料编号</th>

									<!-- TRW-->
									<th >SAP物料编号</th>
									<th >模具编号</th>
									<th >产品名称</th>
									<th >生产批号</th>
									<th >产品编号</th>
									<th >版本</th>
									<th >产品数量</th>

									<th>箱型</th>
									<th>箱号</th>
									<th>总箱数</th>
									<th >操作</th>
								</tr>
							</thead>
							<!--汽车工业件成品 -->
							<c:forEach items="${list}" var="label">
							<tr>
								<td >${label.customername}</td>
								<td >${label.materialname}</td>
								<td >${label.materialno}</td>

								<!-- TRW-->

								<td >${label.sapmaterialno}</td>
								<td >${label.modelno}</td>
								<td >${label.productname}</td>
								<td >${label.sapmaterialbatchno}</td>
								<td >${label.productno}</td>
								<td >${label.versionindex}</td>
								<td >${label.qtysum}</td>

								<td>${label.boxszie}</td>
								<td>${label.boxno}</td>
								<td>${label.boxsum}</td>
								<td>
									<a href="javascript:void(0)" class="btn btn-primary btn-xs" <%--data-toggle="modal" data-target="#customerEditDialog"--%>  onclick = "labelp(${label.workorder},${label.qtysum},${label.boxsum},${label.boxno})">打印</a>
									<a href="javascript:void(0)" class="btn btn-danger btn-xs" onclick="seek(${label.workorder},${label.qtysum},${label.boxsum},${label.boxno})">预览</a>
								</td>
							</tr>
							</c:forEach>

						</table>
						<div class="col-md-12 text-right">
							<itheima:page url="${pageContext.request.contextPath }/customer/list.action" />
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
		</div>
		<!-- /#page-wrapper -->

	</div>


	<!-- jQuery -->
	<script src="<%=basePath%>js/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="<%=basePath%>js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=basePath%>js/metisMenu.min.js"></script>

	<!-- DataTables JavaScript -->
	<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="<%=basePath%>js/sb-admin-2.js"></script>
	
	<script type="text/javascript">
		function editCustomer(id) {
			$.ajax({
				type:"get",
				url:"/customer/edit.action",
				data:{"id":id},
				success:function(data) {  
					$("#edit_cust_id").val(data.cust_id);
					$("#edit_customerName").val(data.cust_name);
					$("#edit_customerFrom").val(data.cust_source)
					$("#edit_custIndustry").val(data.cust_industry)
					$("#edit_custLevel").val(data.cust_level)
					$("#edit_linkMan").val(data.cust_linkman);
					$("#edit_phone").val(data.cust_phone);
					$("#edit_mobile").val(data.cust_mobile);
					$("#edit_zipcode").val(data.cust_zipcode);
					$("#edit_address").val(data.cust_address);
					
				}
			});
		}


		function labelp(workorder,qtysum,boxsum,boxno) {
            var selectValue=$('#custIndustry').val();

            var url=null;
            if(selectValue == 'TRW半成品标签'){
                url="printTrw.do";
			}else if (selectValue=='汽车和工业件成品标签'){
                url="printCar.do";
			}else if (selectValue=='汽车和工业件其他标签'){
			    url="printCar2.do";
			}

			$.ajax({
				url:url,
				type:'post',
				async:true,
				dataType:'json',
				data:{workorder:workorder,qtysum:qtysum,boxsum:boxsum,boxno:boxno},
				success:function (data) {
					alert(data);
                }

			})

        }

        function seek(workorder,qtysum,boxsum,boxno) {
            var selectValue=$('#custIndustry').val();

            var url=null;
            if(selectValue == 'TRW半成品标签'){
                url="viewTrw.do";
            }else if (selectValue=='汽车和工业件成品标签'){
                url="viewCar.do";
            }else if (selectValue=='汽车和工业件其他标签'){
                url="viewCar2.do";
            }

            $.ajax({
                url:url,
                type:'post',
                async:true,
                dataType:'json',
                data:{workorder:workorder,qtysum:qtysum,boxsum:boxsum,boxno:boxno},
                success:function (data) {
                    alert(data);
                }

            })
        }
        
        /*
        function seek() {
			
        }*/
	/*	function Handover() {
			var selectValue=$('#custIndustry').val();

			if (selectValue =="汽车和工业件成品标签"){
                $('.trw').hide();
                $('.Car').show();
			} else if(selectValue =="汽车和工业件其他标签")
			{
                $('#this_td').show();
			}else if (selectValue=="TRW半成品标签"){
			  $('.Car').hide();
			  $('.trw').show();
			}

        }*/

	</script>

</body>

</html>
