<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>MeuCaixa.Mobi</title>
    
    <!-- Bootstrap Core CSS -->
    <link href="../static/startbootstrap/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../static/startbootstrap/bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- DataTables CSS -->
    <link href="../static/startbootstrap/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="../static/startbootstrap/bower_components/datatables-responsive/css/dataTables.responsive.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../static/startbootstrap/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../static/startbootstrap/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
    <div id="wrapper">
		<%@include file="../menu.jsp" %>
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Usuário</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>            
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Listagem de usuário
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                        	<c:if test="${success ne null}">
								<div class="alert alert-success lead">
							    	${success}
								</div>
                        	</c:if>
                        	<c:if test="${warning ne null}">
								<div class="alert alert-warning lead">
							    	${warning}
								</div>
                        	</c:if>                        	
                            <div>
								<sec:authorize access="hasRole('ADMIN')">
									<a class="btn btn-primary" href="<c:url value='/user/newuser' />">Cadastrar novo</a>
							 	</sec:authorize>
                            </div>
							<br/>
                            <div class="dataTable_wrapper">
                                <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-lista">
                                    <thead>
							      		<tr>
									        <th>Nome</th>
									        <th>Sobrenome</th>
									        <th>Email</th>
									        <th>Login</th>
									        <sec:authorize access="hasRole('ADMIN') or hasRole('DBA')">
									        	<th width="50" style="text-align:center"></th>
									        </sec:authorize>
										</tr>
                                    </thead>
                                    <tbody>
										<c:forEach items="${users}" var="user">
											<tr class="odd gradeX">
												<td>${user.firstName}</td>
												<td>${user.lastName}</td>
												<td>${user.email}</td>
												<td>${user.ssoId}</td>
												<td width="50" style="text-align:center">
												    <sec:authorize access="hasRole('ADMIN') or hasRole('DBA')">
														<a href="<c:url value='/user/edit-user-${user.ssoId}' />" class="btn btn-success btn-circle"><i class="fa fa-edit"></i></a>
							        				</sec:authorize>
											        <sec:authorize access="hasRole('ADMIN')">
													    <a href="#" 
													    	class="btn btn-danger btn-circle"
													    	data-href="<c:url value='/user/delete-user-${user.ssoId}' />" 
													    	data-toggle="modal" 
													    	data-target="#confirm-delete">
													    	<i class="fa fa-times"></i>
													    </a>
							        				</sec:authorize>
												</td>
											</tr>
										</c:forEach>                                        
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
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
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="../static/startbootstrap/bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../static/startbootstrap/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../static/startbootstrap/bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- DataTables JavaScript -->
    <script src="../static/startbootstrap/bower_components/datatables/media/js/jquery.dataTables.min.js"></script>
    <script src="../static/startbootstrap/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>
    <script src="../static/startbootstrap/bower_components/datatables-responsive/js/dataTables.responsive.js"></script>
    
    <!-- Custom Theme JavaScript -->
    <script src="../static/startbootstrap/dist/js/sb-admin-2.js"></script>

<%@include file="../footer.jsp" %>
</body>

</html>
