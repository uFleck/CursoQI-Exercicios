<?php

    include "../model/product.class.php";

    $product = new Product();

    $product->setName("Coca-cola 2L");
    $product->setAmount(1);
    $product->setValue(600);

	echo
		'<h1 style="text-align: center; margin-top: 100px; font-size: 40px">Product</h1>'.
    	'<h2 style="text-align: center; margin-top: 250px; font-size: 30px"> Name: '.$product->getName().'</h1>'.
    	'<h2 style="text-align: center; font-size: 30px"> Amount: '.$product->getAmount().'</h2>'.
    	'<h2 style="text-align: center; font-size: 30px"> Value: '.$product->getValue().'</h2>'.
	
		'<h2 style="text-align: center; font-size: 30px; color: purple; margin-top: 100px"> Final Value: '.$product->calculateFinalValue().'</h2>'.
		'<h2 style="text-align: center; font-size: 30px; color: turquoise; margin-top: 20px"> Final Value With Discount: '.$product->calculateTotalDiscount().'</h2>'.
		'<h2 style="text-align: center; font-size: 30px; color: red; margin-top: 20px"> Final Value With Interest: '.$product->calculateTotalInterest().'</h2>';