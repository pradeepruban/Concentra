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
	
	
    <body class="">
    
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
                                margin: 10px 0px 0px;" href="./logout" title="Sign Out" data-action="userLogout" 
                                data-logout-msg="You can improve your security further after logging out by closing this opened browser">
                           <i class="fa fa-sign-out"></i>
                       </a> 
             </span> 

           </div>
			<!-- end pulled right: nav area -->

		</header>
		<!-- END HEADER -->

		<aside id="left-panel">

			<!-- NAVIGATION : This navigation is also responsive-->
			<nav>
			
				<ul>
					 <li>
						<a href="dashboardTenantUser" title="Dashboard"><i class="fa fa-lg fa-fw fa-home"></i> <span class="menu-item-parent">Dashboard</span></a>
					</li>
					<li class="active">
						<a href="#"><i class="fa fa-lg fa-fw fa-windows"></i> <span class="menu-item-parent">Provision VM</span></a>
						<ul>
							<li >
								<a href="stackTenantUser">Stack Service </a>
							</li>
								<li>
								<a href="bespokeTenantUser">Bespoke Service </a>
							</li>
							<li class="active">
								<a href="#">Custom Service  </a>
							</li>
						</ul>
					</li>
					
					<li>
						<a href="customUserServiceList" title="Custom Service List"><i class="fa fa-lg fa-fw fa-filter"></i> <span class="menu-item-parent">Service List</span></a>
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
				<%-- 	<span id="refresh" class="btn btn-ribbon" data-action="resetWidgets" data-title="refresh"  rel="tooltip" data-placement="bottom" data-original-title="<i class='text-warning fa fa-warning'></i> Warning! This will reset all your widget settings." data-html="true">
						<i class="fa fa-refresh"></i>
					</span>  --%>
				</span>
				<!-- breadcrumb -->
				<ol class="breadcrumb">
					<li>Home</li><li>Provision VM</li><li>Custom Service</li>
				</ol>
			</div>
			<!-- END RIBBON -->

	<!-- MAIN CONTENT -->
<div id="content">

<form  action="customLaunch" id="smart-form-register" method="POST">

<input type="hidden" name="imageName" id="imageName" value=""/>

<input type="hidden" name="securityName" id="securityName" value=""/>

