<html>
<head>
<title></title>
<body>
<table>
<form name="f1"> 
Name:
<input type="text" name="name">
<br>

contact:
<input type="text" name="contact">
<br>

e-mail:
<input type="email" name="email">
<br>

gender:
<input type="radio" name="gender">male
<input type="radio" name="gender">female
<br>

city:
<select name="city">
<option>rajkot
<option>ahemdabad
<option>vadodra
</select>
<br>
Address:<br>
<textarea name="address">
</textarea>
<input type="submit">
</form>


</table>
<?php
$f1=$_GET["name"];
print_r($f1);
?>
</body>
</head>
</html>