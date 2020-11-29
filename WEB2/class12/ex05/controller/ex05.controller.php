<?php
	include "../model/ex05.class.php";
	
	$ex05 = new Ex05();
	$ex05->setUsd(10);
	
	echo "$10 usd: {$ex05->convertDollar(5.66)}";