<?php
	include '../model/ex08.class.php';

	$ex08 = new Ex08();

	$ex08->setName("Arroz");
	$ex08->setPrice(2.30);

	echo
		"Name: {$ex08->getName()}<br>".
		"Price: {$ex08->getPrice()}<br>".
		"Final Price: {$ex08->calculateFinalPrice()}";