<!DOCTYPE html>
<html lang="en-us">
	<head>
		<meta charset="utf-8">
		<!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->

		<title>ISAP Manager Bespoke Service </title>
		<meta name="description" content="">
		<meta name="author" content="">	
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

		<!-- Basic Styles -->
		<link rel="stylesheet" type="text/css" media="screen" href="css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" media="screen" href="css/font-awesome.min.css">

		<!-- SmartAdmin Styles : Caution! DO NOT change the order -->
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-production-plugins.min.css">
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-production.min.css">
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-skins.min.css">

		<!-- SmartAdmin RTL Support -->
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-rtl.min.css"> 

		<!-- #FAVICONS syntel logo -->
		<link rel="icon" href="img/favicon/favicon.ico" type="image/x-icon">

		<!-- Demo purpose only: goes with demo.js, you can delete this css when designing your own WebApp -->
		<link rel="stylesheet" type="text/css" media="screen" href="css/demo.min.css">

		<style>

          .panel-white {border-color: #333; border-top-color: #333; border-right-color-value: rgb(51, 51, 51);border-bottom-color: #333;
             border-left-color-value: rgb(51, 51, 51);border-left-color-ltr-source: physical; border-left-color-rtl-source: physical;
             border-right-color-ltr-source: physical; border-right-color-rtl-source: physical;
            }
       </style>
		
		<!-- iOS web-app metas : hides Safari UI Components and Changes Status Bar Appearance -->
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
	
	</head>
	
	
    <body class="desktop-detected menu-on-top pace-done smart-style-4">
    
		<!-- #HEADER -->
		<header id="header">
          <div id="logo-group">
			<img width="80px" height="100%" style="padding-top: 2.5%" src="img/logo_isap.png" alt="ISAP"> 
			<span> </span>
			
			<!-- PLACE YOUR LOGO HERE -->
			 <span> 
			  <img src="img/syntel-logo.png" style="padding-top: 3%" width="85px" height="100%" alt="SYNTEL">
			</span>
		</div>

			
			<!-- #TOGGLE LAYOUT BUTTONS -->
			<!-- pulled right: nav area -->
			<div class="pull-right">

               <div class="project-context hidden-xs">
                <span class="label">Tenant Manager: ( Project : STG Automtation Team )</span>
                 <a href="#" class="dropdown-toggle" data-toggle="dropdown"> 
                    <i class="fa fa-user"></i>
                    <span> Welcome ,&nbsp;&nbsp;Karthik</span>
                 </a>
               </div>
               
               	<!-- collapse menu button -->
				<div id="hide-menu" class="btn-header pull-right">
					<span> <a href="javascript:void(0);" data-action="toggleMenu" title="Collapse Menu"><i class="fa fa-reorder"></i></a> </span>
				</div>
				<!-- end collapse menu -->

              <span> <a style="border-radius: 2px;cursor: default !important;display: inline-block;font-weight: 700;height: 30px;line-height: 24px;min-width: 30px;
                                padding: 2px;text-align: center;text-decoration: none !important;-moz-user-select: none;background-color: #F8F8F8;
                                background-image: -moz-linear-gradient(center top , #F8F8F8, #F1F1F1);border: 1px solid #BFBFBF;color: #6D6A69;font-size: 17px;
                                margin: 10px 0px 0px;" href="/isap" title="Sign Out" data-action="userLogout" 
                                data-logout-msg="You can improve your security further after logging out by closing this opened browser">
                           <i class="fa fa-sign-out"></i>
                       </a> 
             </span> 

           </div>
			<!-- end pulled right: nav area -->

		</header>
		<!-- END HEADER -->


		<!-- #NAVIGATION -->
		<!-- Left panel : Navigation area -->
		<!-- Note: This width of the aside area can be adjusted through LESS variables -->
		<aside id="left-panel">

			<!-- NAVIGATION : This navigation is also responsive-->
			<nav>
				<ul>
					 <li >
						<a href="dashboardManager" title="Dashboard"><i class="fa fa-lg fa-fw fa-home"></i> <span class="menu-item-parent">Dashboard</span></a>
					</li>
				     <li class="active">
						<a href="#"><i class="fa fa-lg fa-fw fa-windows"></i> <span class="menu-item-parent">Provision VM</span></a>
						<ul>
						
							<li >
								<a href="stackManager">Stack Service </a>
							</li>
							<li class="active">
								<a href="#">Bespoke Service </a>
							</li>
						     <li>
								<a href="customManager">Custom Service</a>
							</li>
						</ul>
					</li>
					<li>
						<a href="billingManager" title="Billing"><i class="fa fa-lg fa-fw fa-list-alt "></i> <span class="menu-item-parent">Billing</span></a>
					</li>
			         <li>
						<a href="serviceExtensionManager" title="Service Extensions"><i class="fa fa-lg fa-fw fa-plus-circle "></i> <span class="menu-item-parent">Service Extands</span></a>
					</li>
					 <li>
						<a href="approvalManager" title="Approval"><i class="fa fa-lg fa-fw fa-unlock-alt"></i> <span class="menu-item-parent">Approval</span></a>
					</li>
				</ul>
			</nav>
			<span class="minifyme" data-action="minifyMenu"> 
				<i class="fa fa-arrow-circle-left hit"></i> 
			</span>
		</aside>
		<!-- END NAVIGATION -->

		<!-- MAIN PANEL -->
		<div id="main" role="main">

			<!-- RIBBON -->
			<div id="ribbon">
				<span class="ribbon-button-alignment"> 
					<span id="refresh" class="btn btn-ribbon" data-action="resetWidgets" data-title="refresh"  rel="tooltip" data-placement="bottom" data-original-title="<i class='text-warning fa fa-warning'></i> Warning! This will reset all your widget settings." data-html="true">
						<i class="fa fa-refresh"></i>
					</span> 
				</span>
				<!-- breadcrumb -->
				<ol class="breadcrumb">
					<li>Home</li><li>Provision VM</li><li>Bespoke</li>
				</ol>
			</div>
			<!-- END RIBBON -->

			<!-- MAIN CONTENT -->
		<div id="content">
		
		   <div class="row">
			<div class="col-sm-12">
			  <div class="well well-light">
						
				
				  <div class="row">
					
					<div class="col-sm-12">
						
						<div class="well well-light">
				            <div class="row">
								
							      <div class="col-xs-12 col-sm4 col-md-2">
						            <div class="panel panel-white">
						                <div class="panel-heading"  style="border-bottom-color: #333;">
						                    <h3 class="panel-title">
						                         <img src="img/tomcat.png" style="padding-left: 1%" width="150px" height="50px;"  alt="Tomcat"  />
						                     </h3>
						                </div>
						                <div class="panel-body no-padding text-align-center">
						                    <div class="the-price">
						                        <h1>
						                            Tomcat Version <strong> : 7.0</strong>
						                         </h1>
						                    </div>
						                    <table class="table">
						                        <tr>
						                            <td>
						                              OS <strong> : Windows</strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                            <strong>VCPU </strong> : 2
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                               RAM <strong> : 2GB </strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                             Disk Size  <strong> : 20GB</strong>
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                             Type  <strong> : Application <br> Server</strong>
						                            </td>
						                        </tr>
						                      
						                    </table>
						                </div>
						                <div class="panel-footer no-padding">
						                
						                  <a href="javascript:void(0);" data-toggle="modal" data-target="#myModal" class="btn bg-color-darken txt-color-white btn-block" role="button">
						                    
						                    <i class="fa fa-shopping-cart"></i>
						                      Launch <span> now!</span></a>
						                
						                </div>
						            </div>
						        </div>	
						        
						         <div class="col-xs-12 col-sm-4 col-md-2">
						             <div class="panel panel-white">
						                <div class="panel-heading"  style="border-bottom-color: #333;">
						                    <h3 class="panel-title">
						                        <img src="img/mysql_logo.png"  style="padding-left: 1%" width="150px" height="50px;"   alt="MySql"  /></h3>
						                </div>
						                <div class="panel-body no-padding text-align-center">
						                    <div class="the-price">
						                        <h1>
						                         Mysql &nbsp;&nbsp; Version <strong> : 5.5</strong>
						                        </h1>
						                    </div>
						                     <table class="table">
						                        <tr>
						                            <td>
						                              OS <strong> : UBuntu</strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                            <strong>VCPU </strong> : 2
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                               RAM <strong> : 2GB </strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                             Disk Size  <strong> : 20GB</strong>
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                                 Type  <strong> : Database  <br> Server</strong>
						                            </td>
						                        </tr>
						                      
						                    </table>
						                </div>
						                <div class="panel-footer no-padding">
						
						                    <a href="javascript:void(0);"  class="btn bg-color-darken txt-color-white btn-block" role="button">
						                    
						                    <i class="fa fa-shopping-cart"></i>
						                      Launch <span> now!</span></a>
						                </div>
						            </div>
						        </div>	
								
								
								 <div class="col-xs-12 col-sm-4 col-md-2">
						             <div class="panel panel-white">
						                    <img src="img/ribbon.png" class="ribbon" alt="">
						                <div class="panel-heading"  style="border-bottom-color: #333;">
						                    <h3 class="panel-title">
						                         <img src="img/JBoss_logo.png" style="padding-left: 1%" width="110px" height="50px;"  alt="JBoss" />
						                     </h3>
						                </div>
						                <div class="panel-body no-padding text-align-center">
						                    <div class="the-price">
						                        <h1>
						                             JBoss &nbsp;&nbsp; Version <strong> : 7.0</strong>
						                         </h1>
						                    </div>
						                      <table class="table">
						                        <tr>
						                            <td>
						                              OS <strong> : UBuntu</strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                            <strong>VCPU </strong> : 2
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                               RAM <strong> : 2GB </strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                             Disk Size  <strong> : 20GB</strong>
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                                 Type  <strong> : Application  <br> Server</strong>
						                            </td>
						                        </tr>
						                      
						                    </table>
						                </div>
						                <div class="panel-footer no-padding">
						                    <a href="javascript:void(0);" class="btn bg-color-darken txt-color-white btn-block" role="button">
						                    
						                     <i class="fa fa-shopping-cart"></i>
						                      Launch <span> now!</span></a>
						                </div>
						            </div>
						        </div>
						        <div class="col-xs-12 col-sm-4 col-md-2">
						             <div class="panel panel-white">
						               
						                <img src="img/ribbon.png" class="ribbon" alt="">
						               <div class="panel-heading"  style="border-bottom-color: #333;">
						                    <h3 class="panel-title">
						                        <img src="img/oracle.png" style="padding-left: 1%" width="120px" height="50px;"  alt="Oracle" />
						                     </h3>
						                </div>
						                <div class="panel-body no-padding text-align-center">
						                      <div class="the-price">
						                        <h1>
						                         Oracle &nbsp;&nbsp; Version <strong> : 11g</strong>
						                       </h1>
						                    </div>
						                     <table class="table">
						                        <tr>
						                            <td>
						                              OS <strong> : UBuntu</strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                            <strong>VCPU </strong> : 2
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                               RAM <strong> : 2GB </strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                             Disk Size  <strong> : 20GB</strong>
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                                 Type  <strong> : Database  <br> Server</strong>
						                            </td>
						                        </tr>
						                      
						                    </table>
						                </div>
						                <div class="panel-footer no-padding">
						                    <a href="javascript:void(0);" class="btn bg-color-darken txt-color-white btn-block" role="button">
						                    
						                    <i class="fa fa-shopping-cart"></i>
						                      Launch <span> now!</span></a>
						                </div>
						            </div>
						        </div>		
						   				
						       <div class="col-xs-12 col-sm-4 col-md-2">
						            <div class="panel panel-white">
						                <div class="panel-heading"  style="border-bottom-color: #333;">
						                    <h3 class="panel-title">
						                         <img src="img/DB2-logo.png"  style="padding-left: 1%" width="150px" height="50px;" alt="DB2" />
						                     </h3>
						                </div>
						                <div class="panel-body no-padding text-align-center">
						                    <div class="panel-body no-padding text-align-center">
						                      <div class="the-price">
						                        <h1>
						                         DB2 &nbsp;&nbsp; Version <strong>:10.5</strong>
						                       </h1>
						                    </div>
						                     <table class="table">
						                        <tr>
						                            <td>
						                              OS <strong> : Windows</strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                            <strong>VCPU </strong> : 2
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                               RAM <strong> : 2GB </strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                             Disk Size  <strong> : 20GB</strong>
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                                 Type  <strong> : Database <br>  Server</strong>
						                            </td>
						                        </tr>
						                      
						                    </table>
						                </div>
						                <div class="panel-footer no-padding">
						                    <a href="javascript:void(0);" class="btn bg-color-darken txt-color-white btn-block" role="button">
						                    
						                     <i class="fa fa-shopping-cart"></i>
						                      Launch <span> now!</span></a>
						                </div>
						            </div>
						        </div>		        							
						      </div>
							
							
							       <div class="col-xs-12 col-sm-4 col-md-2">
						             <div class="panel panel-white">
						                <div class="panel-heading"  style="border-bottom-color: #333;">
						                    <h3 class="panel-title">
						                         <img src="img/weblogic1.png" style="padding-left: 2%" width="150px" height="50px;"   alt="WebLogic"  />
						                    </h3>
						                </div>
						                <div class="panel-body no-padding text-align-center">
						                    <div class="the-price">
						                        <h1>
						                         WebLogic  Version <strong> : 11</strong>
						                        </h1>   
						                    </div>
						                     <table class="table">
						                        <tr>
						                            <td>
						                              OS <strong> : Windows</strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                            <strong>VCPU </strong> : 2
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                               RAM <strong> : 2GB </strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                             Disk Size  <strong> : 20GB</strong>
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                                 Type  <strong> : Application <br>  Server</strong>
						                            </td>
						                        </tr>
						                      
						                    </table>
						                </div>
						                <div class="panel-footer no-padding">
						                    <a href="javascript:void(0);" class="btn bg-color-darken txt-color-white btn-block" role="button">
                                    <i class="fa fa-shopping-cart"></i>
						                      Launch <span> now!</span></a>
						                </div>
						            </div>
						        </div>
							
							</div>
							
								
				     <div class="row">
						       <div class="col-xs-12 col-sm4 col-md-2">
						            <div class="panel panel-white">
						                <div class="panel-heading"  style="border-bottom-color: #333;">
						                    <h3 class="panel-title">
						                        <img src="img/windows_system.png"  style="padding-left: 2%" width="150px" height="50px;"  alt="Windows"  />
						                    </h3>
						                </div>
						                <div class="panel-body no-padding text-align-center">
						                    <div class="the-price">
						                        <h1>
						                            Windows  Version <strong> : 7</strong>
						                        </h1>  
						                    </div>
						                    <table class="table">
						                        <tr>
						                            <td>
						                              OS <strong> : Windows</strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                            <strong>VCPU </strong> : 3
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                               RAM <strong> : 4GB </strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                             Disk Size  <strong> : 40GB</strong>
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                             Type  <strong> : <br> OS <br> </strong>
						                            </td>
						                        </tr>
						                      
						                    </table>
						                </div>
						                <div class="panel-footer no-padding">
						                
						                  <a href="javascript:void(0);"  class="btn bg-color-darken txt-color-white btn-block" role="button">
						                    
						                    <i class="fa fa-shopping-cart"></i>
						                      Launch <span> now!</span></a>
						                
						                </div>
						            </div>
						        </div>
								
							      <div class="col-xs-12 col-sm4 col-md-2">
						            <div class="panel panel-white">
						                <div class="panel-heading"  style="border-bottom-color: #333;">
						                    <h3 class="panel-title">
						                          <img src="img/websphere.PNG" style="padding-left: 2%" width="150px" height="50px;"  alt="WebSphere"  />
						                     </h3>
						                </div>
						                <div class="panel-body no-padding text-align-center">
						                    <div class="the-price">
						                        <h1>
						                            WebSphere  Version <strong> : 6.0</strong>
						                        </h1>
						                    </div>
						                    <table class="table">
						                        <tr>
						                            <td>
						                              OS <strong> : Windows</strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                            <strong>VCPU </strong> : 2
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                               RAM <strong> : 2GB </strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                             Disk Size  <strong> : 20GB</strong>
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                             Type  <strong> : Application <br> Server</strong>
						                            </td>
						                        </tr>
						                      
						                    </table>
						                </div>
						                <div class="panel-footer no-padding">
						                
						                  <a href="javascript:void(0);"  class="btn bg-color-darken txt-color-white btn-block" role="button">
						                    
						                    <i class="fa fa-shopping-cart"></i>
						                      Launch <span> now!</span></a>
						                
						                </div>
						            </div>
						        </div>	
						           
						                <div class="col-xs-12 col-sm4 col-md-2">
						            <div class="panel panel-white">
						                <div class="panel-heading"  style="border-bottom-color: #333;">
						                    <h3 class="panel-title">
						                        <img src="img/ubuntu.PNG"  style="padding-left: 2%" width="150px" height="50px;"  alt="Ubuntu"  />
						                     </h3>
						                </div>
						                <div class="panel-body no-padding text-align-center">
						                    <div class="the-price">
						                        <h1>
						                            Ubuntu Version<strong>:12.04</strong>
						                         </h1>
						                    </div>
						                    <table class="table">
						                        <tr>
						                            <td>
						                              OS <strong> : Linux</strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                            <strong>VCPU </strong> : 3
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                               RAM <strong> : 4GB </strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                             Disk Size  <strong> : 40GB</strong>
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                             Type  <strong> : <br> OS <br> </strong>
						                            </td>
						                        </tr>
						                      
						                    </table>
						                </div>
						                <div class="panel-footer no-padding">
						                
						                  <a href="javascript:void(0);"  class="btn bg-color-darken txt-color-white btn-block" role="button">
						                    
						                    <i class="fa fa-shopping-cart"></i>
						                      Launch <span> now!</span></a>
						                
						                </div>
						            </div>
						        </div>

								    
						         <div class="col-xs-12 col-sm-4 col-md-2">
						             <div class="panel panel-white">
						               
						                <img src="img/ribbon.png" class="ribbon" alt="">
						               <div class="panel-heading"  style="border-bottom-color: #333;">
						                    <h3 class="panel-title">
						                       <img src="img/sql-logo-no-version.png"  style="padding-left: 1%" width="120px" height="50px;"  alt="Sql Server"  />
						                     </h3>
						                </div>
						                <div class="panel-body no-padding text-align-center">
						                      <div class="the-price">
						                        <h1>
						                         Sql      Version <strong>:2012</strong>
						                        </h1>
						                    </div>
						                     <table class="table">
						                        <tr>
						                            <td>
						                              OS <strong> : UBuntu</strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                            <strong>VCPU </strong> : 1
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                               RAM <strong> : 2GB </strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                             Disk Size  <strong> : 20GB</strong>
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                                 Type  <strong> : Database <br> Server  </strong>
						                            </td>
						                        </tr>
						                      
						                    </table>
						                </div>
						                <div class="panel-footer no-padding">
						                    <a href="javascript:void(0);" class="btn bg-color-darken txt-color-white btn-block" role="button">
						                    
						                    <i class="fa fa-shopping-cart"></i>
						                      Launch <span> now!</span></a>
						                </div>
						            </div>
						        </div>	
						
						         <div class="col-xs-12 col-sm4 col-md-2">
						            <div class="panel panel-white">
						                <div class="panel-heading"  style="border-bottom-color: #333;">
						                    <h3 class="panel-title">
						                        <img src="img/redhat.PNG"  style="padding-left: 2%" width="150px" height="50px;"  alt="RedHat" />
						                    </h3>
						                </div>
						                <div class="panel-body no-padding text-align-center">
						                    <div class="the-price">
						                        <h1>
						                            Redhat <br>  Version <strong> : 7.0</strong>
						                        </h1>
						                    </div>
						                    
						                    <table class="table">
						                        <tr>
						                            <td>
						                              OS <strong> : Linux</strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                            <strong>VCPU </strong> : 3
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                               RAM <strong> : 4GB </strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                             Disk Size  <strong> : 40GB</strong>
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                             Type  <strong> : <br> OS <br> </strong>
						                            </td>
						                        </tr>
						                      
						                    </table>
						                </div>
						                <div class="panel-footer no-padding">
						                
						                  <a href="javascript:void(0);"  class="btn bg-color-darken txt-color-white btn-block" role="button">
						                    
						                    <i class="fa fa-shopping-cart"></i>
						                      Launch <span> now!</span></a>
						                
						                </div>
						            </div>
						        </div>

						       <div class="col-xs-12 col-sm4 col-md-2">
						            <div class="panel panel-white">
						                <div class="panel-heading"  style="border-bottom-color: #333;">
						                    <h3 class="panel-title">
						                        <img src="img/fedora-logo-100528469-medium.png"  style="padding-left: 2%" width="150px" height="50px;"  alt="Fedora"  />
						                    </h3>
						                </div>
						                <div class="panel-body no-padding text-align-center">
						                    <div class="the-price">
						                        <h1>
						                            Fedora <br>  Version <strong> : 20</strong>
						                        </h1>
						                      
						                    </div>
						                    <table class="table">
						                        <tr>
						                            <td>
						                              OS <strong> : Linux</strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                            <strong>VCPU </strong> : 3
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                               RAM <strong> : 8GB </strong>
						                            </td>
						                        </tr>
						                        <tr class="active">
						                            <td>
						                             Disk Size  <strong> : 40GB</strong>
						                            </td>
						                        </tr>
						                        <tr>
						                            <td>
						                             Type  <strong> : <br> OS <br> </strong>
						                            </td>
						                        </tr>
						                      
						                    </table>
						                </div>
						                <div class="panel-footer no-padding">
						                
						                  <a href="javascript:void(0);"  class="btn bg-color-darken txt-color-white btn-block" role="button">
						                    
						                    <i class="fa fa-shopping-cart"></i>
						                      Launch <span> now!</span></a>
						                
						                </div>
						            </div>
						        </div>
							</div>
							
						  </div>	
						</div>
					</div>
				</div>

                  <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
									&times;
								</button>
								<h4 class="modal-title" id="myModalLabel">Launch Configuration (Tomcat)</h4>
							</div>
							<div class="modal-body">
				
								<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<label for="tags"> Http Container Port</label>
											<input type="text" class="form-control" placeholder="8080" required />
										</div>
										
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="tags"> Admin Login</label>
											<input type="text" class="form-control" id="tags" placeholder="admin" />
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="tags"> Password</label>
											<input type="password" class="form-control" id="tags" placeholder="******" />
										</div>
									</div>
								</div>
						
						
							<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<label for="tags"> Bind Address</label>
											<input type="text" class="form-control" placeholder="192.168.185.68" required />
										</div>
										
									</div>
								</div>
				
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-info" >
								  <i class="fa fa-edit "></i>	Edit 
								</button>
								<!-- <button type="button" class="btn btn-success" data-dismiss="modal">
								<i class="fa fa-dot-circle-o "></i>	Save And Submit
								</button> -->
								
								<a class="btn btn-success pull-right" href="#"> Save And Submit </a>
								
							</div>
						</div><!-- /.modal-content -->
					</div><!-- /.modal-dialog -->
				</div><!-- /.modal -->
				
			</div>
			</div>
			<!-- END MAIN CONTENT -->
       </div>
     </div>
		<!-- END MAIN PANEL -->

		<!-- PAGE FOOTER -->
	      <div class="page-footer">
			<div class="row">
				<div class="col-xs-12 col-sm-6">
					<span class="txt-color-white">ISAP - Syntel, Inc. � 2014-2015</span>
				</div>
			</div>
		</div>
		<!-- END PAGE FOOTER -->

		
		<!--================================================== -->

		<!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)-->
		<script data-pace-options='{ "restartOnRequestAfter": true }' src="js/plugin/pace/pace.min.js"></script>

		<!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
		<script>
			if (!window.jQuery) {
				document.write('<script src="js/libs/jquery-2.1.1.min.js"><\/script>');
			}
		</script>

		<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
		<script>
			if (!window.jQuery.ui) {
				document.write('<script src="js/libs/jquery-ui-1.10.3.min.js"><\/script>');
			}
		</script>

		<!-- IMPORTANT: APP CONFIG -->
		<script src="js/app.config.js"></script>

		<!-- JS TOUCH : include this plugin for mobile drag / drop touch events-->
		<script src="js/plugin/jquery-touch/jquery.ui.touch-punch.min.js"></script> 

		<!-- BOOTSTRAP JS -->
		<script src="js/bootstrap/bootstrap.min.js"></script>

		<!-- CUSTOM NOTIFICATION -->
		<script src="js/notification/SmartNotification.min.js"></script>

		<!-- JARVIS WIDGETS -->
		<script src="js/smartwidgets/jarvis.widget.min.js"></script>

		<!-- EASY PIE CHARTS -->
		<script src="js/plugin/easy-pie-chart/jquery.easy-pie-chart.min.js"></script>

		<!-- SPARKLINES -->
		<script src="js/plugin/sparkline/jquery.sparkline.min.js"></script>

		<!-- JQUERY VALIDATE -->
		<script src="js/plugin/jquery-validate/jquery.validate.min.js"></script>

		<!-- JQUERY MASKED INPUT -->
		<script src="js/plugin/masked-input/jquery.maskedinput.min.js"></script>

		<!-- JQUERY SELECT2 INPUT -->
		<script src="js/plugin/select2/select2.min.js"></script>

		<!-- JQUERY UI + Bootstrap Slider -->
		<script src="js/plugin/bootstrap-slider/bootstrap-slider.min.js"></script>

		<!-- browser msie issue fix -->
		<script src="js/plugin/msie-fix/jquery.mb.browser.min.js"></script>

		<!-- FastClick: For mobile devices -->
		<script src="js/plugin/fastclick/fastclick.min.js"></script>

		<!--[if IE 8]>

		<h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>

		<![endif]-->

		<!-- Demo purpose only -->
		<script src="js/demo.min.js"></script>

		<!-- MAIN APP JS FILE -->
		<script src="js/app.min.js"></script>

		<!-- ENHANCEMENT PLUGINS : NOT A REQUIREMENT -->
		<!-- Voice command : plugin -->
		<script src="js/speech/voicecommand.min.js"></script>

		<!-- SmartChat UI : plugin -->
		<script src="js/smart-chat-ui/smart.chat.ui.min.js"></script>
		<script src="js/smart-chat-ui/smart.chat.manager.min.js"></script>

		<!-- PAGE RELATED PLUGIN(S) 
		<script src="..."></script>-->

		<script type="text/javascript">
		
		// DO NOT REMOVE : GLOBAL FUNCTIONS!
		
		$(document).ready(function() {
			
			pageSetUp();
			localStorage.setItem("sm-setmenu","top")
		})

		</script>

		<!-- Your GOOGLE ANALYTICS CODE Below -->
		<script type="text/javascript">
			var _gaq = _gaq || [];
				_gaq.push(['_setAccount', 'UA-XXXXXXXX-X']);
				_gaq.push(['_trackPageview']);
			
			(function() {
				var ga = document.createElement('script');
				ga.type = 'text/javascript';
				ga.async = true;
				ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
				var s = document.getElementsByTagName('script')[0];
				s.parentNode.insertBefore(ga, s);
			})();

		</script>

	</body>

</html>