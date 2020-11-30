<?php

	include '../model/ex03.class.php';

	$ex03 = new Ex03();
	$ex03->setAmount(2);
	$ex03->setPrice(10);
	$ex03->setProductsName("Coca 2L");

	echo "Total: {$ex03->calculateTotal()}";