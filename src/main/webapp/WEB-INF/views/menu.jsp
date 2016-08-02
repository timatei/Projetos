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
                            <a href="#"><i class="fa fa-files-o fa-fw"></i> Cadastros<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
		                        <li>
		                            <a href="<c:url value='/pessoa/list'/>"><i class="fa fa-users fa-fw"></i> Pessoas</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/vendedor/list'/>"><i class="fa fa-child fa-fw"></i> Vendedores</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/resGarcon/list'/>"><i class="fa fa-steam fa-fw"></i> Garçon</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/resControle/list'/>"><i class="fa fa-tasks fa-fw"></i> Controle/Mesas</a>
		                        </li>
		                        <li>
		                            <a href="#"><i class="fa fa-building fa-fw"></i> Produtos<span class="fa arrow"></span></a>
		                            <ul class="nav nav-third-level">
				                        <li>
				                            <a href="<c:url value='/produtoGrupo/list'/>"><i class="fa fa-columns fa-fw"></i> Grupo</a>
				                        </li>
				                        <li>
				                            <a href="<c:url value='/produtoGrupoSubGrp/list'/>"><i class="fa fa-unsorted fa-fw"></i> SubGrupo</a>
				                        </li>
				                        <li>
				                            <a href="<c:url value='/produtoUnidade/list'/>"><i class="fa fa-arrows fa-fw"></i> Unidade</a>
				                        </li>
				                        <li>
				                            <a href="<c:url value='/grupoPersonalizacao/list'/>"><i class="fa fa-magic fa-fw"></i> Grupo Personalização</a>
				                        </li>
				                        <li>
				                            <a href="<c:url value='/produto/list'/>"><i class="fa fa-lightbulb-o fa-fw"></i> Produto</a>
				                        </li>
				                        <li>
				                            <a href="<c:url value='/produtoPersonalizacao/list'/>"><i class="fa fa-magic fa-fw"></i> Produto Personalização</a>
				                        </li>
		                            </ul>
			                        </li>
			                        <li>
			                            <a href="<c:url value='/moeda/list'/>"><i class="fa fa-dollar fa-fw"></i> Moedas</a>
			                        </li>
			                        <li>
			                            <a href="<c:url value='/formapagamento/list'/>"><i class="fa fa-pagelines fa-fw"></i> Formas de Pagamentos</a>
			                        </li>
			                        <li>
			                            <a href="<c:url value='/banco/list'/>"><i class="fa fa-th-large fa-fw"></i> Contas Bancárias</a>
			                        </li>
			                        <li>
			                            <a href="<c:url value='/centCusto/list'/>"><i class="fa fa-trophy fa-fw"></i> Centros de Custo</a>
			                        </li>
		                            <!-- /.nav-second-level -->
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        
                        <li>
                            <a href="#"><i class="fa fa-wrench fa-fw"></i> Movimentações<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
		                        <li>
		                            <a href="<c:url value='/contas/list'/>"><i class="fa fa-money fa-fw"></i> Contas</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/pedVenda/list'/>"><i class="fa fa-inbox fa-fw"></i> Venda Rápida</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/resPedido/list'/>"><i class="fa fa-list-alt fa-fw"></i> Lançamento de Mesa</a>
		                        </li>
		                        <li>
		                            <a href="#"><i class="fa fa-tags fa-fw"></i> Compra<span class="fa arrow"></span></a>
		                            <ul class="nav nav-third-level">
				                        <li>
				                            <a href="<c:url value='/ajusteEstoque/list'/>"><i class="fa fa-tag fa-fw"></i> Ajuste de Estoque</a>
				                        </li>
				                        <li>
				                            <a href="<c:url value='/nfCompra/list'/>"><i class="fa fa-book fa-fw"></i> Nota Fiscal de Compra</a>
				                        </li>
		                            </ul>
		                            <!-- /.nav-second-level -->
		                        </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-sitemap fa-fw"></i> Sistemas<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
		                        <li>
		                            <a href="<c:url value='/user/list'/>"><i class="fa fa-user fa-fw"></i> Usuário</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/impressao/list'/>"><i class="fa fa-print fa-fw"></i> Impressão</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/parGeral/list'/>"><i class="fa fa-table fa-fw"></i> Parâmetro Geral (Empresa)</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/parRestaurante/list'/>"><i class="fa fa-ge fa-fw"></i> Parâmetro Restaurante</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/parVenda/list'/>"><i class="fa fa-legal fa-fw"></i> Parametro de Venda</a>
		                        </li>
		                        <li>
		                            <a href="<c:url value='/configuracaoGeral/list'/>"><i class="fa fa-codepen fa-fw"></i> Configuração Geral</a>
		                        </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="<c:url value='/caixaAbertura/list'/>"><i class="fa fa-compass fa-fw"></i> Abertura de Caixa</a>
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>
