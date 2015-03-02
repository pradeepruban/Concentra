<!DOCTYPE html>
<html lang="en-us">
	<head>
		<meta charset="utf-8">
		<!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->

		<title>ISAP Manager Stack Service </title>
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

		
		
		<!-- iOS web-app metas : hides Safari UI Components and Changes Status Bar Appearance -->
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
	
	</head>
	
	
	   <%@ include file="/SesssionFilter.jsp" %>
	   
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
                                margin: 10px 0px 0px;" href="./logOut.jsp" title="Sign Out" data-action="userLogout" 
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
						
							<li class="active">
								<a href="#">Stack Service </a>
							</li>
							<li>
								<a href="bespokeManager">Bespoke Service </a>
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
					<li>Home</li><li>Provision VM</li><li>Stack</li>
				</ol>
			</div>
			<!-- END RIBBON -->


		<!-- MAIN CONTENT -->
			<div id="content">
	
				<!-- widget grid -->
				<section id="widget-grid" class="">
					<!-- start row -->
					<div class="row">
			
						<!-- NEW WIDGET START -->
						<article class="col-sm-12 col-md-12 col-lg-12">
				
							<!-- Widget ID (each widget will need unique ID)-->
							<div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-10" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="true" data-widget-sortable="false">
								<header>
								   <span class="widget-icon"><i class="fa fa-th-list"></i></span>
									<h2>Available Stack Templates </h2>
								 </header>
								 
								<!-- widget div-->
							   <div>
									<!-- widget content -->
								<div class="widget-body no-padding">
								
									<div class="panel-group smart-accordion-default" id="accordion-2">
										<div class="panel panel-default">
											<div class="row">
										          <div class="col-xs-12 col-sm-9 col-md-9">
												      <div class="panel-heading">
															<h4 class="panel-title">
																<a data-toggle="collapse" class="collapsed" data-parent="#accordion-2" href="#collapseOne-1"> 
																	<i class="fa fa-fw fa-plus-circle txt-color-green"></i> 	
																	<i class="fa fa-fw fa-minus-circle txt-color-red"></i>	
																	 Tomcat Dev Stack 
																 </a>  
													        </h4>
												       </div>
												    </div>
											  <div class="col-xs-12 col-sm-3 col-md-3">
						                         <a href="javascript:void(0);" id="show-shortcut" >
													<img src="img/tomcat_logo.gif"  width="15%" height="15%" alt="tomcat"   style="padding-top: 3px;padding-bottom: 3px;" />
													<img src="img/JBoss_logo.png"  width="17%" height="15%" alt="Jboss"   style="padding-top: 3px;padding-bottom: 3px;"/>
													<img src="img/mysql-logo.png"  width="16%" height="15%" alt="mysql"   style="padding-top: 3px;padding-bottom: 3px;" />
													<img src="img/cluster.png"  width="15%" height="15%" alt="cluster"   style="padding-top: 3px;padding-bottom: 3px;" />
						                         </a> 
										      </div>
											</div>

											<div id="collapseOne-1" class="panel-collapse collapse">
													<div class="panel-body">
													  <div class="table-responsive">
												       <table class="table table-bordered">
														    <thead>
															<tr>
															    <th>Instance Name</th>
																<th >Memory (MB)</th>
																<th >VCPU</th>
																<th >Disk Size (GB)</th>
																<th >Components</th>
																<th >Provider</th>
															</tr>
														</thead>
														<tbody>
															
															<tr><td>Tomcat Dev</td>
																<td>2048</td>
																<td>3</td>
																<td>20</td>
																<td>Tomcat 8.0, Java 1.7</td>
															    <td><span class="label label-primary">OpenStack-Chennai-DC</span></td>
															</tr>
															
															<tr>
																<td> JBoss Dev</td>
																<td>1024</td>
																<td>2</td>
																<td>10</td>
																<td>JBoss 5.1</td>
																<td><span class="label label-primary">OpenStack-Chennai-DC</span></td>
															</tr>
															
															<tr>
															    <td>MySql Dev</td>
																<td>1024</td>
																<td>2</td>
																<td>10</td>
																<td>Java 1.7 , MySql 5.5</td>
															    <td><span class="label label-primary">OpenStack-Chennai-DC</span></td>
															</tr>
														</tbody>
												    </table>
													</div>
													  <button class='btn btn-xs btn-success pull-right'><i class="fa fa-shopping-cart"></i> Launch <span> now!</span></button> 
												</div>  
										 </div>
									</div>
											
											
											
								<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title">
												<a data-toggle="collapse" data-parent="#accordion-2" href="#collapseTwo-1" class="collapsed"> 
													<i class="fa fa-fw fa-plus-circle txt-color-green"></i> 
													<i class="fa fa-fw fa-minus-circle txt-color-red"></i> 
													Syntelligence Dev Stack 
												</a>
											</h4>
										</div>
									 <div id="collapseTwo-1" class="panel-collapse collapse">
										<div class="panel-body">
											<div class="table-responsive">
												<table class="table table-bordered">
													<thead>
														<tr>
														    <th>Instance Name</th>
															<th >Memory (MB)</th>
															<th >VCPU</th>
															<th >Disk Size (GB)</th>
															<th >Components</th>
															<th >Provider</th>
														</tr>
													</thead>
													
													<tbody>
													
														<tr>
														   <td>Java Dev</td>
															<td>1024</td>
															<td>1</td>
															<td>10</td>
															<td>Java 1.7</td>
															<td><span class="label label-primary">OpenStack-Chennai-DC</span></td>
														</tr>
														
													</tbody>
												</table>
											</div>
											  <button class='btn btn-xs btn-success pull-right'><i class="fa fa-shopping-cart"></i> Launch <span> now!</span></button> 
											</div>
										</div>
									</div>
											
											
											
								<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title">
											  <a data-toggle="collapse" data-parent="#accordion-2" href="#collapseThree-1" class="collapsed"> 
											    <i class="fa fa-fw fa-plus-circle txt-color-green"></i> 
											    <i class="fa fa-fw fa-minus-circle txt-color-red"></i> 
											    Websphere Dev Stack 
											   </a>
											  </h4>
										</div>
									    <div id="collapseThree-1" class="panel-collapse collapse">
										   <div class="panel-body">
											     <div class="table-responsive">
													<table class="table table-bordered">
														<thead>
															<tr>
															    <th>Instance Name</th>
																<th >Memory (MB)</th>
																<th >VCPU</th>
																<th >Disk Size (GB)</th>
																<th >Components</th>
																<th >Provider</th>
															</tr>
														</thead>
														
														<tbody>
															<tr>
															  <td>WebSphere Dev</td>
																<td>1024</td>
																<td>2</td>
																<td>10</td>
																<td> Java 1.7 , MySql 5.5, Websphere 8.5</td>
																<td><span class="label label-warning">VCenter-Pune-DC</span></td>
															</tr>
														</tbody>
													</table>	
												</div>
												<button class='btn btn-xs btn-success pull-right'><i class="fa fa-shopping-cart"></i> Launch <span> now!</span></button> 
										</div>
									  </div>
								</div>
															
								<div class="panel panel-default">
									<div class="panel-heading">
										<h4 class="panel-title">
										   <a data-toggle="collapse" data-parent="#accordion-2" href="#collapseFour-1" class="collapsed">
										       <i class="fa fa-fw fa-plus-circle txt-color-green"></i> 
										       <i class="fa fa-fw fa-minus-circle txt-color-red"></i> 
										         FP App Testing 
										     </a>
										  </h4>
									  </div>
									  
									<div id="collapseFour-1" class="panel-collapse collapse">
											<div class="panel-body">
											  <div class="table-responsive">
												<table class="table table-bordered">
													<thead>
														<tr>
														    <th>Instance Name</th>
															<th >Memory (MB)</th>
															<th >VCPU</th>
															<th >Disk Size (GB)</th>
															<th >Components</th>
															<th >Provider</th>
														</tr>
													</thead>
													
													<tbody>
														<tr>
														  <td>Apache Dev</td>
															<td>512</td>
															<td>1</td>
															<td>10</td>
															<td> Apache 2.0</td>											
															<td><span class="label label-primary">OpenStack-Chennai-DC</span></td>
														 </tr>

														 <tr>
															<td>JBoss Dev1</td>
															<td>1024</td>
															<td>2</td>
															<td>10</td>
															<td>JBoss 5.1</td>
															<td><span class="label label-primary">OpenStack-Chennai-DC</span></td>
														 </tr>
														
														<tr>
															<td>JBoss Dev2</td>
															<td>1024</td>
															<td>1</td>
															<td>10</td>
															<td>JBoss 5.1</td>
															<td><span class="label label-primary">OpenStack-Chennai-DC</span></td>
														 </tr>
														
													</tbody>
												</table>
						                      </div> 
						                       <button class='btn btn-xs btn-success pull-right'><i class="fa fa-shopping-cart"></i> Launch <span> now!</span></button> 
						                      </div>
										   </div>
									</div>
											
								
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion-2" href="#collapseFive-1" class="collapsed"> 
											   <i class="fa fa-fw fa-plus-circle txt-color-green"></i> 
											   <i class="fa fa-fw fa-minus-circle txt-color-red"></i> 
											   Supply Chain Dev </a>
											  </h4>
										</div>
										<div id="collapseFive-1" class="panel-collapse collapse">
												<div class="panel-body">
													  <div class="table-responsive">
															<table class="table table-bordered">
														       <thead>
																 <tr>
															        <th>Instance Name</th>
																	<th >Memory (MB)</th>
																	<th >VCPU</th>
																	<th >Disk Size (GB)</th>
																	<th >Components</th>
																	<th >Provider</th>
															    </tr>
														      </thead>
														     <tbody>
																<tr>
																	<td>JBoss Dev</td>
																    <td>1024</td>
																    <td>1</td>
																    <td>10</td>
																    <td>JBoss 5.1</td>
																    <td><span class="label label-primary">OpenStack-Chennai-DC</span></td>
															   </tr>
														</tbody>
													</table>
													</div> 
												<button class='btn btn-xs btn-success pull-right'><i class="fa fa-shopping-cart"></i> Launch <span> now!</span></button> 
											 </div>
											</div>
										</div>
												
											
																				
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title">
											   <a data-toggle="collapse" data-parent="#accordion-2" href="#collapseSix-1" class="collapsed"> 
											     <i class="fa fa-fw fa-plus-circle txt-color-green"></i> 
											      <i class="fa fa-fw fa-minus-circle txt-color-red"></i> 
											      SharePoint Dev 
											     </a>
											   </h4>
										  </div>
										<div id="collapseSix-1" class="panel-collapse collapse">
										
										  <div class="panel-body">
											 <div class="table-responsive">
												<table class="table table-bordered">
													<thead>
														<tr>
														    <th>Instance Name</th>
															<th >Memory (MB)</th>
															<th >VCPU</th>
															<th >Disk Size (GB)</th>
															<th >Components</th>
															<th >Provider</th>
														</tr>
													</thead>
													
													<tbody>
													        <tr>
																<td>JBoss Dev</td>
																<td>1024</td>				
																<td>1</td>
																<td>10</td>
																<td>JBoss 5.1</td>
																<td><span class="label label-primary">OpenStack-Chennai-DC</span></td>
														    </tr>
													</tbody>
													
												</table>
											</div> 
											<button class='btn btn-xs btn-success pull-right'><i class="fa fa-shopping-cart"></i> Launch <span> now!</span></button> </div>
										 </div>
									</div>
												
											
											
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title">
											   <a data-toggle="collapse" data-parent="#accordion-2" href="#collapseSeven-1" class="collapsed">
											      <i class="fa fa-fw fa-plus-circle txt-color-green"></i> 
											       <i class="fa fa-fw fa-minus-circle txt-color-red"></i> 
											       ECommerce WebSphere Dev 
											      </a>
											     </h4>
											</div>
											
											<div id="collapseSeven-1" class="panel-collapse collapse">
												<div class="panel-body">
												   <div class="table-responsive">
														<table class="table table-bordered">
													       <thead>
															<tr>
															    <th >Instance Name</th>
																<th >Memory (MB)</th>
																<th >VCPU</th>
																<th >Disk Size (GB)</th>
																<th >Components</th>
																<th >Provider</th>
															</tr>
													    </thead>
													     
													      <tbody>
															<tr>
																<td>Websphere Plus Version Control Dev</td>
																<td>2048</td>
																<td>2</td>
																<td>20</td>
															    <td>Java 1.7 , MySql 5.5 , Websphere 8.5 , SVN 1.8 , Eclipse Luna</td>
																<td><span class="label label-warning">VCenter-Pune-DC</span></td>
														    </tr>
													    </tbody>
												      </table>
													</div>
													<button class='btn btn-xs btn-success pull-right'><i class="fa fa-shopping-cart"></i> Launch <span> now!</span></button> </div>
												</div>
									</div>
											
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title">
											    <a data-toggle="collapse" data-parent="#accordion-2" href="#collapseEight-1" class="collapsed"> 
											      <i class="fa fa-fw fa-plus-circle txt-color-green"></i> 
											      <i class="fa fa-fw fa-minus-circle txt-color-red"></i> 
											      AppStack Dev 
											     </a>
											  </h4>
											</div>
											
										  <div id="collapseEight-1" class="panel-collapse collapse">
												<div class="panel-body">  
												   <div class="table-responsive">
														<table class="table table-bordered">
													        <thead>
																<tr>
																    <th >Instance Name</th>
																	<th >Memory (MB)</th>
																	<th >VCPU</th>
																	<th >Disk Size (GB)</th>
																	<th >Components</th>
																	<th >Provider</th>
															    </tr>
													      </thead>
													      
													       <tbody>
																<tr>
																    <td>WebSphere Dev</td>
																	<td>2048</td>
																	<td>2</td>
																	<td>20</td>
																    <td>Java 1.7 , SSH  , Websphere 8.5 </td>
																	<td><span class="label label-warning">VCenter-Pune-DC</span></td>
														       </tr>
														
																<tr>
																  <td>MySql Dev</td>
															      <td>2048</td>
															      <td>1</td>
															      <td>20</td>
														          <td>Java 1.7 , MySql 5.1 </td>
																  <td><span class="label label-warning">VCenter-Pune-DC</span></td>
														      </tr>
													   </tbody>
												    </table>
												</div>
												<button class='btn btn-xs btn-success pull-right'><i class="fa fa-shopping-cart"></i> Launch <span> now!</span></button> 
											</div>
										</div>
									</div>
											
							</div>
				
						</div>
						<!-- end widget content -->
				
					</div>
						<!-- end widget div -->
				
				</div>
				<!-- end widget -->
				
			</article>
				<!-- WIDGET END -->
				
		</div>
				
		<!-- end row -->
		
	  </section>
	   <!-- end widget grid -->
				
	</div>
	<!-- END MAIN CONTENT -->

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

		<!-- PAGE RELATED PLUGIN(S) -->
		<script src="js/plugin/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>

		

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