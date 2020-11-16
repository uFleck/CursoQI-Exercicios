<?php

    include "product.class.php";

    $product = new Product();

    $product->setName("Coca-cola 2L");
    $product->setAmount(2);
    $product->setValue(6);

    echo '<h1 style="text-align: center; margin-top: 100px; font-size: 40px">Product</h1>';
    echo '<h2 style="text-align: center; margin-top: 250px; font-size: 30px"> Name: '.$product->getName().'</h1>';
    echo '<h2 style="text-align: center; font-size: 30px"> Amount: '.$product->getAmount().'</h2>';
    echo '<h2 style="text-align: center; font-size: 30px"> Value: '.$product->getValue().'</h2>';
    
    echo '<h2 style="text-align: center; font-size: 30px; color: red; margin-top: 100px"> Final Value: '.$product->calculateFinalValue().'</h1>';