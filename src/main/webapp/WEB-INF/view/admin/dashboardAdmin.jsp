<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en-us">
    <head>
        <meta charset="utf-8">
        <!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->

        <title> ISAP Corporate User - Department Home</title>
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

        <!-- We recommend you use "your_style.css" to override SmartAdmin
             specific styles this will also ensure you retrain your customization with each SmartAdmin update.
        <link rel="stylesheet" type="text/css" media="screen" href="css/your_style.css"> -->

        <!-- Demo purpose only: goes with demo.js, you can delete this css when designing your own WebApp -->
        <link rel="stylesheet" type="text/css" media="screen" href="css/demo.min.css">

        <!-- FAVICONS -->
        <link rel="shortcut icon" href="img/favicon/favicon.ico" type="image/x-icon">
        <link rel="icon" href="img/favicon/favicon.ico" type="image/x-icon">

        <!-- GOOGLE FONT -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,300,400,700">
    </head>
   
    <body class=" ">
    <!-- #HEADER -->
    <header id="header">
          <div id="logo-group">
            <img width="80px" height="100%" style="padding-top: 2.5%" src="img/logo_isap.png" alt="ISAP">
            <span> </span>
             <span>
              <img src="img/syntel-logo.png" style="padding-top: 3%" width="85px" height="100%" alt="SYNTEL">
            </span>
          </div>

    <!-- pulled right: nav area -->
       <div class="pull-right">
           <div class="project-context hidden-xs">
                <span class="label">Corporate Admin: ( Syntel )
                </span>
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

            <span>
                   <a style="border-radius: 2px;cursor: default !important;display: inline-block;font-weight: 700;height: 30px;line-height: 24px;min-width: 30px;
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


        <!-- #NAVIGATION -->
        <!-- Left panel : Navigation area -->
        <!-- Note: This width of the aside area can be adjusted through LESS variables -->
        <aside id="left-panel">
            <!-- NAVIGATION : This navigation is also responsive-->
            <nav>
                <ul>  
                    <li class="active">
						<a href="dashboardAdmin" title="DashBoard"><i class="fa fa-lg fa-fw fa-home"></i> <span class="menu-item-parent">DashBoard</span></a>
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
						<a href="ListUsers"><i class="fa fa-user"></i> <span class="menu-item-parent">Users</span></a>
					</li>
					
					<li >
						<a href="corporategroups" title="corporateAdmin"><i class="fa  fa-group"></i> <span class="menu-item-parent">Corporate Group</span></a>
					</li>
					
						<li>
					<a href="#"><i class="fa fa-lg fa-fw fa-cogs"></i> <span class="menu-item-parent"> Quota</span></a>			
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
           <!-- breadcrumb -->
            <ol class="breadcrumb">
                    <li>Home</li><li>Dashboard</li>
            </ol>
            <!-- end breadcrumb -->
        </div>
        <!-- END RIBBON -->
  
			<!-- MAIN CONTENT -->
			<div id="content">

			<div id="content">
				<!-- row -->
				<div class="row">
					<article class="col-sm-6">
					
						<div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-0" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="true" data-widget-sortable="false">
							<header>
								<span class="widget-icon"> <i class="glyphicon glyphicon-stats txt-color-darken"></i> </span>
								 <h2>Resource Snapshot </h2>			
							</header>

							<!-- widget div-->
						<div class="no-padding">
							<!-- widget edit box -->
							<div class="jarviswidget-editbox">

							</div>
							<!-- end widget edit box -->

						<div class="widget-body">
							<!-- content -->
							<div id="myTabContent" class="tab-content">
								<div class="tab-pane fade active in padding-10 no-padding-bottom"  id="s1">
	
									<div class="row no-space" >
										<div class="col-xs-12 col-sm-12 col-md-10 col-lg-10 show-stats">
											<div class="row">						
											   <div class="padding-10">
													<div id="flotcontainer" class="chart-large has-legend-unique"></div>
												</div>												
										    </div>
										</div>												
										<div class="col-xs-12 col-sm-12 col-md-2 col-lg-2 show-stats">
										  
										  <div class="row">
											<div class="col-xs-6 col-sm-6 col-md-12 col-lg-12"> 
											   <strong><span style ="color:#1236B1">STG CHN <span class="pull-right"></span> 
											            </span>
											    </strong>
											</div>
																
											<div class="col-xs-6 col-sm-6 col-md-12 col-lg-12">
												<strong> <span style ="color:#3276B1"> STG PUN<span class="pull-right"></span> 
												         </span>
												</strong>
											</div>
											<div class="col-xs-6 col-sm-6 col-md-12 col-lg-12"> 
											   <strong><span style ="color:#71843F"> TSG CHN <span class="pull-right"></span> 
											         </span>
											   </strong>
											</div>
										</div>
										</div>
									</div>
                                </div>
							<!-- end s1 tab pane -->

						<div class="tab-pane fade" id="s2">
							<div class="widget-body-toolbar bg-color-white">

									<form class="form-inline" role="form">

										<div class="form-group">
											<label class="sr-only" for="s123">Show From</label>
															<input type="email" class="form-control input-sm" id="s123" placeholder="Show From">
														</div>
														<div class="form-group">
															<input type="email" class="form-control input-sm" id="s124" placeholder="To">
														</div>

														<div class="btn-group hidden-phone pull-right">
															<a class="btn dropdown-toggle btn-xs btn-default" data-toggle="dropdown"><i class="fa fa-cog"></i> More <span class="caret"> </span> </a>
															<ul class="dropdown-menu pull-right">
																<li>
																	<a href="javascript:void(0);"><i class="fa fa-file-text-alt"></i> Export to PDF</a>
																</li>
																<li>
																	<a href="javascript:void(0);"><i class="fa fa-question-sign"></i> Help</a>
																</li>
															</ul>
														</div>

													</form>

												</div>
												<div class="padding-10">
													<div id="statsChart" class="chart-large has-legend-unique"></div>
												</div>

											</div>
											<!-- end s2 tab pane -->

											<div class="tab-pane fade" id="s3">

												<div class="widget-body-toolbar bg-color-white smart-form" id="rev-toggles">

													<div class="inline-group">

														<label for="gra-0" class="checkbox">
															<input type="checkbox" name="gra-0" id="gra-0" checked="checked">
															<i></i> Amex </label>
														<label for="gra-1" class="checkbox">
															<input type="checkbox" name="gra-1" id="gra-1" checked="checked">
															<i></i> FedEx </label>
														<label for="gra-2" class="checkbox">
															<input type="checkbox" name="gra-2" id="gra-2" checked="checked">
															<i></i> Interlink </label>
													</div>

													<div class="btn-group hidden-phone pull-right">
														<a class="btn dropdown-toggle btn-xs btn-default" data-toggle="dropdown"><i class="fa fa-cog"></i> More <span class="caret"> </span> </a>
														<ul class="dropdown-menu pull-right">
															<li>
																<a href="javascript:void(0);"><i class="fa fa-file-text-alt"></i> Export to PDF</a>
															</li>
															<li>
																<a href="javascript:void(0);"><i class="fa fa-question-sign"></i> Help</a>
															</li>
														</ul>
													</div>

												</div>

												<div class="row no-space">
													<div class="col-xs-12 col-sm-12 col-md-8 col-lg-8">
														<span class="demo-liveupdate-1"> <span class="onoffswitch-title">Live switch</span> <span class="onoffswitch">
																<input type="checkbox" name="start_interval" class="onoffswitch-checkbox" id="start_interval">
																<label class="onoffswitch-label" for="start_interval"> 
																	<span class="onoffswitch-inner" data-swchon-text="ON" data-swchoff-text="OFF"></span> 
																	<span class="onoffswitch-switch"></span> </label> </span> </span>
														<div id="updating-chart" class="chart-large txt-color-blue"></div>

													</div>
													<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4 show-stats">

														<div class="row">
															<div class="col-xs-6 col-sm-6 col-md-12 col-lg-12"> 
															<span class="text"> My Tasks <span class="pull-right">130/200</span> </span>
																<div class="progress">
																	<div class="progress-bar bg-color-blueDark" style="width: 65%;"></div>
																</div> </div>
															<div class="col-xs-6 col-sm-6 col-md-12 col-lg-12"> <span class="text"> Transfered <span class="pull-right">440 GB</span> </span>
																<div class="progress">
																	<div class="progress-bar bg-color-blue" style="width: 34%;"></div>
																</div> </div>
															<div class="col-xs-6 col-sm-6 col-md-12 col-lg-12"> <span class="text"> Bugs Squashed<span class="pull-right">77%</span> </span>
																<div class="progress">
																	<div class="progress-bar bg-color-blue" style="width: 77%;"></div>
																</div> </div>
															<div class="col-xs-6 col-sm-6 col-md-12 col-lg-12"> <span class="text"> User Testing <span class="pull-right">7 Days</span> </span>
																<div class="progress">
																	<div class="progress-bar bg-color-greenLight" style="width: 84%;"></div>
																</div> </div>

															<span class="show-stat-buttons"> <span class="col-xs-12 col-sm-6 col-md-6 col-lg-6"> <a href="javascript:void(0);" class="btn btn-default btn-block hidden-xs">Generate PDF</a> </span> <span class="col-xs-12 col-sm-6 col-md-6 col-lg-6"> <a href="javascript:void(0);" class="btn btn-default btn-block hidden-xs">Report a bug</a> </span> </span>

														</div>

													</div>
												</div>
											</div>
											<!-- end s3 tab pane -->
										</div>

										<!-- end content -->
									</div>

								</div>
								<!-- end widget div -->
							</div>
							<!-- end widget -->

						</article>
						
						<article class="col-sm-6">
						
						
						
						<div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-0" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="true" data-widget-sortable="false">
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
									<span class="widget-icon"> <i class="fa fa-table"></i> </span>
									<h2>Data Centre Utilization</h2>
				
								</header>
				
								<!-- widget div-->
								<div>
				
									<!-- widget edit box -->
									<div class="jarviswidget-editbox">
										<!-- This area used as dropdown edit box -->
				
									</div>
									<!-- end widget edit box -->
				
									<!-- widget content -->
									<div class="widget-body no-padding" class="custom-scroll table-responsive" >
										<!-- content goes here -->
				
										<table id="dt_basic" class="table table-striped table-bordered table-hover" width="100%">
											<thead>
												<tr>
													<th>VDC</th>
													<th>Tenant Code</th>
													<th>Utilization</th>
				
													
												</tr>
											</thead>
											<tbody>
											
												<tr>
													<td><a href="javascript:void(0);">OpenS-Chennai-STG</a></td>
													<td>STGAU-CHN</td>
													<td width ="50%"><div class=""> 
													<span class="text"> 50% Available </span>
																<div class="progress-xs">
																	<div class="progress-bar bg-color-green" style="width: 50%;"></div>
																</div> </div></td>
												</tr>
												<tr>
													<td><a href="javascript:void(0);">OpenS-Pune-STG</a></td>
													<td>STGSIT-PUN</td>
													<td width ="80%"><div class=""> 
													<span class="text"> 20% Available </span>
																<div class="progress-xs">
																	<div class="progress-bar bg-color-yellow" style="width: 80%;"></div>
																</div> </div></td>
												</tr>
												<tr>
													<td><a href="javascript:void(0);">OpenS-Chennai-TSG</a></td>
													<td>TSG-CHN</td>
													<td width ="80%"><div class=""> 
													<span class="text"> 25% Available </span>
																<div class="progress-xs">
																	<div class="progress-bar bg-color-yellow" style="width: 75%;"></div>
																</div> </div></td>
												</tr>
												
												<tr>
													<td><a href="javascript:void(0);">AWS-Mumbai</a></td>
													<td>STG TEST</td>
													<td><div class=""> 
														<span class="text"> 60% Available </span>	
																<div class="progress-xs">
																	<div class="progress-bar bg-color-green" style="width: 40%;"></div>
																</div> </div></td>
												</tr>
												<tr>
													<td><a href="javascript:void(0);">AWS-Mumbai <br></a></td>
													<td>STGAU-PUN</td>
													<td><div class=""> 
															<span class="text"> 40% Available </span>
																<div class="progress-xs">
																	<div class="progress-bar bg-color-green" style="width: 60%;"></div>
																</div> </div></td>
												  </tr>							
											</tbody>
											
										</table>

									</div>
									<!-- end widget content -->
				
								</div>
								<!-- end widget div -->
				
							</div>
						
						
						

							
							</article>
					</div>

					<!-- end row -->

					<!-- row -->

					<div class="row">
						
						<article class="col-sm-12 col-md-12 col-lg-6">
						
						
						<div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-0" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="true" data-widget-sortable="false">
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
									<span class="widget-icon"> <i class="fa fa-table"></i> </span>
									<h2>Tenant Reports </h2>
				
								</header>
				
								<!-- widget div-->
								<div>
				
									<!-- widget edit box -->
									<div class="jarviswidget-editbox">
										<!-- This area used as dropdown edit box -->
				
									</div>
									<!-- end widget edit box -->
				
									<!-- widget content -->
									<div class="widget-body no-padding" class="custom-scroll table-responsive">
				
										<table id="dt_basic1" class="table table-striped table-bordered table-hover" width="100%">
											<thead>
													<tr>
													
													<th>Tenant List</th>
													<th>Code</th>
													<th>Total-Usage-Hours</th>
													<th>Status</th>
													<th>Trend</th>
													<th>Action</th>
													
													</tr>
												</thead>
												<tbody>
													<tr>
														<td><a href="javascript:void(0);">STG AutomationCHN</a></td>
													<td>STGAU-CHN</td>
													<td width ="10px">185.71</td>
													<td width ="10px" class="text-align-left">
														<span class='label label-success'>ACTIVE</span>
													</td>
													<td><span class="label bg-color-red"><i class="fa fa-caret-down"></i> 9%</span>	</td>
													<td width ="10px"><a href="javascript:void(0);"><i class="fa fa-dollar"></i></a></td>
													</tr>
													
													
													<tr>
														<td><a href="javascript:void(0);">STG SystemINT PUN</a></td>
													<td>STGSIT-PUN</td>
													<td>260.156</td>
													<td class="text-align-left">
													<span class='label label-success'>ACTIVE</span>
													
													</td>
													<td><span class="label bg-color-green"><i class="fa fa-caret-up"></i> 30%</span>
													</td>
													<td><a href="javascript:void(0);"><i class="fa fa-dollar"></i></a></td>
													
													
													</tr>
													<tr>
														<td><a href="javascript:void(0);">Tech Support Group</a></td>
													<td>TSG CHN</td>
													<td>45.11</td>
													<td class="text-align-left"><span class='label label-default'>INACTIVE</span>
													</td>
													<td><span class="label bg-color-red"><i class="fa fa-caret-down"></i> 10%</span>	</td>
													<td><a href="javascript:void(0);"><i class="fa fa-dollar"></i></a></td>
													</tr>
													<tr>
														<td><a href="javascript:void(0);">Tech Support Group</a></td>
													<td>TSG CHN</td>
													<td>45.11</td>
													<td class="text-align-left"><span class='label label-default'>INACTIVE</span>
													</td>
													<td><span class="label bg-color-red"><i class="fa fa-caret-down"></i> 10%</span>	</td>
													<td><a href="javascript:void(0);"><i class="fa fa-dollar"></i></a></td>
													</tr>
													<tr>
														<td><a href="javascript:void(0);">Tech Support Group</a></td>
													<td>TSG CHN</td>
													<td>45.11</td>
													<td class="text-align-left"><span class='label label-default'>INACTIVE</span>
													</td>
													<td><span class="label bg-color-red"><i class="fa fa-caret-down"></i> 10%</span>	</td>
													<td><a href="javascript:void(0);"><i class="fa fa-dollar"></i></a></td>
													</tr>
													<tr>
														<td><a href="javascript:void(0);">Tech Support Group</a></td>
													<td>TSG CHN</td>
													<td>45.11</td>
													<td class="text-align-left"><span class='label label-default'>INACTIVE</span>
													</td>
													<td><span class="label bg-color-red"><i class="fa fa-caret-down"></i> 10%</span>	</td>
													<td><a href="javascript:void(0);"><i class="fa fa-dollar"></i></a></td>
													</tr>
													<tr>
														<td><a href="javascript:void(0);">Tech Support Group</a></td>
													<td>TSG CHN</td>
													<td>45.11</td>
													<td class="text-align-left"><span class='label label-default'>INACTIVE</span>
													</td>
													<td><span class="label bg-color-red"><i class="fa fa-caret-down"></i> 10%</span>	</td>
													<td><a href="javascript:void(0);"><i class="fa fa-dollar"></i></a></td>
													</tr>
													<tr>
														<td><a href="javascript:void(0);">Tech Support Group</a></td>
													<td>TSG CHN</td>
													<td>45.11</td>
													<td class="text-align-left"><span class='label label-default'>INACTIVE</span>
													</td>
													<td><span class="label bg-color-red"><i class="fa fa-caret-down"></i> 10%</span>	</td>
													<td><a href="javascript:void(0);"><i class="fa fa-dollar"></i></a></td>
													</tr>
													
												</tbody>					
											</tbody>
											
										</table>

									</div>
									<!-- end widget content -->
				
								</div>
								<!-- end widget div -->
				
							</div>
						
				

							
						</article>

						<article class="col-sm-12 col-md-12 col-lg-6">
						
					<div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-0" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="true" data-widget-sortable="false">
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
									<span class="widget-icon"> <i class="fa fa-table"></i> </span>
									<h2>Work Items</h2>
				
								</header>
				
								<!-- widget div-->
								<div>
				
									<!-- widget edit box -->
									<div class="jarviswidget-editbox">
										<!-- This area used as dropdown edit box -->
				
									</div>
									<!-- end widget edit box -->
				
									<!-- widget content -->
										<div class="widget-body no-padding" class="custom-scroll table-responsive">
				
										<table id="dt_basic2" class="table table-striped table-bordered table-hover" width="100%">
											<thead>
												<tr>
													<th>Organization</th>
													<th>Owner</th>
													<th >Approval Status</th>
													<th>Summary</th>
													
												</tr>
											</thead>
											<tbody>
												<tr>
													<td><a href="javascript:void(0);">STG AutomationCHN</a></td>
													<td>Rhea</td>
													<td >Pending Approval</td>
													<td>Add 16 VCPU, Ram...<a data-toggle="modal" href="#myModal">
											<i class="fa fa-folder-open-o"></i></a></td>
												</tr>
												<tr>
													<td><a href="javascript:void(0);">STG AutomationCHN</a></td>
													<td>Rhea</td>
													<td>ISAP-Admin In Process</td>
													<td >Add new tenant<a data-toggle="modal" href="#myModal" >
											<i class="fa fa-folder-open-o"></i></a></td>
												</tr>
												<tr>
													<td><a href="javascript:void(0);">STG Testing</a></td>
													<td>Ravi</td>
													<td>ISAP-Admin In Process</td>
													<td >Create new VDC..<a data-toggle="modal" href="#myModal" >
											<i class="fa fa-folder-open-o"></i></a></td>
												</tr>
												<tr>
													<td><a href="javascript:void(0);">STG SystemINT PUN</a></td>
													<td>Mark</td>
													<td>Request for Information</td>
													<td>Delete ISAP Business..<a data-toggle="modal" href="#myModal">
											<i class="fa fa-folder-open-o"></i></a></td>
												</tr>	
											
												<tr>
													<td><a href="javascript:void(0);">STG SystemINT PUN</a></td>
													<td>Mark</td>
													<td>Request for Information</td>
													<td>Delete ISAP Business..<a data-toggle="modal" href="#myModal">
											<i class="fa fa-folder-open-o"></i></a></td>
												</tr>	
												
												<tr>
													<td><a href="javascript:void(0);">STG SystemINT PUN</a></td>
													<td>Mark</td>
													<td>Request for Information</td>
													<td>Delete ISAP Business..<a data-toggle="modal" href="#myModal">
											<i class="fa fa-folder-open-o"></i></a></td>
												</tr>	
											
												<tr>
													<td><a href="javascript:void(0);">STG SystemINT PUN</a></td>
													<td>Mark</td>
													<td>Request for Information</td>
													<td>Delete ISAP Business..<a data-toggle="modal" href="#myModal">
											<i class="fa fa-folder-open-o"></i></a></td>
												</tr>	
										
												<tr>
													<td><a href="javascript:void(0);">STG SystemINT PUN</a></td>
													<td>Mark</td>
													<td>Request for Information</td>
													<td>Delete ISAP Business..<a data-toggle="modal" href="#myModal">
											<i class="fa fa-folder-open-o"></i></a></td>
												</tr>	
																												
											</tbody>	
											</tbody>
											
										</table>

									</div>
									<!-- end widget content -->
				
								</div>
								<!-- end widget div -->
				
							</div>
						
						
						


						</article>						
					</div>
					<!-- end widget -->	
			<!-- END MAIN CONTENT -->

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

		<!-- SHORTCUT AREA : With large tiles (activated via clicking user name tag)
		Note: These tiles are completely responsive,
		you can add as many as you like
		-->

		<!-- END SHORTCUT AREA -->

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
		
		<!-- PAGE RELATED PLUGIN(S) -->
		<script src="js/plugin/datatables/jquery.dataTables.min.js"></script>
		<script src="js/plugin/datatables/dataTables.colVis.min.js"></script>
		<script src="js/plugin/datatables/dataTables.tableTools.min.js"></script>
		<script src="js/plugin/datatables/dataTables.bootstrap.min.js"></script>
		<script src="js/plugin/datatable-responsive/datatables.responsive.min.js"></script>
		
		
		
		<script type="text/javascript">
		
		// DO NOT REMOVE : GLOBAL FUNCTIONS!
		
		$(document).ready(function() {
			
			pageSetUp();
			
			
				var responsiveHelper_dt_basic = undefined;
				var responsiveHelper_datatable_fixed_column = undefined;
				var responsiveHelper_datatable_col_reorder = undefined;
				var responsiveHelper_datatable_tabletools = undefined;
				
				var breakpointDefinition = {
					tablet : 1024,
					phone : 480
				};
	
				$('#dt_basic').dataTable({
					"sDom": "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-12 hidden-xs'l>r>"+
						"t"+
						"<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",
					"autoWidth" : true,
					
					 'paging': false,
					 "filter":false,
					 "searching": false,
					 "info": false,
					 
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
	
			/* 	Billing table */
				$('#dt_basic1').dataTable({
					"sDom": "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-12 hidden-xs'l>r>"+
						"t"+
						"<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",
					"autoWidth" : true,
					
					 'paging': true,
					 "filter":true,
					 "searching": true,
					 "info": true,
					 "iDisplayLength": 5,
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
			
			/* Orders queue */
				$('#dt_basic2').dataTable({
					"sDom": "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-12 hidden-xs'l>r>"+
						"t"+
						"<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",
					"autoWidth" : true,
					
					 'paging': true,
					 "filter":true,
					 "searching": true,
					 "info": true,
					 "iDisplayLength": 5,
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
			
				
				
				
			/* END BASIC */
			
			/* COLUMN FILTER  */
		    var otable = $('#datatable_fixed_column').DataTable({
		    	//"bFilter": false,
		    	//"bInfo": false,
		    	//"bLengthChange": false
		    	//"bAutoWidth": false,
		    	//"bPaginate": false,
		    	//"bStateSave": true // saves sort state using localStorage
				"sDom": "<'dt-toolbar'<'col-xs-12 col-sm-6 hidden-xs'f><'col-sm-6 col-xs-12 hidden-xs'<'toolbar'>>r>"+
						"t"+
						"<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",
				"autoWidth" : true,
				"preDrawCallback" : function() {
					// Initialize the responsive datatables helper once.
					if (!responsiveHelper_datatable_fixed_column) {
						responsiveHelper_datatable_fixed_column = new ResponsiveDatatablesHelper($('#datatable_fixed_column'), breakpointDefinition);
					}
				},
				"rowCallback" : function(nRow) {
					responsiveHelper_datatable_fixed_column.createExpandIcon(nRow);
				},
				"drawCallback" : function(oSettings) {
					responsiveHelper_datatable_fixed_column.respond();
				}		
			
		    });
		    
		    // custom toolbar
		    $("div.toolbar").html('<div class="text-right"><img src="img/logo.png" alt="SmartAdmin" style="width: 111px; margin-top: 3px; margin-right: 10px;"></div>');
		    	   
		    // Apply the filter
		    $("#datatable_fixed_column thead th input[type=text]").on( 'keyup change', function () {
		    	
		        otable
		            .column( $(this).parent().index()+':visible' )
		            .search( this.value )
		            .draw();
		            
		    } );
		    /* END COLUMN FILTER */   
	    
			/* COLUMN SHOW - HIDE */
			$('#datatable_col_reorder').dataTable({
				"sDom": "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-6 hidden-xs'C>r>"+
						"t"+
						"<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-sm-6 col-xs-12'p>>",
				"autoWidth" : true,
				"preDrawCallback" : function() {
					// Initialize the responsive datatables helper once.
					if (!responsiveHelper_datatable_col_reorder) {
						responsiveHelper_datatable_col_reorder = new ResponsiveDatatablesHelper($('#datatable_col_reorder'), breakpointDefinition);
					}
				},
				"rowCallback" : function(nRow) {
					responsiveHelper_datatable_col_reorder.createExpandIcon(nRow);
				},
				"drawCallback" : function(oSettings) {
					responsiveHelper_datatable_col_reorder.respond();
				}			
			});
			
			/* END COLUMN SHOW - HIDE */
	
			/* TABLETOOLS */
			$('#datatable_tabletools').dataTable({
				
				// Tabletools options: 
				//   https://datatables.net/extensions/tabletools/button_options
				"sDom": "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-6 hidden-xs'T>r>"+
						"t"+
						"<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-sm-6 col-xs-12'p>>",
		        "oTableTools": {
		        	 "aButtons": [
		             "copy",
		             "csv",
		             "xls",
		                {
		                    "sExtends": "pdf",
		                    "sTitle": "SmartAdmin_PDF",
		                    "sPdfMessage": "SmartAdmin PDF Export",
		                    "sPdfSize": "letter"
		                },
		             	{
	                    	"sExtends": "print",
	                    	"sMessage": "Generated by SmartAdmin <i>(press Esc to close)</i>"
	                	}
		             ],
		            "sSwfPath": "js/plugin/datatables/swf/copy_csv_xls_pdf.swf"
		        },
				"autoWidth" : true,
				"preDrawCallback" : function() {
					// Initialize the responsive datatables helper once.
					if (!responsiveHelper_datatable_tabletools) {
						responsiveHelper_datatable_tabletools = new ResponsiveDatatablesHelper($('#datatable_tabletools'), breakpointDefinition);
					}
				},
				"rowCallback" : function(nRow) {
					responsiveHelper_datatable_tabletools.createExpandIcon(nRow);
				},
				"drawCallback" : function(oSettings) {
					responsiveHelper_datatable_tabletools.respond();
				}
			});
			
			/* END TABLETOOLS */
		
		})

		</script>
		
		

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

				/*
				* TODO: add a way to add more todo's to list
				*/

				// initialize sortable
				$(function() {
					$("#sortable1, #sortable2").sortable({
						handle : '.handle',
						connectWith : ".todo",
						update : countTasks
					}).disableSelection();
				});

				// check and uncheck
				$('.todo .checkbox > input[type="checkbox"]').click(function() {
					var $this = $(this).parent().parent().parent();

					if ($(this).prop('checked')) {
						$this.addClass("complete");

						// remove this if you want to undo a check list once checked
						//$(this).attr("disabled", true);
						$(this).parent().hide();

						// once clicked - add class, copy to memory then remove and add to sortable3
						$this.slideUp(500, function() {
							$this.clone().prependTo("#sortable3").effect("highlight", {}, 800);
							$this.remove();
							countTasks();
						});
					} else {
						// insert undo code here...
					}

				})
				// count tasks
				function countTasks() {

					$('.todo-group-title').each(function() {
						var $this = $(this);
						$this.find(".num-of-tasks").text($this.next().find("li").size());
					});

				}

				/*
				* RUN PAGE GRAPHS
				*/

				/* TAB 1: UPDATING CHART */
				// For the demo we use generated data, but normally it would be coming from the server

				var data = [], totalPoints = 200, $UpdatingChartColors = $("#updating-chart").css('color');

				function getRandomData() {
					if (data.length > 0)
						data = data.slice(1);

					// do a random walk
					while (data.length < totalPoints) {
						var prev = data.length > 0 ? data[data.length - 1] : 50;
						var y = prev + Math.random() * 10 - 5;
						if (y < 0)
							y = 0;
						if (y > 100)
							y = 100;
						data.push(y);
					}

					// zip the generated y values with the x values
					var res = [];
					for (var i = 0; i < data.length; ++i)
						res.push([i, data[i]])
					return res;
				}

				// setup control widget
				var updateInterval = 1500;
				$("#updating-chart").val(updateInterval).change(function() {

					var v = $(this).val();
					if (v && !isNaN(+v)) {
						updateInterval = +v;
						$(this).val("" + updateInterval);
					}

				});

				// setup plot
				var options = {
					yaxis : {
						min : 0,
						max : 100
					},
					xaxis : {
						min : 0,
						max : 100
					},
					colors : [$UpdatingChartColors],
					series : {
						lines : {
							lineWidth : 1,
							fill : true,
							fillColor : {
								colors : [{
									opacity : 0.4
								}, {
									opacity : 0
								}]
							},
							steps : false

						}
					}
				};

				var plot = $.plot($("#updating-chart"), [getRandomData()], options);

				/* live switch */
				$('input[type="checkbox"]#start_interval').click(function() {
					if ($(this).prop('checked')) {
						$on = true;
						updateInterval = 1500;
						update();
					} else {
						clearInterval(updateInterval);
						$on = false;
					}
				});

				function update() {
					if ($on == true) {
						plot.setData([getRandomData()]);
						plot.draw();
						setTimeout(update, updateInterval);

					} else {
						clearInterval(updateInterval)
					}

				}

				var $on = false;

				/*end updating chart*/

				/* TAB 2: Social Network  */

				$(function() {
					// jQuery Flot Chart
					var twitter = [[1, 27], [2, 34], [3, 51], [4, 48], [5, 55], [6, 65], [7, 61], [8, 70], [9, 65], [10, 75], [11, 57], [12, 59], [13, 62]], facebook = [[1, 25], [2, 31], [3, 45], [4, 37], [5, 38], [6, 40], [7, 47], [8, 55], [9, 43], [10, 50], [11, 47], [12, 39], [13, 47]], data = [{
						label : "Twitter",
						data : twitter,
						lines : {
							show : true,
							lineWidth : 1,
							fill : true,
							fillColor : {
								colors : [{
									opacity : 0.1
								}, {
									opacity : 0.13
								}]
							}
						},
						points : {
							show : true
						}
					}, {
						label : "Facebook",
						data : facebook,
						lines : {
							show : true,
							lineWidth : 1,
							fill : true,
							fillColor : {
								colors : [{
									opacity : 0.1
								}, {
									opacity : 0.13
								}]
							}
						},
						points : {
							show : true
						}
					}];

					var options = {
						grid : {
							hoverable : true
						},
						colors : ["#568A89", "#3276B1"],
						tooltip : true,
						tooltipOpts : {
							//content : "Value <b>$x</b> Value <span>$y</span>",
							defaultTheme : false
						},
						xaxis : {
							ticks : [[1, "JAN"], [2, "FEB"], [3, "MAR"], [4, "APR"], [5, "MAY"], [6, "JUN"], [7, "JUL"], [8, "AUG"], [9, "SEP"], [10, "OCT"], [11, "NOV"], [12, "DEC"], [13, "JAN+1"]]
						},
						yaxes : {

						}
					};

					var plot3 = $.plot($("#statsChart"), data, options);
				});

				// END TAB 2

				// TAB THREE GRAPH //
				/* TAB 3: Revenew  */

				$(function() {


					 var trgt = [[1304586000000, 153], [1314587000000, 1000], [1324588000000, 198], [1334589000000, 663], [1344590000000, 801], [1354591000000, 1080], [1364592000000, 353], [1374593000000, 749], [1384594000000, 523], [1394595000000, 258], [1404596000000, 688], [1414597000000, 364], [1424597000000, 364]], 
						prft = [[1304586000000, 300], [1314587000000, 65], [1324588000000, 98], [1334589000000, 83], [1344590000000, 980], [1354591000000, 808], [1364592000000, 720], [1374593000000, 674], [1384594000000, 23], [1394595000000, 79], [1404596000000, 88], [1414597000000, 36], [1424597000000, 36]], 
						sgnups = [[1304586000000, 647], [1314587000000, 435], [1324588000000, 784], [1334589000000, 346], [1344590000000, 487], [1354591000000, 463], [1364592000000, 479], [1374593000000, 236], [1384594000000, 843], [1394595000000, 657], [1404596000000, 241], [1414597000000,341], [1424597000000,341]], 
					 
					 
					toggles = $("#rev-toggles"),
					target = $("#flotcontainer");

					var data = [{
						label : "Amex",
						data : trgt,
						color : '#1236B1',
						lines : {
								show : true,
							    lineWidth : 3
							
						},
						points : {
							show : true
						}
					}, {
						label : "FedEx ",
						data : prft,
						color : '#3276B1',
						lines : {
							show : true,
							lineWidth : 3
						},
						points : {
							show : true
						}
					}, {
						label : "Interlink",
						data : sgnups,
						color : '#71843F',
						lines : {
							show : true,
							lineWidth : 1
						},
						points : {
							show : true
						}
					}]

					var options = {
						grid : {
							hoverable : true
						},
						tooltip : true,
						tooltipOpts : {
							//content: '%x - %y',
							//dateFormat: '%b %y',
							defaultTheme : false
						},
						xaxis : {
							mode : "time"
						},
						yaxes : {
							tickFormatter : function(val, axis) {
								return "$" + val;
							},
							max : 1200
						}

					};

					plot2 = null;

					function plotNow() {
						var d = [];
						toggles.find(':checkbox').each(function() {
							if ($(this).is(':checked')) {
								d.push(data[$(this).attr("name").substr(4, 1)]);
							}
						});
						if (d.length > 0) {
							if (plot2) {
								plot2.setData(d);
								plot2.draw();
							} else {
								plot2 = $.plot(target, d, options);
							}
						}

					};

					toggles.find(':checkbox').on('change', function() {
						plotNow();
					});
					plotNow()

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