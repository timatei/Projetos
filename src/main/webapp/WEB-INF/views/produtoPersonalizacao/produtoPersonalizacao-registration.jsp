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
                    <h1 class="page-header">Produto personalização</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de produto personalização
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="produtoPersonalizacao" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codProdutoPersonalizacao" id="codProdutoPersonalizacao"/>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cód. Produto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="produto.codProduto" id="produto.codProduto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="produto.codProduto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cód. Grupo Personalização:</label>
									<div class="col-sm-8">
										<form:input type="text" path="grupoPersonalizacao.codGrupoPersonalizacao" id="grupoPersonalizacao.codGrupoPersonalizacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="grupoPersonalizacao.codGrupoPersonalizacao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">QtdeMinima:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtdeMinima" id="qtdeMinima" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtdeMinima" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">QtdeMaxima:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtdeMaxima" id="qtdeMaxima" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtdeMaxima" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Valor:</label>
									<div class="col-sm-8">
										<form:input type="text" path="valor" id="valor" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="valor" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/produtoPersonalizacao/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/produtoPersonalizacao/list' />">Desistir</a>
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