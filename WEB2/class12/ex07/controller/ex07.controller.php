<?php
	include '../model/ex07.class.php';

	$ex07 = new Ex07();

	$ex07->setHeight(2);
	$ex07->setBase(3);

	echo "Rectangle area: {$ex07->calculateRectangleArea()}";