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
                    <h1 class="page-header">Pessoa</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de pessoa
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="pessoa" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codpessoa" id="codpessoa"/>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TipoPessoa:</label>
									<div class="col-sm-8">
										<form:input type="text" path="tipoPessoa" id="tipoPessoa" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="tipoPessoa" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Nome:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nome" id="nome" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nome" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RazaoSocial:</label>
									<div class="col-sm-8">
										<form:input type="text" path="razaoSocial" id="razaoSocial" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="razaoSocial" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cpfcnpj:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cpfcnpj" id="cpfcnpj" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cpfcnpj" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Ie:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ie" id="ie" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ie" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Im:</label>
									<div class="col-sm-8">
										<form:input type="text" path="im" id="im" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="im" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Endereco:</label>
									<div class="col-sm-8">
										<form:input type="text" path="endereco" id="endereco" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="endereco" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EnderecoNumero:</label>
									<div class="col-sm-8">
										<form:input type="text" path="enderecoNumero" id="enderecoNumero" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="enderecoNumero" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EnderecoComplemento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="enderecoComplemento" id="enderecoComplemento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="enderecoComplemento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Bairro:</label>
									<div class="col-sm-8">
										<form:input type="text" path="bairro" id="bairro" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="bairro" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cidade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cidade" id="cidade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cidade" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Uf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="uf" id="uf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="uf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cep:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cep" id="cep" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cep" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TelefoneDdd:</label>
									<div class="col-sm-8">
										<form:input type="text" path="telefoneDdd" id="telefoneDdd" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="telefoneDdd" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">FaxDdd:</label>
									<div class="col-sm-8">
										<form:input type="text" path="faxDdd" id="faxDdd" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="faxDdd" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Fax:</label>
									<div class="col-sm-8">
										<form:input type="text" path="fax" id="fax" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="fax" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CelularDdd:</label>
									<div class="col-sm-8">
										<form:input type="text" path="celularDdd" id="celularDdd" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="celularDdd" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Celular:</label>
									<div class="col-sm-8">
										<form:input type="text" path="celular" id="celular" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="celular" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Contatos:</label>
									<div class="col-sm-8">
										<form:input type="text" path="contatos" id="contatos" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="contatos" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Homepage:</label>
									<div class="col-sm-8">
										<form:input type="text" path="homepage" id="homepage" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="homepage" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PontoReferencia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="pontoReferencia" id="pontoReferencia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="pontoReferencia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ClassCli:</label>
									<div class="col-sm-8">
										<form:input type="text" path="classCli" id="classCli" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="classCli" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ClassFor:</label>
									<div class="col-sm-8">
										<form:input type="text" path="classFor" id="classFor" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="classFor" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ClassTra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="classTra" id="classTra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="classTra" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">ClassFab:</label>
									<div class="col-sm-8">
										<form:input type="text" path="classFab" id="classFab" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="classFab" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LimiteCredito:</label>
									<div class="col-sm-8">
										<form:input type="text" path="limiteCredito" id="limiteCredito" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="limiteCredito" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ConsumidorFinal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="consumidorFinal" id="consumidorFinal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="consumidorFinal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Dsp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dsp" id="dsp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dsp" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codvendedor:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codvendedor" id="codvendedor" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codvendedor" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VenComissao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="venComissao" id="venComissao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="venComissao" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">DescMax:</label>
									<div class="col-sm-8">
										<form:input type="text" path="descMax" id="descMax" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="descMax" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Optica:</label>
									<div class="col-sm-8">
										<form:input type="text" path="optica" id="optica" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="optica" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Sexo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="sexo" id="sexo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="sexo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Profissao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="profissao" id="profissao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="profissao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Filhos:</label>
									<div class="col-sm-8">
										<form:input type="text" path="filhos" id="filhos" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="filhos" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TpCadLoja:</label>
									<div class="col-sm-8">
										<form:input type="text" path="tpCadLoja" id="tpCadLoja" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="tpCadLoja" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TpCadOutr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="tpCadOutr" id="tpCadOutr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="tpCadOutr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TpCadCart:</label>
									<div class="col-sm-8">
										<form:input type="text" path="tpCadCart" id="tpCadCart" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="tpCadCart" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Adicao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="adicao" id="adicao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="adicao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LngOdEsf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="lngOdEsf" id="lngOdEsf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="lngOdEsf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LngOdCil:</label>
									<div class="col-sm-8">
										<form:input type="text" path="lngOdCil" id="lngOdCil" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="lngOdCil" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LngOdEixo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="lngOdEixo" id="lngOdEixo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="lngOdEixo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LngOdAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="lngOdAlt" id="lngOdAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="lngOdAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LngOdDnp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="lngOdDnp" id="lngOdDnp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="lngOdDnp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LngOeEsf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="lngOeEsf" id="lngOeEsf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="lngOeEsf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LngOeCil:</label>
									<div class="col-sm-8">
										<form:input type="text" path="lngOeCil" id="lngOeCil" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="lngOeCil" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LngOeEixo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="lngOeEixo" id="lngOeEixo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="lngOeEixo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LngOeAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="lngOeAlt" id="lngOeAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="lngOeAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LngOeDnp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="lngOeDnp" id="lngOeDnp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="lngOeDnp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PrtOdEsf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="prtOdEsf" id="prtOdEsf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="prtOdEsf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PrtOdCil:</label>
									<div class="col-sm-8">
										<form:input type="text" path="prtOdCil" id="prtOdCil" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="prtOdCil" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PrtOdEixo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="prtOdEixo" id="prtOdEixo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="prtOdEixo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PrtOdAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="prtOdAlt" id="prtOdAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="prtOdAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PrtOdDnp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="prtOdDnp" id="prtOdDnp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="prtOdDnp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PrtOeEsf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="prtOeEsf" id="prtOeEsf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="prtOeEsf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PrtOeCil:</label>
									<div class="col-sm-8">
										<form:input type="text" path="prtOeCil" id="prtOeCil" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="prtOeCil" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PrtOeEixo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="prtOeEixo" id="prtOeEixo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="prtOeEixo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PrtOeAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="prtOeAlt" id="prtOeAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="prtOeAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PrtOeDnp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="prtOeDnp" id="prtOeDnp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="prtOeDnp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CnhCategoria:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cnhCategoria" id="cnhCategoria" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cnhCategoria" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CnhNumero:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cnhNumero" id="cnhNumero" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cnhNumero" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CnhDt1cart:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cnhDt1cart" id="cnhDt1cart" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cnhDt1cart" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CnhDtEmissao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cnhDtEmissao" id="cnhDtEmissao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cnhDtEmissao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CnhObs:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cnhObs" id="cnhObs" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cnhObs" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">VeiModelo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="veiModelo" id="veiModelo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="veiModelo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VeiCor:</label>
									<div class="col-sm-8">
										<form:input type="text" path="veiCor" id="veiCor" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="veiCor" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DtNasc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dtNasc" id="dtNasc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dtNasc" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Pai:</label>
									<div class="col-sm-8">
										<form:input type="text" path="pai" id="pai" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="pai" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Mae:</label>
									<div class="col-sm-8">
										<form:input type="text" path="mae" id="mae" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="mae" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Escolidade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="escolidade" id="escolidade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="escolidade" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Fonte:</label>
									<div class="col-sm-8">
										<form:input type="text" path="fonte" id="fonte" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="fonte" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Escola:</label>
									<div class="col-sm-8">
										<form:input type="text" path="escola" id="escola" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="escola" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EstadoCivil:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estadoCivil" id="estadoCivil" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estadoCivil" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codcidade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codcidade" id="codcidade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codcidade" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Naturalidade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="naturalidade" id="naturalidade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="naturalidade" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EscolaSerie:</label>
									<div class="col-sm-8">
										<form:input type="text" path="escolaSerie" id="escolaSerie" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="escolaSerie" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Rg:</label>
									<div class="col-sm-8">
										<form:input type="text" path="rg" id="rg" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="rg" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Parceria:</label>
									<div class="col-sm-8">
										<form:input type="text" path="parceria" id="parceria" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="parceria" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Grade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="grade" id="grade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="grade" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Faturamento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="faturamento" id="faturamento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="faturamento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codfonte:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codfonte" id="codfonte" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codfonte" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codgrade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codgrade" id="codgrade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codgrade" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codfaixafaturamento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codfaixafaturamento" id="codfaixafaturamento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codfaixafaturamento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codparceria:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codparceria" id="codparceria" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codparceria" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">MediaFaturamento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="mediaFaturamento" id="mediaFaturamento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="mediaFaturamento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Ant:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ant" id="ant" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ant" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Atendimento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="atendimento" id="atendimento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="atendimento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Simul:</label>
									<div class="col-sm-8">
										<form:input type="text" path="simul" id="simul" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="simul" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SimulAn:</label>
									<div class="col-sm-8">
										<form:input type="text" path="simulAn" id="simulAn" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="simulAn" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">MediaFaturamentoSim:</label>
									<div class="col-sm-8">
										<form:input type="text" path="mediaFaturamentoSim" id="mediaFaturamentoSim" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="mediaFaturamentoSim" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Pais:</label>
									<div class="col-sm-8">
										<form:input type="text" path="pais" id="pais" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="pais" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ClassFun:</label>
									<div class="col-sm-8">
										<form:input type="text" path="classFun" id="classFun" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="classFun" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PrevProxVenda:</label>
									<div class="col-sm-8">
										<form:input type="text" path="prevProxVenda" id="prevProxVenda" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="prevProxVenda" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ClassParc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="classParc" id="classParc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="classParc" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codcli:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codcli" id="codcli" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codcli" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Classificacao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="classificacao" id="classificacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="classificacao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TrabEmpresa:</label>
									<div class="col-sm-8">
										<form:input type="text" path="trabEmpresa" id="trabEmpresa" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="trabEmpresa" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TrabDtAdmissao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="trabDtAdmissao" id="trabDtAdmissao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="trabDtAdmissao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TrabEndereco:</label>
									<div class="col-sm-8">
										<form:input type="text" path="trabEndereco" id="trabEndereco" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="trabEndereco" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TrabCargo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="trabCargo" id="trabCargo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="trabCargo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TrabSalario:</label>
									<div class="col-sm-8">
										<form:input type="text" path="trabSalario" id="trabSalario" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="trabSalario" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CobrEndereco:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cobrEndereco" id="cobrEndereco" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cobrEndereco" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CobrEnderecoNumero:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cobrEnderecoNumero" id="cobrEnderecoNumero" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cobrEnderecoNumero" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CobrEnderecoComplemento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cobrEnderecoComplemento" id="cobrEnderecoComplemento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cobrEnderecoComplemento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CobrEnderecoBairro:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cobrEnderecoBairro" id="cobrEnderecoBairro" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cobrEnderecoBairro" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CobrEnderecoCidade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cobrEnderecoCidade" id="cobrEnderecoCidade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cobrEnderecoCidade" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CobrEnderecoCep:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cobrEnderecoCep" id="cobrEnderecoCep" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cobrEnderecoCep" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">CobrEnderecoPontoRef:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cobrEnderecoPontoRef" id="cobrEnderecoPontoRef" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cobrEnderecoPontoRef" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AvalNome:</label>
									<div class="col-sm-8">
										<form:input type="text" path="avalNome" id="avalNome" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="avalNome" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AvalRg:</label>
									<div class="col-sm-8">
										<form:input type="text" path="avalRg" id="avalRg" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="avalRg" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AvalCpf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="avalCpf" id="avalCpf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="avalCpf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AvalDtNasc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="avalDtNasc" id="avalDtNasc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="avalDtNasc" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AvalEndereco:</label>
									<div class="col-sm-8">
										<form:input type="text" path="avalEndereco" id="avalEndereco" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="avalEndereco" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AvalTelefoneDdd:</label>
									<div class="col-sm-8">
										<form:input type="text" path="avalTelefoneDdd" id="avalTelefoneDdd" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="avalTelefoneDdd" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AvalTelefone:</label>
									<div class="col-sm-8">
										<form:input type="text" path="avalTelefone" id="avalTelefone" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="avalTelefone" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AvalCargoProfissao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="avalCargoProfissao" id="avalCargoProfissao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="avalCargoProfissao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AvalEmpresa:</label>
									<div class="col-sm-8">
										<form:input type="text" path="avalEmpresa" id="avalEmpresa" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="avalEmpresa" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AvalSalario:</label>
									<div class="col-sm-8">
										<form:input type="text" path="avalSalario" id="avalSalario" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="avalSalario" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RefPes1Nome:</label>
									<div class="col-sm-8">
										<form:input type="text" path="refPes1Nome" id="refPes1Nome" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="refPes1Nome" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RefPes1Telefones:</label>
									<div class="col-sm-8">
										<form:input type="text" path="refPes1Telefones" id="refPes1Telefones" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="refPes1Telefones" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RefPes1Endereco:</label>
									<div class="col-sm-8">
										<form:input type="text" path="refPes1Endereco" id="refPes1Endereco" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="refPes1Endereco" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RefPes2Nome:</label>
									<div class="col-sm-8">
										<form:input type="text" path="refPes2Nome" id="refPes2Nome" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="refPes2Nome" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RefPes2Telefones:</label>
									<div class="col-sm-8">
										<form:input type="text" path="refPes2Telefones" id="refPes2Telefones" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="refPes2Telefones" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RefPes2Endereco:</label>
									<div class="col-sm-8">
										<form:input type="text" path="refPes2Endereco" id="refPes2Endereco" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="refPes2Endereco" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RefCom1Estabelecimento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="refCom1Estabelecimento" id="refCom1Estabelecimento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="refCom1Estabelecimento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RefCom1DtCompra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="refCom1DtCompra" id="refCom1DtCompra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="refCom1DtCompra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RefCom1VlrCompra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="refCom1VlrCompra" id="refCom1VlrCompra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="refCom1VlrCompra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RefCom1QtdeParcelas:</label>
									<div class="col-sm-8">
										<form:input type="text" path="refCom1QtdeParcelas" id="refCom1QtdeParcelas" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="refCom1QtdeParcelas" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RefCom2Estabelecimento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="refCom2Estabelecimento" id="refCom2Estabelecimento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="refCom2Estabelecimento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RefCom2DtCompra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="refCom2DtCompra" id="refCom2DtCompra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="refCom2DtCompra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RefCom2VlrCompra:</label>
									<div class="col-sm-8">
										<form:input type="text" path="refCom2VlrCompra" id="refCom2VlrCompra" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="refCom2VlrCompra" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RefCom2QtdeParcelas:</label>
									<div class="col-sm-8">
										<form:input type="text" path="refCom2QtdeParcelas" id="refCom2QtdeParcelas" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="refCom2QtdeParcelas" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Grupo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="grupo" id="grupo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="grupo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codpessoagrupo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codpessoagrupo" id="codpessoagrupo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codpessoagrupo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codveiculomarca:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codveiculomarca" id="codveiculomarca" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codveiculomarca" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codveiculomodelo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codveiculomodelo" id="codveiculomodelo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codveiculomodelo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codveiculocor:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codveiculocor" id="codveiculocor" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codveiculocor" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VeiAno:</label>
									<div class="col-sm-8">
										<form:input type="text" path="veiAno" id="veiAno" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="veiAno" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">MesReajuste:</label>
									<div class="col-sm-8">
										<form:input type="text" path="mesReajuste" id="mesReajuste" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="mesReajuste" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Skype:</label>
									<div class="col-sm-8">
										<form:input type="text" path="skype" id="skype" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="skype" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Msn:</label>
									<div class="col-sm-8">
										<form:input type="text" path="msn" id="msn" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="msn" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Paypal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="paypal" id="paypal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="paypal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codpais:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codpais" id="codpais" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codpais" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Provincia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="provincia" id="provincia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="provincia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Nivel:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nivel" id="nivel" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nivel" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Pontos:</label>
									<div class="col-sm-8">
										<form:input type="text" path="pontos" id="pontos" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="pontos" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PontosRecebidos:</label>
									<div class="col-sm-8">
										<form:input type="text" path="pontosRecebidos" id="pontosRecebidos" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="pontosRecebidos" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Comissao3:</label>
									<div class="col-sm-8">
										<form:input type="text" path="comissao3" id="comissao3" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="comissao3" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Comissao4:</label>
									<div class="col-sm-8">
										<form:input type="text" path="comissao4" id="comissao4" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="comissao4" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Comissao5:</label>
									<div class="col-sm-8">
										<form:input type="text" path="comissao5" id="comissao5" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="comissao5" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codtransportadora:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codtransportadora" id="codtransportadora" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codtransportadora" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Login:</label>
									<div class="col-sm-8">
										<form:input type="text" path="login" id="login" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="login" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Senha:</label>
									<div class="col-sm-8">
										<form:input type="text" path="senha" id="senha" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="senha" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Fase:</label>
									<div class="col-sm-8">
										<form:input type="text" path="fase" id="fase" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="fase" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codpessoaempresa:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codpessoaempresa" id="codpessoaempresa" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codpessoaempresa" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codcargo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codcargo" id="codcargo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codcargo" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codrotaentrega:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codrotaentrega" id="codrotaentrega" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codrotaentrega" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AnimalRaca:</label>
									<div class="col-sm-8">
										<form:input type="text" path="animalRaca" id="animalRaca" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="animalRaca" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AnimalProprietario:</label>
									<div class="col-sm-8">
										<form:input type="text" path="animalProprietario" id="animalProprietario" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="animalProprietario" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AnimalNomeVeter:</label>
									<div class="col-sm-8">
										<form:input type="text" path="animalNomeVeter" id="animalNomeVeter" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="animalNomeVeter" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AnimalCor:</label>
									<div class="col-sm-8">
										<form:input type="text" path="animalCor" id="animalCor" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="animalCor" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AnimalRacao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="animalRacao" id="animalRacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="animalRacao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Animal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="animal" id="animal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="animal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codsoftware:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codsoftware" id="codsoftware" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codsoftware" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ClassInseminador:</label>
									<div class="col-sm-8">
										<form:input type="text" path="classInseminador" id="classInseminador" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="classInseminador" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ResponsavelCpf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="responsavelCpf" id="responsavelCpf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="responsavelCpf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ResponsavelNome:</label>
									<div class="col-sm-8">
										<form:input type="text" path="responsavelNome" id="responsavelNome" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="responsavelNome" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">DadosBancarios:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dadosBancarios" id="dadosBancarios" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dadosBancarios" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataDll:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataDll" id="dataDll" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataDll" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ConsultaDll:</label>
									<div class="col-sm-8">
										<form:input type="text" path="consultaDll" id="consultaDll" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="consultaDll" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BanFavorecido:</label>
									<div class="col-sm-8">
										<form:input type="text" path="banFavorecido" id="banFavorecido" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="banFavorecido" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BanBanco:</label>
									<div class="col-sm-8">
										<form:input type="text" path="banBanco" id="banBanco" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="banBanco" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BanAgencia:</label>
									<div class="col-sm-8">
										<form:input type="text" path="banAgencia" id="banAgencia" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="banAgencia" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BanContaCorrente:</label>
									<div class="col-sm-8">
										<form:input type="text" path="banContaCorrente" id="banContaCorrente" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="banContaCorrente" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">BanCpfcnpjFavorecido:</label>
									<div class="col-sm-8">
										<form:input type="text" path="banCpfcnpjFavorecido" id="banCpfcnpjFavorecido" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="banCpfcnpjFavorecido" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codescola:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codescola" id="codescola" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codescola" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codtrecho:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codtrecho" id="codtrecho" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codtrecho" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Coddepartamento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="coddepartamento" id="coddepartamento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="coddepartamento" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Subfornecedor:</label>
									<div class="col-sm-8">
										<form:input type="text" path="subfornecedor" id="subfornecedor" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="subfornecedor" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">EmailNfe:</label>
									<div class="col-sm-8">
										<form:input type="text" path="emailNfe" id="emailNfe" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="emailNfe" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SistemaExclusivo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="sistemaExclusivo" id="sistemaExclusivo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="sistemaExclusivo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Versao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="versao" id="versao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="versao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Pafversao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="pafversao" id="pafversao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="pafversao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AsoProprio:</label>
									<div class="col-sm-8">
										<form:input type="text" path="asoProprio" id="asoProprio" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="asoProprio" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Responsavel:</label>
									<div class="col-sm-8">
										<form:input type="text" path="responsavel" id="responsavel" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="responsavel" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NaturalidadeUf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="naturalidadeUf" id="naturalidadeUf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="naturalidadeUf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EscolaAno:</label>
									<div class="col-sm-8">
										<form:input type="text" path="escolaAno" id="escolaAno" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="escolaAno" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EscolaCidade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="escolaCidade" id="escolaCidade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="escolaCidade" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EscolaUf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="escolaUf" id="escolaUf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="escolaUf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">RgOrgao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="rgOrgao" id="rgOrgao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="rgOrgao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Popular:</label>
									<div class="col-sm-8">
										<form:input type="text" path="popular" id="popular" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="popular" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Matricula:</label>
									<div class="col-sm-8">
										<form:input type="text" path="matricula" id="matricula" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="matricula" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codprorhperfilescala:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codprorhperfilescala" id="codprorhperfilescala" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codprorhperfilescala" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DtTrabalho:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dtTrabalho" id="dtTrabalho" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dtTrabalho" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Codprorhescala:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codprorhescala" id="codprorhescala" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codprorhescala" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">GuiaAltura:</label>
									<div class="col-sm-8">
										<form:input type="text" path="guiaAltura" id="guiaAltura" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="guiaAltura" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">GuiaAlimento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="guiaAlimento" id="guiaAlimento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="guiaAlimento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">GuiaEletricidade:</label>
									<div class="col-sm-8">
										<form:input type="text" path="guiaEletricidade" id="guiaEletricidade" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="guiaEletricidade" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/pessoa/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/pessoa/list' />">Desistir</a>
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