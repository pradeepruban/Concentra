<!DOCTYPE html>
<html lang="en-us">
	<head>
		<meta charset="utf-8">
		<title> Organizational Designer</title>
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
	
		<script  src="https://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js"></script>
        <link rel="icon" href="/graphics/dbc-16.png" type="image/png">
        
		 <style type="text/css">
		    .box{
		        padding: 20px; display: none;margin-top: 20px;
		        }
		        
		        #logo img {
				width: 60%;height: 123%;padding-left: -2px;margin-left: -13px;margin-top: -12px;
			}
        </style>
		
		<script type="text/javascript">
		    $(document).ready(function(){
		        $('input[type="checkbox"]').click(function(){
		            if($(this).attr("value")=="red"){
		                $(".red").toggle();
		            }
		           
		        });
		    });
		</script>
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
					<li class="active">
						<a href="#" title="OrganizationDesigner"><i class="fa fa-pencil-square"></i> <span class="menu-item-parent">Organization Designer</span></a>
					</li>
					<li>
						<a href="#"><i class="fa fa-lg fa-fw fa-puzzle-piece"></i> <span class="menu-item-parent">VDC Management</span></a>
						<ul>
							<li>
								<a href="registerVdcAdmin">Register VDC</a>
							</li>
						</ul>		
					</li>
					<li>
						<a href="#"><i class="fa fa-lg fa-fw  fa-legal"></i> <span class="menu-item-parent">Policies</span></a>
						<ul>
						   <li>
								<a href="listUsersAdmin">List Users</a>
							</li>
							<li>
								<a href="setPoliciesAdmin">Set Policies</a>
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
					<li>Home</li><li>Organization Designer</li>
				</ol>
				<!-- end breadcrumb -->
			</div>
			<!-- END RIBBON -->

			<!-- MAIN CONTENT -->
			<div id="content">
				<div class="row">
					<div class="col-xs-12 col-sm-5 col-md-5 col-lg-8">
						<ul id="sparks" class="">	
						</ul>
					</div>
				</div>
				
				<!-- widget grid -->
				<section id="widget-grid" class="">			
					<!-- row -->
					<div class="row">
						<!-- NEW WIDGET START -->
						<article class="col-sm-20 col-md-23 col-lg-15">
							<!-- Widget ID (each widget will need unique ID)-->
							<div class="jarviswidget jarviswidget-color-darken" id="wid-id-1" data-widget-editbutton="false">
								<header>
									<span class="widget-icon"> <i class="fa fa-check"></i> </span>
									<h2>Configuration Details </h2>				
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
										<div class="row">
											<form id="wizard-1" novalidate="novalidate">
												<div id="bootstrap-wizard-1" class="col-sm-20">
												
													<div class="form-bootstrapWizard">
														<ul class="bootstrapWizard form-wizard">
															<li class="active" data-target="#step1">
																<a href="#tab1" data-toggle="tab"> <span class="step">1</span> <span class="title">Create Organization</span> </a>
															</li>
															<li data-target="#step2">
																<a href="#tab2" data-toggle="tab"> <span class="step">2</span> <span class="title">Integrate with Organization Directory</span> </a>
															</li>
															<li data-target="#step3">
																<a href="#tab3" data-toggle="tab"> <span class="step">3</span> <span class="title">Create user & assign tenant admin for your Organization</span> </a>
															</li>
															
															<li data-target="#step4">
																<a href="#tab4" data-toggle="tab"> <span class="step">4</span> <span class="title">Create user & assign ISAP Bussiness admin for your Organization</span> </a>
															</li>
															<li data-target="#step5">
																<a href="#tab5" data-toggle="tab"> <span class="step">5</span> <span class="title">Save & Submit</span> </a>
															</li>
														</ul>
														<div class="clearfix"></div>
													</div>
													
													<div class="tab-content">
													
														<div class="tab-pane active" id="tab1">
															<br>
															<h3><strong>Step 1 </strong> - Create Configuration</h3>				
	  													     <div class="row">				
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-envelope fa-lg fa-fw"></i></span>
																			<input class="form-control input-lg" placeholder="Organization Name" type="text" name="orgname" id="orgname">			
																		</div>
																	</div>				
																</div>
				
				                                                <div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-envelope fa-lg fa-fw"></i></span>
																			<input class="form-control input-lg" placeholder="Organization Location" type="text" name="orgloc" id="orgloc">				
																		</div>
																	</div>			
														         </div>			
															   </div>
				
				                                             <div class="row">
				
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-envelope fa-lg fa-fw"></i></span>
																			<input class="form-control input-lg" placeholder="Organization Bank Details" type="text" name="orgbank" id="orgbank">
																		</div>
																	</div>		
																</div>				
				                                               <div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-envelope fa-lg fa-fw"></i></span>
																			<select name="orggeo" class="form-control input-lg">
																				<option value="" selected="selected">Select Organization Geography</option>
																				<option value="Team Lead">Team Lead</option>
																				<option value="System Analyst">System Analyst</option>
																				<option value="Project Manager">Project Manager</option>																				
																			</select>
																		</div>
																	</div>			
																</div>			
															</div>
				
					                                       <div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-user fa-lg fa-fw"></i></span>
																			<input class="form-control input-lg" placeholder="Organization Contact Person" type="text" name="orgcontact" id="orgcontact">			
																		</div>
																	</div>
																</div>
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																						<span class="input-group-addon"><i class="fa fa-envelope fa-lg fa-fw"></i></span>
																			<input class="form-control input-lg" placeholder="email@address.com" type="text" name="email" id="email">
																		</div>
																	</div>
																</div>
															</div>
															
															
															
														   <div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-user fa-lg fa-fw"></i></span>
																			<select name="desg" class="form-control input-lg">
																				<option value="" selected="desg">Select Designation</option>
																				<option value="Team Lead">Team Lead</option>
																				<option value="System Analyst">System Analyst</option>
																				<option value="Project Manager">Project Manager</option>
																				
																			</select>
																		</div>
																	</div>
																</div>															
															</div>
														</div>
														
														
														
														<div class="tab-pane" id="tab2">
															<br>
															<h3><strong>Step 2</strong> - Integrate with Organization Directory</h3>
															<div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-flag fa-lg fa-fw"></i></span>
																					<input class="form-control input-lg" placeholder="Business" type="text" name="business" id="business">					
																		</div>
																	</div>
																</div>
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-lock fa-lg fa-fw"></i></span>
																			<select class="form-control input-lg" name="authentication">
																				<option value="" selected="selected">Authentication Method</option>
																				<option>AD</option>
																				<option>LDAP</option>
																				<option>DATA BASE</option>
																			
																			</select>
																		</div>
																	</div>
																</div>														
															</div>
															
															<div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-flag fa-lg fa-fw"></i></span>
																					<input class="form-control input-lg" placeholder="Domain" type="text" name="domain" id="domain">																	
																		</div>
																	</div>
																</div>
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="IP Address" type="text" name="ipadd" id="ipadd">
																		</div>
																	</div>
																</div>														
															</div>
															
															<div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-flag fa-lg fa-fw"></i></span>
																					<input class="form-control input-lg" placeholder="User Name" type="text" name="uname" id="uname">
																	
																		</div>
																	</div>
																</div>
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-lock fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="Password" type="text" name="pass" id="pass">
																		</div>
																	</div>
																</div>												
															</div>
									
													    <div class="row">
														   <div class="col-sm-3">																														<div class="form-group">
																<div class="input-group">
															        <label><input type="checkbox" name="colorCheckbox" value="red"> Sub Organization</label>													        
															    </div>
															   </div>
															 </div>
													    </div>
    
    
                                                 <div class="red box">
  
                                                          <div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-flag fa-lg fa-fw"></i></span>
																					<input class="form-control input-lg" placeholder="Business" type="text" name="business" id="business">
																		</div>
																	</div>
																</div>
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																			<select class="form-control input-lg" name="authentication">
																				<option value="" selected="selected">Authentication Method</option>
																				<option>AD</option>
																				<option>LDAP</option>
																				<option>DATA BASE</option>
																			</select>
																		</div>
																	</div>
																</div>													
															</div>
															
															<div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-flag fa-lg fa-fw"></i></span>
																					<input class="form-control input-lg" placeholder="Domain" type="text" name="domain" id="domain">
																	
																		</div>
																	</div>
																</div>
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="IP Address" type="text" name="ipadd" id="ipadd">
																		</div>
																	</div>
																</div>
															
															</div>
															
															
															<div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-flag fa-lg fa-fw"></i></span>
																					<input class="form-control input-lg" placeholder="User Name" type="text" name="uname" id="uname">																
																		</div>
																	</div>
																</div>
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="Password" type="text" name="pass" id="pass">
																		</div>
																	</div>
																</div>											
															</div>
 
                                                    </div>
    
												</div>
												
												
												<div class="tab-pane" id="tab3">
													<br>
													<h3><strong>Step 3</strong> - Create User and assign tenant admin for your organization</h3>
														<div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="Name" type="text" name="pass" id="pass">
																		</div>
																	</div>
																</div>
																
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="Email Id" type="text" name="pass" id="pass">
																		</div>
																	</div>
																</div>															
															</div>
																														
															<div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="Contact" type="text" name="pass" id="pass">
																		</div>
																	</div>
																</div>
																
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="Emp Id" type="text" name="empid" id="empid">
																		</div>
																	</div>
																</div>															
															</div>
																
																
														<div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="First Name" type="text" name="pass" id="pass">
																		</div>
																	</div>
																</div>
																
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="Last Name" type="text" name="pass" id="pass">
																		</div>
																	</div>
																</div>
																
															</div>
																												
																
														  <div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<select class="form-control input-lg" name="role">
																				<option value="" selected="selected">Role</option>
																				<option>Tenant Admin</option>
																				<option>ISAP Business Admin</option>
																				
																			
																			</select>
																		</div>
																	</div>
																</div>
																
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="Policy" type="text" name="policy" id="policy">
																		</div>
																	</div>
																</div>
																
														</div>
														
														
														<div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">																		
																			<input class="btn btn-lg btn-success" type="button"  value="Test Connection" name="wphone" id="wphone">
																		</div>
																	</div>
																</div>
																
															</div>
												</div>
												
														
												<div class="tab-pane" id="tab4">
													<br>
													<h3><strong>Step 4</strong> - Create User and assign ISAP Bussiness admin for your organization</h3>
													  <div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="Name" type="text" name="pass" id="pass">
																		</div>
																	</div>
																</div>
																
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="Email Id" type="text" name="pass" id="pass">
																		</div>
																	</div>
																</div>															
														</div>
																														
														<div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="Contact" type="text" name="pass" id="pass">
																		</div>
																	</div>
																</div>
																
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="Emp Id" type="text" name="empid" id="empid">
																		</div>
																	</div>
															</div>
																
														</div>
																															
														<div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="First Name" type="text" name="pass" id="pass">
																		</div>
																	</div>
																</div>
																
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="Last Name" type="text" name="pass" id="pass">
																		</div>
																	</div>
																</div>
																
														    </div>
																																											
														<div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<select class="form-control input-lg" name="role">
																				<option value="" selected="selected">Role</option>
																				<option>Tenant Admin</option>
																				<option>ISAP Business Admin</option>																																					
																			</select>
																		</div>
																	</div>
																</div>
																
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
																				<input class="form-control input-lg" placeholder="Policy" type="text" name="policy" id="policy">
																		</div>
																	</div>
																</div>
																
														</div>
														
														<div class="row">
																<div class="col-sm-6">
																	<div class="form-group">
																		<div class="input-group">
																		
																			<input class="btn btn-lg btn-default" type="button"  value="Test Connection" name="wphone" id="wphone">
																		</div>
																	</div>
																</div>
																
															</div>
												</div>
														
											    <div class="tab-pane" id="tab5">
															<br>
															<h3><strong>Step 5</strong> - Save Form</h3>
															<br>
															<h1 class="text-center text-success"><strong><i class="fa fa-check fa-lg"></i>Finish</strong></h1>
															<br>
															<br>
												</div>
				
												<div class="form-actions">
															<div class="row">
																<div class="col-sm-12">
																	<ul class="pager wizard no-margin">

																		<li class="previous disabled">
																			<a href="javascript:void(0);" class="btn btn-lg btn-default"> Previous </a>
																		</li>
																		<li class="next">
																			<a href="javascript:void(0);" class="btn btn-lg txt-color-darken"> Next </a>
																		</li>
																	</ul>
																</div>
															</div>
													</div>
				
												</div>
											</div>
										</form>
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
					<span class="txt-color-white">ISAP- Syntel, Inc. � 2014-2015</span>
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

		<!-- PAGE RELATED PLUGIN(S) -->
		<script src="js/plugin/bootstrap-wizard/jquery.bootstrap.wizard.min.js"></script>
		<script src="js/plugin/fuelux/wizard/wizard.min.js"></script>
		

		<script type="text/javascript">
		
		// DO NOT REMOVE : GLOBAL FUNCTIONS!
		
		$(document).ready(function() {
			
			pageSetUp();
			
			
	
			//Bootstrap Wizard Validations

			  var $validator = $("#wizard-1").validate({
			    
			    rules: {
			      orgname: {
			        required: true,
			       },
			      orgloc: {
			        required: true
			      },
			      orgbank: {
			        required: true
			      },
			      orggeo: {
			        required: true
			      },
			      orgcontact: {
			        required: true
			      },
			      email: {
				        required: true,
				        email: "Your email address must be in the format of name@domain.com"
			      },
			      desg: {
			        required: true,
			       // minlength: 10
			      },
			      
			    },
			    
			    messages: {
			    	orgloc: "Please specify Organization location",
			    	orgbank: "Please specify your Organization bank details",
			    	orggeo:"Please specify your Organization Geography",
			    	
			    	orgcontact:"Please specify your Organization Contact",
			    	desg:"Please specify your Designation",
			    	
			    	
			      email: {
			        required: "We need your email address to contact you",
			        email: "Your email address must be in the format of name@domain.com"
			      }
			    },
			    
			    highlight: function (element) {
			      $(element).closest('.form-group').removeClass('has-success').addClass('has-error');
			    },
			    unhighlight: function (element) {
			      $(element).closest('.form-group').removeClass('has-error').addClass('has-success');
			    },
			    errorElement: 'span',
			    errorClass: 'help-block',
			    errorPlacement: function (error, element) {
			      if (element.parent('.input-group').length) {
			        error.insertAfter(element.parent());
			      } else {
			        error.insertAfter(element);
			      }
			    }
			  });
			  
			  $('#bootstrap-wizard-1').bootstrapWizard({
			    'tabClass': 'form-wizard',
			    'onNext': function (tab, navigation, index) {
			      var $valid = $("#wizard-1").valid();
			      if (!$valid) {
			        $validator.focusInvalid();
			        return false;
			      } else {
			        $('#bootstrap-wizard-1').find('.form-wizard').children('li').eq(index - 1).addClass(
			          'complete');
			        $('#bootstrap-wizard-1').find('.form-wizard').children('li').eq(index - 1).find('.step')
			        .html('<i class="fa fa-check"></i>');
			      }
			    }
			  });
			  
		
			// fuelux wizard
			  var wizard = $('.wizard').wizard();
			  
			  wizard.on('finished', function (e, data) {
			    //$("#fuelux-wizard").submit();
			    //console.log("submitted!");
			    $.smallBox({
			      title: "Congratulations! Your form was submitted",
			      content: "<i class='fa fa-clock-o'></i> <i>1 seconds ago...</i>",
			      color: "#5F895F",
			      iconSmall: "fa fa-check bounce animated",
			      timeout: 4000
			    });
			    
			  });

		
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


</html>