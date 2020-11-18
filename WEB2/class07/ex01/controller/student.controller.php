<?php

	include '../model/student.class.php';

	$student = new Student();
	$student->setN1(7);
	$student->setN2(4);
	echo $student->calculateAverage();