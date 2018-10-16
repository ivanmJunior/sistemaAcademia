<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Usuários - Área do Cliente</title>
  <link rel="icon" href="<%=request.getContextPath()%>/resources/imagem/Logo21x21.ico">
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/bower_components/bootstrap/dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/bower_components/font-awesome/css/font-awesome.min.css">
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/bower_components/Ionicons/css/ionicons.min.css">
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/dist/css/AdminLTE.min.css">
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/dist/css/skins/skin-blue.min.css">
</head>

<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Main Header -->
  <header class="main-header">

    <!-- Logo -->
    <a href="<%=request.getContextPath()%>/index" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini">FitNet</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg">FitNet</span>
    </a>

    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- User Account Menu -->
          <li class="dropdown user user-menu">
            <!-- Menu Toggle Button -->
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <!-- The user image in the navbar-->
              <img src="<%=request.getContextPath()%>/resources/dist/img/avatar5.png" class="user-image" alt="User Image">
              <!-- hidden-xs hides the username on small devices so only the image appears. -->
              <span class="hidden-xs">Fulano Junior</span>
            </a>
            <ul class="dropdown-menu">
              <!-- The user image in the menu -->
              <li class="user-header">
                <img src="<%=request.getContextPath()%>/resources/dist/img/avatar5.png" class="img-circle" alt="User Image">

                <p>
                  Fulano Junior - Web Developer
                  <small>Membro desde Abr. 2018</small>
                </p>
              </li>
              <!-- Menu Body -->
              <li class="user-body">
                <div class="row">
                  <div class="col-xs-4 text-center">
                    <a href="#">Followers</a>
                  </div>
                  <div class="col-xs-4 text-center">
                    <a href="#">Sales</a>
                  </div>
                  <div class="col-xs-4 text-center">
                    <a href="#">Friends</a>
                  </div>
                </div>
                <!-- /.row -->
              </li>
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-left">
                  <a href="#" class="btn btn-default btn-flat">Perfil</a>
                </div>
                <div class="pull-right">
                  <a href="#" class="btn btn-default btn-flat">Sair</a>
                </div>
              </li>
            </ul>
          </li>
        </ul>
      </div>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

      <!-- Sidebar user panel (optional) -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="<%=request.getContextPath()%>/resources/dist/img/avatar5.png" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>Fulano Junior</p>
          <!-- Status -->
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>

      <!-- Sidebar Menu -->
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header">MENU</li>
        <!-- Optionally, you can add icons to the links -->
        <li class="active"><a href="#1"><i class="fa "></i> <span>Agendar Avaliação</span></a></li>
        <li class="active"><a href="#6"><i class="fa "></i> <span>Marcar Treino</span></a></li>
        <li class="active"><a href="#2"><i class="fa "></i> <span>Resultados</span></a></li>
        <li class="active"><a href="#3"><i class="fa "></i> <span>Ficha de Avaliação</span></a></li>
        
      </ul>
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header">Financeiro</li>
        <!-- Optionally, you can add icons to the links -->
        <li class="active"><a href="#4"><i class="fa "></i> <span>2º via Boleto</span></a></li>
        <li class="active"><a href="#5"><i class="fa "></i> <span>Extrato de Pagamentos</span></a></li>
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Treinos
        <small>Gerenciamento de treinos</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="/"><i class="fa fa-home"></i> Home</a></li>
        <li class="active">Usuários</li>
      </ol>
    </section>

    <!-- Main content -->

    <section class="content container-fluid">

      <div class="row">

        <div class="col-md-8">
      	<nav aria-label="Page navigation example">
		  <ul class="pagination">
		    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
		    <li class="page-item"><a class="page-link" href="#">1</a></li>
		    <li class="page-item"><a class="page-link" href="#">2</a></li>
		    <li class="page-item"><a class="page-link" href="#">3</a></li>
		    <li class="page-item"><a class="page-link" href="#">Next</a></li>
		  </ul>
		</nav>
          <div class="box">
          
            <div class="box-header">
              <h3 class="box-title">Treinos marcados</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body no-padding">
              <table class="table table-striped">
                <thead>
                  <tr>
                    <th>Intrutor</th>
                    <th>Data do Treino</th>
                    <th>Horário de Inicio</th>
                    <th>Horário de Termino</th>
                    <th>Modalidade</th>
                    <th>Realizado</th>
                    <th>Funções</th>
                  </tr>
                </thead>
                <tbody id="table-user">

                <c:forEach items="${listaTreino}" var="treino">  
                  <tr>
                    <td>${treino.instrutor.nome}</td>
                    <td><fmt:formatDate value="${treino.dataTreino.time}" pattern="dd-MM-yyyy"/></td>
                    <td><fmt:formatDate value="${treino.horaInicio.time}" pattern="hh:mm"/></td>
                    <td><fmt:formatDate value="${treino.horaTermino.time}" pattern="hh:mm"/></td>
                    <td>${treino.modalidade.descricao}</td>
                    
                    <td>-</td>
                  <td>
                  	 <a href="<%=request.getContextPath()%>?instrutor.nome=${treino.instrutor.nome}" class="btn btn-success btn-xs btn-flat">Editar</a>
                     <a href="<%=request.getContextPath()%>?instrutor.nome=${treino.instrutor.nome}" class="btn btn-primary btn-xs btn-flat">Detalhes</a>
                     <a href="<%=request.getContextPath()%>/removerTreino?instrutor.nome=${treino.instrutor.nome}" class="btn btn-danger btn-xs btn-flat">Excluir</a>
                    </td>
                  </tr>
                 </c:forEach>
                </tbody>
              </table>
            </div>
            <!-- /.box-body -->
          </div>

        </div>
        <div class="col-md-4">

          <div class="row">
          
            
          </div>

          <div class="box box-success">
            <div class="box-header with-border">
              <h3 class="box-title">Agendar Novo Treino</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <form role="form" id="form-user-create" action="<%=request.getContextPath()%>/adicionaTreino" method="post">
              <div class="box-body">
               <div class="form-group">
                  <label for="InputCountryIntrutor">Intrutor</label>
                  <select class="form-control" id="InputCountryIntrutor" name="horaInicio" required>
                    <option value="" selected="selected">Selecione o Instrutor</option>
                    <c:forEach items="${listaInstrutores}" var="instrutor">
                    	<option value="${instrutor.nome}">${instrutor.nome}</option>
                    </c:forEach>
				</select>
                </div>
                <div class="form-group">
                  <label for="exampleInputBirth">Data do Treino</label>
                  <input type="date" class="form-control"  id="exampleInputBirth" name="dataTreino" required="true">
                </div>
                <div class="form-group">
                  <label for="exampleInputCountry">Hora de Inícil</label>
                  <select class="form-control" id="exampleInputCountry" name="horaInicio" required="true">
                    <option value="" selected="selected">Selecione a Hora</option>
                    <option value="5:00">5:00</option>
                    <option value="6:00">6:00</option>
                    <option value="7:00">7:00</option>
                    <option value="8:00">8:00</option>
                    <option value="9:00">9:00</option>
                    <option value="10:00">10:00</option>
                    <option value="11:00">11:00</option>
                    <option value="12:00">12:00</option>
                    <option value="13:00">13:00</option>
                    <option value="14:00">14:00</option>
                    <option value="14:00">15:00</option>
                    <option value="16:00">16:00</option>
                    <option value="17:00">17:00</option>
                    <option value="18:00">18:00</option>
                    <option value="19:00">19:00</option>
                    <option value="20:00">20:00</option>
                    <option value="21:00">21:00</option>
                  </select>
                </div>
                <div class="form-group">
                  <label for="exampleInputCountry">Hora de Termino</label>
                  <select class="form-control" id="exampleInputCountry" name="horaTermino" required="true">
                    <option value="" selected="selected">Selecione a Hora</option>
                    <option value="6:00">6:00</option>
                    <option value="7:00">7:00</option>
                    <option value="8:00">8:00</option>
                    <option value="9:00">9:00</option>
                    <option value="10:00">10:00</option>
                    <option value="11:00">11:00</option>
                    <option value="12:00">12:00</option>
                    <option value="13:00">13:00</option>
                    <option value="14:00">14:00</option>
                    <option value="15:00">15:00</option>
                    <option value="16:00">16:00</option>
                    <option value="17:00">17:00</option>
                    <option value="18:00">18:00</option>
                    <option value="19:00">19:00</option>
                    <option value="20:00">20:00</option>
                    <option value="21:00">21:00</option>
                    <option value="22:00">22:00</option>
                  </select>
                </div>
                <div class="form-group">
                  <label for="exampleInputCountry">Modalidades</label>
                  <select class="form-control" id="exampleInputCountry" name="modalidade.descricao" required="true">
                    <option value="" selected="selected">Selecione uma Modalidade</option>
                    <option value="Musculação">Musculação</option>
                    <option value="Aeróbica">Aeróbica</option>
                    <option value="Jump">Jump</option>
                    <option value="Funcional">Funcional</option>
                    <option value="Exercícios Cardios">Exercícios Cardios</option>
                    <option value="Pilates">Pilates</option>
                    <option value="Jiu Jitsu">Jiu Jitsu</option>
                    <option value="Box">Box</option>
                    <option value="Muay">Muay Thai</option>
                    <option value="Hidroginástica">Hidroginástica</option>
                    <option value="Natação">Natação</option>
                  </select>
                </div>
              </div>
         
              <div class="box-footer">
                <button type="submit" class="btn btn-success">Comfirmar</button>
              </div>
            </form>
          </div>

        </div>
      </div>

    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <!-- Main Footer -->
  <footer class="main-footer">
    <!-- To the right -->
    <div class="pull-right hidden-xs">
      <a target="_blank" href="<%=request.getContextPath()%>/index">FitNet</a>
    </div>
    <!-- Default to the left -->
    
  </footer>

</div>

</body>
</html>