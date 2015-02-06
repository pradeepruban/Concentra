<!DOCTYPE html>
<html lang="en-us">
	<head>
		<meta charset="utf-8">
		<!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->

		<title>ISAP Manager Order Billing </title>
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
				     <li >
						<a href="#"><i class="fa fa-lg fa-fw fa-windows"></i> <span class="menu-item-parent">Provision VM</span></a>
						<ul>
						
							<li >
								<a href="stackManager">Stack Service </a>
							</li>
							<li >
								<a href="bespokeManager">Bespoke Service </a>
							</li>
						     <li >
								<a href="customManager">Custom Service</a>
							</li>
						</ul>
					</li>
					<li class="active">
						<a href="#" title="Billing"><i class="fa fa-lg fa-fw fa-list-alt "></i> <span class="menu-item-parent">Billing</span></a>
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
					<li>Home</li><li>Order Billing</li>
				</ol>
			</div>
			<!-- END RIBBON -->

			<!-- MAIN CONTENT -->
			<div id="content">
			<section id="widget-grid" class="">

					<!-- row -->
					<div class="row">
						<!-- NEW WIDGET START -->
						<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
							<!-- Widget ID (each widget will need unique ID)-->
							<div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-0" data-widget-editbutton="false">
								<header>
									<span class="widget-icon"> <i class="fa fa-table"></i> </span>
									<h2>Order Tracking Sheet</h2>
								</header>
								<!-- widget div-->
								<div>

								<!-- widget edit box -->
								<div class="jarviswidget-editbox">
								   <!-- This area used as dropdown edit box -->

								</div>
									<!-- end widget edit box -->

							 <!-- widget content -->
							  <div class="widget-body">		
								<div class="table-responsive">						
									<table class="table table-bordered table-striped">
										<thead>
											<tr>
													<th>Environment Request Number </th>
													<th>Service Type </th>
													<th>Duration Period</th>
													<th>Order Status</th>					
											</tr>
										</thead>
										<tbody>
											<tr>
													<td> <a data-toggle="modal" href="#myModal"> 10001</a>
													</td>
													<td>Stack</td>
												    <td>12/20/2014 - 12/20/2015</td>
													<td style="padding-left: 13px;">Pending ...</td>		
											</tr>
											<tr>
													<td> <a  href="#"> 10002</a></td>
													<td>Custom</td>
													<td>12/20/2014 - 12/20/2015</td>
													<td style="padding-left: 13px;">Pending ...</td>		
											</tr>
											<tr>
													<td> <a  href="#"> 10003</a></td>
													<td>Custom</td>
													<td>10/20/2014 - 12/21/2014</td>
													<td style="padding-left: 13px;">Approved</td>		
											</tr>
											<tr>
													<td> <a  href="#"> 10004</a></td>
													<td>Bespoke</td>
													<td>11/23/2014 - 11/24/2015</td>
													<td style="padding-left: 13px;">Pending ...</td>		
											</tr>
											<tr>
											        <td> <a href="#"> 10005</a></td>
													<td>Bespoke</td>
													<td>11/21/2014 - 11/22/2015</td>
													<td style="padding-left: 13px;">Approved</td>		
											</tr>
													
										</tbody>
									</table>
											
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
		
      <div class="modal fade" id="myModal" tabindex="-1" role="dialog">
	    <div class="modal-dialog">
		   <div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title">
					Billing Details
				</h4>
			</div>
			
			<div class="modal-body no-padding">
				<div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-0" data-widget-editbutton="false">	
						<header>
							<span class="widget-icon"> <i class="fa fa-table"></i> </span>
								<h2>Usage And Billing</h2>
						</header>

					<!-- widget div-->
						<div>
                   	<!-- widget edit box -->
						<div class="jarviswidget-editbox">
							<!-- This area used as dropdown edit box -->
						</div>
						<!-- end widget edit box -->

						<!-- widget content -->
						<div class="widget-body">		
							<div class="table-responsive">
										
								<table class="table table-bordered table-striped">
										<thead>
												<tr>
													    <th>Service Type </th>
														<th>Quantity </th>
														<th>Service Description</th>
														<th>Duration Period</th>
														<th>Unit Cost</th>	
												</tr>
													
										</thead>
										<tbody>
												<tr>
														<td>Stack</td>
														<td>2</td>
														<td>Subscribe tomcat and Weblogic 11g</td>
														<td>12/20/2014 - 12/20/2015</td>
														<td>$12</td>
														
												</tr>		
											</tbody>
									</table>
											
									</div>
							</div>
						<!-- end widget content -->
						
							<div class="modal-footer">
							
		       				<button class='btn btn-xs btn-success'>Cost Billing</button>
		                    </div>
						</div>
						<!-- end widget div -->
		                       
					</div>						
				</div>
				</div><!-- /.modal-content -->
			</div><!-- /.modal-dialog -->
		</div><!-- /.modal -->									
		</div>		
	   </div>
			<!-- END MAIN CONTENT -->

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

	

		<!-- JQUERY VALIDATE -->
		<script src="js/plugin/jquery-validate/jquery.validate.min.js"></script>


		<!-- JQUERY SELECT2 INPUT -->
		<script src="js/plugin/select2/select2.min.js"></script>

		<!-- JQUERY UI + Bootstrap Slider -->
		<script src="js/plugin/bootstrap-slider/bootstrap-slider.min.js"></script>

		<!-- browser msie issue fix -->
		<script src="js/plugin/msie-fix/jquery.mb.browser.min.js"></script>

		<!-- FastClick: For mobile devices -->
		<script src="js/plugin/fastclick/fastclick.min.js"></script>

		

		<!-- Demo purpose only -->
		<script src="js/demo.min.js"></script>

		<!-- MAIN APP JS FILE -->
		<script src="js/app.min.js"></script>

		<!-- ENHANCEMENT PLUGINS : NOT A REQUIREMENT -->
	
		<script type="text/javascript">
		
		// DO NOT REMOVE : GLOBAL FUNCTIONS!
		
		$(document).ready(function() {
			
			pageSetUp();
			
		})

		</script>
	</body>

</html>