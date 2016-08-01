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
                    <h1 class="page-header">ContasBaixas</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de contasBaixas
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="contasBaixas" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codcontabaixa" id="codcontabaixa"/>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codconta:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codconta" id="codconta" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codconta" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codmoeda:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codmoeda" id="codmoeda" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codmoeda" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Dtpag:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dtpag" id="dtpag" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dtpag" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Vlrpago:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrpago" id="vlrpago" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrpago" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Obs:</label>
									<div class="col-sm-8">
										<form:input type="text" path="obs" id="obs" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="obs" class="label label-danger"/>
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

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Numcheq:</label>
									<div class="col-sm-8">
										<form:input type="text" path="numcheq" id="numcheq" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="numcheq" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Banco:</label>
									<div class="col-sm-8">
										<form:input type="text" path="banco" id="banco" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="banco" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BncAgencia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bncAgencia" id="bncAgencia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bncAgencia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BncNrconta:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bncNrconta" id="bncNrconta" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bncNrconta" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BncNmEmitente:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bncNmEmitente" id="bncNmEmitente" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bncNmEmitente" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codbanconaoconta:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codbanconaoconta" id="codbanconaoconta" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codbanconaoconta" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BncNmCpf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bncNmCpf" id="bncNmCpf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bncNmCpf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codcaixaabertura:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codcaixaabertura" id="codcaixaabertura" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codcaixaabertura" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DiasVenc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="diasVenc" id="diasVenc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="diasVenc" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Usuario:</label>
									<div class="col-sm-8">
										<form:input type="text" path="usuario" id="usuario" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="usuario" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Aux:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aux" id="aux" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aux" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codntcredito:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codntcredito" id="codntcredito" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codntcredito" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Datahora:</label>
									<div class="col-sm-8">
										<form:input type="text" path="datahora" id="datahora" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="datahora" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codbancoextrato:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codbancoextrato" id="codbancoextrato" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codbancoextrato" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/contasBaixas/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/contasBaixas/list' />">Desistir</a>
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