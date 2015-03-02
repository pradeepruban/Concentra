<html lang="en-us">
	<head>
		<meta charset="utf-8">
		<title> ISAP User Dashboard Page </title>
		<meta name="description" content="">
		<meta name="author" content="">
			
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		
		<!-- #CSS Links -->
		<!-- Basic Styles -->
		<link rel="stylesheet" type="text/css" media="screen" href="css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" media="screen" href="css/font-awesome.min.css">

		<!-- SmartAdmin Styles : Caution! DO NOT change the order -->
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-production-plugins.min.css">
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-production.min.css">
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-skins.min.css">

		<!-- SmartAdmin RTL Support -->
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-rtl.min.css"> 

		
		<!-- Demo purpose only: goes with demo.js, you can delete this css when designing your own WebApp -->
		<link rel="stylesheet" type="text/css" media="screen" href="css/demo.min.css">

		<!-- #FAVICONS syntel logo -->
		<link rel="icon" href="img/favicon/favicon.ico" type="image/x-icon">

		<!-- #GOOGLE FONT -->
		<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,300,400,700">

		<!-- #APP SCREEN / ICONS -->
		<!-- Specifying a Webpage Icon for Web Clip 
			 Ref: https://developer.apple.com/library/ios/documentation/AppleApplications/Reference/SafariWebContent/ConfiguringWebApplications/ConfiguringWebApplications.html -->
		<link rel="apple-touch-icon" href="img/splash/sptouch-icon-iphone.png">
		<link rel="apple-touch-icon" sizes="76x76" href="img/splash/touch-icon-ipad.png">
		<link rel="apple-touch-icon" sizes="120x120" href="img/splash/touch-icon-iphone-retina.png">
		<link rel="apple-touch-icon" sizes="152x152" href="img/splash/touch-icon-ipad-retina.png">
		
		<!-- iOS web-app metas : hides Safari UI Components and Changes Status Bar Appearance -->
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		
		<!-- Startup image for web apps -->
		<link rel="apple-touch-startup-image" href="img/splash/ipad-landscape.png" media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:landscape)">
		<link rel="apple-touch-startup-image" href="img/splash/ipad-portrait.png" media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:portrait)">
		<link rel="apple-touch-startup-image" href="img/splash/iphone.png" media="screen and (max-device-width: 320px)">
	 </head>

   <%@ include file="/SesssionFilter.jsp" %>
   
