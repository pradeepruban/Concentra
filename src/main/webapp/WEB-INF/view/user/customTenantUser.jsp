<!DOCTYPE html>
<html lang="en-us">
	<head>
		<meta charset="utf-8">
		<!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->

		<title>ISAP User Custom Service Page</title>
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
                <span class="label">Tenant User: ( Project : STG Automtation Team )</span>
                 <a href="#" class="dropdown-toggle" data-toggle="dropdown"> 
                    <i class="fa fa-user"></i>
                    <span> Welcome ,&nbsp;&nbsp;Ashok</span>
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
						<a href="dashboardUser" title="Dashboard"><i class="fa fa-lg fa-fw fa-home"></i> <span class="menu-item-parent">Dashboard</span></a>
					</li>
					<li class="active">
						<a href="#"><i class="fa fa-lg fa-fw fa-windows"></i> <span class="menu-item-parent">Provision VM</span></a>
						<ul>
							<li >
								<a href="stackUser">Stack Service </a>
							</li>
								<li>
								<a href="bespokeUser">Bespoke Service </a>
							</li>
							<li class="active">
								<a href="#">Custom Service  </a>
							</li>
						</ul>
					</li>
					
					<li>
						<a href="orderStatusUser" title="Order Status"><i class="fa fa-lg fa-fw fa-list-alt "></i> <span class="menu-item-parent">Order Status</span></a>
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
					<li>Home</li><li>Provision VM</li><li>Custom</li>
				</ol>
			</div>
			<!-- END RIBBON -->

		<!-- MAIN CONTENT -->
			<div id="content">
				
					<!-- START ROW -->
				
					<div class="row">
						
						<!-- NEW COL START -->
						<article class="col-sm-12 col-md-12 col-lg-12">
				
							<!-- Widget ID (each widget will need unique ID)-->
							<div class="jarviswidget" id="wid-id-1" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-custombutton="false">
								<!-- widget options:
								usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">
				
								data-widget-colorbutton="false"
								data-widget-editbutton="false"
								data-widget-togglebutton="false"
								data-widget-deletebutton="false"
								data-widget-fullscreenbutton="false"
								data-widget-custombutton="false"
								data-widget-collapsed="true"
								data-widget-sortable="false"
				
								-->
								<header>
									<span class="widget-icon"> <i class="fa fa-edit"></i> </span>
									<h2>User Details</h2>
				
								</header>
				
								<!-- widget div-->
								<div>
									<!-- widget content -->
									<div class="widget-body no-padding">
										<form class="smart-form">
											<fieldset>
											   <section class="col col-4">
										        <label class="label"><b>User</b></label>
												<label class="input state-disabled">
													<input type="text" class="input-sm" value="user" disabled="disabled">
												</label>	
									           </section>

									    	<section class="col col-4">
										      <label class="label"><b>Project/Process</b></label>
									          <label class="input state-disabled">
											     <input type="text" name="named" id="named" class="input-sm"  value="MSO-STG/92095" disabled="disabled">
										     </label>
									        </section>
									    
									      <section class="col col-4">
											<label class="label"><b>Notify By</b></label>
											<label class="input state-disabled">
											
												<input type="text" name="named" id="named" class="input-sm"  value="ISAP" disabled="disabled">
											</label>
									      </section>
									    
									    <section class="col col-4">
											<label class="label"><b>Email Id</b></label>
											<label class="input state-disabled">
												
												<input type="text" name="named" id="named" class="input-sm"  value="user@syntelinc.com" disabled="disabled">
											</label>
									    </section>
									    
									    <section class="col col-4">
											<label class="label"><b>Location</b></label>
											<label class="select state-disabled">
												<select name="prov_name" class="input-sm" id="prov_name" disabled="disabled">
													<option value="0"  disabled="">Select</option>
													<option value="1">Pune</option>
													<option value="2" selected="">Chennai</option>								
												</select> 
											</label>
									</section>
						
									<section class="col col-4">
										<label class="label"><b>Choose your Virtual DataCenter</b></label>
										<label class="select state-disabled">
											<select name="prov_name" class="input-sm" id="prov_name" disabled="disabled">
												<option value="0"  disabled="">Select</option>
												<option value="1" selected="">OpenStack</option>
												<option value="2" >Amazon</option>
												<option value="3">VMWare</option>
												<option value="4">Rackspace</option>
												<option value="5">Microsoft-Azure</option>										
											</select> 
										</label>
									</section>

								</fieldset>
				
									
							</form>
				
						</div>
						<!-- end widget content -->
				
					</div>
					<!-- end widget div -->
				
				</div>
			<!-- end widget -->
				
		</article>
		<!-- END COL -->
						
	
		<!-- NEW COL START -->
		<article class="col-sm-12 col-md-12 col-lg-12">
				
		<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget" id="wid-id-1" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-custombutton="false">
				
				<header>
					<span class="widget-icon"> <i class="fa fa-edit"></i> </span>
						<h2>VM Details</h2>
				</header>
				
				<!-- widget div-->
				<div>
	
				<!-- widget content -->
					<div class="widget-body no-padding">
				
						<form class="smart-form">		
							<fieldset>

								<section class="col col-4">
									<label class="label">OS</label>
										<label class="select">
											<select name="os" id="os">
												<option value="0" selected="" disabled="">select os</option>
												<option value="1">Windows</option>
												<option value="2">Linux</option>									
											</select> 
										</label>
									</section>
									
									<section class="col col-4">
									<label class="label">OS Version</label>
										<label class="select">
											<select name="os_version" id="os_version">
												<option value="0" selected="" disabled="">select version</option>
																					
											</select> 
										</label>
									</section>
									
								    <section class="col col-4">
									<label class="label">Components</label>
										<label class="select">
											<select multiple style="width:100%" class="select2">	
												<optgroup label="Application Server">
													<option value="AK">JBoss</option>
													<option value="HI">Weblogic</option>
												</optgroup>
												<optgroup label="Web Server">
													<option value="CA">Tomcat 2.0</option>
												</optgroup>
												<optgroup label="Database">
													<option value="AZ">MySQL</option>
													<option value="CO">Oracle 11g</option>	
												</optgroup>	
											</select>
									 <i></i> </label>
									</section>

									<section class="col col-4">
									<label class="label">Memory</label>
										<label class="select">
											<select name="country">
												<option value="0" selected="" disabled="">select </option>
												<option value="1">2GB</option>
												<option value="2">4GB</option>	
													<option value="3">8GB</option>	
									
											</select> 
									  </label>
								</section>

								<section class="col col-4">
									<label class="label">VCPU</label>
										<label class="select">
											<select name="country">
												<option value="0" selected="" disabled="">select </option>
												<option value="1">1</option>
												<option value="2">2</option>	
												<option value="3">3</option>	
												<option value="5">5</option>											
											</select> 
									 </label>
									</section>
		
							
									<section class="col col-4">
									<label class="label">Disk Size</label>
										<label class="select">
											<select name="country">
												<option value="0" selected="" disabled="">select </option>
												<option value="1">20GB</option>
												<option value="6">40GB</option>	
												<option value="3">60GB</option>	
												<option value="4">80GB</option>	
												<option value="5">100GB</option>									
											</select> 
									 </label>
									</section>
							</fieldset>
				
						</form>
				      </div>
					<!-- end widget content -->
				
					</div>
					<!-- end widget div -->
				
					</div>
					<!-- end widget -->
				
				</article>
				<!-- END COL -->
				
				
				
				
				<!-- NEW COL START -->
		<article class="col-sm-12 col-md-12 col-lg-12">
				
		<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget" id="wid-id-1" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-custombutton="false">
				
				                <header>
									<span class="widget-icon"> <i class="fa fa-edit"></i> </span>
									<h2>General Details</h2>
								</header>
				
				<!-- widget div-->
				<div>
	
				<!-- widget content -->
					<div class="widget-body no-padding">
				
				           <form class="smart-form">
									  <fieldset>

								
									    
		                                    <section class="col col-4">
												<label class="label">Service Description </label>
												<label class="input">
													<i class="icon-append fa fa-user"></i>
													<input type="text" name="named" id="named" >
												</label>
											</section>
		                         
		                         
					                          <section class="col col-4">
					                                 <label class="label">Start Date </label>
															<label class="input"> <i class="icon-append fa fa-calendar"></i>
																<input type="text" name="startdate" id="startdate" placeholder="Expected start date">
															</label>
												</section>
												
												<section class="col col-4">
														   <label class="label">End Date </label>
															<label class="input"> <i class="icon-append fa fa-calendar"></i>
																<input type="text" name="finishdate" id="finishdate" placeholder="Expected finish date">
															</label>
												</section>
						
									    </fieldset>
									</form>
				      </div>
					<!-- end widget content -->
				
					</div>
					<!-- end widget div -->
				
					</div>
					<!-- end widget -->
				
				</article>
				<!-- END COL -->
				
				
		

              	<div class="row">
						<div class="col-md-2 pull-right" >
					  	<button  type="submit" class="btn btn-primary">Launch</button>
					  	<button type="button" class="btn btn-primary">Cancel</button>
					</div>

				</div>

				<!-- END ROW-->
				</div>
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

			
			$('#os').change(
		            
					function() {
		           var val = $('#os option:selected').val();
				   if(val=="2"){
					
					   var select = $('#os_version');
					   var newOptions = {
					                   'ubuntu' : 'ubuntu 12.04',
					                   'blue' : 'ubuntu 14.04',
					                   'green' : 'Fedora 21',
					                   'yellow' : 'Redhat 10.5'
					               };
					   $('option', select).remove();
					   $.each(newOptions, function(text, key) {
					       var option = new Option(key, text);
					       select.append($(option));
					   });
					  

				   }

				 else{
					 var select = $('#os_version');
					   var newOptions = {
					                   'ubuntu' : 'windows 7',
					                   'blue' : 'windows vista',
					               
					               };
					   $('option', select).remove();
					   $.each(newOptions, function(text, key) {
					       var option = new Option(key, text);
					       select.append($(option));
					   });
					   
				   }
				   
		          });	
			
			
	
		// START AND FINISH DATE
			$('#startdate').datepicker({
				dateFormat : 'dd.mm.yy',
				prevText : '<i class="fa fa-chevron-left"></i>',
				nextText : '<i class="fa fa-chevron-right"></i>',
				onSelect : function(selectedDate) {
					$('#finishdate').datepicker('option', 'minDate', selectedDate);
				}
			});
			
			$('#finishdate').datepicker({
				dateFormat : 'dd.mm.yy',
				prevText : '<i class="fa fa-chevron-left"></i>',
				nextText : '<i class="fa fa-chevron-right"></i>',
				onSelect : function(selectedDate) {
					$('#startdate').datepicker('option', 'maxDate', selectedDate);
				}
			}); 

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