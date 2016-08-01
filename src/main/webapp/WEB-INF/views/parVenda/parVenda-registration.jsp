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
                    <h1 class="page-header">ParVenda</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de parVenda
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="parVenda" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codparvenda" id="codparvenda"/>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfModelo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfModelo" id="ecfModelo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfModelo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfPorta:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfPorta" id="ecfPorta" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfPorta" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfTimeout:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfTimeout" id="ecfTimeout" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfTimeout" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfIntervalo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfIntervalo" id="ecfIntervalo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfIntervalo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfTentNova:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfTentNova" id="ecfTentNova" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfTentNova" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfBloqTeclMouse:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfBloqTeclMouse" id="ecfBloqTeclMouse" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfBloqTeclMouse" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfExibMsgAguarde:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfExibMsgAguarde" id="ecfExibMsgAguarde" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfExibMsgAguarde" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfArreQtde:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfArreQtde" id="ecfArreQtde" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfArreQtde" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfGavSinInv:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfGavSinInv" id="ecfGavSinInv" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfGavSinInv" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfVerifGav:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfVerifGav" id="ecfVerifGav" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfVerifGav" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfAbriGav:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfAbriGav" id="ecfAbriGav" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfAbriGav" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfAliq:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfAliq" id="ecfAliq" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfAliq" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfFpg:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfFpg" id="ecfFpg" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfFpg" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfMoe:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfMoe" id="ecfMoe" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfMoe" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Ecf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecf" id="ecf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Margem01:</label>
									<div class="col-sm-8">
										<form:input type="text" path="margem01" id="margem01" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="margem01" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Margem02:</label>
									<div class="col-sm-8">
										<form:input type="text" path="margem02" id="margem02" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="margem02" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Margem03:</label>
									<div class="col-sm-8">
										<form:input type="text" path="margem03" id="margem03" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="margem03" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Margem04:</label>
									<div class="col-sm-8">
										<form:input type="text" path="margem04" id="margem04" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="margem04" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Margem05:</label>
									<div class="col-sm-8">
										<form:input type="text" path="margem05" id="margem05" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="margem05" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Ext:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ext" id="ext" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ext" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CustoAdm:</label>
									<div class="col-sm-8">
										<form:input type="text" path="custoAdm" id="custoAdm" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="custoAdm" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ImpFed:</label>
									<div class="col-sm-8">
										<form:input type="text" path="impFed" id="impFed" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="impFed" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SuperSimp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="superSimp" id="superSimp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="superSimp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ImpFront:</label>
									<div class="col-sm-8">
										<form:input type="text" path="impFront" id="impFront" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="impFront" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ImpSaida:</label>
									<div class="col-sm-8">
										<form:input type="text" path="impSaida" id="impSaida" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="impSaida" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Nfvenda:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfvenda" id="nfvenda" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfvenda" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Nfcompra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfcompra" id="nfcompra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfcompra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AssinaturaPedido:</label>
									<div class="col-sm-8">
										<form:input type="text" path="assinaturaPedido" id="assinaturaPedido" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="assinaturaPedido" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ObsPedido:</label>
									<div class="col-sm-8">
										<form:input type="text" path="obsPedido" id="obsPedido" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="obsPedido" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ImpVendedor:</label>
									<div class="col-sm-8">
										<form:input type="text" path="impVendedor" id="impVendedor" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="impVendedor" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Assinatura2Pedido:</label>
									<div class="col-sm-8">
										<form:input type="text" path="assinatura2Pedido" id="assinatura2Pedido" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="assinatura2Pedido" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SenhaDesconto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="senhaDesconto" id="senhaDesconto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="senhaDesconto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Principal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="principal" id="principal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="principal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Secundario:</label>
									<div class="col-sm-8">
										<form:input type="text" path="secundario" id="secundario" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="secundario" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AberturaCaixa:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aberturaCaixa" id="aberturaCaixa" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aberturaCaixa" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">FechamentoTipo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="fechamentoTipo" id="fechamentoTipo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="fechamentoTipo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Desconto1:</label>
									<div class="col-sm-8">
										<form:input type="text" path="desconto1" id="desconto1" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="desconto1" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Desconto2:</label>
									<div class="col-sm-8">
										<form:input type="text" path="desconto2" id="desconto2" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="desconto2" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Desconto3:</label>
									<div class="col-sm-8">
										<form:input type="text" path="desconto3" id="desconto3" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="desconto3" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SenhaDesconto2:</label>
									<div class="col-sm-8">
										<form:input type="text" path="senhaDesconto2" id="senhaDesconto2" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="senhaDesconto2" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SenhaDesconto3:</label>
									<div class="col-sm-8">
										<form:input type="text" path="senhaDesconto3" id="senhaDesconto3" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="senhaDesconto3" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CustoTpLente1:</label>
									<div class="col-sm-8">
										<form:input type="text" path="custoTpLente1" id="custoTpLente1" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="custoTpLente1" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CustoTpLente2:</label>
									<div class="col-sm-8">
										<form:input type="text" path="custoTpLente2" id="custoTpLente2" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="custoTpLente2" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CustoTpLente3:</label>
									<div class="col-sm-8">
										<form:input type="text" path="custoTpLente3" id="custoTpLente3" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="custoTpLente3" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">QtdeLinhasRel:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtdeLinhasRel" id="qtdeLinhasRel" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtdeLinhasRel" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ImprimirPdv:</label>
									<div class="col-sm-8">
										<form:input type="text" path="imprimirPdv" id="imprimirPdv" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="imprimirPdv" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NaoGerarCodigo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="naoGerarCodigo" id="naoGerarCodigo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="naoGerarCodigo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CancelSomenteDia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cancelSomenteDia" id="cancelSomenteDia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cancelSomenteDia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SenhaCancelDepois:</label>
									<div class="col-sm-8">
										<form:input type="text" path="senhaCancelDepois" id="senhaCancelDepois" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="senhaCancelDepois" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">FundoCaixa:</label>
									<div class="col-sm-8">
										<form:input type="text" path="fundoCaixa" id="fundoCaixa" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="fundoCaixa" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">MargProd:</label>
									<div class="col-sm-8">
										<form:input type="text" path="margProd" id="margProd" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="margProd" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PrecProdRo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="precProdRo" id="precProdRo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="precProdRo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">QtdeProdPreco:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtdeProdPreco" id="qtdeProdPreco" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtdeProdPreco" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PreVendRp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preVendRp" id="preVendRp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preVendRp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SenhaConsulta:</label>
									<div class="col-sm-8">
										<form:input type="text" path="senhaConsulta" id="senhaConsulta" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="senhaConsulta" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CustAjuste:</label>
									<div class="col-sm-8">
										<form:input type="text" path="custAjuste" id="custAjuste" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="custAjuste" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">MsgEcf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="msgEcf" id="msgEcf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="msgEcf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ItDesc1:</label>
									<div class="col-sm-8">
										<form:input type="text" path="itDesc1" id="itDesc1" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="itDesc1" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ItDesc2:</label>
									<div class="col-sm-8">
										<form:input type="text" path="itDesc2" id="itDesc2" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="itDesc2" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ItDesc3:</label>
									<div class="col-sm-8">
										<form:input type="text" path="itDesc3" id="itDesc3" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="itDesc3" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ItDesc4:</label>
									<div class="col-sm-8">
										<form:input type="text" path="itDesc4" id="itDesc4" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="itDesc4" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ItDescSenha1:</label>
									<div class="col-sm-8">
										<form:input type="text" path="itDescSenha1" id="itDescSenha1" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="itDescSenha1" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ItDescSenha2:</label>
									<div class="col-sm-8">
										<form:input type="text" path="itDescSenha2" id="itDescSenha2" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="itDescSenha2" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ItDescSenha3:</label>
									<div class="col-sm-8">
										<form:input type="text" path="itDescSenha3" id="itDescSenha3" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="itDescSenha3" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ItDescSenha4:</label>
									<div class="col-sm-8">
										<form:input type="text" path="itDescSenha4" id="itDescSenha4" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="itDescSenha4" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DiasCarencia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="diasCarencia" id="diasCarencia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="diasCarencia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">JurosDia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="jurosDia" id="jurosDia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="jurosDia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">MenorParcela:</label>
									<div class="col-sm-8">
										<form:input type="text" path="menorParcela" id="menorParcela" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="menorParcela" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SenhaMenorParcela:</label>
									<div class="col-sm-8">
										<form:input type="text" path="senhaMenorParcela" id="senhaMenorParcela" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="senhaMenorParcela" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">FreteCif:</label>
									<div class="col-sm-8">
										<form:input type="text" path="freteCif" id="freteCif" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="freteCif" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">FreteFob:</label>
									<div class="col-sm-8">
										<form:input type="text" path="freteFob" id="freteFob" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="freteFob" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Frete:</label>
									<div class="col-sm-8">
										<form:input type="text" path="frete" id="frete" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="frete" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstacVlrDiaria:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estacVlrDiaria" id="estacVlrDiaria" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estacVlrDiaria" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstacTolHoras:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estacTolHoras" id="estacTolHoras" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estacTolHoras" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AquisicaoVeiculo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aquisicaoVeiculo" id="aquisicaoVeiculo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aquisicaoVeiculo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">FreteVlrCombustivel:</label>
									<div class="col-sm-8">
										<form:input type="text" path="freteVlrCombustivel" id="freteVlrCombustivel" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="freteVlrCombustivel" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">FreteIndKmRodados:</label>
									<div class="col-sm-8">
										<form:input type="text" path="freteIndKmRodados" id="freteIndKmRodados" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="freteIndKmRodados" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">FreteIndGastosPneu:</label>
									<div class="col-sm-8">
										<form:input type="text" path="freteIndGastosPneu" id="freteIndGastosPneu" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="freteIndGastosPneu" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">FreteIndManutencao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="freteIndManutencao" id="freteIndManutencao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="freteIndManutencao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstacVlrDiariaBitrem:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estacVlrDiariaBitrem" id="estacVlrDiariaBitrem" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estacVlrDiariaBitrem" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstacVlrDiariaTruck:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estacVlrDiariaTruck" id="estacVlrDiariaTruck" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estacVlrDiariaTruck" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstacVlrDiariaCarreta:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estacVlrDiariaCarreta" id="estacVlrDiariaCarreta" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estacVlrDiariaCarreta" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstacQtdeHorasGratis:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estacQtdeHorasGratis" id="estacQtdeHorasGratis" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estacQtdeHorasGratis" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Mensalidades:</label>
									<div class="col-sm-8">
										<form:input type="text" path="mensalidades" id="mensalidades" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="mensalidades" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">UrlGeradorBoletos:</label>
									<div class="col-sm-8">
										<form:input type="text" path="urlGeradorBoletos" id="urlGeradorBoletos" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="urlGeradorBoletos" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">CustoKm:</label>
									<div class="col-sm-8">
										<form:input type="text" path="custoKm" id="custoKm" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="custoKm" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstacVlrDiariaTreminha:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estacVlrDiariaTreminha" id="estacVlrDiariaTreminha" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estacVlrDiariaTreminha" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ObsPedcompra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="obsPedcompra" id="obsPedcompra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="obsPedcompra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TextoTermoEntrEpi:</label>
									<div class="col-sm-8">
										<form:input type="text" path="textoTermoEntrEpi" id="textoTermoEntrEpi" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="textoTermoEntrEpi" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TxtFinTermoEntrEpi:</label>
									<div class="col-sm-8">
										<form:input type="text" path="txtFinTermoEntrEpi" id="txtFinTermoEntrEpi" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="txtFinTermoEntrEpi" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BalIntervalo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balIntervalo" id="balIntervalo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balIntervalo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BalModelo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balModelo" id="balModelo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balModelo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BalMonitorar:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balMonitorar" id="balMonitorar" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balMonitorar" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BalPorta:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balPorta" id="balPorta" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balPorta" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BalModeloBalanca:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balModeloBalanca" id="balModeloBalanca" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balModeloBalanca" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BalBaud:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balBaud" id="balBaud" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balBaud" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BalData:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balData" id="balData" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balData" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BalHandshake:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balHandshake" id="balHandshake" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balHandshake" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BalHardflow:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balHardflow" id="balHardflow" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balHardflow" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BalParity:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balParity" id="balParity" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balParity" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BalProcessMessages:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balProcessMessages" id="balProcessMessages" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balProcessMessages" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BalSendbytescount:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balSendbytescount" id="balSendbytescount" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balSendbytescount" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BalSendbytesinterval:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balSendbytesinterval" id="balSendbytesinterval" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balSendbytesinterval" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BalStop:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balStop" id="balStop" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balStop" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BalSoftflow:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balSoftflow" id="balSoftflow" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balSoftflow" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BolTipoCobranca:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bolTipoCobranca" id="bolTipoCobranca" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bolTipoCobranca" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BolCedAgencia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bolCedAgencia" id="bolCedAgencia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bolCedAgencia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BolCedAgenciaDigito:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bolCedAgenciaDigito" id="bolCedAgenciaDigito" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bolCedAgenciaDigito" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BolCedCodigo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bolCedCodigo" id="bolCedCodigo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bolCedCodigo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BolCedCodTransmissao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bolCedCodTransmissao" id="bolCedCodTransmissao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bolCedCodTransmissao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BolCedConta:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bolCedConta" id="bolCedConta" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bolCedConta" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BolCedContaDig:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bolCedContaDig" id="bolCedContaDig" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bolCedContaDig" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BolCedRespTransmissao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bolCedRespTransmissao" id="bolCedRespTransmissao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bolCedRespTransmissao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BolMsgPadraoEmail:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bolMsgPadraoEmail" id="bolMsgPadraoEmail" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bolMsgPadraoEmail" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">GadoVlrArrobaMerc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="gadoVlrArrobaMerc" id="gadoVlrArrobaMerc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="gadoVlrArrobaMerc" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ObsCarne:</label>
									<div class="col-sm-8">
										<form:input type="text" path="obsCarne" id="obsCarne" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="obsCarne" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfVeloc115200:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfVeloc115200" id="ecfVeloc115200" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfVeloc115200" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ObsOrcamento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="obsOrcamento" id="obsOrcamento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="obsOrcamento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EndAssLadoEsquerdo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="endAssLadoEsquerdo" id="endAssLadoEsquerdo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="endAssLadoEsquerdo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BolCedConvenio:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bolCedConvenio" id="bolCedConvenio" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bolCedConvenio" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PercMulta:</label>
									<div class="col-sm-8">
										<form:input type="text" path="percMulta" id="percMulta" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="percMulta" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/parVenda/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/parVenda/list' />">Desistir</a>
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