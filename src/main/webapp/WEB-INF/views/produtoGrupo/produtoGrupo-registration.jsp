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
                    <h1 class="page-header">ProdutoGrupo</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de produtoGrupo
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="produtoGrupo" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codprodutogrupo" id="codprodutogrupo"/>

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
									<label class="col-sm-2 control-label" for="inline-suggestions">IpiPadrao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ipiPadrao" id="ipiPadrao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ipiPadrao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">IcmsPadrao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="icmsPadrao" id="icmsPadrao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="icmsPadrao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Grau1:</label>
									<div class="col-sm-8">
										<form:input type="text" path="grau1" id="grau1" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="grau1" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Grau2:</label>
									<div class="col-sm-8">
										<form:input type="text" path="grau2" id="grau2" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="grau2" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Grau3:</label>
									<div class="col-sm-8">
										<form:input type="text" path="grau3" id="grau3" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="grau3" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Grau4:</label>
									<div class="col-sm-8">
										<form:input type="text" path="grau4" id="grau4" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="grau4" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Grau5:</label>
									<div class="col-sm-8">
										<form:input type="text" path="grau5" id="grau5" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="grau5" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Grau6:</label>
									<div class="col-sm-8">
										<form:input type="text" path="grau6" id="grau6" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="grau6" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">UltimoNivel:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ultimoNivel" id="ultimoNivel" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ultimoNivel" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Numeracao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="numeracao" id="numeracao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="numeracao" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Img:</label>
									<div class="col-sm-8">
										<form:input type="text" path="img" id="img" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="img" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cor:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cor" id="cor" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cor" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Ordem:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ordem" id="ordem" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ordem" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DesativarTouch:</label>
									<div class="col-sm-8">
										<form:input type="text" path="desativarTouch" id="desativarTouch" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="desativarTouch" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/produtoGrupo/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/produtoGrupo/list' />">Desistir</a>
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