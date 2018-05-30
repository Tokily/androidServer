<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="../scripts/jquery-3.3.1.min.js"></script>
</head>
<body>
<input type="text">
<input type="button" value="提交">
</body>
<script>
$("input:last").click(
		function(){
			var url="/android/user/userPass"
				var data={
						key:$("input:first").val()
						};
				$.post(url,data,function(reString){
					alert(reString)
				});
		}
)
</script>
</html>