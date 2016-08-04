<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
                    <h1 class="page-header">Usu�rio</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de usu�rio
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="user" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="id" id="id"/>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Nome:</label>
									<div class="col-sm-8">
										<form:input type="text" path="firstName" id="firstName" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="firstName" class="label label-danger"/>
	                                    </div>
									</div>
								</div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label" for="inline-suggestions">Sobrenome:</label>
									<div class="col-sm-8">
	                                    <form:input type="text" path="lastName" id="lastName" class="form-control input-sm" />
	                                    <div class="has-error">
	                                        <form:errors path="lastName" class="label label-danger"/>
	                                    </div>
	                                </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label" for="inline-suggestions">Login:</label>
									<div class="col-sm-8">
	                                    <c:choose>
	                                        <c:when test="${edit}">
	                                            <form:input type="text" path="ssoId" id="ssoId" class="form-control" disabled="true"/>
	                                        </c:when>
	                                        <c:otherwise>
	                                            <form:input type="text" path="ssoId" id="ssoId" class="form-control" />
	                                            <div class="has-error">
	                                                <form:errors path="ssoId" class="label label-danger"/>
	                                            </div>
	                                        </c:otherwise>
	                                    </c:choose>
	                                 </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label" for="inline-suggestions">Senha:</label>
									<div class="col-sm-8">
	                                    <form:input type="password" path="password" id="password" class="form-control" />
	                                    <div class="has-error">
	                                        <form:errors path="password" class="label label-danger"/>
	                                    </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label" for="inline-suggestions">Email:</label>
									<div class="col-sm-8">
	                                    <form:input type="text" path="email" id="email" class="form-control" />
	                                    <div class="has-error">
	                                        <form:errors path="email" class="label label-danger"/>
	                                    </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label" for="inline-suggestions">Database:</label>
									<div class="col-sm-8">
	                                    <form:input type="text" path="banco" id="banco" class="form-control" />
	                                    <div class="has-error">
	                                        <form:errors path="banco" class="label label-danger"/>
	                                    </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label" for="inline-suggestions">Acessos:</label>
                                    <div class="col-sm-8">
	                                    <form:select path="userProfiles" items="${roles}" multiple="true" itemValue="id" itemLabel="type" class="form-control" />
	                                    <div class="has-error">
	                                        <form:errors path="userProfiles" class="label label-danger"/>
	                                    </div>
                                    </div>
                                </div>
								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/user/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/user/list' />">Desistir</a>
                                            </c:otherwise>
                                        </c:choose>
									</div>
								</div>
                            </form:form>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
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

    <!-- Custom Theme JavaScript -->
    <script src="../static/startbootstrap/dist/js/sb-admin-2.js"></script>
</body>
</html>