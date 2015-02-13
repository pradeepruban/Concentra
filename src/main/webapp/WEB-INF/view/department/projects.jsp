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

			<!-- User info -->
			
			
			<!-- end user info -->

			<!-- NAVIGATION : This navigation is also responsive-->
			<nav>
				<ul>
				
					<li>
						<a href="dashboardDeparment" title="DashBoard"><i class="fa fa-lg fa-fw fa-home"></i> <span class="menu-item-parent">DashBoard</span></a>
					</li>
					
					<li class="active">
						<a href="projects"><i class="fa fa-stack-overflow"></i> <span class="menu-item-parent">Projects</span></a>
					</li>	
					<li>
						<a href="templateList" title="templateList"><i class="fa  fa-group"></i> <span class="menu-item-parent">Template List</span></a>
					</li>	
				<!-- 	<li >
						<a href="#"><i class="fa fa-lg fa-fw fa-filter"></i> <span class="menu-item-parent">Map Users</span></a>
					</li> -->
					<!-- <li>
						<a href="#"><i class="fa fa-lg fa-fw fa-calendar"></i> <span class="menu-item-parent">Service Catalog creation</span></a>
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
					</li> -->
						<li>
					<a href="#"><i class="fa fa-lg fa-fw fa-cogs"></i> <span class="menu-item-parent"> Quota</span></a>			
					</li>
					
					<!-- 	
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
           <!-- breadcrumb -->
            <ol class="breadcrumb">
             		<li>Home</li><li>Projects</li>
            </ol>
            <!-- end breadcrumb -->
        </div>
        <!-- END RIBBON -->
		<!-- END NAVIGATION -->

	<!-- 	<!-- MAIN PANEL -->
	<!-- 	<div id="main" role="main"> -->

		<%-- 	<!-- RIBBON -->
			<div id="ribbon">

				<span class="ribbon-button-alignment"> 
					<span id="refresh" class="btn btn-ribbon" data-action="resetWidgets" data-title="refresh"  rel="tooltip" data-placement="bottom" data-original-title="<i class='text-warning fa fa-warning'></i> Warning! This will reset all your widget settings." data-html="true">
						<i class="fa fa-refresh"></i>
					</span> 
				</span>

				<!-- breadcrumb -->
				<ol class="breadcrumb">
					<li>Home</li><li>Projects<</li>
				</ol>
				<!-- end breadcrumb -->

			</div>
			<!-- END RIBBON --> --%>

			<!-- MAIN CONTENT -->
			<div id="content">

     
		
				<!-- widget grid -->
				<section id="widget-grid" class="">
				
					<!-- row -->
					<div class="row">
					
				<!-- 		<div class="row">
                       <div class="alert alert-success">
							<div class="row">
							   <div class="col-md-6">
								
								</div>
												
									<div class="col-sm-5">
										<a data-toggle="modal" href="#myModal" class="btn btn-success txt-color-white pull-right ">
											<i class="fa fa-circle-arrow-up fa-lg"></i>
											Add Project
										</a>
		
									</div>
								</div>
							</div>
	              	</div> -->
	              	
	              	   
                     <div class="pull-right" style="padding-right: 1%;">
							 <a data-toggle="modal" href="#myModal"  class="btn btn-success txt-color-white pull-right  ">
                                            <i class="fa fa-circle-arrow-up fa-lg"></i>
                                           Add Project
                                        </a>   
							<br><br>
						</div>
	              	
	              	
	              	 <div class="modal fade" id="myModal1" tabindex="-1" role="dialog">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                   <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                    &times;
                                    </button>
                                    <h4 class="modal-title">
                                        Edit Projects
                                    </h4>
                                </div>
                                <div class="modal-body no-padding">
                                    <form  action ="editProjectDetails" id="edit-proj-form" class="smart-form" method="POST">
                                   
                                    <input type="hidden" id="editprojId" name="proj_id" value="">
                                            <fieldset>
                                                <section>
                                                    <div class="row">
                                                            <label class="label col col-2">Project Name</label>
                                                                <div class="col col-10">
                                                                        <label class="input"> 
                                                                            <input type="text" name="proj_name" id="edit_proj_name">
                                                                        </label>
                                                                </div>
                                                    </div>                                   
                                                </section>
                                                <section>
                                                    <div class="row">
                                                            <label class="label col col-2">Project Description</label>
                                                                <div class="col col-10">
                                                                    <label class="input"> 
                                                                        <input type="text" name="proj_desc" id="edit_proj_desc">
                                                                    </label>
                                                                   
                                                                </div>
                                                    </div>
                                                </section>
                                                
                                                
                                                <section>
                                                    <div class="row">
                                                        <label class="label col col-2">Select New Owner</label>
                                                                <div class="col col-10">
                                                                    <label class="input">
                                                                        <select class="form-control" id="edit_usr_id" name="usr_id">
                                                                    </select> 
                                                                    </label>                                                               
                                                                </div>
                                                     </div>
                                                </section>    
                                                
                                                
                                                
                                                                                                                                             
                                               </fieldset>                                   
                                               <footer>
                                                    <button type="submit" class="btn btn-primary">
                                                    Save Changes
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
												Add New Project
											</h4>
										</div>
										<div class="modal-body no-padding">
											<form  id="addForm" action="addProject" name ="addForm" class="smart-form" method="post">
											
										
													<fieldset>
													
															<section>
																<div class="row">
																	<label class="label col col-2">Name</label>
																	<div class="col col-10">
																		<label class="input"> 
																			<input type="text" name="proj_name">
																		</label>
																	</div>
																</div>
														</section>
														  <section>
															<div class="row">
																<label class="label col col-2">Project Description</label>
																<div class="col col-10">
																	<label class="input"> 
																		<input type="text" name="proj_desc">
																	</label>
																	
																</div>
															</div>
														</section>
														
														<section>
                                                    <div class="row">
                                                        <label class="label col col-2">Select  Owner</label>
                                                                <div class="col col-10">
                                                                    <label class="input">
                                                                        <select class="form-control" id="usr_id" name="usr_id">
                                                                        
                                                                        <option value="0" selected="selected" disabled="disabled">Select owner</option>
                                                                        
                                                                    </select> 
                                                                    </label>                                                               
                                                                </div>
                                                     </div>
                                                </section>    
														
					
										        </fieldset>
										
												<footer>
													<button type="submit"  class="btn btn-primary">
														Add Project
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
				
				<form name ="editForm" >
				
				<input type="hidden"  name="proj_id" id="proj_id"/>
							<!-- Widget ID (each widget will need unique ID)-->
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
									<h2>Project List </h2>
				
								</header>
				
								<!-- widget div-->
								<div>
				
									<!-- widget edit box -->
									<div class="jarviswidget-editbox">
										<!-- This area used as dropdown edit box -->
				
									</div>
									<!-- end widget edit box -->
				
									<!-- widget content -->
									<div class="widget-body no-padding">
				
										<table id="dt_basic" class="table table-striped table-bordered table-hover" width="100%">
									     <thead>			                
												<tr>
													<th data-class="expand"><i class="fa fa-fw fa-user text-muted hidden-md hidden-sm hidden-xs"></i>Project Name</th>
													<th data-hide="phone" > Project Description</th>	
													 <th>Status</th>
													 <th>Owner</th>
													
													<th data-hide="phone,tablet"><i class="fa fa-fw fa-map-marker txt-color-blue hidden-md hidden-sm hidden-xs"></i>Actions</th> 					
									
												</tr>
											</thead>
											<tbody>
												
												
		                                          <c:forEach items="${prolist}" var="project">
                                                      <tr >
														 <td style="padding-left: 30px;">${project.proj_name}</td>
														 <td style="padding-left: 30px;">${project.proj_desc}</td>
	
														 <c:set var="status" value="${project.status}"/> 
		 												<td style="padding-left: 10px;">
													<c:choose>
   														 <c:when test="${ status=='Active'}">
     													 <span class="label label-success">Active</span>
    													</c:when>
    												<c:otherwise>
        											<span class="label label-danger">InActive</span>
    												</c:otherwise>
   													</c:choose>	 
   													 </td>
   													 <td style="padding-left: 30px;">${project.owner}</td>
        								          <td  style="padding-left: 3%;">
        								   
        								      <a title="edit"  id ="${project.proj_id}" name ="${project.owner}"  onclick="getRow(this);" href="#myModal1" data-toggle="modal"><i class="fa fa-pencil"></i></a>
                                                    
                                                           
                                                             <a title="delete" href="#myModal${project.proj_id}" role="button" data-toggle="modal"><i class="fa fa-trash-o"></i></a>
                                                          
                                                         
        
      									  <div class="modal small fade" id="myModal${project.proj_id}" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      												<div class="modal-dialog">
       											  <div class="modal-content">
          											 <div class="modal-header">
					
															<h4 class="modal-title">
															Delete Project confirmations !
															</h4>
														</div>
          										<div class="modal-body">
           											 <p><i class="fa fa-warning"></i>Are you sure you want to delete the Project : ${project.proj_name} ?  <br>This cannot be undone.</p>
         											 </div>
            									<div class="modal-footer">
            									<button class="btn btn-default" data-dismiss="modal" >Cancel</button>
           										<button class="btn btn-danger" onclick="deleteProject(this);" id="${project.proj_id}">Delete</button>
           										 </div>
         									 </div>
       										 </div>
     									</div>
        
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
				
					</div>
				
					<!-- end row -->
				
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
			
			
			 
	          // Validation
	                $("#edit-proj-form").validate({
	                    // Rules for form validation
	                    rules : {
	                        proj_name : {
	                            required : true
	                        },
	                        proj_desc : {
	                            required : true
	                        },                   
	                        usr_id : {
	                            required : true
	                        }
	                    },

	                    // Messages for form validation
	                    messages : {
	                    	proj_name : {
	                            required : 'Please enter your project name'
	                        },   
	                        proj_desc : {
	                            required : 'Please select your project description'
	                        },                       
	                        usr_id : {
	                            required : 'Please select owner'
	                        }
	                       
	                    },

	                    // Ajax form submition
	                    submitHandler : function(form) {
	                        $(form).ajaxSubmit({
	                            success : function() {
	                                $("#edit-proj-form").addClass('submited');
	                            }
	                        });
	                    },
	                // Do not change code below
	                    errorPlacement : function(error, element) {
	                        error.insertAfter(element.parent());
	                    }
	                });
	           
	                
	  	          // Validation
	  	                $("#addForm").validate({
	  	                    // Rules for form validation
	  	                    rules : {
	  	                        proj_name : {
	  	                            required : true
	  	                        },
	  	                        proj_desc : {
	  	                            required : true
	  	                        },                   
	  	                        usr_id : {
	  	                            required : true
	  	                        }
	  	                    },

	  	                    // Messages for form validation
	  	                    messages : {
	  	                    	proj_name : {
	  	                            required : 'Please enter your project name'
	  	                        },   
	  	                        proj_desc : {
	  	                            required : 'Please select your project description'
	  	                        },                       
	  	                        usr_id : {
	  	                            required : 'Please select owner'
	  	                        }
	  	                       
	  	                    },

	  	                    // Ajax form submition
	  	                    submitHandler : function(form) {
	  	                        $(form).ajaxSubmit({
	  	                            success : function() {
	  	                                $("#addForm").addClass('submited');
	  	                            }
	  	                        });
	  	                    },
	  	                // Do not change code below
	  	                    errorPlacement : function(error, element) {
	  	                        error.insertAfter(element.parent());
	  	                    }
	  	                });
	          
	                
			
			
			
			
			 $.getJSON("./getDeptUsersList",function(response){
                 var options = '';   
                 for(i=0;i<response.length;i++){
                    options += '<option value="' + response[i].usr_id + '">' + response[i].usr_name + '</option>';
                 }
                $('#usr_id').append(options);     
              });  
			/* $.getJSON("./getDeptUsers",function(response){
                var options = '';   
                for(i=0;i<response.length;i++){
                   options += '<option value="' + response[i].usr_id + '">' + response[i].usr_name + '</option>';
                }
               $('#usr_id').append(options);     
             });  
			 */
			/* // DOM Position key index //
		
			l - Length changing (dropdown)
			f - Filtering input (search)
			t - The Table! (datatable)
			i - Information (records)
			p - Pagination (paging)
			r - pRocessing 
			< and > - div elements
			<"#id" and > - div with an id
			<"class" and > - div with a class
			<"#id.class" and > - div with an id and class
			
			Also see: http://legacy.datatables.net/usage/features
			*/	
	
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
			
			
			/* For edit and delete popup */
			
			
			
				
			
			
			
			
			
			
		})

		</script>
		
		
		
		<script type="text/javascript">
		
		function deleteDepartment(department){
	           var id=department.id;
	           var name=department.name;
	           $('#dept').text(name);
	           $('#deptId').val(id);
	           $('#dialog_simple').dialog('open');
	            return false;      
	       }
	      
	       function getRow(value){
	    	  
	          var projId=value.id;
	         
	          $('#editprojId').val(projId);
	          var userName=value.name;

	          $.getJSON("./getProject/"+projId,function(response){
	                 $('#edit_proj_name').val(response.proj_name);
	                 $('#edit_proj_desc').val(response.proj_desc);
	                  $('#edit_usr_id').html('');
	                  if(userName.trim() !== ""){
	                      $.getJSON("./getOwnersofProject/"+userName,function(response){
	                              var options = '';                 
	                                 options += '<option selected value="' + response.usr_id + '">' + response.usr_name + '</option>';
	                                 $('#edit_usr_id').append(options); 
	                                 
	            
	                           });
	                  }
	                  else{
	                      var options = '';                 
	                       options += '<option selected value="0"> Select new Owner </option>';
	                      $('#edit_usr_id').append(options);   
	                  }
	                  
	                  
	                  $.getJSON("./getDeptUsersList",function(response){
	                      var options = '';   
	                      for(i=0;i<response.length;i++){
	                         options += '<option value="' + response[i].usr_id + '">' + response[i].usr_name + '</option>';
	                      }
	                     $('#edit_usr_id').append(options);     
	                   });  
	               });         
	         
	          
	       
	       }
	
	
		
		
		</script>
		
		
		
		<script>
	
function deletedf(){
	alter(1);
	    
}
	
	
	function addProject()
	{
		
		document.addForm.action = "./addProject";
	   	document.addForm.submit();
	}
	
	function deleteProject(value){

		    var proj_id=value.id;
			document.getElementById('proj_id').value = proj_id;
			
			document.editForm.action = "./deleteProject";
		   	document.editForm.submit();
	}
	
	/* function editProject(value){
		
		    var proj_id=value.id;
		    alert(proj_id);
			document.getElementById('proj_id').value = proj_id;
			document.editForm.action = "./editProjectList";
		   	document.editForm.submit();
	} */
	
	
	
	/* function updateProjectList()
	{
	document.edit-proj-form.action="./editProjectDetails";
	document.edit-proj-form.submit();
	}
 */

	
	
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