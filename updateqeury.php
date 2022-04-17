<?php
$db=mysqli_connect("localhost","root","","first");
$id=$_REQUEST['id'];
$sel="SELECT * FROM `data` WHERE `id`='$id'";
$res=mysqli_query($db,$sel);
$data=mysqli_fetch_assoc($res);
?>
<html>
<head>
    <title>update form</title>
</head>
<body>
<h1>Registration Form</h1>
<table cellspacing="10px">
<form name="f1" method="post" >
	
	<tr>
		<td><label>Name</label></td>
		<td><input type="text" name="name" value="<?php echo $data['name']; ?>" placeholder="enter name" class="c1"></td>
	</tr>
	<tr>
		<td><label>Contact</label></td>
		<td><input type="text" name="contact" value="<?php echo $data['contact']; ?>" placeholder="enter contact no" class="c1"></td>
	</tr>
	<tr>
		<td><label>E-mail</label></td>
		<td><input type="email" name="email" value="<?php echo $data['email']; ?>" placeholder="enter email" class="c1"></td>
	</tr>
	
		<td><input type="submit" name="submit" class="su"></td>
		<td><input type="reset" class="su"></td>
	</tr>

</form>
</table>
</body>
</html>
<?php

if(isset($_POST['submit']))
{
    $nm=$_REQUEST['name'];
	$em=$_REQUEST['email'];
	$cn=$_REQUEST['contact'];

    $update="UPDATE `data` SET `name`='$nm',`email`='$em',`contact`='$cn' WHERE `id`='$id'";
    $que=mysqli_query($db,$update);
    if($que==TRUE)
    {
        header("location:update.php");
    }
    else
    {
        echo "no";
    }
}
?>