<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en-us">
	<head>
		<meta charset="utf-8">
		<!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->

		<title> ISAP User KeyPair List</title>
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
	
	<!--

	TABLE OF CONTENTS.
	
	Use search to find needed section.
	
	===================================================================
	
	|  01. #CSS Links                |  all CSS links and file paths  |
	|  02. #FAVICONS                 |  Favicon links and file paths  |
	|  03. #GOOGLE FONT              |  Google font link              |
	|  04. #APP SCREEN / ICONS       |  app icons, screen backdrops   |
	|  05. #BODY                     |  body tag                      |
	|  06. #HEADER                   |  header tag                    |
	|  07. #PROJECTS                 |  project lists                 |
	|  08. #TOGGLE LAYOUT BUTTONS    |  layout buttons and actions    |
	|  09. #MOBILE                   |  mobile view dropdown          |
	|  10. #SEARCH                   |  search field                  |
	|  11. #NAVIGATION               |  left panel & navigation       |
	|  12. #RIGHT PANEL              |  right panel userlist          |
	|  13. #MAIN PANEL               |  main panel                    |
	|  14. #MAIN CONTENT             |  content holder                |
	|  15. #PAGE FOOTER              |  page footer                   |
	|  16. #SHORTCUT AREA            |  dropdown shortcuts area       |
	|  17. #PLUGINS                  |  all scripts and plugins       |
	
	===================================================================
	
	-->
	
	<!-- #BODY -->
	<!-- Possible Classes

		* 'smart-style-{SKIN#}'
		* 'smart-rtl'         - Switch theme mode to RTL
		* 'menu-on-top'       - Switch to top navigation (no DOM change required)
		* 'no-menu'			  - Hides the menu completely
		* 'hidden-menu'       - Hides the main menu but still accessable by hovering over left edge
		* 'fixed-header'      - Fixes the header
		* 'fixed-navigation'  - Fixes the main menu
		* 'fixed-ribbon'      - Fixes breadcrumb
		* 'fixed-page-footer' - Fixes footer
		* 'container'         - boxed layout mode (non-responsive: will not work with fixed-navigation & fixed-ribbon)
	-->


   <%@ include file="/SesssionFilter.jsp" %>
   
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
                                margin: 10px 0px 0px;" href="./logOut.jsp" title="Sign Out" data-action="userLogout" 
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
					<li >
						<a href="#"><i class="fa fa-lg fa-fw fa-windows"></i> <span class="menu-item-parent">Provision VM</span></a>
						<ul>
							<li >
								<a href="stackTenantUser">Stack Service </a>
							</li>
								<li>
								<a href="bespokeTenantUser">Bespoke Service </a>
							</li>
							<li>
								<a  href="customLaunch">Custom Service </a>
							</li>
						</ul>
					</li>
					
					<li >
						<a href="customUserServiceList" title="Custom Service List"><i class="fa fa-lg fa-fw fa-filter"></i> <span class="menu-item-parent">Service List</span></a>
					</li>
					
					<li class="active">
						<a href="userKeyPairList" title="KeyPair"><i class="fa fa-lg fa-fw fa-key"></i> <span class="menu-item-parent">KeyPair List</span></a>
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
					<%-- <span id="refresh" class="btn btn-ribbon" data-action="resetWidgets" data-title="refresh"  rel="tooltip" data-placement="bottom" data-original-title="<i class='text-warning fa fa-warning'></i> Warning! This will reset all your widget settings." data-html="true">
						<i class="fa fa-refresh"></i>
					</span>  --%>
				</span>
				<!-- breadcrumb -->
				<ol class="breadcrumb">
					<li>Home</li><li>KeyPair List</li>
				</ol>
			</div>
			<!-- END RIBBON -->

			<!-- MAIN CONTENT -->
			<div id="content">

     
		
				<!-- widget grid -->
				<section id="widget-grid" class="">
				
					<!-- row -->
					<div class="row">
					
				     <div class="pull-right" style="padding-right: 1%;">
							 <a data-toggle="modal" href="#myModal"  class="btn btn-success txt-color-white pull-right  ">
                                            <i class="fa fa-key"></i>
                                            Create KeyPair
                                        </a>   
							<br><br>
						</div>
				
				
				
				       <form name="keypair" id="keypair">
				<input type="hidden" name="keyId" id="keyId" value="">
						<!-- NEW WIDGET START -->
						<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
				
							<!-- Widget ID (each widget will need unique ID)-->
							<div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="true" data-widget-sortable="false">
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
									<h2>KeyPair List </h2>
				
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
									
													<th data-class="expand" >  <i class="fa fa-key"></i>KeyPair Name</th>	
													 <th data-hide="phone,tablet">Created On</th>												
									                <th data-hide="phone,tablet" colspan="1">Actions</th>	
												</tr>
											</thead>
											<tbody>
											<c:forEach items="${keyPairList}" var="keyList">
											<tr>
									
			        								<td>${keyList.name}</td>
													<td>${keyList.created_at}</td>
													
													<td width="30%">   
													
													
													<a class="btn bg-color-redLight txt-color-white" href="javascript:void(0);">  <i class="fa fa-trash-o"></i>    Delete KeyPair  </a>
							&nbsp;
							                        <a class="btn bg-color-blueLight txt-color-white" href="javascript:void(0);" id="${keyList.identity_id}" onclick="downloadkeyPair(this.id)"> <i class="fa fa-download"></i>     Download KeyPair  </a>
													
													
													   
													<!-- 	<div class="btn-group">
															<button class="btn btn-primary btn-sm dropdown-toggle" data-toggle="dropdown">
																More <span class="caret"></span>
															</button>
															<ul class="dropdown-menu">
																<li>
																	<a href="javascript:void(0);">Download KeyPair</a>
																</li>
																<li>
																	<a href="javascript:void(0);">Delete KeyPair</a>
																</li>
																
															</ul>
														</div> -->
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
				
				
						</article>
						<!-- WIDGET END -->
				</form>
					</div>
				
					<!-- end row -->
				
					<!-- end row -->
				
				</section>
				<!-- end widget grid -->

			</div>
			<!-- END MAIN CONTENT -->

        
                    <div class="modal fade" id="myModal" tabindex="-1" role="dialog">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                   <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                    &times;
                                    </button>
                                    <h4 class="modal-title">
                                        Create KeyPair
                                    </h4>
                                </div>
                                <div class="modal-body no-padding">
                                    <form action="addKeyPair" id="keyPair-form" class="smart-form" method="POST">
                                            <fieldset>
                                                <section>
                                                    <div class="row">
                                                            <label class="label col col-2">KeyPair Name</label>
                                                                <div class="col col-10">
                                                                        <label class="input"> 
                                                                            <input type="text" name="name" id="name">
                                                                        </label>
                                                                </div>
                                                                
                                                    </div>  
                                                    
                                                   <div class="row">
                                                   <label class="label col col-6"><span id="message"></span> </label>
                                                      </div>  
                                                                                     
                                                </section>
                                           </fieldset>                                   
                                               <footer>
                                                    <button id="keyPairButton" type="submit" class="btn btn-primary">
                                                    Save
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
		     $("#name").change(function(){
		    	 $("#message").html('<img src="img/discoverImage.GIF" align="absmiddle">&nbsp;Checking availability...');
             
 
              var name=$("#name").val().trim();
              
              if(name.length>0)
              {
            	  $.ajax({
                      type:"post",
                      url:"./checkKeyPair",
                      data:"name="+name,
                          success:function(data){
                          if(data==0){
                              $("#message").html(" <font color='green'> <b>KeyPair available </b> </font> ");
                          }
                          else{
                              $("#message").html("  <font color='red'> <b style=''> KeyPair already taken <b> </font>  ");
                              $("#name").val('');
                          }
                      }
                   });
   
              }
              else{
                  $("#message").html("");         	  
              }
             
            });
			
			$("#keyPairButton").click(function () {
				var name= $('#name').val();  
				 $.ajax({
				    	//actual ajax call
				        url: $('#keyPairButton').attr( "action"),
				        data : "name=" + name ,
				        type: "POST",
				        success: function(response) {
				        	 window.location.href = "./userKeyPairList";				                
				        },
				        error : function(xhr, textStatus, error) {        	
				        	setInterval(ajaxCall, 5000);		        	  
				        }
				    });			
			});
			 
	          // Validation
	                $("#keyPair-form").validate({
	                    // Rules for form validation
	                    rules : {
	                        name : {
	                            required : true
	                        },                      
	                    },
	                    // Messages for form validation
	                    messages : {
	                        name : {
	                            required : 'Please enter your keypair name'
	                        }	                       
	                    },
	                    // Ajax form submition
	                    submitHandler : function(form) {
	                        $(form).ajaxSubmit({
	                            success : function() {
	                                $("#keyPair-form").addClass('submited');
	                            }
	                        });
	                    },
	                // Do not change code below
	                    errorPlacement : function(error, element) {
	                        error.insertAfter(element.parent());
	                    }
	                });
	           	
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
					"sDom": "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-12  hidden-xs'l>r>"+
						"t"+
						"<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",
					"autoWidth" : true,
					"bSort": true,
					    "sScrollY": "500px",
					    "oLanguage": {
				            "sEmptyTable": "No KeyPairs available"
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
			$("#ckbCheckAll").click(function () {
			        $(".checkBoxClass").prop('checked', $(this).prop('checked'));
			 });
				
		     $('.checkBoxClass').change(function () {
				        var check = ($('.checkBoxClass').filter(":checked").length == $('.checkBoxClass').length);
				        $('#ckbCheckAll').prop("checked", check);
			   });	
			$.root_.addClass("fixed-page-footer") 
			localStorage.setItem("sm-setmenu","top");		
		});
		</script>		
		<script>
		function ajaxCall(){
			 window.location.href = "./userKeyPairList";
		}
		
		function downloadkeyPair(IdentityId){			
			$("#keyId").val(IdentityId);
			 document.keypair.action = "./downloadkeyPair";
             document.keypair.submit();
		}
		</script>\
	</body>
</html>