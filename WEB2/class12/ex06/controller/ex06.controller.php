<?php
	include '../model/ex06.class.php';

	$ex06 = new Ex06();
	$ex06->setYear(10);

	echo 
		"Years: {$ex06->getYear()}<br>".
		"Months: {$ex06->convertYearToMonths()}<br>".
		"Weeks: {$ex06->convertYearToWeeks()}<br>".
		"Days: {$ex06->convertYearToDays()}<br>";