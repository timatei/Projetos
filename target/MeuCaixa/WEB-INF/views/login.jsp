<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="pt-BR">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>MeuCaixa.Mobi</title>
	
    <!-- Bootstrap Core CSS -->
    <link href="static/startbootstrap/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/css/app.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="static/startbootstrap/bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="static/startbootstrap/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="static/startbootstrap/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body class="login_page pace-done">

    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Login...</h3>
                    </div>
                    <div class="panel-body">
						<c:url var="loginUrl" value="/login" />
						<form action="${loginUrl}" method="post" class="form-horizontal" role="form">
                            <fieldset>
                                <div class="form-group">
									<div class="input-group input-sm">
										<label class="input-group-addon" for="username"><i class="fa fa-user"></i></label>
										<input type="text" class="form-control" id="username" name="ssoId" placeholder="Seu login" required>
									</div>
                                </div>
                                <div class="form-group">
									<div class="input-group input-sm">
										<label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label> 
										<input type="password" class="form-control" id="password" name="password" placeholder="Sua senha" required>
									</div>
                                </div>

                                <div class="checkbox">
                                    <label><input type="checkbox" id="rememberme" name="remember-me"> Lembrar de mim</label>
                                </div>

								<input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />

								<div class="form-actions">
									<input type="submit"
										class="btn btn-lg btn-success btn-block" value="Entrar">
								</div>
                            </fieldset>
                        </form>
                    </div>
                </div>
                <c:if test="${param.error != null}">
					<div class="alert alert-danger">
						<p>Login ou senha inválidos.</p>
					</div>
				</c:if>
				<c:if test="${param.logout != null}">
					<div class="alert alert-success">
						<p>Você foi desconectado com sucesso.</p>
					</div>
				</c:if>
            </div>
        </div>
    </div>

    <!-- jQuery -->
    <script src="static/startbootstrap/bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="static/startbootstrap/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="static/startbootstrap/bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="static/startbootstrap/dist/js/sb-admin-2.js"></script>

</body>

</html>