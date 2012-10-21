<html>
<head>
    <title>ObjectLedge Security Demo</title>
    <link rel="stylesheet" href="lib/dijit/themes/claro/document.css">
    <link rel="stylesheet" href="lib/dijit/themes/claro/claro.css">
    <style>
    #appLayout {
    	height: 100%;
    	margin: 0 auto;
	}
	html {
		margin: 0px;
	}
	html, body, #mainDiv {
    width: 100%; height: 100%;
    border: 0; padding: 0; margin: 0;
	}
    </style>
    <script data-dojo-config="async : true , parseOnLoad : true" src="lib/dojo/dojo.js"></script>
    <script type="text/javascript">
       require(["dojo/parser",
        		"dijit/form/Button",
        		"dijit/form/Form",
        		"dijit/form/TextBox"
        		]);
    </script>
</head>
<body class="claro">
<div id="appLayout">
	<form data-dojo-type="dijit/form/Form" id="myForm" name="loginform" data-dojo-id="myForm" action="" method="post">
		<label for="username">Username</label>
		<input type="text" name="username" value="username"
    data-dojo-type="dijit/form/TextBox"
    data-dojo-props="trim:true, propercase:true" id="username" />

    <label for="password">Password</label>
	<input type="password" name="password" value=""
    data-dojo-type="dijit/form/TextBox"
    data-dojo-props="trim:true, propercase:true" id="password"/>
	<button data-dojo-type="dijit/form/Button" type="submit">Login</button>
</form>
</div>

</body>
</html>