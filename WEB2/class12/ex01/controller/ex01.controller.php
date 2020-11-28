<?php

	include '../model/ex01.class.php';

	$ex01 = new Ex01();
	$ex01->setNumber1(10);
	$ex01->setNumber2(20);
	$ex01->setNumber3(30);

	echo "A soma é: {$ex01->calculateSum()}";