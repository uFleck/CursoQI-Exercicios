<?php

	include '../model/ex04.class.php';

	$ex04 = new Ex04();
	$ex04->setValue1(10);
	$ex04->setValue2(2);

	echo "Difference between {$ex04->getValue1()} and {$ex04->getValue2()} = {$ex04->findDiff()}";