<body class="desktop-detected menu-on-top fixed-page-footer pace-done">
    
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
                <span class="label">Tenant User: ( Project : STG Automtation Team )</span>
                 <a href="#" class="dropdown-toggle" data-toggle="dropdown"> 
                    <i class="fa fa-user"></i>
                    <span> Welcome ,&nbsp;&nbsp;${userValue.usr_name}</span>
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
					 <li class="active">
						<a href="dashboardTenantUser" title="Dashboard"><i class="fa fa-lg fa-fw fa-home"></i> <span class="menu-item-parent">Dashboard</span></a>
					</li>
					<li>
						<a href="#"><i class="fa fa-lg fa-fw fa-windows"></i> <span class="menu-item-parent">Provision VM</span></a>
						<ul>
							<li>
								<a href="stackTenantUser">Stack Service   </a>
							</li>
								<li>
								<a href="bespokeTenantUser">Bespoke Service </a>
							</li>
							<li>
								<a href="customLaunch">Custom Service  </a>
							</li>
						</ul>
					</li>
					
					<li>
						<a href="customUserServiceList" title="Custom Service List"><i class="fa fa-lg fa-fw fa-filter"></i> <span class="menu-item-parent">Service List</span></a>
					</li>
					
					<li >
						<a href="userKeyPairList" title="KeyPair"><i class="fa fa-lg fa-fw fa-key"></i> <span class="menu-item-parent">KeyPair List</span></a>
					</li>
					
				</ul>
			</nav>
		</aside>
		<!-- END NAVIGATION -->

		<!-- MAIN PANEL -->
		<div id="main" role="main">

			<!-- RIBBON -->
			<div id="ribbon">


	        <span class="ribbon-button-alignment"> 
					<%-- <span id="refresh" class="btn btn-ribbon" data-action="resetWidgets" data-title="refresh"  rel="tooltip" data-placement="bottom" data-original-title="<i class='text-warning fa fa-warning'></i> Warning! This will reset all your widget settings." data-html="true">
						<i class="fa fa-refresh"></i>
					</span>  --%>
				</span>
				<!-- breadcrumb -->
				<ol class="breadcrumb">
					<li>Home</li><li>Dashboard</li>
				</ol>
				<!-- end breadcrumb -->
				
			</div>
			<!-- END RIBBON -->
			
			<!-- MAIN CONTENT -->
			<div id="content">

				<!-- row -->
				<div class="row">
					<!-- col -->
					<div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
						<h1 class="page-title txt-color-blueDark">
						<!-- PAGE HEADER -->
					     Request Service		  
						</h1>
					</div>
					<!-- end col -->
				</div>
				<!-- end row -->
				
				  <div class="row">
				  
					<div class="col-sm-12">
					
						<div class="well padding-10">
	
							<div class="row">
							    <div class="col-md-2">
								  <img src="img/Insta-BW.jpg" class="img-responsive" alt="img"/>
							    </div>
	
								<div class="col-md-4 padding-left-0">
									<h3 class="margin-top-0">
									   <a href="javascript:void(0);"> Stack Service</a>
									   <a class="btn btn-primary pull-right" href="stackTenantUser"> Create Request </a>
									   <br>
									</h3>
									
									<p>Order Your Enterprise Stack  <br><br>
                                        On-demand Cloud servers <br><br>
                                        Choose our bundle of servers with cluster, HA and ready made OS, appliance and configuration<br><br>
                                        Choose your Usage period <br><br>                    
									</p>
								</div>
								
								<div class="col-md-2">
										<img src="img/Fusion-BW.jpg" class="img-responsive" alt="img"/>
								</div> 
								
								<div class="col-md-4 padding-left-0">
									<h3 class="margin-top-0">
									   <a href="javascript:void(0);">Bespoke Service </a>
									   <a class="btn btn-primary pull-right" href="bespokeTenantUser"> Create Request </a>
									    <br>
									</h3>
									<p>Order  a VM with built in OS , appliance and configuration <br><br>
                                        On-demand Cloud servers <br><br>
                                        Choose your Usage period <br><br>
									</p>
								</div>
							</div>
							
						    <div class="row">
								<div class="col-md-2"></div>
								<div class="col-md-4 padding-left-0"></div>
									<div class="col-md-2">
									  <img src="img/supreme.png" class="img-responsive" alt="img"/>			
								    </div>
								<div class="col-md-4 padding-left-0">
									<h3 class="margin-top-0">
									    <a href="javascript:void(0);"> Custom Service </a>
										<a class="btn btn-primary pull-right" href="customLaunch"> Create Request </a>
									    <br>
									</h3>
									<p>	Order your VM and select your hardware configuration <br><br>
                                        On-demand Cloud servers <br><br> 
                                        Choose your own OS<br><br>
                                        Select your Software Package<br><br>
                                        Choose your Usage period <br><br>
									</p>
								</div>
							</div>
							
							<hr>
						</div>

					</div>

				</div>

			</div>
			<!-- END MAIN CONTENT -->

		</div>
		<!-- END MAIN PANEL -->

		<!-- PAGE FOOTER -->
         <div class="page-footer">
			<div class="row">
				<div class="col-xs-12 col-sm-6">
					<span class="txt-color-white">ISAP - Syntel, Inc. &copy; 2014-2015</span>
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

		<!-- MAIN APP JS FILE -->
		<script src="js/app.min.js"></script>

	

		<!-- PAGE RELATED PLUGIN(S) 
		<script src="..."></script>-->

		<script type="text/javascript">

			$(document).ready(function() {
			 	
				/* DO NOT REMOVE : GLOBAL FUNCTIONS!
				 *
				 * pageSetUp(); WILL CALL THE FOLLOWING FUNCTIONS
				 *
				 * // activate tooltips
				 * $("[rel=tooltip]").tooltip();
				 *
				 * // activate popovers
				 * $("[rel=popover]").popover();
				 *
				 * // activate popovers with hover states
				 * $("[rel=popover-hover]").popover({ trigger: "hover" });
				 *
				 * // activate inline charts
				 * runAllCharts();
				 *
				 * // setup widgets
				 * setup_widgets_desktop();
				 *
				 * // run form elements
				 * runAllForms();
				 *
				 ********************************
				 *
				 * pageSetUp() is needed whenever you load a page.
				 * It initializes and checks for all basic elements of the page
				 * and makes rendering easier.
				 *
				 */
				
				 pageSetUp();
				 
				/*
				 * ALL PAGE RELATED SCRIPTS CAN GO BELOW HERE
				 * eg alert("my home function");
				 * 
				 * var pagefunction = function() {
				 *   ...
				 * }
				 * loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
				 * 
				 * TO LOAD A SCRIPT:
				 * var pagefunction = function (){ 
				 *  loadScript(".../plugin.js", run_after_loaded);	
				 * }
				 * 
				 * OR
				 * 
				 * loadScript(".../plugin.js", run_after_loaded);
				 */
				 $.root_.addClass("fixed-page-footer") ;
				 localStorage.setItem("sm-setmenu","top");
				
			});
		
		</script>

		

</html>