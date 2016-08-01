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
                    <h1 class="page-header">CaixaAbertura</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de caixaAbertura
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="caixaAbertura" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codcaixaabertura" id="codcaixaabertura"/>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Status:</label>
									<div class="col-sm-8">
										<form:input type="text" path="status" id="status" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="status" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Operador:</label>
									<div class="col-sm-8">
										<form:input type="text" path="operador" id="operador" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="operador" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AberturaData:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aberturaData" id="aberturaData" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aberturaData" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">FechamentoData:</label>
									<div class="col-sm-8">
										<form:input type="text" path="fechamentoData" id="fechamentoData" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="fechamentoData" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Vlrinicial:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrinicial" id="vlrinicial" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrinicial" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SaldoFinal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="saldoFinal" id="saldoFinal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="saldoFinal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Maquina:</label>
									<div class="col-sm-8">
										<form:input type="text" path="maquina" id="maquina" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="maquina" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">SaldoAnterior:</label>
									<div class="col-sm-8">
										<form:input type="text" path="saldoAnterior" id="saldoAnterior" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="saldoAnterior" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Anterior:</label>
									<div class="col-sm-8">
										<form:input type="text" path="anterior" id="anterior" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="anterior" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codpargeral:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codpargeral" id="codpargeral" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codpargeral" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cent005:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cent005" id="cent005" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cent005" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cent010:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cent010" id="cent010" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cent010" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cent025:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cent025" id="cent025" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cent025" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cent050:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cent050" id="cent050" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cent050" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cent100:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cent100" id="cent100" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cent100" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cedl001:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cedl001" id="cedl001" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cedl001" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cedl002:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cedl002" id="cedl002" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cedl002" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cedl005:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cedl005" id="cedl005" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cedl005" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cedl010:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cedl010" id="cedl010" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cedl010" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cedl020:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cedl020" id="cedl020" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cedl020" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cedl050:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cedl050" id="cedl050" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cedl050" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cedl100:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cedl100" id="cedl100" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cedl100" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AberturaHora:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aberturaHora" id="aberturaHora" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aberturaHora" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/caixaAbertura/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/caixaAbertura/list' />">Desistir</a>
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