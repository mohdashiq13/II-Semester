<?php
	include 'DBCon.php';
	if(isset($_POST["submit"])){
		$name = $_POST["fname"];
		$email = $_POST["email"];
		$place = $_POST["place"];
		
		$doc = array("Full Name"=>$name,
					 "E-Mail"=>$email,
					 "Place"=>$place
					);
		$col->insertOne($doc);
		header("location:Registration.html");
	}
?>