<!-- widget grid -->
<section id="widget-grid" class="">


	<!-- START ROW -->

	<div class="row">

		<!-- NEW COL START -->
		<article class="col-sm-12 col-md-12 col-lg-12">
			
			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-1" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="true" data-widget-sortable="false">
				<header>
					<span class="widget-icon"> <i class="fa fa-edit"></i> </span>
					<h2>User Details </h2>				
					
				</header>

				<!-- widget div-->
				<div>
					
					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
						<!-- This area used as dropdown edit box -->
						
					</div>
					<!-- end widget edit box -->
					
					<!-- widget content -->
					<div class="widget-body no-padding smart-form">
						
							<fieldset>
								<div class="row">
								
						              <section class="col col-4">
										        <label class="label"><b>User</b></label>
												<label class="input state-disabled">
												<i class="icon-append fa fa-user"></i>
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
												 <i class="icon-append fa fa-envelope"></i>
												<input type="text" name="named" id="named" class="input-sm"  value="user@syntelinc.com" disabled="disabled">
											</label>
									    </section>
									    
									
						
						
						         <section class="col col-4">
								<label class="label">Location</label>
										<label class="select state-disabled">
											<select name="prov_name" class="input-sm" id="prov_name" disabled="disabled">
													<option value="0"  disabled="">Select</option>
													<option value="1">Pune</option>
													<option value="2" selected="">Chennai</option>								
												</select>  <i></i> </label>
									</section>
						
						
						 <section class="col col-4">
								<label class="label">Choose your Virtual Data Center</label>
										<label class="select state-disabled">
											<select name="prov_name" class="input-sm" id="prov_name" disabled="disabled">
												<option value="0"  disabled="">Select</option>
												<option value="1" selected="">OpenStack</option>
												<option value="2" >Amazon</option>
												<option value="3">VMWare</option>
												<option value="4">Rackspace</option>
												<option value="5">Microsoft-Azure</option>										
											</select>   <i></i> </label>
									</section>
								
									
								</div>

							</fieldset>

					</div>
					<!-- end widget content -->
					
				</div>
				<!-- end widget div -->
				
			</div>
			<!-- end widget -->
		
		</article>
		<!-- END COL -->
		
		
				
		<!-- NEW COL START -->
		<article class="col-sm-12 col-md-12 col-lg-5">
			
			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-2" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="true" data-widget-sortable="false">
		
				<header>
					<span class="widget-icon"> <i class="fa fa-edit"></i> </span>
					<h2>VM Details </h2>				
					
				</header>

				<!-- widget div-->
				<div>
					
					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
						<!-- This area used as dropdown edit box -->
						
					</div>
					<!-- end widget edit box -->
					
					<!-- widget content -->
					<div class="widget-body no-padding smart-form">
						
							<fieldset>
								<div class="row">
								
								
								<section class="col col-10">
								<label class="label">Flavor</label>
										<label class="select">
											<select name="flavor" id="flavor">
											<option selected="selected" disabled="disabled" value="0">Select flavor</option>
												<!-- <option selected="selected" value="m1.tiny">m1.tiny</option>
												<option value="m1.small">m1.small</option>	
												<option value="m1.medium">m1.medium</option>
												<option value="m1.large">m1.large</option>		
												<option value="m1.xlarge">m1.xlarge</option> -->				
											</select>  <i></i> </label>
									</section>
								
								
								<section class="col col-10">
								<label class="label">Security Group</label>
										<label class="select">
											<select name="security" id="security">
											<option value="0" selected="" disabled="">select security group</option>
												<!-- <option value="default" selected="selected">default</option>
												<option value="test">test</option>	 -->
											</select>  <i></i> </label>
									</section>
									
									
								<section class="col col-5">
								<label class="label">Image</label>
										<label class="select">
											<select name="image" id="image">
												<option value="0" selected="" disabled="">select image</option>
												<!-- <option value="UBuntu 14.04">UBuntu 14.04</option>
												<option value="UBuntu 12.04">UBuntu 12.04</option>	
												<option value="cirros-0.3.2-x86_64">cirros-0.3.2-x86_64</option>
												<option value="Windows Server 2012">Windows Server 2012</option>		 -->
											</select>  <i></i> </label>
									</section>
									
									
							<section class="col col-5">
								<label class="label">Network</label>
										<label class="select">
											<select name="network" id="network">
												<option value="0" selected="" disabled="">select network</option>
												<!-- <option value="Private_Net10">Private_Net10</option>
												<option value="Public_Network">Public_Network</option>	 -->
											</select> <i></i> </label>
									</section>
								
						</div>

						</fieldset>
                       <br>
					</div>
					<!-- end widget content -->
					
				</div>
				<!-- end widget div -->
				
			</div>
			<!-- end widget -->
			
		</article>
		<!-- END COL -->
		
		
		
		<!-- NEW COL START -->
		<article class="col-sm-12 col-md-12 col-lg-3">
			
			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-3" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="true" data-widget-sortable="false">
			
				<header>
					<h2>
					Flavor Details : 
					 </h2>	
					 <span class="pull-right" id="loading1" > <img src="img/ajaxLoader.gif"> </span>		
				</header>

				<!-- widget div-->
				<div>
		
					<!-- widget content -->
					<div class="widget-body no-padding ">
						
					<div class="well no-padding">

								<div class="well well-sm well-light">
								 <br>
								 <p><b> Type &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </b> : <span id="flavorheader"> - </span> </p>
								  <br>
									<p><b> RAM &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </b> : <span id="ram"> - </span> </p>
									<br>
									<p><b> VCPU &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </b> : <span id="vcpu"> - </span> </p>
									<br>
									<p><b> DiskSize &nbsp;&nbsp;&nbsp;</b> : <span id="size"> - </span> </p>
									<br><br><br>
								</div>
							</div>

					</div>
					<!-- end widget content -->
					
				</div>
				<!-- end widget div -->
				
			</div>
			<!-- end widget -->
			
	

		</article>
		<!-- END COL -->
		
		
		
		
		<!-- NEW COL START -->
		<article class="col-sm-12 col-md-12 col-lg-4">
			
			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-4" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="true" data-widget-sortable="false">
				<header>
				
					<h2>Security Group Details : <span id="groupheader"> </span> </h2>	
					
					 <span class="pull-right" id="loading2" ><img src="img/ajaxLoader.gif"> </span>					
					
				</header>

				<!-- widget div-->
				<div>
					
					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
						<!-- This area used as dropdown edit box -->
						
					</div>
					<!-- end widget edit box -->
					
					<!-- widget content -->
					<div class="widget-body no-padding ">
						
						<table id="dt_basic" class="table table-striped table-bordered table-hover" width="100%">
											<thead>								
												<tr>
													<!-- <th data-class="expand">Direction</th>
													<th data-hide="phone" >Ether Type</th>	
													<th>IP Protocol</th>
													<th data-hide="phone,tablet">Port Range</th>
													<th data-hide="phone,tablet">Remote</th>						
									 -->
									 
									               <th data-class="expand">From Port</th>
													<th data-hide="phone" >To Port</th>	
													<th>IP Protocol</th>
