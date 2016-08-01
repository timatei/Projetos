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
                    <h1 class="page-header">ParRestaurante</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de parRestaurante
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="parRestaurante" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codparrestaurante" id="codparrestaurante"/>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ControleNome:</label>
									<div class="col-sm-8">
										<form:input type="text" path="controleNome" id="controleNome" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="controleNome" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TrabalharRest:</label>
									<div class="col-sm-8">
										<form:input type="text" path="trabalharRest" id="trabalharRest" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="trabalharRest" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ImpCozinha:</label>
									<div class="col-sm-8">
										<form:input type="text" path="impCozinha" id="impCozinha" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="impCozinha" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LinhaFinalImpressao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="linhaFinalImpressao" id="linhaFinalImpressao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="linhaFinalImpressao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ImpExtrato:</label>
									<div class="col-sm-8">
										<form:input type="text" path="impExtrato" id="impExtrato" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="impExtrato" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrCovert:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrCovert" id="vlrCovert" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrCovert" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ImprimirIeim:</label>
									<div class="col-sm-8">
										<form:input type="text" path="imprimirIeim" id="imprimirIeim" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="imprimirIeim" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SelecionarGarcon:</label>
									<div class="col-sm-8">
										<form:input type="text" path="selecionarGarcon" id="selecionarGarcon" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="selecionarGarcon" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CodpesqVenda:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codpesqVenda" id="codpesqVenda" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codpesqVenda" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SomenteDuracao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="somenteDuracao" id="somenteDuracao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="somenteDuracao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ImpBar:</label>
									<div class="col-sm-8">
										<form:input type="text" path="impBar" id="impBar" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="impBar" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrServico:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrServico" id="vlrServico" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrServico" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ImpPizza:</label>
									<div class="col-sm-8">
										<form:input type="text" path="impPizza" id="impPizza" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="impPizza" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/parRestaurante/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/parRestaurante/list' />">Desistir</a>
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