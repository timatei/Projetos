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
                    <h1 class="page-header">ResPedido</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de resPedido
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="resPedido" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codpedido" id="codpedido"/>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codcontrole:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codcontrole" id="codcontrole" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codcontrole" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

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
									<label class="col-sm-2 control-label" for="inline-suggestions">Data:</label>
									<div class="col-sm-8">
										<form:input type="text" path="data" id="data" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="data" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Total:</label>
									<div class="col-sm-8">
										<form:input type="text" path="total" id="total" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="total" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codgarcon:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codgarcon" id="codgarcon" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codgarcon" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">QtdeCovert:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtdeCovert" id="qtdeCovert" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtdeCovert" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Impresso:</label>
									<div class="col-sm-8">
										<form:input type="text" path="impresso" id="impresso" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="impresso" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DescVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descVlr" id="descVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Acrescimo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="acrescimo" id="acrescimo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="acrescimo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataFinal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataFinal" id="dataFinal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataFinal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">QtdePessoa:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtdePessoa" id="qtdePessoa" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtdePessoa" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DtUltMov:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dtUltMov" id="dtUltMov" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dtUltMov" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Md5:</label>
									<div class="col-sm-8">
										<form:input type="text" path="md5" id="md5" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="md5" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Totprod:</label>
									<div class="col-sm-8">
										<form:input type="text" path="totprod" id="totprod" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="totprod" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Coo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="coo" id="coo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="coo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Numecf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="numecf" id="numecf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="numecf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cer" id="cer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/resPedido/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/resPedido/list' />">Desistir</a>
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