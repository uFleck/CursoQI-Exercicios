<?php

	include '../model/hotel.class.php';

	$hotel = new Hotel();

	echo "<h1>Daily Rate: $ {$hotel->calculateDaily($_POST['inputweekend'], $_POST['inputchildren'], $_POST['inputdays'])}</h1>";
