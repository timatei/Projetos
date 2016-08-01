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
                    <h1 class="page-header">Moeda</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de moeda
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="moeda" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codmoeda" id="codmoeda"/>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Descricao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descricao" id="descricao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descricao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Tipo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="tipo" id="tipo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="tipo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PerDesc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="perDesc" id="perDesc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="perDesc" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DiasComp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="diasComp" id="diasComp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="diasComp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codecf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codecf" id="codecf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codecf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NaoVisFech:</label>
									<div class="col-sm-8">
										<form:input type="text" path="naoVisFech" id="naoVisFech" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="naoVisFech" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DadosPos:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dadosPos" id="dadosPos" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dadosPos" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BaixarSempre:</label>
									<div class="col-sm-8">
										<form:input type="text" path="baixarSempre" id="baixarSempre" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="baixarSempre" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Numdias:</label>
									<div class="col-sm-8">
										<form:input type="text" path="numdias" id="numdias" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="numdias" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NumdiasDemais:</label>
									<div class="col-sm-8">
										<form:input type="text" path="numdiasDemais" id="numdiasDemais" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="numdiasDemais" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ConChe:</label>
									<div class="col-sm-8">
										<form:input type="text" path="conChe" id="conChe" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="conChe" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Gp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="gp" id="gp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="gp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Modificacao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="modificacao" id="modificacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="modificacao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Aux:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aux" id="aux" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aux" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DescricaoEcf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descricaoEcf" id="descricaoEcf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descricaoEcf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codbanco:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codbanco" id="codbanco" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codbanco" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/moeda/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/moeda/list' />">Desistir</a>
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