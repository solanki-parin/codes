<html><!--comment-->
<head>
<title>form</title>
<style>
body
{
	background-image: linear-gradient(#48fab6,#48f7fa,#486ffa,#9831f7);
}
.c1{
padding-top:5px;
padding-bottom:5px;
border-radius:10px;
border-color:black;

}
.c2{
padding-top:5px;
padding-bottom:5px;
border-radius:10px;
border-color:black;
height:50px;


}
.td{
color:white;
border:2px solid #2febf5;
background-color:#2febf5;	
border-radius:10px;
padding:2px;
text-align:center;

}
.su
{
	border:none;
	border-radius:10px;
	padding:5px;
	padding-left:10px;
	padding-right:10px;
	color:white;
	background-color:blue;
	
}
h1{
padding-top:10px;
margin-top:45px;
}
div{
background-color:white;
height:550px;
width:380px;
border-radius:40px;

}
</style>
</head>
<body>
<center>
<div>
<h1>Registration Form</h1>
<table cellspacing="10px">
<form name="f1" method="post" >
	
	<tr>
		<td class="td"><label>First Name</label></td>
		<td><input type="text" name="fname" placeholder="enter first name" class="c1"></td>
	</tr>
	<tr>
		<td class="td"><label>Last Name</label></td>
		<td><input type="text" name="lname" placeholder="enter last name" class="c1"></td>
	</tr>
	<tr>
		<td class="td"><label>User Name</label></td>
		<td><input type="text" name="name" placeholder="enter user name" class="c1"></td>
	</tr>
	<tr>
		<td class="td"><label>Contact</label></td>
		<td><input type="text" name="contact" placeholder="enter contact no" class="c1"></td>
	</tr>
	<tr>
		<td class="td"><label>E-mail</label></td>
		<td><input type="email" name="email" placeholder="enter email" class="c1"></td>
	</tr>
	<tr>
		<td class="td"><label>Password</label></td>
		<td><input type="password" name="pass" placeholder="enter password" class="c1"></td>
	</tr>
	<tr>
		<td class="td"><label>Gender</label></td>
		<td><input type="radio" name="gender" value="male">Male
		<input type="radio" name="gender" value="female">Female
		</td>
	</tr>
	<tr>
		<td class="td"><label>City</label></td>
		<td>
		<select name="city">
		<option>rajkot</option>
		<option>vadodra</option>
		<option>ahemdabad</option>
		<option>junagadh</option>
		</select>
		</td>
	</tr>
	<tr>
		<td class="td"><label>Education</label></td>
		<td><input type="text" name="edu" placeholder="enter education" class="c1"></td>
	</tr>
	<tr>
		<td class="td"><label >Address</label></td>
		<td><input type="text" name="address" placeholder="enter address" class="c2"></td>
	</tr>
	<tr>
		<td><input type="submit" name="submit" class="su"></td>
		<td><input type="reset" name="submit" class="su"></td>
	</tr>

</form>
</table>
</div>
<?php
$db=mysqli_connect("localhost","root","","project");
if(isset($_POST['submit']))
{
	$fn=$_REQUEST['fname'];
	$ln=$_REQUEST['lname'];
	$un=$_REQUEST['name'];
	$cn=$_REQUEST['contact'];
	$em=$_REQUEST['email'];
	$pas=$_REQUEST['pass'];
	$pass=md5($pas);
	$gn=$_REQUEST['gender'];
	$ct=$_REQUEST['city'];
	$ed=$_REQUEST['edu'];
	$add=$_REQUEST['address'];

$ins="INSERT INTO `data`(`firstname`,`lastname`,`username`,`contact`,`email`,`password`,`gender`,`city`,`education`,`address`) VALUES('$fn','$ln','$un','$cn','$em','$pass','$gn','$ct','$ed','$add')";
$res=mysqli_query($db,$ins);
header("location:display.php");

}

?>
</center>
</body>
</html>