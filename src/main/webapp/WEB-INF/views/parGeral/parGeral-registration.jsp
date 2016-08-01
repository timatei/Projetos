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
                    <h1 class="page-header">ParGeral</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de parGeral
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="parGeral" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codpargeral" id="codpargeral"/>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Empresa:</label>
									<div class="col-sm-8">
										<form:input type="text" path="empresa" id="empresa" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="empresa" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Telefone:</label>
									<div class="col-sm-8">
										<form:input type="text" path="telefone" id="telefone" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="telefone" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Cpfcgc:</label>
									<div class="col-sm-8">
										<form:input type="text" path="cpfcgc" id="cpfcgc" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="cpfcgc" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Figura:</label>
									<div class="col-sm-8">
										<form:input type="text" path="figura" id="figura" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="figura" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Atualizacao:</label>
									<div class="col-sm-8">
										<form:input type="text" path="atualizacao" id="atualizacao" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="atualizacao" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">LogoRel:</label>
									<div class="col-sm-8">
										<form:input type="text" path="logoRel" id="logoRel" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="logoRel" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">EmailNome:</label>
									<div class="col-sm-8">
										<form:input type="text" path="emailNome" id="emailNome" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="emailNome" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">EmailLogin:</label>
									<div class="col-sm-8">
										<form:input type="text" path="emailLogin" id="emailLogin" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="emailLogin" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EmailSenha:</label>
									<div class="col-sm-8">
										<form:input type="text" path="emailSenha" id="emailSenha" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="emailSenha" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EmailSmtp:</label>
									<div class="col-sm-8">
										<form:input type="text" path="emailSmtp" id="emailSmtp" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="emailSmtp" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EmailPort:</label>
									<div class="col-sm-8">
										<form:input type="text" path="emailPort" id="emailPort" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="emailPort" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">EmailSsl:</label>
									<div class="col-sm-8">
										<form:input type="text" path="emailSsl" id="emailSsl" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="emailSsl" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Site:</label>
									<div class="col-sm-8">
										<form:input type="text" path="site" id="site" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="site" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Razaosocial:</label>
									<div class="col-sm-8">
										<form:input type="text" path="razaosocial" id="razaosocial" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="razaosocial" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Numero:</label>
									<div class="col-sm-8">
										<form:input type="text" path="numero" id="numero" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="numero" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Complemento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="complemento" id="complemento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="complemento" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Nfe:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfe" id="nfe" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfe" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NfeCertCaminho:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfeCertCaminho" id="nfeCertCaminho" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfeCertCaminho" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NfeCertNr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfeCertNr" id="nfeCertNr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfeCertNr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NfeCertSenha:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfeCertSenha" id="nfeCertSenha" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfeCertSenha" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NfeDanfe:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfeDanfe" id="nfeDanfe" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfeDanfe" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NfeFe:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfeFe" id="nfeFe" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfeFe" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NfeLog:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfeLog" id="nfeLog" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfeLog" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NfeLogo:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfeLogo" id="nfeLogo" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfeLogo" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NfeWsUf:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfeWsUf" id="nfeWsUf" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfeWsUf" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NfeWsAmbiente:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfeWsAmbiente" id="nfeWsAmbiente" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfeWsAmbiente" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NfeProxyHost:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfeProxyHost" id="nfeProxyHost" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfeProxyHost" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NfeProxyPorta:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfeProxyPorta" id="nfeProxyPorta" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfeProxyPorta" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NfeProxyUser:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfeProxyUser" id="nfeProxyUser" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfeProxyUser" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">NfeProxyPassword:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nfeProxyPassword" id="nfeProxyPassword" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nfeProxyPassword" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">OpcaoTributaria:</label>
									<div class="col-sm-8">
										<form:input type="text" path="opcaoTributaria" id="opcaoTributaria" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="opcaoTributaria" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Segmento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="segmento" id="segmento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="segmento" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">EnviarEmailErro:</label>
									<div class="col-sm-8">
										<form:input type="text" path="enviarEmailErro" id="enviarEmailErro" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="enviarEmailErro" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">EnderecoPastaArquivos:</label>
									<div class="col-sm-8">
										<form:input type="text" path="enderecoPastaArquivos" id="enderecoPastaArquivos" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="enderecoPastaArquivos" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcTxSupPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcTxSupPer" id="plcTxSupPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcTxSupPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcTxSupAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcTxSupAlt" id="plcTxSupAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcTxSupAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcTxAdmPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcTxAdmPer" id="plcTxAdmPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcTxAdmPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcTxAdmAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcTxAdmAlt" id="plcTxAdmAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcTxAdmAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcTxComPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcTxComPer" id="plcTxComPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcTxComPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcTxComAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcTxComAlt" id="plcTxComAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcTxComAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcOtPrvPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcOtPrvPer" id="plcOtPrvPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcOtPrvPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcOtPrvAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcOtPrvAlt" id="plcOtPrvAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcOtPrvAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcOtConPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcOtConPer" id="plcOtConPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcOtConPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcOtConAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcOtConAlt" id="plcOtConAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcOtConAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcOtComPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcOtComPer" id="plcOtComPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcOtComPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcOtComAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcOtComAlt" id="plcOtComAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcOtComAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcOtOnuPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcOtOnuPer" id="plcOtOnuPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcOtOnuPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcOtOnuAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcOtOnuAlt" id="plcOtOnuAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcOtOnuAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcOtMngPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcOtMngPer" id="plcOtMngPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcOtMngPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcOtMngAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcOtMngAlt" id="plcOtMngAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcOtMngAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcOtMlcPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcOtMlcPer" id="plcOtMlcPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcOtMlcPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcOtMlcAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcOtMlcAlt" id="plcOtMlcAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcOtMlcAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcImIrlPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcImIrlPer" id="plcImIrlPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcImIrlPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcImIrlAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcImIrlAlt" id="plcImIrlAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcImIrlAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcImCslPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcImCslPer" id="plcImCslPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcImCslPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcImCslAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcImCslAlt" id="plcImCslAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcImCslAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcImIrcPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcImIrcPer" id="plcImIrcPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcImIrcPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcImIrcAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcImIrcAlt" id="plcImIrcAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcImIrcAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcImCpmPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcImCpmPer" id="plcImCpmPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcImCpmPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcImCpmAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcImCpmAlt" id="plcImCpmAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcImCpmAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcImIssPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcImIssPer" id="plcImIssPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcImIssPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcImIssAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcImIssAlt" id="plcImIssAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcImIssAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcImPisPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcImPisPer" id="plcImPisPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcImPisPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcImPisAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcImPisAlt" id="plcImPisAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcImPisAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcImCofPer:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcImCofPer" id="plcImCofPer" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcImCofPer" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">PlcImCofAlt:</label>
									<div class="col-sm-8">
										<form:input type="text" path="plcImCofAlt" id="plcImCofAlt" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="plcImCofAlt" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/parGeral/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/parGeral/list' />">Desistir</a>
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