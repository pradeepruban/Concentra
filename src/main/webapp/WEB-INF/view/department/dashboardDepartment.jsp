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
				
					<li class="active">
						<a href="dashboardDeparment" title="DashBoard"><i class="fa fa-lg fa-fw fa-home"></i> <span class="menu-item-parent">DashBoard</span></a>
					</li>
					
					
				
					<li >
						<a href="projects"><i class="fa fa-stack-overflow"></i> <span class="menu-item-parent">Projects</span></a>
					</li>		
				<!-- 	<li >
						<a href="#"><i class="fa fa-lg fa-fw fa-filter"></i> <span class="menu-item-parent">Map Users</span></a>
					</li> -->
					<!-- <li>
						<a href="#"><i class="fa fa-lg fa-fw fa-calendar"></i> <span class="menu-item-parent">Service Catalog creation</span></a>
					</li> 
					<li>
						<a href="#"><i class="fa fa-lg fa-fw fa-filter"></i> <span class="menu-item-parent">Stack List</span></a>
					</li> -->
					
		           <!-- <li>
						<a href="#"><i class="fa fa-lg fa-fw fa-cogs"></i> <span class="menu-item-parent">Manage Services</span></a>
					</li>  -->
					
					<!-- <li>
						<a href="#"><i class="fa fa-stack-overflow"></i> <span class="menu-item-parent">Reports</span></a>
					</li> -->		
				<!-- 	
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
					
					
					</li> -->
					
					
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

				<!-- row -->
				<div class="row">
				
				</div>
				<!-- end row -->
				
				  <div class="row">
				  
					<div class="col-sm-12">
					
						<div class="well padding-10">
	
							<div class="row">
							 
	
								<div class="col-md-4 padding-left-0">
									<h3 class="margin-top-0">
									   <a href="javascript:void(0);"> Welcome,&nbsp;${userValue.usr_name} </a>
									 <!--   <a class="btn btn-primary pull-right" href="departmentList"> List / Add Department </a> -->
									   <br>
									</h3>
									
									<!-- <p>Order Your Enterprise Stack  <br><br>
                                        On-demand Cloud servers <br><br>
                                        Choose our bundle of servers with cluster, HA and ready made OS, appliance and configuration<br><br>
                                        Choose your Usage period <br><br>                    
									</p> -->
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
                    <span class="txt-color-white">ISAP- Syntel, Inc. &copy; 2014-2015</span>
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


        <!-- MAIN APP JS FILE -->
        <script src="js/app.min.js"></script>

    <!-- PAGE RELATED PLUGIN(S) -->
        <script src="js/plugin/datatables/jquery.dataTables.min.js"></script>
        <script src="js/plugin/datatables/dataTables.colVis.min.js"></script>
        <script src="js/plugin/datatables/dataTables.tableTools.min.js"></script>
        <script src="js/plugin/datatables/dataTables.bootstrap.min.js"></script>
        <script src="js/plugin/datatable-responsive/datatables.responsive.min.js"></script>
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
          var deptId=value.id;
          $('#editDeptId').val(deptId);
          var userName=value.name;

          $.getJSON("./getDepartment/"+deptId,function(response){
                 $('#edit_dpt_name').val(response.dpt_name);
                 $('#edit_dpt_desc').val(response.dpt_desc);
                  $('#edit_usr_id').html('');     
                 if(userName.trim() !== ""){
                     $.getJSON("./getOwners/"+userName,function(response){
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
                
                  $.getJSON("./getDeptUsers",function(response){
                        var options = '';   
                        for(i=0;i<response.length;i++){
                           options += '<option value="' + response[i].usr_id + '">' + response[i].usr_name + '</option>';
                        }
                       $('#edit_usr_id').append(options);     
                     });  
               });         
         }
      
        // DO NOT REMOVE : GLOBAL FUNCTIONS!
        $(document).ready(function() {
            pageSetUp();
            $.root_.addClass("fixed-page-footer") ;
            localStorage.setItem("sm-setmenu","top");
           
            $.getJSON("./getDeptUsers",function(response){
                var options = '';   
                for(i=0;i<response.length;i++){
                   options += '<option value="' + response[i].usr_id + '">' + response[i].usr_name + '</option>';
                }
               $('#usr_id').append(options);     
             });  
           
            /*
             * CONVERT DIALOG TITLE TO HTML
             * REF: http://stackoverflow.com/questions/14488774/using-html-in-a-dialogs-title-in-jquery-ui-1-10
             */
            $.widget("ui.dialog", $.extend({}, $.ui.dialog.prototype, {
                _title : function(title) {
                    if (!this.options.title) {
                        title.html("&#160;");
                    } else {
                        title.html(this.options.title);
                    }
                }
            }));
           
            /*
            * DIALOG SIMPLE
            */
       
            // Dialog click
            $('#dialog_link').click(function() {
                $('#dialog_simple').dialog('open');
                return false;
       
            });
       
            $('#dialog_simple').dialog({
                autoOpen : false,
                width : 600,
                resizable : false,
                modal : true,
                title : "<div class='widget-header'><h4><i class='fa fa-warning'></i> Delete Confirmation ?</h4></div>",
                buttons : [{
                    html : "<i class='fa fa-trash-o'></i>&nbsp; Delete department",
                    "class" : "btn btn-danger",
                    click : function() {
                        document.department.action = "./deleteDepartment";
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
       
             // Validation
            $("#edit-dept-form").validate({
                // Rules for form validation
                rules : {
                    dpt_name : {
                        required : true
                    },
                    dpt_desc : {
                        required : true
                    },                   
                    usr_id : {
                        required : true
                    }
                },

                // Messages for form validation
                messages : {
                    dpt_name : {
                        required : 'Please enter your department name'
                    },   
                    dpt_desc : {
                        required : 'Please select your department description'
                    },                       
                    usr_id : {
                        required : 'Please select owner'
                    }
                   
                },

                // Ajax form submition
                submitHandler : function(form) {
                    $(form).ajaxSubmit({
                        success : function() {
                            $("#edit-dept-form").addClass('submited');
                        }
                    });
                },
            // Do not change code below
                errorPlacement : function(error, element) {
                    error.insertAfter(element.parent());
                }
            });
       

           
          // Validation
                $("#dept-form").validate({
                    // Rules for form validation
                    rules : {
                        dpt_name : {
                            required : true
                        },
                        dpt_desc : {
                            required : true
                        },                   
                        usr_id : {
                            required : true
                        }
                    },

                    // Messages for form validation
                    messages : {
                        dpt_name : {
                            required : 'Please enter your department name'
                        },   
                        dpt_desc : {
                            required : 'Please select your department description'
                        },                       
                        usr_id : {
                            required : 'Please select owner'
                        }
                       
                    },

                    // Ajax form submition
                    submitHandler : function(form) {
                        $(form).ajaxSubmit({
                            success : function() {
                                $("#dept-form").addClass('submited');
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
                        "sScrollY": "420px",
                        "oLanguage": {
                            "sEmptyTable": "No Departments available"
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
        });
        </script>
    </body>
</html>