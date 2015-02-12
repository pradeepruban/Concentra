<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en-us">
    <head>
        <meta charset="utf-8">
        <!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->

        <title> ISAP ADMIN HOME</title>
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
					<li >
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
					
					<li class="active">
						<a href="ListUsers"><i class="fa fa-user"></i> <span class="menu-item-parent">Users</span></a>
					</li>
					
					<li >
						<a href="corporategroups" title="corporateAdmin"><i class="fa  fa-group"></i> <span class="menu-item-parent">Corporate Group</span></a>
					</li>
						<li>
					<a href="#"><i class="fa fa-lg fa-fw fa-cogs"></i> <span class="menu-item-parent"> Quota</span></a>			
					</li>
				
					<!-- <li >
						<a href="#"><i class="fa fa-lg fa-fw fa-puzzle-piece"></i> <span class="menu-item-parent">VDC Management</span></a>
						<ul>
							<li>
								<a href="#">Register VDC</a>
							</li>
						</ul>		
					</li>
					<li>
						<a href="#"><i class="fa fa-lg fa-fw  fa-legal"></i> <span class="menu-item-parent">Policies</span></a>
						<ul>
						   <li class="active">
								<a href="#">List Users</a>
							</li>
							<li>
								<a href="#">Set Policies</a>
							</li>
							
						</ul>		
					</li>
					
					<li>
						<a href="#"><i class="fa fa-lg fa-fw fa-filter"></i> <span class="menu-item-parent">Stack List</span></a>
					</li>
					
					<li>
						<a href="#"><i class="fa fa-lg fa-fw fa-cogs"></i> <span class="menu-item-parent">Manage Services</span></a>
					</li> 
					
					<li>
						<a href="#"><i class="fa fa-stack-overflow"></i> <span class="menu-item-parent">Reports</span></a>
					</li>		
					
					<li>
					<a href="#"><i class="fa fa-fw fa-medkit"></i> <span class="menu-item-parent"> Monitor</span></a>			
					</li>
					
						
					<li>
						<a href="#" ><i class="fa fa-lg fa-fw fa-retweet"></i> <span class="menu-item-parent">Migration</span></a>
					
					    <ul>
						   <li>
								<a href="#">Discover</a>
							</li>
							<li class="active"> 
								<a href="#">MigrationPlans</a>
							</li>
							<li>
								<a href="#">RegisterEnv</a>
							</li>
						</ul>
					
					
					</li>
					 -->
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
					<li>Home</li><li>Users</li>
				</ol>
			</div>
			<!-- END RIBBON -->

			
			<!-- MAIN CONTENT -->
			<div id="content">

     
		
				<!-- widget grid -->
				<section id="widget-grid" class="">
				
					<!-- row -->
					<div class="row">
                       
						 <div class="pull-right" style="padding-right: 2%;">
							 <a data-toggle="modal" href="#myModal"  class="btn btn-success txt-color-white pull-right  ">
                                            <i class="fa fa-circle-arrow-up fa-lg"></i>
                                            Add User
                                        </a>   
							<br><br>
						</div>		
								
                    <!--  <div class="pull-right" style="padding-right: 1%;">
							 <a data-toggle="modal" href="#myModal"  class="btn btn-success txt-color-white pull-right  ">
                                            <i class="fa fa-circle-arrow-up fa-lg"></i>
                                            Add User
                                        </a>  
                                        <br> 
							<br>
						</div> -->
								</div>
								
								
								
								
								<div class="modal fade" id="myModal1" tabindex="-1" role="dialog">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                   <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                    &times;
                                    </button>
                                    <h4 class="modal-title">
                                        Edit User
                                    </h4>
                                    
                                </div>
                                <div class="modal-body no-padding">
                                    <form action="editUserDetails" id="editusrform" class="smart-form" method="POST">
                                   
                                    <input type="hidden" id="editUserId" name="usr_id" >
                                            <fieldset>
													<section>
																<div class="row">
																	<label class="label col col-2"> User Name</label>
																	<div class="col col-10">
																		<label class="input"> 
																			<input type="text" name="usr_name" id="editUserName">
																		</label>
																	</div>
																</div>
														</section>
														<!-- <section>
																<div class="row">
																	<label class="label col col-2"> Password</label>
																	<div class="col col-10">
																		<label class="input"> 
																			<input type="password" name="password" id="editUserPassword">
																		</label>
																	</div>
																</div>
														</section> -->
														<section>
														
										            <div class="row">
													<label class="label col col-2">Corporate Group</label>
													    <div class="col col-10">
													        <label class="input">
													            <select class="form-control" name="cg_id" id="editCgId">
															
							                         <option selected="" disabled="disabled" value="0">Select Corporate</option>
							
													</select>  </label></div>
														</div>
														
														
												</section>
												<section>
														<div class="row">
													<label class="label col col-2">Department </label>
													<div class="col col-10"><label class="input">
													 <select class="form-control" name="dpt_id" id="editDeptId" >
															
							                         <option selected="" disabled="disabled" value="0">Select Department</option>
							
													</select>  </label> 
														
															
														  </div>
														</div>
												</section>
														  
														
														<section>
														<div class="row">
													<label class="label col col-2">Projects </label>
													<div class="col col-10"><label class="input">
														<select class="form-control" name="proj_id" id="editProjId" >
															
							                         <option selected="" disabled="disabled" value="0">Select Projects</option>
							
													</select>  </label></div>
														</div>
												</section> 	
														
														<section>
                                                    <div class="row">
                                                        <label class="label col col-2">Status</label>
                                                                <div class="col col-10">
                                                                    <label class="input">
                                                                        <select class="form-control" id="status" name="status">
                                                                        
                                                                        <option value="Active">Active</option>
                                                                        
                                                                        <option value="InActive">InActive</option>
                                                                        
                                                                        
                                                                        
                                                                    </select> 
                                                                    </label>                                                               
                                                                </div>
                                                     </div>
                                                </section>   
												</fieldset>	
													<footer>
													<button type="submit" id="user"  class="btn btn-primary">
														Edit User
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
	              	
	              				<div class="modal fade" id="myModal" tabindex="-1" role="dialog">
								<div class="modal-dialog">
								<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
												&times;
											</button>
											<h4 class="modal-title">
												Add User
											</h4>
										</div>
										<div class="modal-body no-padding">
											<form action="add" id="corp-form" class="smart-form" method="POST">
													<fieldset>
															<section>
																<div class="row">
																	<label class="label col col-2"> User Name</label>
																	<div class="col col-10">
																		<label class="input"> 
																			<input type="text" name="usr_name">
																		</label>
																	</div>
																</div>
														</section>
														<section>
																<div class="row">
																	<label class="label col col-2"> Password</label>
																	<div class="col col-10">
																		<label class="input"> 
																			<input type="password" name="password">
																		</label>
																	</div>
																</div>
														</section>
														<section>
														
										            <div class="row">
													<label class="label col col-2">Corporate Group</label>
													    <div class="col col-10">
													        <label class="input">
													            <select class="form-control" name="cg_id" id="cg_id">
															
							                         <option selected="" disabled="disabled" value="0">Select Corporate</option>
							
													</select>  </label></div>
														</div>
														
														
												</section>
												<section>
														<div class="row">
													<label class="label col col-2">Department </label>
													<div class="col col-10"><label class="input">
													 <select class="form-control" name="dpt_id" id="dpt_id" onclick="getdepartment(this)">
															
							                         <option selected="" disabled="disabled" value="0">Select Department</option>
							
													</select>  </label> 
														
															
														  </div>
														</div>
												</section>
														  
														
														<section>
														<div class="row">
													<label class="label col col-2">Projects </label>
													<div class="col col-10"><label class="input">
														<select class="form-control" name="proj_id" id="proj_id" onclick="getdepartment(this)">
															
							                         <option selected="" disabled="disabled" value="0">Select Projects</option>
							
													</select>  </label></div>
														</div>
												</section> 														<!-- <section>
															<div class="row">
																<label class="label col col-2">Role</label>
																<div class="col col-10">
																	<label class="input"> <i class="icon-append fa fa-user"></i>
																		<input type="text" name="role">
																	</label>
																	
																</div>
															</div>
														</section> -->
														
														<!-- <section>
															<div class="row">
																<label class="label col col-2">Status</label>
																
																<div class="col col-2">
																<label>&nbsp;</label>
																	<label class="radio-inline">
												                    &nbsp;&nbsp; &nbsp;   <input type="radio" name="status" checked="checked"/> Active 
												                   </label>
												               
																</div>
																	<div class="col col-2">
																		<label>&nbsp;</label>
																	<label class="radio-inline">
												                      <input type="radio" name="status"  value="INA" /> Inactive 
												                   </label>
																	
																</div>
															</div>
														</section> -->
													
														
													 </fieldset>
										
												<footer>
													<button type="submit" id="user"  class="btn btn-primary">
														Add User
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
					
						
				
						<!-- NEW WIDGET START -->
						<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
							<form name = "department" id =  "department">
							<input type = "hidden" name = "usr_id" id = "usr_id">
							<!-- Widget ID (each widget will need unique ID)-->
							<div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-1" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="true" data-widget-sortable="false">
								
								<header>
									<span class="widget-icon"> <i class="fa fa-table"></i> </span>
									<h2>Add User </h2>
				
								</header>
				
								<!-- widget div-->
								<div>
				
									
				
									<!-- widget content -->
									<div class="widget-body no-padding">
				
										<table id="dt_basic" class="table table-striped table-bordered table-hover" width="100%">
									     <thead>
									     
									     			                
												<tr>
													<th data-class="expand"><i class="fa fa-fw fa-user text-muted hidden-md hidden-sm hidden-xs"></i>User Name</th>
													<th data-hide="phone" > Corporate Name</th>	
													<th data-hide="phone" > Department</th>	
													<th data-hide="phone" > Projects</th>	
													<th>Status</th>
													<th>Actions</th>
												</tr>
											</thead>
											<tbody>
												
												
											<c:forEach var="users" items="${usrlist}">
                                             <tr>
                                             <td><c:out value="${users.usr_name}"/></td>
                                            
                                            <td><c:out value="${users.corporate_name}"/></td>
                                            <td><c:out value="${users.dpt_name}"/></td>
                                            <td><c:out value="${users.proj_name}"/></td>
                                             <td> 
                                               <c:choose>
                                            <c:when test="${users.status=='Active'}">
                                           <span class="label label-success">Active</span>
                                          </c:when>
                                         <c:when test="${users.status=='Inactive'}">
                                       <span class="label label-danger">Inactive</span>
                                        </c:when>
  
                                      </c:choose>
                                  </td>
                                        <td  style="padding-left: 3%;">
												<!-- <a title="edit"  href="#"><i class="fa fa-pencil"></i></a> -->
												<a title="edit" data-toggle="modal" id="${users.usr_id}" name="${users.usr_name}"  onclick="getRow(this);" href="#myModal1"><i class="fa fa-pencil"></i></a>
                                               
												  <a title="delete" href="#" id="${users.usr_id}" name="${users.usr_name}" onclick="deleteDepartment(this)"><i class="fa fa-trash-o"></i></a>
												
												
												</td>
									
                                        </tr>
                                     </c:forEach>
											</tbody>
										</table>
										
										

									</div>
									<!-- end widget content -->
				
								</div>
								<!-- end widget div -->
				
							</div>
							
							<!-- end widget -->
							</form>
						</article>
						<!-- WIDGET END -->
				</section>
				
				</div>
					</div>
					
					
					
					<div id="dialog_simple" title="Dialog Simple Title">
            <p>
               The User <span id="userName"> </span> is CorporateAdmin cannot be delete before assing new CorporateAdmin.
            </p>
        </div>
        <div id="isapAdmin_dialog" title="Dialog Simple Title">
            <p>
               The User <span id="userName3"> </span> is ISAPAdmin cannot be delete before assing new ISAPAdmin.
            </p>
        </div>
        <div id="departmentAdmin_dialog" title="Dialog Simple Title">
            <p>
               The User <span id="userName4"> </span> is DepartmentAdmin cannot be delete before assing new DepartmentAdmin.
            </p>
        </div>
        <div id="projAdmin_dialog" title="Dialog Simple Title">
            <p>
               The User <span id="userName5"> </span> is ProjectAdmin cannot be delete before assing new ProjectAdmin.
            </p>
        </div>
         <div id="user_dialog" title="Dialog Simple Title">
            <p>
              Do you want to delete the User  <span id="userName2"> </span> :?
            </p>
        </div>
				
					<!-- end row -->
				
					<!-- end row -->
				
				
				<!-- end widget grid -->

			
			<!-- END MAIN CONTENT -->

		
		<!-- END MAIN PANEL -->
		<%-- 
		<div id="delete_modal" title="Dialog Simple Title">
            <p>
                Are you sure you want to delete the user: ${users.usr_desc} "<span id="user"> </span>" ?
            </p>
        </div> --%>
		
		<!-- PAGE FOOTER -->
          <div class="page-footer">
			<div class="row">
				<div class="col-xs-12 col-sm-6">
					<span class="txt-color-white">ISAP - Syntel, Inc. &copy; 2014-2015</span>
				</div>
			</div>
		</div>
		<!-- END PAGE FOOTER -->

		<!-- SHORTCUT AREA : With large tiles (activated via clicking user name tag)
		Note: These tiles are completely responsive,
		you can add as many as you like
		-->

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
		<script src="js/plugin/datatables/jquery.dataTables.min.js"></script>
		<script src="js/plugin/datatables/dataTables.colVis.min.js"></script>
		<script src="js/plugin/datatables/dataTables.tableTools.min.js"></script>
		<script src="js/plugin/datatables/dataTables.bootstrap.min.js"></script>
		<script src="js/plugin/datatable-responsive/datatables.responsive.min.js"></script>





