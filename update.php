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
    <th>delete</th>
    <th>update</th>
    
</tr>
<?php while($data=mysqli_fetch_assoc($res)) 
{ ?>
<?php
$id=$data['id'];
?>
<tr>
    <td><?php echo $data['id'] ?></td>
    <td><?php echo $data['name'] ?></td>
    <td><?php echo $data['email'] ?></td>
    <td><?php echo $data['contact'] ?></td>
    <td><a href="updatedel.php?id=<?php echo $id;?>">delete</a></td>
    <td><a href="updateqeury.php?id=<?php echo $id;?>">update</a></td>
</tr>
<?php } ?>
</table>
</body>
</html>