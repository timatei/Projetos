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
                    <h1 class="page-header">PedvendaItem</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de pedvendaItem
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="pedvendaItem" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codpedvendaitem" id="codpedvendaitem"/>

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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codproduto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codproduto" id="codproduto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codproduto" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Qtde:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtde" id="qtde" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtde" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Descvlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descvlr" id="descvlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descvlr" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codpesquisa:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codpesquisa" id="codpesquisa" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codpesquisa" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Item:</label>
									<div class="col-sm-8">
										<form:input type="text" path="item" id="item" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="item" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">QtdeFat:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtdeFat" id="qtdeFat" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtdeFat" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Origem:</label>
									<div class="col-sm-8">
										<form:input type="text" path="origem" id="origem" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="origem" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">QtdeEntr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtdeEntr" id="qtdeEntr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtdeEntr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Paciente:</label>
									<div class="col-sm-8">
										<form:input type="text" path="paciente" id="paciente" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="paciente" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Pedi:</label>
									<div class="col-sm-8">
										<form:input type="text" path="pedi" id="pedi" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="pedi" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">CustoProduto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="custoProduto" id="custoProduto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="custoProduto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Perdesc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="perdesc" id="perdesc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="perdesc" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TotalDesconto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="totalDesconto" id="totalDesconto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="totalDesconto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

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
									<label class="col-sm-2 control-label" for="inline-suggestions">Tmp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="tmp" id="tmp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="tmp" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">DescPropPed:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descPropPed" id="descPropPed" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descPropPed" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrComissao1:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrComissao1" id="vlrComissao1" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrComissao1" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrComissao2:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrComissao2" id="vlrComissao2" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrComissao2" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TrocaPropPed:</label>
									<div class="col-sm-8">
										<form:input type="text" path="trocaPropPed" id="trocaPropPed" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="trocaPropPed" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AntVlrComis1:</label>
									<div class="col-sm-8">
										<form:input type="text" path="antVlrComis1" id="antVlrComis1" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="antVlrComis1" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AntVlrComis2:</label>
									<div class="col-sm-8">
										<form:input type="text" path="antVlrComis2" id="antVlrComis2" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="antVlrComis2" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Vlrdif:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrdif" id="vlrdif" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrdif" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AcrescPropPed:</label>
									<div class="col-sm-8">
										<form:input type="text" path="acrescPropPed" id="acrescPropPed" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="acrescPropPed" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Numlote:</label>
									<div class="col-sm-8">
										<form:input type="text" path="numlote" id="numlote" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="numlote" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Medico:</label>
									<div class="col-sm-8">
										<form:input type="text" path="medico" id="medico" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="medico" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">MedicoRp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="medicoRp" id="medicoRp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="medicoRp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">MedicoRpTipo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="medicoRpTipo" id="medicoRpTipo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="medicoRpTipo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">MedicoRpUf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="medicoRpUf" id="medicoRpUf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="medicoRpUf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ReceitaDt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="receitaDt" id="receitaDt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="receitaDt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ReceitaTp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="receitaTp" id="receitaTp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="receitaTp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ReceitaNr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="receitaNr" id="receitaNr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="receitaNr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RecNome:</label>
									<div class="col-sm-8">
										<form:input type="text" path="recNome" id="recNome" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="recNome" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RecId:</label>
									<div class="col-sm-8">
										<form:input type="text" path="recId" id="recId" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="recId" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RecOrg:</label>
									<div class="col-sm-8">
										<form:input type="text" path="recOrg" id="recOrg" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="recOrg" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RecUf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="recUf" id="recUf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="recUf" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">StatusEntrega:</label>
									<div class="col-sm-8">
										<form:input type="text" path="statusEntrega" id="statusEntrega" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="statusEntrega" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Acrescvlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="acrescvlr" id="acrescvlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="acrescvlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Peracresc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="peracresc" id="peracresc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="peracresc" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TotalAcrescimo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="totalAcrescimo" id="totalAcrescimo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="totalAcrescimo" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">PendCompraGerada:</label>
									<div class="col-sm-8">
										<form:input type="text" path="pendCompraGerada" id="pendCompraGerada" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="pendCompraGerada" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preparacao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preparacao" id="preparacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preparacao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PrecoCompra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="precoCompra" id="precoCompra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="precoCompra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">UltPrecoCompra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ultPrecoCompra" id="ultPrecoCompra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ultPrecoCompra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">UltCusto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ultCusto" id="ultCusto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ultCusto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AntCalcPrecoCompra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="antCalcPrecoCompra" id="antCalcPrecoCompra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="antCalcPrecoCompra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AntCalcCustoProduto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="antCalcCustoProduto" id="antCalcCustoProduto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="antCalcCustoProduto" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrIpi:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrIpi" id="vlrIpi" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrIpi" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrIcms:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrIcms" id="vlrIcms" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrIcms" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BcIcms:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bcIcms" id="bcIcms" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bcIcms" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BcIpi:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bcIpi" id="bcIpi" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bcIpi" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codvendedor:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codvendedor" id="codvendedor" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codvendedor" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">EstoqueBaixado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estoqueBaixado" id="estoqueBaixado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estoqueBaixado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ReceitaPacNome:</label>
									<div class="col-sm-8">
										<form:input type="text" path="receitaPacNome" id="receitaPacNome" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="receitaPacNome" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ReceitaPacIdade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="receitaPacIdade" id="receitaPacIdade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="receitaPacIdade" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ReceitaPacSexo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="receitaPacSexo" id="receitaPacSexo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="receitaPacSexo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">QtdeReserva:</label>
									<div class="col-sm-8">
										<form:input type="text" path="qtdeReserva" id="qtdeReserva" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="qtdeReserva" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">PerReduc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="perReduc" id="perReduc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="perReduc" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">ReservaOk:</label>
									<div class="col-sm-8">
										<form:input type="text" path="reservaOk" id="reservaOk" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="reservaOk" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Fornecedor:</label>
									<div class="col-sm-8">
										<form:input type="text" path="fornecedor" id="fornecedor" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="fornecedor" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codnfvendaitem:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codnfvendaitem" id="codnfvendaitem" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codnfvendaitem" class="label label-danger"/>
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

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/pedvendaItem/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/pedvendaItem/list' />">Desistir</a>
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