<?php
$db=mysqli_connect("localhost","root","","first");
$sel="SELECT * FROM `data`";
$res=mysqli_query($db,$sel);
?>
<html>
    <head>
        <title>data base connection</title>
    </head>
<body>
<table align="center" border="1px">
<tr>
    <th>id</th>
    <th>name</th>
    <th>email</th>
    <th>contact</th>
</tr>
<?php while($data=mysqli_fetch_assoc($res)) 
{ ?>
<tr>
    <td><?php echo $data['id'] ?></td>
    <td><?php echo $data['name'] ?></td>
    <td><?php echo $data['email'] ?></td>
    <td><?php echo $data['contact'] ?></td>
</tr>
<?php } ?>
</table>
</body>
</html>