<?php

	include '../model/ex02.class.php';

	$ex02 = new Ex02();
	$ex02->setName("Bruno");
	$ex02->setCurrentYear(2020);
	$ex02->setBirthYear(2004);

	echo  
		"Your name is: {$ex02->getName()}".
		"<br>And your age is: {$ex02->calculateCurrentAge()}";