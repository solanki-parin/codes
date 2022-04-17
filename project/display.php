<html>
    <head>
        <title>project</title>
    </head>
<style>
body
{
    background-image:url('image2.png');
    background-size:cover;
}        
h1
{
    color:blue;
    font-size:40;
}
table
{
    font-size:20;
    
}   
.grey
{
    background-color:#b1b2b3;
    color:white;
}
.de
{
    background-color:red;
    color:white;
    
}
.delink
{
    text-decoration:none;
    background-color:red;
    color:white;
}
.up
{
    text-decoration:none;
    background-color:green;
    color:white;
}
</style>
<?php
$db=mysqli_connect("localhost","root","","project");
$sel="SELECT * FROM `data`";
$res=mysqli_query($db,$sel);
?>
<body>
<center>
<h1>User Details</h1>
<table cellpadding="7px" > 
<tr>
    <th class="grey">First name</th>
    <th>Last name</th>
    <th class="grey">User name</th>
    <th>Contact</th>
    <th class="grey">Email</th>
    <th>Gender</th>
    <th class="grey">City</th>
    <th>Education</th>
    <th class="grey">Address</th>
    <th class="de">Delete</th>
    <th class="up">Update</th>
</tr>
<tr>
    
<?php while($data=mysqli_fetch_assoc($res)) 
{ ?>
<?php $id=$data['id']; ?>
<tr>
    <td class="grey"><?php echo $data['firstname'] ?></td>
    <td><?php echo $data['lastname'] ?></td>
    <td class="grey"><?php echo $data['username'] ?></td>
    <td><?php echo $data['contact'] ?></td>
    <td class="grey"><?php echo $data['email'] ?></td>
    <td><?php echo $data['gender'] ?></td>
    <td class="grey"><?php echo $data['city'] ?></td>
    <td><?php echo $data['education'] ?></td>
    <td class="grey"><?php echo $data['address'] ?></td>
    <td class='delink'><a href="delete.php?id=<?php echo $id;?>" class='delink'>Delete</a></td>
    <td class="up"><a href="updateform.php?id=<?php echo $id;?>" class="up">Update</a></td>
</tr>
<?php } ?>
</tr>
</table>
</body>
</center>
</html>