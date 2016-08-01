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
                    <h1 class="page-header">Nfcompra</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Cadastro de nfcompra
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" modelAttribute="nfcompra" class="form form-horizontal has-validation-callback">
                                <form:input type="hidden" path="codnfcompra" id="codnfcompra"/>

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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codcfop:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codcfop" id="codcfop" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codcfop" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codformapagamento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codformapagamento" id="codformapagamento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codformapagamento" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Nrnota:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nrnota" id="nrnota" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nrnota" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Serie:</label>
									<div class="col-sm-8">
										<form:input type="text" path="serie" id="serie" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="serie" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataEmi:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataEmi" id="dataEmi" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataEmi" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DataEntr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dataEntr" id="dataEntr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dataEntr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">IcmsBase:</label>
									<div class="col-sm-8">
										<form:input type="text" path="icmsBase" id="icmsBase" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="icmsBase" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">IcmsVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="icmsVlr" id="icmsVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="icmsVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">IcmsSubBase:</label>
									<div class="col-sm-8">
										<form:input type="text" path="icmsSubBase" id="icmsSubBase" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="icmsSubBase" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">IcmsSubVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="icmsSubVlr" id="icmsSubVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="icmsSubVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ProdutosTotal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="produtosTotal" id="produtosTotal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="produtosTotal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">FreteVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="freteVlr" id="freteVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="freteVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">SeguroVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="seguroVlr" id="seguroVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="seguroVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">OutrasDespesas:</label>
									<div class="col-sm-8">
										<form:input type="text" path="outrasDespesas" id="outrasDespesas" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="outrasDespesas" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">IpiBase:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ipiBase" id="ipiBase" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ipiBase" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">IpiVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="ipiVlr" id="ipiVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="ipiVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">ServicosTotal:</label>
									<div class="col-sm-8">
										<form:input type="text" path="servicosTotal" id="servicosTotal" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="servicosTotal" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">IrVlr:</label>
									<div class="col-sm-8">
										<form:input type="text" path="irVlr" id="irVlr" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="irVlr" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AlterarIcms:</label>
									<div class="col-sm-8">
										<form:input type="text" path="alterarIcms" id="alterarIcms" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="alterarIcms" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">TotalNota:</label>
									<div class="col-sm-8">
										<form:input type="text" path="totalNota" id="totalNota" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="totalNota" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">IssPercentual:</label>
									<div class="col-sm-8">
										<form:input type="text" path="issPercentual" id="issPercentual" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="issPercentual" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Financeiro:</label>
									<div class="col-sm-8">
										<form:input type="text" path="financeiro" id="financeiro" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="financeiro" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">Estoque:</label>
									<div class="col-sm-8">
										<form:input type="text" path="estoque" id="estoque" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="estoque" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">AtualizouCusto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="atualizouCusto" id="atualizouCusto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="atualizouCusto" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrIcmsDif:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrIcmsDif" id="vlrIcmsDif" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrIcmsDif" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">DtFaturamento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="dtFaturamento" id="dtFaturamento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="dtFaturamento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label" for="inline-suggestions">VlrDesconto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="vlrDesconto" id="vlrDesconto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="vlrDesconto" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">TipoFrete:</label>
									<div class="col-sm-8">
										<form:input type="text" path="tipoFrete" id="tipoFrete" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="tipoFrete" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Codcentcusto:</label>
									<div class="col-sm-8">
										<form:input type="text" path="codcentcusto" id="codcentcusto" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="codcentcusto" class="label label-danger"/>
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
									<label class="col-sm-2 control-label" for="inline-suggestions">Nrconhecimento:</label>
									<div class="col-sm-8">
										<form:input type="text" path="nrconhecimento" id="nrconhecimento" class="form-control has-suggestions"/>
	                                    <div class="has-error">
	                                        <form:errors path="nrconhecimento" class="label label-danger"/>
	                                    </div>
									</div>
								</div>

								<div class="row">
									<label class="col-sm-2 control-label" for="inline-suggestions"></label>
									<div class="col-sm-8">
                                        <c:choose>
                                            <c:when test="${edit}">
                                                <input type="submit" value="Atualizar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/nfcompra/list' />">Desistir</a>
                                            </c:when>
                                            <c:otherwise>
                                                <input type="submit" value="Cadastrar" class="btn btn-success custom-width"/> ou <a href="<c:url value='/nfcompra/list' />">Desistir</a>
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