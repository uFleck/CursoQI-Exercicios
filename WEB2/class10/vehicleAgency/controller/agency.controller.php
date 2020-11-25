<?php

	include '../model/agency.class.php';

	$agency = new Agency();

	$agency->setDailyQuantities(3);
	$agency->setFuelType(1);
	$agency->setRentalPrice(135);
	$agency->setVehicle("EcoSport");
	$agency->setVehicleType(1);

	echo 
		"<h1>Selected car: {$agency->getVehicle()}</h1>".
		"<h1>Daily total: {$agency->calculateDaily()}</h1>".
		"<h1>Vehicle type tariff: {$agency->selectVehicle()}</h1>".
		"<h1>Total payable {$agency->calculateTotal()}</h1>";