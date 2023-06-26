<?php
	require '../vendor/autoload.php';
	$con = new MongoDB\Client('mongodb://localhost:27017');
	$db = $con->admin;
	$col = $db->Profile;
?>