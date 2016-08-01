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
                    <h1 class="page-header">Contas</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de contas
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="contas" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codconta" id="codconta"/>

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
									<label class="col-sm-2 control-label" for="inline-suggestions">Tipo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="tipo" id="tipo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="tipo" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Numdoc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="numdoc" id="numdoc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="numdoc" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Parcela:</label>
									<div class="col-sm-8">
										<form:input type="text" path="parcela" id="parcela" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="parcela" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Dtentr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dtentr" id="dtentr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dtentr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Dtemis:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dtemis" id="dtemis" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dtemis" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Dtvenc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dtvenc" id="dtvenc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dtvenc" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codpessoa:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codpessoa" id="codpessoa" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codpessoa" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">AcresVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="acresVlr" id="acresVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="acresVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">JurosVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="jurosVlr" id="jurosVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="jurosVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DescImpostos:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descImpostos" id="descImpostos" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descImpostos" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Vlrparcela:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrparcela" id="vlrparcela" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrparcela" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Vlrtotal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrtotal" id="vlrtotal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrtotal" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codnfvenda:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codnfvenda" id="codnfvenda" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codnfvenda" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codserie:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codserie" id="codserie" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codserie" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codpedvenda:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codpedvenda" id="codpedvenda" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codpedvenda" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Nrboleto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nrboleto" id="nrboleto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nrboleto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codcentcusto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codcentcusto" id="codcentcusto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codcentcusto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codaluguel:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codaluguel" id="codaluguel" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codaluguel" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codossimples:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codossimples" id="codossimples" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codossimples" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CheqNum:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cheqNum" id="cheqNum" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cheqNum" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CheqBanco:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cheqBanco" id="cheqBanco" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cheqBanco" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CheqAgencia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cheqAgencia" id="cheqAgencia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cheqAgencia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CheqConta:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cheqConta" id="cheqConta" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cheqConta" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CheqEmitido:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cheqEmitido" id="cheqEmitido" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cheqEmitido" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codosprincipal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codosprincipal" id="codosprincipal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codosprincipal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codrefatura:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codrefatura" id="codrefatura" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codrefatura" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PosNrautorizacao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="posNrautorizacao" id="posNrautorizacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="posNrautorizacao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PosNome:</label>
									<div class="col-sm-8">
										<form:input type="text" path="posNome" id="posNome" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="posNome" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Vlr1:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlr1" id="vlr1" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlr1" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Vlr2:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlr2" id="vlr2" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlr2" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CheqCpf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cheqCpf" id="cheqCpf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cheqCpf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NrPed:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nrPed" id="nrPed" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nrPed" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codfrete:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codfrete" id="codfrete" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codfrete" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codveiculo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codveiculo" id="codveiculo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codveiculo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codpedcompra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codpedcompra" id="codpedcompra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codpedcompra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BoletoGerado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="boletoGerado" id="boletoGerado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="boletoGerado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BoletoDemonstrativo1:</label>
									<div class="col-sm-8">
										<form:input type="text" path="boletoDemonstrativo1" id="boletoDemonstrativo1" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="boletoDemonstrativo1" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BoletoDemonstrativo2:</label>
									<div class="col-sm-8">
										<form:input type="text" path="boletoDemonstrativo2" id="boletoDemonstrativo2" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="boletoDemonstrativo2" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BoletoDemonstrativo3:</label>
									<div class="col-sm-8">
										<form:input type="text" path="boletoDemonstrativo3" id="boletoDemonstrativo3" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="boletoDemonstrativo3" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codcontaspedecf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codcontaspedecf" id="codcontaspedecf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codcontaspedecf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Autorizada:</label>
									<div class="col-sm-8">
										<form:input type="text" path="autorizada" id="autorizada" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="autorizada" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codguia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codguia" id="codguia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codguia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrJurosCrediario:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrJurosCrediario" id="vlrJurosCrediario" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrJurosCrediario" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codplanoassistencia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codplanoassistencia" id="codplanoassistencia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codplanoassistencia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Dtprevista:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dtprevista" id="dtprevista" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dtprevista" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SuspensaoUsuario:</label>
									<div class="col-sm-8">
										<form:input type="text" path="suspensaoUsuario" id="suspensaoUsuario" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="suspensaoUsuario" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SuspensaoDatahora:</label>
									<div class="col-sm-8">
										<form:input type="text" path="suspensaoDatahora" id="suspensaoDatahora" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="suspensaoDatahora" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AutorizacaoUsuario:</label>
									<div class="col-sm-8">
										<form:input type="text" path="autorizacaoUsuario" id="autorizacaoUsuario" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="autorizacaoUsuario" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AutorizacaoDatahora:</label>
									<div class="col-sm-8">
										<form:input type="text" path="autorizacaoDatahora" id="autorizacaoDatahora" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="autorizacaoDatahora" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SuspensaoJustif:</label>
									<div class="col-sm-8">
										<form:input type="text" path="suspensaoJustif" id="suspensaoJustif" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="suspensaoJustif" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AutorizacaoJustif:</label>
									<div class="col-sm-8">
										<form:input type="text" path="autorizacaoJustif" id="autorizacaoJustif" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="autorizacaoJustif" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codboleto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codboleto" id="codboleto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codboleto" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Bx:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bx" id="bx" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bx" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Usuario:</label>
									<div class="col-sm-8">
										<form:input type="text" path="usuario" id="usuario" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="usuario" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Dtultbx:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dtultbx" id="dtultbx" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dtultbx" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrAdiantamento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrAdiantamento" id="vlrAdiantamento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrAdiantamento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NaoCalcJuros:</label>
									<div class="col-sm-8">
										<form:input type="text" path="naoCalcJuros" id="naoCalcJuros" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="naoCalcJuros" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">MultaVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="multaVlr" id="multaVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="multaVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NaoCalcMulta:</label>
									<div class="col-sm-8">
										<form:input type="text" path="naoCalcMulta" id="naoCalcMulta" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="naoCalcMulta" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NrboletoAlf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nrboletoAlf" id="nrboletoAlf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nrboletoAlf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Protestado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="protestado" id="protestado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="protestado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NumdocBoleto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="numdocBoleto" id="numdocBoleto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="numdocBoleto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/contas/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/contas/list' />">Desistir</a>
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