<!-- 													<th data-hide="phone,tablet">Port Range</th>
													<th data-hide="phone,tablet">Remote</th>	 -->					
													
												</tr>
											</thead>
											<tbody>
										<!-- 		<tr>
													<td>Egress</td>
													<td>IPv4</td>
													<td>Any</td>
													<td>-</td>
													<td>0.0.0.0/0 (CIDR)</td>
												</tr>
												<tr>
													<td>Egress</td>
													<td>IPv6</td>
													<td>Any</td>
													<td>-</td>
													<td>::/0 (CIDR)</td>
													
												</tr>
												<tr>
													<td>Ingress</td>
													<td>IPv4</td>
													<td>Any</td>
													<td>-</td>
													<td>default</td>											
												</tr>												
												  <tr>
													<td>Ingress</td>
													<td>IPv6</td>
													<td>Any</td>
													<td>-</td>
													<td>default</td>
													
												</tr>-->
											</tbody>					
										</table> 

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
			<div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-5" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="true" data-widget-sortable="false">
		
				<header>
					<span class="widget-icon"> <i class="fa fa-edit"></i> </span>
					<h2>General Details </h2>				
					
				</header>

				<!-- widget div-->
				<div>
					
					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
						<!-- This area used as dropdown edit box -->
						
					</div>
					<!-- end widget edit box -->
					
					<!-- widget content -->
					<div class="widget-body no-padding smart-form">
						
							<fieldset>
								<div class="row">
						             <section class="col col-4">
												<label class="label">Instance Name </label>
												<label class="input">
													<input type="text" name="vm_name" id="vm_name" >
												</label>
											</section>
					                         <section class="col col-4">
					                                 <label class="label">Start Date </label>
															<label class="input"> <i class="icon-append fa fa-calendar"></i>
																<input type="text" name="startDate" id="startDate" placeholder="Expected start date">
															</label>
												</section>
												<section class="col col-4">
														   <label class="label">End Date </label>
															<label class="input"> <i class="icon-append fa fa-calendar"></i>
																<input type="text" name="endDate" id="endDate" placeholder="Expected finish date">
															</label>
												</section>
								         </div>
								
								
							<div class="row">
								<section class="col col-4">
									<label class="label">Service Name</label>
									<label class="input">
										<i class="icon-append fa fa-tag"></i>
										<input type="text" name="service_req_name" id="service_req_name">
									</label>
								</section>
								
								<section class="col col-4">
									<label class="label">Service Decription</label>
									<label class="textarea">
										<i class="icon-append fa fa-comment"></i>
										<textarea rows="2" name="service_desc" id="service_desc"></textarea>
									</label>
								</section>
							</div>

							</fieldset>
							
							<footer>
								<button type="submit" class="btn btn-primary">
									Launch
								</button>
							</footer>

					</div>
					<!-- end widget content -->
					
				</div>
				<!-- end widget div -->
				
			</div>
			<!-- end widget -->
			
	

		</article>
		<!-- END COL -->
	
	</div>

	<!-- END ROW -->

