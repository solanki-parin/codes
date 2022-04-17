<?php
$db=mysqli_connect("localhost","root","","first");
$id=$_REQUEST['id'];
$del="DELETE FROM `data` WHERE `id`='$id'";
$delete=mysqli_query($db,$del);
header("location:delquery.php");

?>