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