</section>
<!-- end widget grid -->

</form>


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

		<!-- JQUERY textIDATE -->
		<script src="js/plugin/jquery-textidate/jquery.textidate.min.js"></script>

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


		<!-- MAIN APP JS FILE -->
		<script src="js/app.min.js"></script>
		
		<!-- JQUERY VALIDATE -->
		<script src="js/plugin/jquery-validate/jquery.validate.min.js"></script>



		<!-- PAGE RELATED PLUGIN(S) 
		<script src="..."></script>-->
		<!-- PAGE RELATED PLUGIN(S) -->
		<script src="js/plugin/datatables/jquery.dataTables.min.js"></script>
		<script src="js/plugin/datatables/dataTables.colVis.min.js"></script>
		<script src="js/plugin/datatables/dataTables.tableTools.min.js"></script>
		<script src="js/plugin/datatables/dataTables.bootstrap.min.js"></script>
		<script src="js/plugin/datatable-responsive/datatables.responsive.min.js"></script>
	
		<script type="text/javascript">
		$(document).ready(function() {
			   
			pageSetUp();
			    
			    $( "#loading1" ).hide();
			    $( "#loading2" ).hide();
			    
			    $.getJSON("./getFlavors",function(response){
                    var options = '';   
                    var select = $('#flavor');
                   
                    $.each(response, function(key, value) {
                        $('<option>').val(key).text(value).appendTo(select);
                      });  
                 
                 }); 
			    
			    
			    $.getJSON("./getImages",function(response){
                    var options = '';   
                    var select = $('#image');

                    $.each(response, function(key, value) {
                        $('<option>').val(key).text(value).appendTo(select);
                      });  
                 });  
			    
			    $.getJSON("./getNetworks",function(response){
                    var options = '';   
                    var select = $('#network');

                    $.each(response, function(key, value) {
                        $('<option>').val(key).text(value).appendTo(select);
                      });  
                 });  
			    
			    $.getJSON("./getSecurityGroups",function(response){
                    var options = '';   
                    var select = $('#security');

                    $.each(response, function(key, value) {
                        $('<option>').val(key).text(value).appendTo(select);
                      });  
                 });  
	  			    
			    
				var responsiveHelper_dt_basic = undefined;			
				var breakpointDefinition = {
					tablet : 1024,
					phone : 480
				};	
				$('#dt_basic').dataTable({
					"sDom": "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-12 hidden  hidden-xs'l>r>"+
						"t"+
						"<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",						
					"bSort": true,					
					"iDisplayLength": 4,
					"searching": false,
					"sScrollY": "170px",
				    "oLanguage": {
			            "sEmptyTable":  "No Rules Available"
			          },
					"preDrawCallback" : function() {
						// Initialize the responsive datatables helper once.
						if (!responsiveHelper_dt_basic) {
							responsiveHelper_dt_basic = new ResponsiveDatatablesHelper($('#dt_basic'), breakpointDefinition);
						}
					},
					"rowCallback" : function(nRow) {
						responsiveHelper_dt_basic.createExpandIcon(nRow);
					},
					"drawCallback" : function(oSettings) {
						responsiveHelper_dt_basic.respond();
					}
				});
				
				$('#startDate').datepicker({
					dateFormat : 'yy-mm-dd', 
					prevText : '<i class="fa fa-chevron-left"></i>',
					nextText : '<i class="fa fa-chevron-right"></i>',
					onSelect : function(selectedDate) {
						$('#endDate').datepicker('option', 'minDate', selectedDate);
					}
				});
				
				$('#endDate').datepicker({
					dateFormat : 'yy-mm-dd',
					prevText : '<i class="fa fa-chevron-left"></i>',
					nextText : '<i class="fa fa-chevron-right"></i>',
					onSelect : function(selectedDate) {
						$('#startDate').datepicker('option', 'maxDate', selectedDate);
					}
				}); 
				
				$.root_.addClass("fixed-page-footer") ;
				localStorage.setItem("sm-setmenu","top");
	
				
				
				
				
				
				
				
				$('#image').change(	            
					function() {
			           var imageId = $('#image option:selected').val();	
			           var imageType = $('#image option:selected').text();
			           $('#imageName').val(imageType);		
			          });
				
			$('#flavor').change(	            
				function() {
		           var flavorId = $('#flavor option:selected').val();	
		           var flavorType = $('#flavor option:selected').text();

		      
		          /*  if(flavourId=='0')
		           {
		        	   $('#ram').text('-');
					   $('#vcpu').text('-');
					   $('#size').text('-');
					   $('#flavorheader').text('-'); 
		           }
		           else{
		        	   alert("inside else");
		        	   $.getJSON("./getFlavorDetails/"+flavorId,function(response){
			        	   $('#ram').text(response.ram+' MB');
						   $('#vcpu').text(response.vcpus);
						   $('#size').text(response.disk+' GB');
						   $('#flavorheader').text(flavorType);  			    
			             }); 
		           } */
		           $( "#loading1" ).show();
		           $.getJSON("./getFlavorDetails/"+flavorId,function(response){
	/* 	        	   alert(response); */
		        	   $('#ram').text(response.ram+' MB');
					   $('#vcpu').text(response.vcpus);
					   $('#size').text(response.disk+' GB');
					   $('#flavorheader').text(flavorType);  
					   $( "#loading1" ).hide();
		             }); 
		   /*         
				   if(value=="m1.small"){				   
					   $('#ram').text('2048 MB');
					   $('#vcpu').text('1');
					   $('#size').text('20 GB');
					   $('#flavorheader').text('m1.small');
				   }
				   else if(value=="m1.medium"){
					   $('#ram').text('4096 MB');
					   $('#vcpu').text('2');
					   $('#size').text('40 GB');
					   $('#flavorheader').text('m1.medium');
				   }
	   				else if(value=="m1.large"){
					   $('#ram').text('8192 MB');
					   $('#vcpu').text('4');
					   $('#size').text('80 GB');
					   $('#flavorheader').text('m1.large');
				   }
	   				else if(value=="m1.xlarge"){
						   $('#ram').text('16384 MB');
						   $('#vcpu').text('8');
						   $('#size').text('160 GB');
						   $('#flavorheader').text('m1.xlarge');
				   }
	   				else{
						   $('#ram').text('512 MB');
						   $('#vcpu').text('1');
						   $('#size').text('1 GB');
						   $('#flavorheader').text('m1.tiny');							
					   } */
		          });	
			
			     $('#security').change(	            
					function() {
			           var securityGroup = $('#security option:selected').text();	
			           var securityGroupId=$('#security option:selected').val();
			           $('#securityName').val(securityGroup);
			           
			           
			           $( "#loading2").show();
			           $.getJSON("./getSecurityGroupDetails/"+securityGroupId,function(response){
			        	   $('#groupheader').text(securityGroup);
			        	   var options='';
			        	   var oTable = $('#dt_basic').dataTable();
                           oTable.fnDestroy();
 
                           for(i=0;i<response.length;i++){
	                           options += '<tr><td>'+ response[i].fromPort + '</td><td>' + response[i].toPort + '</td><td>' + response[i].ipProtocol.value + '</td></tr>';
	                        }  		          
                            $( "#dt_basic tbody" ).html(options);
                                   
							$('#dt_basic').dataTable({
								"sDom": "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-12 hidden  hidden-xs'l>r>"+
									"t"+
									"<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",									
									 "bSort": true,
								 "searching": false,
								 "sScrollY": "170px",
								    "oLanguage": {
							            "sEmptyTable":  "No Rules Available"
							          },
								 "iDisplayLength": 4,							
								"preDrawCallback" : function() {
									// Initialize the responsive datatables helper once.
									if (!responsiveHelper_dt_basic) {
										responsiveHelper_dt_basic = new ResponsiveDatatablesHelper($('#dt_basic'), breakpointDefinition);
									}
								},
								"rowCallback" : function(nRow) {
									responsiveHelper_dt_basic.createExpandIcon(nRow);
								},
								"drawCallback" : function(oSettings) {
									responsiveHelper_dt_basic.respond();
								}
							});			
							 $( "#loading2" ).hide();
			        	}); 
			           
			           
			           
			          /*  
					   if(value=="test"){								   
						   $('#groupheader').text('test');
						   var oTable = $('#dt_basic ').dataTable();
                           oTable.fnDestroy();
 
                                   $( "#dt_basic tbody" ).append( "<tr>" +
		    		        		"<td>Ingress</td><td>IPv6</td>"+
		    		        		"<td> Any </td><td >-</td><td >default</td>" +
		    		        		"</tr>" );
							$('#dt_basic').dataTable({
								"sDom": "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-12 hidden  hidden-xs'l>r>"+
									"t"+
									"<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",									
									 "bSort": true,
								 "searching": false,
								 "iDisplayLength": 4,							
								"preDrawCallback" : function() {
									// Initialize the responsive datatables helper once.
									if (!responsiveHelper_dt_basic) {
										responsiveHelper_dt_basic = new ResponsiveDatatablesHelper($('#dt_basic'), breakpointDefinition);
									}
								},
								"rowCallback" : function(nRow) {
									responsiveHelper_dt_basic.createExpandIcon(nRow);
								},
								"drawCallback" : function(oSettings) {
									responsiveHelper_dt_basic.respond();
								}
							});				
					   }					   					 
		   				else{						   
		   				 $('#groupheader').text('default');
						   var oTable = $('#dt_basic').dataTable(); 
                            oTable.fnDestroy();                           						    
						    $('#dt_basic').each(function(){
						        if($('tbody', this).length > 0){
						            $('tbody tr:last', this).remove();
						        }else {
						            $('tr:last', this).remove();
						        }
						    });		
						    
						    
						    $('#dt_basic').dataTable({
								"sDom": "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-12 hidden  hidden-xs'l>r>"+
									"t"+
									"<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",									
									 "bSort": true,
									 "iDisplayLength": 4,
								 "searching": false,
								"preDrawCallback" : function() {
									// Initialize the responsive datatables helper once.
									if (!responsiveHelper_dt_basic) {
										responsiveHelper_dt_basic = new ResponsiveDatatablesHelper($('#dt_basic'), breakpointDefinition);
									}
								},
								"rowCallback" : function(nRow) {
									responsiveHelper_dt_basic.createExpandIcon(nRow);
								},
								"drawCallback" : function(oSettings) {
									responsiveHelper_dt_basic.respond();
								}
							});
						   } */
			          
			          });	
			     
			     
			  // Validation
					$("#smart-form-register").validate({

						// Rules for form validation
						rules : {
							vm_name : {
								required : true
							},
							service_desc : {
								required : true
							},
							service_req_name : {
								required : true
							},
							image : {
								required : true
							},
							network : {
								required : true
							},
							startDate : {
								required : true
							},
							endDate : {
								required : true
							},
							flavor : {
								required : true
							},
							security : {
								required : true
							}
							
						},

						// Messages for form validation
						messages : {
							vm_name : {
								required : 'Please enter your instance name'
							},	
							service_req_name : {
								required : 'Please select your service name'
							},
							security : {
								required : 'Please select security group'
							},
							image : {
								required : 'Please select image'
							},
							network : {
								required : 'Please select network'
							},
							flavor : {
								required : 'Please select flavor'
							},
							startDate : {
								required : 'You must select startdate'
							},
							endDate : {
								required : 'You must select enddate'
							}
						},

						// Ajax form submition
						submitHandler : function(form) {
							$(form).ajaxSubmit({
								success : function() {
									$("#smart-form-register").addClass('submited');
								}
							});
						},
					// Do not change code below
						errorPlacement : function(error, element) {
							error.insertAfter(element.parent());
						}
					});

		});
		</script>
	</body>
</html>