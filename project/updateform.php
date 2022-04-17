<html><!--comment-->
<head>
<title>form</title>
<style>
body
{
	background-image: linear-gradient(red,orange,yellow,brown);
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
border:2px solid red;
background-color:red;	
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
	background-color:purple;
	
}
h1{
padding-top:10px;
margin-top:45px;
}
div{
background-color:white;
height:470px;
width:380px;
border-radius:40px;

}
</style>
</head>
<body>
<?php
$db=mysqli_connect("localhost","root","","project");
$id=$_REQUEST['id'];
$sel="SELECT * FROM `data` WHERE `id`='$id'";
$res=mysqli_query($db,$sel);
$data=mysqli_fetch_assoc($res);
?>
<center>
<div>
<h1>Update Form</h1>
<table cellspacing="10px">
<form name="f1" method="post" >
	
	<tr>
		<td class="td"><label>First Name</label></td>
		<td><input type="text" name="fname" value="<?php echo $data['firstname']; ?>" placeholder="enter first name" class="c1"></td>
	</tr>
	<tr>
		<td class="td"><label>Last Name</label></td>
		<td><input type="text" name="lname" value="<?php echo $data['lastname']; ?>" placeholder="enter last name" class="c1"></td>
	</tr>
	<tr>
		<td class="td"><label>User Name</label></td>
		<td><input type="text" name="name" value="<?php echo $data['username']; ?>" placeholder="enter user name" class="c1"></td>
	</tr>
	<tr>
		<td class="td"><label>Contact</label></td>
		<td><input type="text" name="contact" value="<?php echo $data['contact']; ?>" placeholder="enter contact no" class="c1"></td>
	</tr>
	<tr>
		<td class="td"><label>E-mail</label></td>
		<td><input type="email" name="email" value="<?php echo $data['email']; ?>" placeholder="enter email" class="c1"></td>
	</tr>
	<tr>
		<td class="td"><label>City</label></td>
		<td>
		<select name="city" value="<?php echo $data['city']; ?>">
		<option>rajkot</option>
		<option>vadodra</option>
		<option>ahemdabad</option>
		<option>junagadh</option>
		</select>
		</td>
	</tr>
	<tr>
		<td class="td"><label>Education</label></td>
		<td><input type="text" name="edu" value="<?php echo $data['education']; ?>" placeholder="enter education" class="c1"></td>
	</tr>
	<tr>
		<td class="td"><label >Address</label></td>
		<td><input type="text" name="address" value="<?php echo $data['address']; ?>" placeholder="enter address" class="c2"></td>
	</tr>
	<tr>
		<td><input type="submit" name="submit" class="su"></td>
		<td><input type="reset" name="submit" class="su"></td>
	</tr>

</form>
</table>
</div>
</center>
<?php

if(isset($_POST['submit']))
{
    $fn=$_REQUEST['fname'];
	$ln=$_REQUEST['lname'];
	$un=$_REQUEST['name'];
	$cn=$_REQUEST['contact'];
	$em=$_REQUEST['email'];
	$ct=$_REQUEST['city'];
	$ed=$_REQUEST['edu'];
	$add=$_REQUEST['address'];

    $update="UPDATE `data` SET `firstname`='$fn',`lastname`='$ln',`username`='$un',`contact`='$cn',`email`='$em',`city`='$ct',`education`='$ed',`address`='$add' WHERE `id`='$id'";
    $que=mysqli_query($db,$update);
    if($que==TRUE)
    {
        header("location:display.php");
    }
    else
    {
        echo "no";
    }
}
?>
</body>
</html>