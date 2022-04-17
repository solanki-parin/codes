<html>
<body>
<table cellspacing="10px">
<form name="f1" method="post" >
	
	<tr>
		<td><label>Name</label></td>
		<td><input type="text" name="name" placeholder="enter name" ></td>
	</tr>
	<tr>
		<td><label>Contact</label></td>
		<td><input type="text" name="contact" placeholder="enter contact no" ></td>
	</tr>
	<tr>
		<td><label>E-mail</label></td>
		<td><input type="email" name="email" placeholder="enter email" ></td>
	</tr>
	
		<td><input type="submit" name="submit"></td>
		<td><input type="reset" ></td>
	</tr>

</form>
</table>
</div>
</body>
</html>
<?php
$db=mysqli_connect("localhost","root","","first");
if(isset($_POST['submit']))
{
	$nm=$_REQUEST['name'];
	$em=$_REQUEST['email'];
	$cn=$_REQUEST['contact'];

	$insert="INSERT INTO `data`(`name`,`email`,`contact`) VALUES('$nm','$em','$cn')";
	$res=mysqli_query($db,$insert);
	if($res==TRUE)
	{
		echo "yes";
	}
	else{
		echo "no";
	}
}