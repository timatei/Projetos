        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Menu</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="<c:url value='/index'/>">MeuCaixa.Mobi</a>
            </div>
            <!-- /.navbar-header 
				@include file="menuusuario.jsp"
			-->            

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                	<a href="<c:url value='/logout'/>"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                </li>
                <!-- /.dropdown -->
            </ul>
			
            <!-- /.navbar-top-links -->
            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                      	<li>
							<div class="profile-info row">
					            <div class="profile-image col-xs-4">
					                <a href="ui-profile.html">
					                    <img alt="" src="http://jaybabani.com/complete-admin/v2.0/preview/data/profile/profile-ecommerce.jpg" class="img-responsive img-circle">
					                </a>
					            </div>
					            <div class="profile-details col-xs-8">
					                <h3>
					                    <a href="ui-profile.html">${loggedinuser}</a>
					
					                    <!-- Available statuses: online, idle, busy, away and offline -->
					                    <span class="profile-status online"></span>
					                </h3>
					                <sec:authorize access="hasRole('USER')">
					                	<p class="profile-title">Usuário</p>
					                </sec:authorize>
					                <sec:authorize access="hasRole('ADMIN')">
					                	<p class="profile-title">Administrador</p>
					                </sec:authorize>
					                <sec:authorize access="hasRole('DBA')">
					                	<p class="profile-title">DBA</p>
					                </sec:authorize>
		
					            </div>
					        </div>
				        </li>
                        <li>
                            <a href="<c:url value='/index'/>"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                        </li>
                        <li>
                            <a href="<c:url value='/user/list'/>"><i class="fa fa-table fa-fw"></i> Usuário</a>
                        </li>
                        <li>
                            <a href="<c:url value='/pessoa/list'/>"><i class="fa fa-edit fa-fw"></i> Pessoa</a>
                        </li>
                        <li>
                            <a href="<c:url value='/pedVenda/list'/>"><i class="fa fa-edit fa-fw"></i> Venda Rápida</a>
                        </li>
                        <li>
                            <a href="<c:url value='/vendedor/list'/>"><i class="fa fa-edit fa-fw"></i> Vendedor</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Catalogo<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
		                        <li>
		                            <a href="<c:url value='/produtoGrupo/list'/>"><i class="fa fa-edit fa-fw"></i> Grupo de Produto</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/produtoGrupoSubGrp/list'/>"><i class="fa fa-edit fa-fw"></i> SubGrupo de Produto</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/produtoUnidade/list'/>"><i class="fa fa-edit fa-fw"></i> Unidade de Produto</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/produto/list'/>"><i class="fa fa-edit fa-fw"></i> Produto</a>
		                        </li>
		                        <li>
		                            <a href="forms.html"><i class="fa fa-edit fa-fw"></i> Personalização de Produto</a>
		                        </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Financeiro<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
		                        <li>
		                            <a href="<c:url value='/moeda/list'/>"><i class="fa fa-edit fa-fw"></i> Moeda</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/formapagamento/list'/>"><i class="fa fa-edit fa-fw"></i> Forma de Pagamento</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/contas/list'/>"><i class="fa fa-edit fa-fw"></i> Contas</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/banco/list'/>"><i class="fa fa-edit fa-fw"></i> Banco</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/centCusto/list'/>"><i class="fa fa-edit fa-fw"></i> Centro de Custo</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/caixaAbertura/list'/>"><i class="fa fa-edit fa-fw"></i> Abertura de Caixa</a>
		                        </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Restaurante<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
		                        <li>
		                            <a href="<c:url value='/resGarcon/list'/>"><i class="fa fa-edit fa-fw"></i> Garçon</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/resControle/list'/>"><i class="fa fa-edit fa-fw"></i> Controle/Mesas</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/resPedido/list'/>"><i class="fa fa-edit fa-fw"></i> Lançamento de Mesa</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/resPedido/list'/>"><i class="fa fa-edit fa-fw"></i> Visualização de Mesa</a>
		                        </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Compra<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
		                        <li>
		                            <a href="<c:url value='/ajusteEstoque/list'/>"><i class="fa fa-edit fa-fw"></i> Ajuste de Estoque</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/nfCompra/list'/>"><i class="fa fa-edit fa-fw"></i> Nota Fiscal de Compra</a>
		                        </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Parametro<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
		                        <li>
		                            <a href="<c:url value='/configuracaoGeral/list'/>"><i class="fa fa-edit fa-fw"></i> Configuração</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/impressao/list'/>"><i class="fa fa-edit fa-fw"></i> Impressão</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/parGeral/list'/>"><i class="fa fa-edit fa-fw"></i> Parametro Geral (Empresa)</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/parRestaurante/list'/>"><i class="fa fa-edit fa-fw"></i> Parametro Restaurante</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/parVenda/list'/>"><i class="fa fa-edit fa-fw"></i> Parametro de Venda</a>
		                        </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>
