<%--
  Created by IntelliJ IDEA.
  User: rockyyao
  Date: 2018/3/13
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
< xmlns="http://www.w3.org/1999/xhtml">
<html>
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
<div>

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


            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">

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
                    <form class="form-inline" action="${pageContext.request.contextPath }/searchPrintMachine" method="post">
                        <div class="form-group">
                            <label>选择你要打印的模板</label>
                            <select class="form-control" name="custIndustry">
                                <option value="">--请选择--</option>
                                <option value="TRW半成品标签" <c:if test="${type eq 'trw'}">selected</c:if>>TRW半成品标签</option>
                                <option value="汽车和工业件成品标签" <c:if test="${type eq 'car'}">selected</c:if>>汽车和工业件成品标签
                                </option>
                                <option value="汽车和工业件其他标签" <c:if test="${type eq 'car2'}">selected</c:if>>汽车和工业件其他标签
                                </option>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-primary">查询</button>
                        <span> <label>这个模板使用的打印机是：</label><label>${printname}</label></span>
                    </form>


                    <!-- /.panel-body -->
                </div>
            </div>


            <div class="panel panel-default">
                <div class="panel-body">
                    <form class="form-inline" action="${pageContext.request.contextPath }/findall.do" method="post">
                        <div class="form-group">
                            <label>选择你要更换的打印机</label>
                            <select class="form-control" name="custIndustry">
                                <option value="">--请选择--</option>
                                <option value="TRW半成品标签" <c:if test="${type eq 'trw'}">selected</c:if>>TRW半成品标签</option>
                                <option value="汽车和工业件成品标签" <c:if test="${type eq 'car'}">selected</c:if>>汽车和工业件成品标签
                                </option>
                                <option value="汽车和工业件其他标签" <c:if test="${type eq 'car2'}">selected</c:if>>汽车和工业件其他标签
                                </option>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-primary">更改</button>
                    </form>
                    <label>这个模板使用的打印机是：</label><input class="form-control" type="text" value=""/>
                    <!-- /.panel-body -->
                </div>
            </div>
            <!-- /.panel -->
            <!-- /.col-lg-12 -->
        </div>


        <!-- /#page-wrapper -->


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
                    type: "get",
                    url: "/customer/edit.action",
                    data: {"id": id},
                    success: function (data) {
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


            function labelp(workorder, qtysum, boxsum, boxno) {
                var selectValue = $('#custIndustry').val();

                var url = null;
                if (selectValue == 'TRW半成品标签') {
                    url = "printTrw.do";
                } else if (selectValue == '汽车和工业件成品标签') {
                    url = "printCar.do";
                } else if (selectValue == '汽车和工业件其他标签') {
                    url = "printCar2.do";
                }

                $.ajax({
                    url: url,
                    type: 'post',
                    async: true,
                    dataType: 'json',
                    data: {workorder: workorder, qtysum: qtysum, boxsum: boxsum, boxno: boxno},
                    success: function (data) {
                        alert(data);
                    }

                })

            }


            function seek() {
                var selectValue = $('#custIndustry').val();

                var url = null;
                if (selectValue == 'TRW半成品标签') {
                    url = "viewTrw.do";
                } else if (selectValue == '汽车和工业件成品标签') {
                    url = "viewCar.do";
                } else if (selectValue == '汽车和工业件其他标签') {
                    url = "viewCar2.do";
                }

                $.ajax({
                    url: url,
                    type: 'post',
                    async: true,
                    dataType: 'json',
                    data: {},
                    success: function (data) {
                        alert(data);
                    }

                })
            }

        </script>
    </div>
</div>

</body>

</html>
