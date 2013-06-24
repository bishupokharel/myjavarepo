
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title><tiles:getAsString name="title" /> - Master Project</title>
</head>
<body>
	<div id="wrapper">

		<tiles:insertAttribute name="header" flush="false" ignore="false" />
		<div id="mbody" style="min-height: 500px">
			<div id="main_content">
				<tiles:insertAttribute name="maincontent" flush="false"
					ignore="false" />
			</div>
		</div>
		<tiles:insertAttribute name="footer" flush="false" ignore="false" />
	</div>

</body>


