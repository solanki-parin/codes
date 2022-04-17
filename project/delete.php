<?php
$db=mysqli_connect("localhost","root","","project");
$id=$_REQUEST['id'];
$del="DELETE FROM `data` WHERE `id`='$id'";
$delete=mysqli_query($db,$del);
header("location:display.php");

?>