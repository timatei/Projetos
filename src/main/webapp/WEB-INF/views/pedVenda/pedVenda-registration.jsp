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
                    <h1 class="page-header">Pedvenda</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de pedvenda
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="pedvenda" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codpedvenda" id="codpedvenda"/>

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
									<label class="col-sm-2 control-label" for="inline-suggestions">Tipopreco:</label>
									<div class="col-sm-8">
										<form:input type="text" path="tipopreco" id="tipopreco" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="tipopreco" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataEntrada:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataEntrada" id="dataEntrada" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataEntrada" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">DescVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descVlr" id="descVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descVlr" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">AcrePerc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="acrePerc" id="acrePerc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="acrePerc" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AcreVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="acreVlr" id="acreVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="acreVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TotalProdutos:</label>
									<div class="col-sm-8">
										<form:input type="text" path="totalProdutos" id="totalProdutos" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="totalProdutos" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codformapagamento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codformapagamento" id="codformapagamento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codformapagamento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codvendedor:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codvendedor" id="codvendedor" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codvendedor" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TotalPedido:</label>
									<div class="col-sm-8">
										<form:input type="text" path="totalPedido" id="totalPedido" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="totalPedido" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Externo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="externo" id="externo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="externo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VenIntComis:</label>
									<div class="col-sm-8">
										<form:input type="text" path="venIntComis" id="venIntComis" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="venIntComis" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VenExtComis:</label>
									<div class="col-sm-8">
										<form:input type="text" path="venExtComis" id="venExtComis" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="venExtComis" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Entrega:</label>
									<div class="col-sm-8">
										<form:input type="text" path="entrega" id="entrega" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="entrega" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Contato:</label>
									<div class="col-sm-8">
										<form:input type="text" path="contato" id="contato" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="contato" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Telefone:</label>
									<div class="col-sm-8">
										<form:input type="text" path="telefone" id="telefone" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="telefone" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Email:</label>
									<div class="col-sm-8">
										<form:input type="text" path="email" id="email" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="email" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Ddd:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ddd" id="ddd" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ddd" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Nf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nf" id="nf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Rapida:</label>
									<div class="col-sm-8">
										<form:input type="text" path="rapida" id="rapida" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="rapida" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Vlrtroca:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrtroca" id="vlrtroca" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrtroca" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TotalComissao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="totalComissao" id="totalComissao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="totalComissao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Reimpressao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="reimpressao" id="reimpressao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="reimpressao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DescPadrao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descPadrao" id="descPadrao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descPadrao" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Usuario:</label>
									<div class="col-sm-8">
										<form:input type="text" path="usuario" id="usuario" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="usuario" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Vlrcovert:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrcovert" id="vlrcovert" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrcovert" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Vlrservico:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrservico" id="vlrservico" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrservico" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EcfData:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ecfData" id="ecfData" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ecfData" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NrPedido:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nrPedido" id="nrPedido" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nrPedido" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataFaturamento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataFaturamento" id="dataFaturamento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataFaturamento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">HoraPedido:</label>
									<div class="col-sm-8">
										<form:input type="text" path="horaPedido" id="horaPedido" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="horaPedido" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">SedexVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="sedexVlr" id="sedexVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="sedexVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AcrescimoFinanceiro:</label>
									<div class="col-sm-8">
										<form:input type="text" path="acrescimoFinanceiro" id="acrescimoFinanceiro" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="acrescimoFinanceiro" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CompPedidoAtualizado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="compPedidoAtualizado" id="compPedidoAtualizado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="compPedidoAtualizado" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">DataFinalizacao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataFinalizacao" id="dataFinalizacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataFinalizacao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SoftwarePara:</label>
									<div class="col-sm-8">
										<form:input type="text" path="softwarePara" id="softwarePara" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="softwarePara" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">QtdeComputadores:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtdeComputadores" id="qtdeComputadores" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtdeComputadores" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DiaVctoMensalidade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="diaVctoMensalidade" id="diaVctoMensalidade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="diaVctoMensalidade" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">MesAnoReferencia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="mesAnoReferencia" id="mesAnoReferencia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="mesAnoReferencia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataVctoInicial:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataVctoInicial" id="dataVctoInicial" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataVctoInicial" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Comarca:</label>
									<div class="col-sm-8">
										<form:input type="text" path="comarca" id="comarca" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="comarca" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ContratoGerado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="contratoGerado" id="contratoGerado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="contratoGerado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ValorMensalidade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="valorMensalidade" id="valorMensalidade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="valorMensalidade" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">QtdeMeses:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtdeMeses" id="qtdeMeses" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtdeMeses" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Atualiz:</label>
									<div class="col-sm-8">
										<form:input type="text" path="atualiz" id="atualiz" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="atualiz" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TotalCustoProdutos:</label>
									<div class="col-sm-8">
										<form:input type="text" path="totalCustoProdutos" id="totalCustoProdutos" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="totalCustoProdutos" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Categoria:</label>
									<div class="col-sm-8">
										<form:input type="text" path="categoria" id="categoria" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="categoria" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Token:</label>
									<div class="col-sm-8">
										<form:input type="text" path="token" id="token" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="token" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Payerid:</label>
									<div class="col-sm-8">
										<form:input type="text" path="payerid" id="payerid" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="payerid" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PaypalStatus:</label>
									<div class="col-sm-8">
										<form:input type="text" path="paypalStatus" id="paypalStatus" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="paypalStatus" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataInstalacao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataInstalacao" id="dataInstalacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataInstalacao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">HoraInstalacao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="horaInstalacao" id="horaInstalacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="horaInstalacao" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">AlteracaoDatahora:</label>
									<div class="col-sm-8">
										<form:input type="text" path="alteracaoDatahora" id="alteracaoDatahora" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="alteracaoDatahora" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AlteracaoUsuario:</label>
									<div class="col-sm-8">
										<form:input type="text" path="alteracaoUsuario" id="alteracaoUsuario" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="alteracaoUsuario" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ExclusaoDatahora:</label>
									<div class="col-sm-8">
										<form:input type="text" path="exclusaoDatahora" id="exclusaoDatahora" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="exclusaoDatahora" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ExclusaoUsuario:</label>
									<div class="col-sm-8">
										<form:input type="text" path="exclusaoUsuario" id="exclusaoUsuario" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="exclusaoUsuario" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">PesagemGerada:</label>
									<div class="col-sm-8">
										<form:input type="text" path="pesagemGerada" id="pesagemGerada" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="pesagemGerada" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PesoTotalBruto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="pesoTotalBruto" id="pesoTotalBruto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="pesoTotalBruto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PesoTotalLiquido:</label>
									<div class="col-sm-8">
										<form:input type="text" path="pesoTotalLiquido" id="pesoTotalLiquido" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="pesoTotalLiquido" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">QtdeAnimaisClassif:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtdeAnimaisClassif" id="qtdeAnimaisClassif" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtdeAnimaisClassif" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Conferido:</label>
									<div class="col-sm-8">
										<form:input type="text" path="conferido" id="conferido" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="conferido" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">UsuarioConferencia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="usuarioConferencia" id="usuarioConferencia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="usuarioConferencia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DatahoraConferencia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="datahoraConferencia" id="datahoraConferencia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="datahoraConferencia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AnimaisEstoqueBaixado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="animaisEstoqueBaixado" id="animaisEstoqueBaixado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="animaisEstoqueBaixado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codanimalpesagem:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codanimalpesagem" id="codanimalpesagem" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codanimalpesagem" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Arquivado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="arquivado" id="arquivado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="arquivado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DatahoraArquivamento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="datahoraArquivamento" id="datahoraArquivamento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="datahoraArquivamento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">UsuarioArquivamento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="usuarioArquivamento" id="usuarioArquivamento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="usuarioArquivamento" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">AprovacaoDatahora:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aprovacaoDatahora" id="aprovacaoDatahora" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aprovacaoDatahora" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AprovacaoUsuario:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aprovacaoUsuario" id="aprovacaoUsuario" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aprovacaoUsuario" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataPrevEntrega:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataPrevEntrega" id="dataPrevEntrega" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataPrevEntrega" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TotalDespesas:</label>
									<div class="col-sm-8">
										<form:input type="text" path="totalDespesas" id="totalDespesas" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="totalDespesas" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TipoPesagem:</label>
									<div class="col-sm-8">
										<form:input type="text" path="tipoPesagem" id="tipoPesagem" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="tipoPesagem" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Consumo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="consumo" id="consumo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="consumo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Alternativa:</label>
									<div class="col-sm-8">
										<form:input type="text" path="alternativa" id="alternativa" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="alternativa" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Revisado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="revisado" id="revisado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="revisado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NrRevisao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nrRevisao" id="nrRevisao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nrRevisao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DatahoraRevisao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="datahoraRevisao" id="datahoraRevisao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="datahoraRevisao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">UsuarioRevisao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="usuarioRevisao" id="usuarioRevisao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="usuarioRevisao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TotalBcIcms:</label>
									<div class="col-sm-8">
										<form:input type="text" path="totalBcIcms" id="totalBcIcms" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="totalBcIcms" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TotalIcms:</label>
									<div class="col-sm-8">
										<form:input type="text" path="totalIcms" id="totalIcms" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="totalIcms" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TotalIpi:</label>
									<div class="col-sm-8">
										<form:input type="text" path="totalIpi" id="totalIpi" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="totalIpi" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TipoFrete:</label>
									<div class="col-sm-8">
										<form:input type="text" path="tipoFrete" id="tipoFrete" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="tipoFrete" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Placa:</label>
									<div class="col-sm-8">
										<form:input type="text" path="placa" id="placa" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="placa" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Km:</label>
									<div class="col-sm-8">
										<form:input type="text" path="km" id="km" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="km" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Modelo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="modelo" id="modelo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="modelo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataSaidaAnimal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataSaidaAnimal" id="dataSaidaAnimal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataSaidaAnimal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataAbateAnimal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataAbateAnimal" id="dataAbateAnimal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataAbateAnimal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PedCli:</label>
									<div class="col-sm-8">
										<form:input type="text" path="pedCli" id="pedCli" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="pedCli" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NrEmpreitada:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nrEmpreitada" id="nrEmpreitada" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nrEmpreitada" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Exportado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="exportado" id="exportado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="exportado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DatahoraExportacao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="datahoraExportacao" id="datahoraExportacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="datahoraExportacao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CodpedvendaExportado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codpedvendaExportado" id="codpedvendaExportado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codpedvendaExportado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Estoquista:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estoquista" id="estoquista" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estoquista" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Segunda:</label>
									<div class="col-sm-8">
										<form:input type="text" path="segunda" id="segunda" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="segunda" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">UsuarioFaturamento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="usuarioFaturamento" id="usuarioFaturamento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="usuarioFaturamento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NaoGerarFinanceiro:</label>
									<div class="col-sm-8">
										<form:input type="text" path="naoGerarFinanceiro" id="naoGerarFinanceiro" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="naoGerarFinanceiro" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataLiberacao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataLiberacao" id="dataLiberacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataLiberacao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataEntrega:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataEntrega" id="dataEntrega" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataEntrega" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataEntregaFim:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataEntregaFim" id="dataEntregaFim" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataEntregaFim" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codgarconentregador:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codgarconentregador" id="codgarconentregador" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codgarconentregador" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codentrega:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codentrega" id="codentrega" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codentrega" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DescontoFinanceiro:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descontoFinanceiro" id="descontoFinanceiro" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descontoFinanceiro" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Liberado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="liberado" id="liberado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="liberado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LiberadoMtv:</label>
									<div class="col-sm-8">
										<form:input type="text" path="liberadoMtv" id="liberadoMtv" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="liberadoMtv" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LiberadoUsr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="liberadoUsr" id="liberadoUsr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="liberadoUsr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Marca:</label>
									<div class="col-sm-8">
										<form:input type="text" path="marca" id="marca" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="marca" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Ano:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ano" id="ano" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ano" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">OsDtaprov:</label>
									<div class="col-sm-8">
										<form:input type="text" path="osDtaprov" id="osDtaprov" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="osDtaprov" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">OsStatus:</label>
									<div class="col-sm-8">
										<form:input type="text" path="osStatus" id="osStatus" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="osStatus" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">GeradoEntrega:</label>
									<div class="col-sm-8">
										<form:input type="text" path="geradoEntrega" id="geradoEntrega" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="geradoEntrega" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codmedico:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codmedico" id="codmedico" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codmedico" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/pedvenda/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/pedvenda/list' />">Desistir</a>
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