<script type="text/javascript">
		
		// DO NOT REMOVE : GLOBAL FUNCTIONS!
		
		$(document).ready(function() {
			
			pageSetUp();
			
			
			/* BASIC ;*/
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
				 "bSort": true,
				 "sScrollY": "460px",
				    "iDisplayLength": 5,
				    "oLanguage": {
			            "sEmptyTable": "No Corporates available"
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

		/* END BASIC */
		
				 $.getJSON("./getCorps",function(response){
		                var options = '';   
		                for(i=0;i<response.length;i++){
		                   options += '<option value="' + response[i].cg_id + '">' + response[i].corporate_name + '</option>';
		                }
		               $('#cg_id').append(options);     
		             });  
			
			
		             
					$('#cg_id').change(	            
							function() {
					           var cgId = $('#cg_id option:selected').val();		       
							    $('#dpt_id').html(''); 
							    $('#proj_id').html(''); 
					           $.getJSON("./getDeptsJson/"+cgId,function(response){
					                var options = '<option selected disabled="disabled" value="0"> Select Department </option>'; 
					                for(i=0;i<response.length;i++){
					                
					                   options += '<option value="' + response[i].dpt_id + '">' + response[i].dpt_name + '</option>';
					                }
					               $('#dpt_id').append(options);     
					             });
					          });	
						 
					$('#dpt_id').change(	            
							function() {
					           var dptId = $('#dpt_id option:selected').val();		       
							    $('#proj_id').html(''); 
							    
					           $.getJSON("./getProjsJson/"+dptId,function(response){
					                var options = '<option selected disabled="disabled" value="0"> Select Projects </option>'; 
					                for(i=0;i<response.length;i++){
					                
					                   options += '<option value="' + response[i].proj_id + '">' + response[i].proj_name + '</option>';
					                }
					               $('#proj_id').append(options);     
					             });
					          });
		             
					
					 $("#editusrform").validate({
		                    // Rules for form validation
						 rules : {
		                    	usr_name : {
		                            required : true
		                        },
		                        password : {
		                            required : true
		                        },  
		                        
		                        cg_id : {
		                            required : true
		                        },
		                        
		                        dpt_id : {
		                            required : true
		                        },
		                        
		                        
		                        proj_id : {
		                            required : true
		                        },
		                        
		                        status :{
		                            required : true
		                        }
		                        
		                    },

		                    // Messages for form validation
		                    messages : {
		                    	usr_name : {
		                            required : 'Please enter your user name '
		                        },   
		                        password : {
		                            required : 'Please entr password '
		                        },                       
		                        cg_id : {
		                            required : 'corporate group must be selected '
		                        },
		                       
		                        dpt_id : {
		                            required : 'department  must be selected '
		                        },
		                        
		                        proj_id : {
		                            required : 'Project  must be selected '
		                        },
		                        
		                        status : {
		                            required : 'Status  must be selected '
		                        },
		                                         },

		                    // Ajax form submition
		                    submitHandler : function(form) {
		                        $(form).ajaxSubmit({
		                            success : function() {
		                                $("#corp-form").addClass('submited');
		                            }
		                        });
		                    },
		                // Do not change code below
		                    errorPlacement : function(error, element) {
		                        error.insertAfter(element.parent());
		                    }
		                });	
					
		                    
				 // Validation
                $("#corp-form").validate({
                    // Rules for form validation
                    rules : {
                    	usr_name : {
                            required : true
                        },
                        password : {
                            required : true
                        },  
                        
                        cg_id : {
                            required : true
                        },
                        
                        dpt_id : {
                            required : true
                        },
                        
                        
                        proj_id : {
                            required : true
                        },
                        
                        status :{
                            required : true
                        }
                        
                    },

                    // Messages for form validation
                    messages : {
                    	usr_name : {
                            required : 'Please enter your user name '
                        },   
                        password : {
                            required : 'Please entr password '
                        },                       
                        cg_id : {
                            required : 'corporate group must be selected '
                        },
                       
                        dpt_id : {
                            required : 'department  must be selected '
                        },
                        
                        proj_id : {
                            required : 'Project  must be selected '
                        },
                        
                        status : {
                            required : 'Status  must be selected '
                        },
                                         },

                    // Ajax form submition
                    submitHandler : function(form) {
                        $(form).ajaxSubmit({
                            success : function() {
                                $("#corp-form").addClass('submited');
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
		
		<script>
		

	       function deleteDepartment(user){
	           var id=user.id;
	        
	           var name=user.name;
	           var name2=user.name;
	           var name3=user.name;
	           var name4=user.name;
	           var name5=user.name;
	           
	           $('#userName').text(name);
	           $('#userName2').text(name2);
	           $('#userName3').text(name3);
	           $('#userName4').text(name4);
	           $('#userName5').text(name5);
	           $('#usr_id').val(id);
	         //  $('#dialog_simple').dialog('open');
	              
	            
	            $.getJSON("./getAdminDetails/"+id,function(response){
                    
	            
	            	if(response.role_id=="2")
	            		{
	            		 $('#dialog_simple').dialog('open');
	            	
	            		}
	            	
	            	if(response.role_id=="1")
            		{
            		 $('#isapAdmin_dialog').dialog('open');
            	
            		}
	            	
	            	if(response.role_id=="3")
            		{
            		 $('#departmentAdmin_dialog').dialog('open');
            	
            		}
	            	if(response.role_id=="4")
            		{
            		 $('#projAdmin_dialog').dialog('open');
            	
            		}
	            	
	            	
	            	if(response.role_id=="6"||response.role_id=="5")
            		{
            		 $('#user_dialog').dialog('open');
            	
            		}

  
                 });
        
	       }
	       
	       
	       $('#dialog_simple').dialog({
               autoOpen : false,
               width : 600,
               resizable : false,
               modal : true,
               title : "Delete Confirmation?",
               buttons : [{
                   html : "<i class='fa fa-times'></i>&nbsp; Cancel",
                   "class" : "btn btn-default",
                   click : function() {
                       $(this).dialog("close");
                   }
               }]
           });
	       
	       
	       
	       $('#isapAdmin_dialog').dialog({
               autoOpen : false,
               width : 600,
               resizable : false,
               modal : true,
               title : "Delete Confirmation?",
               buttons : [{
                   html : "<i class='fa fa-times'></i>&nbsp; Cancel",
                   "class" : "btn btn-default",
                   click : function() {
                       $(this).dialog("close");
                   }
               }]
           });
	       
	       
	       
	       $('#departmentAdmin_dialog').dialog({
               autoOpen : false,
               width : 600,
               resizable : false,
               modal : true,
               title : "Delete Confirmation?",
               buttons : [{
                   html : "<i class='fa fa-times'></i>&nbsp; Cancel",
                   "class" : "btn btn-default",
                   click : function() {
                       $(this).dialog("close");
                   }
               }]
           });
	       
	       
	       
	       $('#projAdmin_dialog').dialog({
               autoOpen : false,
               width : 600,
               resizable : false,
               modal : true,
               title : "Delete Confirmation?",
               buttons : [{
                   html : "<i class='fa fa-times'></i>&nbsp; Cancel",
                   "class" : "btn btn-default",
                   click : function() {
                       $(this).dialog("close");
                   }
               }]
           });
	       
	       
	       $('#user_dialog').dialog({
               autoOpen : false,
               width : 600,
               resizable : false,
               modal : true,
               title : "Delete Confirmation?",
               buttons : [{
                   html : "<i class='fa fa-trash-o'></i>&nbsp; Delete User",
                   "class" : "btn btn-danger",
                   click : function() {
                       document.department.action = "./deleteUser";
                          document.department.submit();
                       $(this).dialog("close");
                   }
               }, {
                   html : "<i class='fa fa-times'></i>&nbsp; Cancel",
                   "class" : "btn btn-default",
                   click : function() {
                       $(this).dialog("close");
                   }
               }]
           });
	       
	       
	       /* $('#dialog_simple').dialog({
               autoOpen : false,
               width : 600,
               resizable : false,
               modal : true,
               title : "<div class='btn btn-danger'><h4><i class='fa fa-warning'></i> Delete Confirmation ?</h4></div>",
               buttons : [{
                   html : "<i class='fa fa-trash-o'></i>&nbsp; Delete department",
                   "class" : "btn btn-danger",
                   
               }, {
                   html : "<i class='fa fa-times'></i>&nbsp; Cancel",
                   "class" : "btn btn-default",
                   click : function() {
                       $(this).dialog("close");
                   }
               }]
           }); */
		
		
		
		</script>
		
		
		<script>
		
		
		function getRow(value){
			
		    var userId=value.id;
		    $('#editUserId').val(userId);
		   

		    $.getJSON("./getUserInEditTable/"+userId,function(response){
		    	var cgId=response.cg_id;
		    	var dptId=response.dpt_id;
		    	var projId=response.proj_id
		    	alert(projId);
		    	$('#editUserName').val(response.usr_name);
		    	 
		    	   $('#editDeptId').html(''); 
				    $('#editProjId').html('');
				    $('#editCgId').html(''); 
				    
		/* 			  $('#editCgId').val(response.cg_id);
		            */
		           $.getJSON("./getCorps",function(response){
						 var userName=value.name;   
						 var options = '';   
			                for(i=0;i<response.length;i++){
			                	
			                	var newCgId=response[i].cg_id;
			                	
			                	if(newCgId==cgId){options += '<option selected value="' + response[i].cg_id + '">' + response[i].corporate_name + '</option>';}
			                		 
			                    else{ options += '<option value="' + response[i].cg_id + '">' + response[i].corporate_name + '</option>';}
			                  
			                }
			               $('#editCgId').append(options);    
			               
			        
			 
			               
			               $.getJSON("./getDeptsJson/"+cgId,function(response){
				                var options = ''; 
				                for(i=0;i<response.length;i++){
				                	//alert(response[i].dpt_id);
				                	//alert(response[i].dpt_name);
				                var newDeptId=response[i].dpt_id;
				                	if(newDeptId==dptId){options += '<option selected value="' + response[i].dpt_id + '">' + response[i].dpt_name + '</option>';}
			                		 
				                    else{ options += '<option value="' + response[i].dpt_id + '">' + response[i].dpt_name + '</option>';}
				                  }
				               $('#editDeptId').append(options);     
				             });
			               
			               
			               
			    
			               
			               $.getJSON("./getProjsJson/"+dptId,function(response){
				                var options = ''; 
				                alert(response.length);
				                for(i=0;i<response.length;i++){
				                	
				                	 // alert(response[i].proj_name);
				                	var newProjId=response[i].proj_id;
				                	//alert(newProjId);
				                	if(newProjId==projId){options += '<option selected value="' + response[i].proj_id + '">' + response[i].proj_name + '</option>';}
			                		 
				                    else{ options += '<option value="' + response[i].proj_id + '">' + response[i].proj_name + '</option>';}
				                   
				                }
				               $('#editProjId').append(options);     
				             });
			               
			           	
			               
			             });
		           
		           
		           
		           
		           
		          /*  $('#editCgId').change(	            
							function() {
					           var cgId = $('#editCgId option:selected').val();		       
							    $('#editDeptId').html(''); 
							    $('#editProjId').html(''); 
							   
					           $.getJSON("./getDeptsJson/"+cgId,function(response){
					                var options = '<option selected disabled="disabled" value="0"> Select Department </option>'; 
					                for(i=0;i<response.length;i++){
					                
					                   options += '<option value="' + response[i].dpt_id + '">' + response[i].dpt_name + '</option>';
					                }
					               $('#editDeptId').append(options);     
					             });
					          });	
						 
					$('#editDeptId').change(	            
							function() {
					           var dptId = $('#editDeptId option:selected').val();		       
							    $('#editProjId').html(''); 
							    
					           $.getJSON("./getProjsJson/"+dptId,function(response){
					                var options = '<option selected disabled="disabled" value="0"> Select Projects </option>'; 
					                for(i=0;i<response.length;i++){
					                
					                   options += '<option value="' + response[i].proj_id + '">' + response[i].proj_name + '</option>';
					                }
					               $('#editProjId').append(options);     
					             });
					          });
		           
		           //** */
		         
		           
								/*  var userName=value.name;   
								 if(userName.trim() !== ""){
					                      $.getJSON("./getCorps/"+userName,function(response){
					                    	  var options = '';   
								                for(i=0;i<response.length;i++){
								                   options += '<option value="' + response[i].cg_id + '">' + response[i].corporate_name + '</option>';
								                }
								               $('#editCgId').append(options);     
								             });
					                  }
					                  else{
					                      var options = '';                 
					                       options += '<option selected value="0"> Select new Owner </option>';
					                      $('#edit_usr_id').append(options);   
					                  } */
		           
		           
		           
		           
		           $('#status').html('');  
		            if(response.status=="Active"){
		          	 var options = '';  
		          	  options += '<option selected value="Active"> Active </option>';
		          	  options += '<option  value="InActive"> InActive </option>';
		                $('#status').append(options); 
		           }
		           else{
		            var options = '';  
		         	  options += '<option  value="Active"> Active </option>';
		         	  options += '<option selected value="InActive"> InActive </option>';
		             $('#status').append(options); 
		           } 
		           
		          
		            $.getJSON("./getUsersToEdit",function(response){
		            	
		                  var options = '';   
		                  for(i=0;i<response.length;i++){
		                     options += '<option value="' + response[i].usr_id + '">' + response[i].usr_name + '</option>';
		                  }
		                 $('#editUserId').append(options);     
		               });  
		         });         
		   }
		</script>

	</body>

</html>