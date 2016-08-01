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
                    <h1 class="page-header">NfcompraItem</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de nfcompraItem
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="nfcompraItem" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codnfcompraitem" id="codnfcompraitem"/>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codnfcompra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codnfcompra" id="codnfcompra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codnfcompra" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codpedcompraitem:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codpedcompraitem" id="codpedcompraitem" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codpedcompraitem" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Vlrunit:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrunit" id="vlrunit" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrunit" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AliqIcms:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aliqIcms" id="aliqIcms" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aliqIcms" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AliqIpi:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aliqIpi" id="aliqIpi" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aliqIpi" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">QtdeCompra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtdeCompra" id="qtdeCompra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtdeCompra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CustoAnterior:</label>
									<div class="col-sm-8">
										<form:input type="text" path="custoAnterior" id="custoAnterior" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="custoAnterior" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CustoAtual:</label>
									<div class="col-sm-8">
										<form:input type="text" path="custoAtual" id="custoAtual" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="custoAtual" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">DescPerc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descPerc" id="descPerc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descPerc" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Nfi:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfi" id="nfi" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfi" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">QtdeUnd:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtdeUnd" id="qtdeUnd" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtdeUnd" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrUnd:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrUnd" id="vlrUnd" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrUnd" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrIcms:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrIcms" id="vlrIcms" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrIcms" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrIpi:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrIpi" id="vlrIpi" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrIpi" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AliqDescBcIcms:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aliqDescBcIcms" id="aliqDescBcIcms" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aliqDescBcIcms" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codcfop:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codcfop" id="codcfop" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codcfop" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AliqIcmsDentro:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aliqIcmsDentro" id="aliqIcmsDentro" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aliqIcmsDentro" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AliqIcmsFora:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aliqIcmsFora" id="aliqIcmsFora" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aliqIcmsFora" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ObsPro:</label>
									<div class="col-sm-8">
										<form:input type="text" path="obsPro" id="obsPro" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="obsPro" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Contribuinte:</label>
									<div class="col-sm-8">
										<form:input type="text" path="contribuinte" id="contribuinte" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="contribuinte" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AlterarBcIcms:</label>
									<div class="col-sm-8">
										<form:input type="text" path="alterarBcIcms" id="alterarBcIcms" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="alterarBcIcms" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrBcIcmsAlterado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrBcIcmsAlterado" id="vlrBcIcmsAlterado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrBcIcmsAlterado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

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
									<label class="col-sm-2 control-label" for="inline-suggestions">Unidade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="unidade" id="unidade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="unidade" class="label label-danger"/>
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

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/nfcompraItem/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/nfcompraItem/list' />">Desistir</a>
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