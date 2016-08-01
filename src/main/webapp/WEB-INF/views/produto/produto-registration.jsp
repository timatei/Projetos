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
                    <h1 class="page-header">Produto</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de produto
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="produto" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codproduto" id="codproduto"/>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codpesq1:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codpesq1" id="codpesq1" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codpesq1" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Ativo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ativo" id="ativo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ativo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TipoProduto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="tipoProduto" id="tipoProduto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="tipoProduto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codprodutogrupo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codprodutogrupo" id="codprodutogrupo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codprodutogrupo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codprodutogruposubgrp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codprodutogruposubgrp" id="codprodutogruposubgrp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codprodutogruposubgrp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codprodutounidade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codprodutounidade" id="codprodutounidade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codprodutounidade" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstqAtual:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estqAtual" id="estqAtual" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estqAtual" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstqMin:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estqMin" id="estqMin" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estqMin" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CalcPrecoCompra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="calcPrecoCompra" id="calcPrecoCompra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="calcPrecoCompra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CalcFreteVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="calcFreteVlr" id="calcFreteVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="calcFreteVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CalcIcmsPerc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="calcIcmsPerc" id="calcIcmsPerc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="calcIcmsPerc" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CalcIpiPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="calcIpiPer" id="calcIpiPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="calcIpiPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CalcOutrosVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="calcOutrosVlr" id="calcOutrosVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="calcOutrosVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CalcCustoProduto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="calcCustoProduto" id="calcCustoProduto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="calcCustoProduto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AnteriorPreco01:</label>
									<div class="col-sm-8">
										<form:input type="text" path="anteriorPreco01" id="anteriorPreco01" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="anteriorPreco01" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AnteriorCalcPrecoCompra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="anteriorCalcPrecoCompra" id="anteriorCalcPrecoCompra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="anteriorCalcPrecoCompra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AnteriorCalcCustoProdut:</label>
									<div class="col-sm-8">
										<form:input type="text" path="anteriorCalcCustoProdut" id="anteriorCalcCustoProdut" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="anteriorCalcCustoProdut" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataUltCompra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataUltCompra" id="dataUltCompra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataUltCompra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Markp01:</label>
									<div class="col-sm-8">
										<form:input type="text" path="markp01" id="markp01" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="markp01" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Markp02:</label>
									<div class="col-sm-8">
										<form:input type="text" path="markp02" id="markp02" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="markp02" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Markp03:</label>
									<div class="col-sm-8">
										<form:input type="text" path="markp03" id="markp03" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="markp03" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Markp04:</label>
									<div class="col-sm-8">
										<form:input type="text" path="markp04" id="markp04" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="markp04" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Markp05:</label>
									<div class="col-sm-8">
										<form:input type="text" path="markp05" id="markp05" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="markp05" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preco01:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preco01" id="preco01" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preco01" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preco02:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preco02" id="preco02" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preco02" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preco03:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preco03" id="preco03" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preco03" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preco04:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preco04" id="preco04" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preco04" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preco05:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preco05" id="preco05" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preco05" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstqInicial:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estqInicial" id="estqInicial" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estqInicial" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Imagem:</label>
									<div class="col-sm-8">
										<form:input type="text" path="imagem" id="imagem" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="imagem" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AliqImp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aliqImp" id="aliqImp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aliqImp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AltPreco:</label>
									<div class="col-sm-8">
										<form:input type="text" path="altPreco" id="altPreco" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="altPreco" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">StTrib:</label>
									<div class="col-sm-8">
										<form:input type="text" path="stTrib" id="stTrib" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="stTrib" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Comp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="comp" id="comp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="comp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">UndcompQtde:</label>
									<div class="col-sm-8">
										<form:input type="text" path="undcompQtde" id="undcompQtde" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="undcompQtde" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">UndcompQtdeemb:</label>
									<div class="col-sm-8">
										<form:input type="text" path="undcompQtdeemb" id="undcompQtdeemb" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="undcompQtdeemb" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codprodutocatesp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codprodutocatesp" id="codprodutocatesp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codprodutocatesp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codfabricante:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codfabricante" id="codfabricante" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codfabricante" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Lote:</label>
									<div class="col-sm-8">
										<form:input type="text" path="lote" id="lote" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="lote" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Tipolista:</label>
									<div class="col-sm-8">
										<form:input type="text" path="tipolista" id="tipolista" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="tipolista" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LicBoapratica:</label>
									<div class="col-sm-8">
										<form:input type="text" path="licBoapratica" id="licBoapratica" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="licBoapratica" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LicRegistro:</label>
									<div class="col-sm-8">
										<form:input type="text" path="licRegistro" id="licRegistro" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="licRegistro" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codclassfiscal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codclassfiscal" id="codclassfiscal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codclassfiscal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SiTribApolo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="siTribApolo" id="siTribApolo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="siTribApolo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codmarca:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codmarca" id="codmarca" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codmarca" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codprodutocor:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codprodutocor" id="codprodutocor" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codprodutocor" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codprodutocurvatura:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codprodutocurvatura" id="codprodutocurvatura" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codprodutocurvatura" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codprodutodiametro:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codprodutodiametro" id="codprodutodiametro" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codprodutodiametro" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codprodutograu:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codprodutograu" id="codprodutograu" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codprodutograu" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RegIcms:</label>
									<div class="col-sm-8">
										<form:input type="text" path="regIcms" id="regIcms" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="regIcms" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrCustoMargem:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrCustoMargem" id="vlrCustoMargem" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrCustoMargem" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codprodutotipolente:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codprodutotipolente" id="codprodutotipolente" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codprodutotipolente" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codprodutoadicao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codprodutoadicao" id="codprodutoadicao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codprodutoadicao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codprodutoeixo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codprodutoeixo" id="codprodutoeixo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codprodutoeixo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codfab:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codfab" id="codfab" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codfab" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codprodutocilindro:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codprodutocilindro" id="codprodutocilindro" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codprodutocilindro" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codcor:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codcor" id="codcor" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codcor" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codprodutoclone:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codprodutoclone" id="codprodutoclone" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codprodutoclone" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Lente:</label>
									<div class="col-sm-8">
										<form:input type="text" path="lente" id="lente" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="lente" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Servico:</label>
									<div class="col-sm-8">
										<form:input type="text" path="servico" id="servico" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="servico" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Composto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="composto" id="composto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="composto" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">CodbarComposto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codbarComposto" id="codbarComposto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codbarComposto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Localizacao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="localizacao" id="localizacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="localizacao" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Referencia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="referencia" id="referencia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="referencia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Comissao1:</label>
									<div class="col-sm-8">
										<form:input type="text" path="comissao1" id="comissao1" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="comissao1" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Comissao2:</label>
									<div class="col-sm-8">
										<form:input type="text" path="comissao2" id="comissao2" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="comissao2" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Ncm:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ncm" id="ncm" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ncm" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DiasEntrega:</label>
									<div class="col-sm-8">
										<form:input type="text" path="diasEntrega" id="diasEntrega" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="diasEntrega" class="label label-danger"/>
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

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DescMax:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descMax" id="descMax" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descMax" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RemControlado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="remControlado" id="remControlado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="remControlado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RegMs:</label>
									<div class="col-sm-8">
										<form:input type="text" path="regMs" id="regMs" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="regMs" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RemGenerico:</label>
									<div class="col-sm-8">
										<form:input type="text" path="remGenerico" id="remGenerico" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="remGenerico" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ControlaLote:</label>
									<div class="col-sm-8">
										<form:input type="text" path="controlaLote" id="controlaLote" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="controlaLote" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NaoAtualizaCusto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="naoAtualizaCusto" id="naoAtualizaCusto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="naoAtualizaCusto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CompPedido:</label>
									<div class="col-sm-8">
										<form:input type="text" path="compPedido" id="compPedido" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="compPedido" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CompPedidoAnterior:</label>
									<div class="col-sm-8">
										<form:input type="text" path="compPedidoAnterior" id="compPedidoAnterior" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="compPedidoAnterior" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">StMva:</label>
									<div class="col-sm-8">
										<form:input type="text" path="stMva" id="stMva" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="stMva" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">St:</label>
									<div class="col-sm-8">
										<form:input type="text" path="st" id="st" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="st" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">StIcmsVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="stIcmsVlr" id="stIcmsVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="stIcmsVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CalcIcmsVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="calcIcmsVlr" id="calcIcmsVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="calcIcmsVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CalcIpiVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="calcIpiVlr" id="calcIpiVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="calcIpiVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AnteriorIcmsVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="anteriorIcmsVlr" id="anteriorIcmsVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="anteriorIcmsVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AnteriorIpiVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="anteriorIpiVlr" id="anteriorIpiVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="anteriorIpiVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AnteriorStIcmsVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="anteriorStIcmsVlr" id="anteriorStIcmsVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="anteriorStIcmsVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AnteriorOutrosVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="anteriorOutrosVlr" id="anteriorOutrosVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="anteriorOutrosVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AnteriorFreteVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="anteriorFreteVlr" id="anteriorFreteVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="anteriorFreteVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CalcImpFront:</label>
									<div class="col-sm-8">
										<form:input type="text" path="calcImpFront" id="calcImpFront" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="calcImpFront" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CalcIcmsBase:</label>
									<div class="col-sm-8">
										<form:input type="text" path="calcIcmsBase" id="calcIcmsBase" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="calcIcmsBase" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CalcFreteIcmsVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="calcFreteIcmsVlr" id="calcFreteIcmsVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="calcFreteIcmsVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CalcFreteIcmsAliq:</label>
									<div class="col-sm-8">
										<form:input type="text" path="calcFreteIcmsAliq" id="calcFreteIcmsAliq" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="calcFreteIcmsAliq" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">StIcmsBase:</label>
									<div class="col-sm-8">
										<form:input type="text" path="stIcmsBase" id="stIcmsBase" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="stIcmsBase" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">UltIpivlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ultIpivlr" id="ultIpivlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ultIpivlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">UltFretevlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ultFretevlr" id="ultFretevlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ultFretevlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">UltIcmssub:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ultIcmssub" id="ultIcmssub" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ultIcmssub" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">UltOutrosvlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ultOutrosvlr" id="ultOutrosvlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ultOutrosvlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">UltIcmsvlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ultIcmsvlr" id="ultIcmsvlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ultIcmsvlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">UltImpFront:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ultImpFront" id="ultImpFront" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ultImpFront" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">AnteriorImpFront:</label>
									<div class="col-sm-8">
										<form:input type="text" path="anteriorImpFront" id="anteriorImpFront" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="anteriorImpFront" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Visual:</label>
									<div class="col-sm-8">
										<form:input type="text" path="visual" id="visual" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="visual" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TipoSaida:</label>
									<div class="col-sm-8">
										<form:input type="text" path="tipoSaida" id="tipoSaida" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="tipoSaida" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Ocorrencia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ocorrencia" id="ocorrencia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ocorrencia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Filial:</label>
									<div class="col-sm-8">
										<form:input type="text" path="filial" id="filial" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="filial" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">StMva7:</label>
									<div class="col-sm-8">
										<form:input type="text" path="stMva7" id="stMva7" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="stMva7" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">StMva12:</label>
									<div class="col-sm-8">
										<form:input type="text" path="stMva12" id="stMva12" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="stMva12" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstoqMinZero:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estoqMinZero" id="estoqMinZero" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estoqMinZero" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstqMax:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estqMax" id="estqMax" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estqMax" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preco01Ant:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preco01Ant" id="preco01Ant" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preco01Ant" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DtCadastro:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dtCadastro" id="dtCadastro" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dtCadastro" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">ConfirmarEntrega:</label>
									<div class="col-sm-8">
										<form:input type="text" path="confirmarEntrega" id="confirmarEntrega" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="confirmarEntrega" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cst:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cst" id="cst" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cst" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Ferramenta:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ferramenta" id="ferramenta" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ferramenta" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Epi:</label>
									<div class="col-sm-8">
										<form:input type="text" path="epi" id="epi" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="epi" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">MatConsumo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="matConsumo" id="matConsumo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="matConsumo" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Modificacao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="modificacao" id="modificacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="modificacao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstqDataUltEntrada:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estqDataUltEntrada" id="estqDataUltEntrada" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estqDataUltEntrada" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstqDataUltSaida:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estqDataUltSaida" id="estqDataUltSaida" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estqDataUltSaida" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CurvaAbc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="curvaAbc" id="curvaAbc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="curvaAbc" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">DescricaoTemp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descricaoTemp" id="descricaoTemp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descricaoTemp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">IcmsOrigem:</label>
									<div class="col-sm-8">
										<form:input type="text" path="icmsOrigem" id="icmsOrigem" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="icmsOrigem" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">DescTecnica:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descTecnica" id="descTecnica" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descTecnica" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preco06:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preco06" id="preco06" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preco06" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preco07:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preco07" id="preco07" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preco07" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preco08:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preco08" id="preco08" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preco08" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preco09:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preco09" id="preco09" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preco09" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preco10:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preco10" id="preco10" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preco10" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preco11:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preco11" id="preco11" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preco11" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preco12:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preco12" id="preco12" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preco12" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preco13:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preco13" id="preco13" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preco13" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Preco14:</label>
									<div class="col-sm-8">
										<form:input type="text" path="preco14" id="preco14" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="preco14" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PrazoEntrega:</label>
									<div class="col-sm-8">
										<form:input type="text" path="prazoEntrega" id="prazoEntrega" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="prazoEntrega" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TipoImpressao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="tipoImpressao" id="tipoImpressao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="tipoImpressao" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">AliqIpi:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aliqIpi" id="aliqIpi" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aliqIpi" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NpermSemestoq:</label>
									<div class="col-sm-8">
										<form:input type="text" path="npermSemestoq" id="npermSemestoq" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="npermSemestoq" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NpermFracionado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="npermFracionado" id="npermFracionado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="npermFracionado" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">AliqIcmsFora:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aliqIcmsFora" id="aliqIcmsFora" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aliqIcmsFora" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ObsNfc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="obsNfc" id="obsNfc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="obsNfc" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Normal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="normal" id="normal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="normal" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Patrimonio:</label>
									<div class="col-sm-8">
										<form:input type="text" path="patrimonio" id="patrimonio" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="patrimonio" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Calibrado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="calibrado" id="calibrado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="calibrado" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">UltDescvlrNf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ultDescvlrNf" id="ultDescvlrNf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ultDescvlrNf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AnteriorDescvlrNf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="anteriorDescvlrNf" id="anteriorDescvlrNf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="anteriorDescvlrNf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CalcDescvlrNf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="calcDescvlrNf" id="calcDescvlrNf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="calcDescvlrNf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstqReservado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estqReservado" id="estqReservado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estqReservado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">IcmsTipo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="icmsTipo" id="icmsTipo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="icmsTipo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">IvaTipo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ivaTipo" id="ivaTipo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ivaTipo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AliqIcmsNcont:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aliqIcmsNcont" id="aliqIcmsNcont" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aliqIcmsNcont" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AliqIcmsForaNcont:</label>
									<div class="col-sm-8">
										<form:input type="text" path="aliqIcmsForaNcont" id="aliqIcmsForaNcont" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="aliqIcmsForaNcont" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">PerReducFora:</label>
									<div class="col-sm-8">
										<form:input type="text" path="perReducFora" id="perReducFora" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="perReducFora" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PerReducNcont:</label>
									<div class="col-sm-8">
										<form:input type="text" path="perReducNcont" id="perReducNcont" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="perReducNcont" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PerReducForaNcont:</label>
									<div class="col-sm-8">
										<form:input type="text" path="perReducForaNcont" id="perReducForaNcont" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="perReducForaNcont" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VendedorCustomizado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vendedorCustomizado" id="vendedorCustomizado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vendedorCustomizado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrOutros:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrOutros" id="vlrOutros" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrOutros" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrAtualBem:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrAtualBem" id="vlrAtualBem" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrAtualBem" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PerDepreciacao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="perDepreciacao" id="perDepreciacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="perDepreciacao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Repistolar:</label>
									<div class="col-sm-8">
										<form:input type="text" path="repistolar" id="repistolar" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="repistolar" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Balanca:</label>
									<div class="col-sm-8">
										<form:input type="text" path="balanca" id="balanca" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="balanca" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DiasValidade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="diasValidade" id="diasValidade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="diasValidade" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Iat:</label>
									<div class="col-sm-8">
										<form:input type="text" path="iat" id="iat" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="iat" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Ippt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ippt" id="ippt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ippt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Gtin:</label>
									<div class="col-sm-8">
										<form:input type="text" path="gtin" id="gtin" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="gtin" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NcmEx:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ncmEx" id="ncmEx" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ncmEx" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NcmTabela:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ncmTabela" id="ncmTabela" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ncmTabela" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NcmAliq:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ncmAliq" id="ncmAliq" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ncmAliq" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataUltVenda:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataUltVenda" id="dataUltVenda" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataUltVenda" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DescricaoMenor:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descricaoMenor" id="descricaoMenor" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descricaoMenor" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Personalizado:</label>
									<div class="col-sm-8">
										<form:input type="text" path="personalizado" id="personalizado" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="personalizado" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DescDinheiro:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descDinheiro" id="descDinheiro" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descDinheiro" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DescOutros:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descOutros" id="descOutros" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descOutros" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoTipo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoTipo" id="promoTipo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoTipo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoDtini:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoDtini" id="promoDtini" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoDtini" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoDtfinal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoDtfinal" id="promoDtfinal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoDtfinal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoSegChk:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoSegChk" id="promoSegChk" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoSegChk" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoTerChk:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoTerChk" id="promoTerChk" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoTerChk" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoQuaChk:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoQuaChk" id="promoQuaChk" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoQuaChk" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoQuiChk:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoQuiChk" id="promoQuiChk" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoQuiChk" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoSexChk:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoSexChk" id="promoSexChk" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoSexChk" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoSabChk:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoSabChk" id="promoSabChk" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoSabChk" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoDomChk:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoDomChk" id="promoDomChk" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoDomChk" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoSegHrini:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoSegHrini" id="promoSegHrini" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoSegHrini" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoSegHrfinal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoSegHrfinal" id="promoSegHrfinal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoSegHrfinal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoTerHrini:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoTerHrini" id="promoTerHrini" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoTerHrini" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoTerHrfinal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoTerHrfinal" id="promoTerHrfinal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoTerHrfinal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoQuaHrini:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoQuaHrini" id="promoQuaHrini" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoQuaHrini" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoQuaHrfinal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoQuaHrfinal" id="promoQuaHrfinal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoQuaHrfinal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoQuiHrini:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoQuiHrini" id="promoQuiHrini" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoQuiHrini" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoQuiHrfinal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoQuiHrfinal" id="promoQuiHrfinal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoQuiHrfinal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoSexHrini:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoSexHrini" id="promoSexHrini" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoSexHrini" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoSexHrfinal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoSexHrfinal" id="promoSexHrfinal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoSexHrfinal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoSabHrini:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoSabHrini" id="promoSabHrini" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoSabHrini" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoSabHrfinal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoSabHrfinal" id="promoSabHrfinal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoSabHrfinal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoDomHrini:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoDomHrini" id="promoDomHrini" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoDomHrini" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PromoDomHrfinal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="promoDomHrfinal" id="promoDomHrfinal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="promoDomHrfinal" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">EstqAtualAntes:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estqAtualAntes" id="estqAtualAntes" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estqAtualAntes" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/produto/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/produto/list' />">Desistir</a>
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