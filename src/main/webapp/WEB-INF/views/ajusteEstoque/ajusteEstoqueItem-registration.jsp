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
                    <h1 class="page-header">AjusteEstoqueItem</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de ajusteEstoqueItem
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="ajusteEstoqueItem" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codajusteestoqueitem" id="codajusteestoqueitem"/>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codajusteestoque:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codajusteestoque" id="codajusteestoque" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codajusteestoque" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codpesquisa:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codpesquisa" id="codpesquisa" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codpesquisa" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codproduto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codproduto" id="codproduto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codproduto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Qtde:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtde" id="qtde" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtde" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Numlote:</label>
									<div class="col-sm-8">
										<form:input type="text" path="numlote" id="numlote" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="numlote" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DtValidade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dtValidade" id="dtValidade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dtValidade" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Custo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="custo" id="custo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="custo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NomeReq:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nomeReq" id="nomeReq" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nomeReq" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codobra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codobra" id="codobra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codobra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstoqAnterior:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estoqAnterior" id="estoqAnterior" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estoqAnterior" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Quebra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="quebra" id="quebra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="quebra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codfuncionario:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codfuncionario" id="codfuncionario" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codfuncionario" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Ca:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ca" id="ca" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ca" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Revisao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="revisao" id="revisao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="revisao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codempresa:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codempresa" id="codempresa" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codempresa" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Novopreco01:</label>
									<div class="col-sm-8">
										<form:input type="text" path="novopreco01" id="novopreco01" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="novopreco01" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codveiculomanutproduto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codveiculomanutproduto" id="codveiculomanutproduto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codveiculomanutproduto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/ajusteEstoqueItem/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/ajusteEstoqueItem/list' />">Desistir</a>
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