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
                    <h1 class="page-header">Banco</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de banco
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="banco" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codbanco" id="codbanco"/>

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
									<label class="col-sm-2 control-label" for="inline-suggestions">SaldoInicial:</label>
									<div class="col-sm-8">
										<form:input type="text" path="saldoInicial" id="saldoInicial" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="saldoInicial" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SaldoAtual:</label>
									<div class="col-sm-8">
										<form:input type="text" path="saldoAtual" id="saldoAtual" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="saldoAtual" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Contas:</label>
									<div class="col-sm-8">
										<form:input type="text" path="contas" id="contas" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="contas" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Aux:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aux" id="aux" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aux" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Agencia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="agencia" id="agencia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="agencia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Operacao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="operacao" id="operacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="operacao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Conta:</label>
									<div class="col-sm-8">
										<form:input type="text" path="conta" id="conta" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="conta" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataInicial:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataInicial" id="dataInicial" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataInicial" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SaldoConciliado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="saldoConciliado" id="saldoConciliado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="saldoConciliado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SaldoExtrato:</label>
									<div class="col-sm-8">
										<form:input type="text" path="saldoExtrato" id="saldoExtrato" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="saldoExtrato" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataExtrato:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataExtrato" id="dataExtrato" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataExtrato" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Ativo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ativo" id="ativo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ativo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/banco/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/banco/list' />">Desistir</a>
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