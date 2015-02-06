<!DOCTYPE html>
<html lang="en-us">
	<head>
		<meta charset="utf-8">
		<title>ISAP Set Policies</title>	
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

		<!-- We recommend you use "your_style.css" to override SmartAdmin
		     specific styles this will also ensure you retrain your customization with each SmartAdmin update.
		<link rel="stylesheet" type="text/css" media="screen" href="css/your_style.css"> -->

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
	

        <link rel="icon" href="/graphics/dbc-16.png" type="image/png">
        
        <style>
			#logo img {width: 60%;height: 123%;padding-left: -2px;margin-left: -13px;margin-top: -12px;
			          }
			
			.btn-primary {background-color: none;border-color: #2C699D;
			              }
		</style>
		<script  src="https://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js"></script>	
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
                <span class="label">Technical Admin: ( Project : STG Automtation Team )</span>
                 <a href="#" class="dropdown-toggle" data-toggle="dropdown"> 
                    <i class="fa fa-user"></i>
                    <span> Welcome ,&nbsp;&nbsp;Admin</span>
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

			<!-- User info -->
			
			
			<!-- end user info -->

			<!-- NAVIGATION : This navigation is also responsive-->
			<nav>
				<ul>
					<li >
						<a href="dashboardAdmin" title="DashBoard"><i class="fa fa-lg fa-fw fa-home"></i> <span class="menu-item-parent">DashBoard</span></a>
					</li>
					<li>
						<a href="organizationDesignerAdmin" title="OrganizationDesigner"><i class="fa fa-pencil-square"></i> <span class="menu-item-parent">Organization Designer</span></a>
					</li>
					<li>
						<a href="#"><i class="fa fa-lg fa-fw fa-puzzle-piece"></i> <span class="menu-item-parent">VDC Management</span></a>
						<ul>
							<li>
								<a href="registerVdcAdmin">Register VDC</a>
							</li>
						</ul>		
					</li>
					<li class="active">
						<a href="#"><i class="fa fa-lg fa-fw  fa-legal"></i> <span class="menu-item-parent">Policies</span></a>
						<ul>
						   <li >
								<a href="listUsersAdmin">List Users</a>
							</li>
							<li class="active">
								<a href="#">Set Policies</a>
							</li>
							
						</ul>		
					</li>
					<li>
						<a href="#"><i class="fa fa-lg fa-fw fa-calendar"></i> <span class="menu-item-parent">Service Catalog creation</span></a>
					</li> 
					<li>
						<a href="#"><i class="fa fa-lg fa-fw fa-filter"></i> <span class="menu-item-parent">Stack List</span></a>
					</li>
					
					<!-- <li>
						<a href="#"><i class="fa fa-lg fa-fw fa-cogs"></i> <span class="menu-item-parent">Manage Services</span></a>
					</li>  -->
					
					<li>
						<a href="#"><i class="fa fa-stack-overflow"></i> <span class="menu-item-parent">Reports</span></a>
					</li>		
					<li>
						<a href="#"><i class="fa  fa-user"></i> <span class="menu-item-parent">Users & Account</span></a>	
			
					</li>
					<li>
					<a href="#"><i class="fa fa-fw fa-medkit"></i> <span class="menu-item-parent"> Monitor</span></a>			
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
					<li>Home</li><li>Policies</li><li>Set Policies</li>
				</ol>
				<!-- end breadcrumb -->

			</div>
			<!-- END RIBBON -->

          <div id="content">
			<!-- widget grid -->
				<section id="widget-grid" class="">
					<!-- row -->
					<div class="row">
					
					          <!--     <header>
									<span class="widget-icon"> <i class="fa fa-arrows-v"></i> </span>
									<h2 class="font-md"><strong>SET</strong> <i>policy</i></h2>												
								</header>  -->
							<!-- Widget ID (each widget will need unique ID)-->
							<div class="jarviswidget jarviswidget-color-darken" id="wid-id-2" data-widget-editbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false">
								
								
								<!-- widget div-->
								<div>							
								<!-- widget edit box -->
								    <div class="jarviswidget-editbox">
									<!-- This area used as dropdown edit box -->
									</div>
									<!-- end widget edit box -->
															
									<!-- widget content -->
									<div class="widget-">										
										<div class="alert alert-success">								
										    <div class="row">								
											    <div class="col-md-6">
												   <div class="form-group">
												      <div class="input-group">											
										                  <span class="input-group-addon">
										                    <i class="fa fa-envelope fa-lg fa-fw"></i>
										                   </span>  
										                   <select class="form-control">
										                        <option value="" selected="selected">Filter By</option>
																<option value="Team Lead">Authority</option>
																<option value="System Analyst">Access</option>
																<option value="Project Manager">Role</option>
										                    </select>  
										             	</div>
											       </div>								
											</div>												
											<div class="col-sm-3">
													<a data-toggle="modal" href="#myModal" class="btn btn-success txt-color-white pull-right ">
													<i class="fa fa-circle-arrow-up fa-lg"></i>Add Role</a>
		
											</div>
										  </div>
										</div>
										
										<div class="alert alert-success">
											<div class="row">
												<div class="col-md-4">
													<h4><Strong>Name</Strong></h4>
												</div>
												<div class="col-md-6">
													<h4><Strong>Description</Strong></h4>
												</div>
											</div>
																					
											<div class="row">
												<div class="col-md-4">
														Tenant Admin
												</div>
												<div class="col-md-8">
													<div class="form-group">
														<div class="col-md-10">
															<div class="checkbox">
																<label>
																	<input type="checkbox">
																	Full access to requested VDC 
																</label>
															 </div>
															 
															<div class="checkbox">
																<label>
																	<input type="checkbox">
																	Full access to requested Stack 
																</label>
															 </div>
															 
															<div class="checkbox">
																<label>
																	<input type="checkbox">
																	Approval Required 
																</label>
															</div>
															
														</div>
													</div>
												</div>
											</div>
																						
											<div class="row">
													<div class="col-md-4">
														ISAP Bussiness Admin
													</div>
													
													<div class="col-md-8">
														<div class="form-group">
														  <div class="col-md-10">
															<div class="checkbox">
																<label>
																	<input type="checkbox">
																	Cost & billing in tenant portal
																</label>
															  </div>
															  
															  <div class="checkbox">
																<label>
																	<input type="checkbox">
																	Reporting 
															   </label>
															  </div>
															  
															   <div class="checkbox">
																<label>
																	<input type="checkbox">
																	Request VDC 
															   </label>
															   </div>
															   
															<div class="checkbox">
																<label>
																	<input type="checkbox">
																	Request Stack 
																</label>
															</div>
															
															<div class="checkbox">
																<label>
																	<input type="checkbox">
																	Approval required 
																</label>
															</div>
															
														</div>
													</div>
												</div>
											</div>
																					
											<div class="row">
												<div class="col-md-4">
														ISAP Tech Admin User
												</div>
												<div class="col-md-8">
													<div class="form-group">
														<div class="col-md-10">
															<div class="checkbox">
																<label>
																	<input type="checkbox">
																	Full access to tenant Amex 
																</label>
															 </div>
															 
															<div class="checkbox">
																<label>
																	<input type="checkbox">
																	Full access to tenant Fedex 
																</label>
															</div>
															
															<div class="checkbox">
																<label>
																	<input type="checkbox">
																	Full access to create VDC 
																</label>
															</div>
															
															<div class="checkbox">
																<label>
																	<input type="checkbox">
																	Provide VDC to tenant 
																</label>
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
							
								<!-- end widget content -->								
							</div>
							<!-- end widget div -->					
						</div>	
					</div>
				</section>
				<!-- end widget grid -->
			</div>
			
		<!-- 	modal section -->
		
		
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
							&times;
						</button>
						<h4 class="modal-title">
							Add New Roles
						</h4>
					</div>
					<div class="modal-body no-padding">	
						<form id="login-form" class="smart-form">
							<fieldset>										
								<section>
									<div class="row">
												<label class="label col col-2">First Name</label>
												<div class="col col-10">
													<label class="input"> <i class="icon-append fa fa-user"></i>
														<input type="text" name="name">
													</label>
												</div>
										</div>
								</section>
								<section>
									<div class="row">
												<label class="label col col-2">Last Name</label>
												<div class="col col-10">
													<label class="input"> <i class="icon-append fa fa-user"></i>
														<input type="text" name="name">
													</label>
												</div>
										</div>
								</section>
								<section>
									<div class="row">
												<label class="label col col-2">EmpID</label>
												<div class="col col-10">
													<label class="input"> <i class="icon-append fa fa-user"></i>
														<input type="text" name="name">
													</label>
												</div>
											</div>
								</section>
								<section>
									<div class="row">
												<label class="label col col-2">Email ID</label>
												<div class="col col-10">
													<label class="input"> <i class="icon-append fa fa-envelope-o"></i>
														<input type="text" name="name">
													</label>
													
												</div>
									</div>
								</section>
								<section>
									<div class="row">
												<label class="label col col-2">Contact</label>
												<div class="col col-10">
													<label class="input"> <i class="icon-append fa fa-envelope-o"></i>
														<input type="text" name="name">
													</label>
													
												</div>
											</div>
								</section>
								<section>
									<div class="row">
												<label class="label col col-2">Role</label>
												 <div class="col col-10">										
													<select  class="form-control input-sm"  name="role">
															<option value="" selected="selected">Role</option>
															<option>Tenant Admin</option>
															<option>ISAP Business Admin</option>
													</select>
												</div>
									</div>
								</section>
								<section>
										<div class="row">
												<label class="label col col-2">Policy</label>
												<div class="col col-10">
													<label class="input"> <i class="icon-append fa fa-user"></i>
														<input type="text" name="role">
													</label>													
												</div>
											</div>
								</section>								
							</fieldset>
									
							<footer>
								<button type="submit" class="btn btn-primary">
											Add Role
								</button>
								<button type="button" class="btn btn-default" data-dismiss="modal">
											Cancel
								</button>
		
							</footer>
						</form>										
					</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
  


		</div>
		<!-- END MAIN PANEL -->

		<!-- PAGE FOOTER -->
	  <div class="page-footer">
			<div class="row">
				<div class="col-xs-12 col-sm-6">
					<span class="txt-color-white">ISAP- Syntel, Inc. � 2014-2015</span>
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
		
		<!-- Flot Chart Plugin: Flot Engine, Flot Resizer, Flot Tooltip -->
		<script src="js/plugin/flot/jquery.flot.cust.min.js"></script>
		<script src="js/plugin/flot/jquery.flot.resize.min.js"></script>
		<script src="js/plugin/flot/jquery.flot.time.min.js"></script>
		<script src="js/plugin/flot/jquery.flot.tooltip.min.js"></script>
		
		<!-- Vector Maps Plugin: Vectormap engine, Vectormap language -->
		<script src="js/plugin/vectormap/jquery-jvectormap-1.2.2.min.js"></script>
		<script src="js/plugin/vectormap/jquery-jvectormap-world-mill-en.js"></script>
		
		<!-- Full Calendar -->
		<script src="js/plugin/moment/moment.min.js"></script>
		<script src="js/plugin/fullcalendar/jquery.fullcalendar.min.js"></script>

		<script>
			$(document).ready(function() {

				// DO NOT REMOVE : GLOBAL FUNCTIONS!
				pageSetUp();

				/*
				 * PAGE RELATED SCRIPTS
				 */

				$(".js-status-update a").click(function() {
					var selText = $(this).text();
					var $this = $(this);
					$this.parents('.btn-group').find('.dropdown-toggle').html(selText + ' <span class="caret"></span>');
					$this.parents('.dropdown-menu').find('li').removeClass('active');
					$this.parent().addClass('active');
				});

				
				
			});

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