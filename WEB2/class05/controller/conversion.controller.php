<?php

    include '../model/conversion.class.php';

    $conversion = new Conversion();

    $conversion->setBrl(100);

    echo 
        '<h1>Results</h1>'.
        '<h2>BRL: '.$conversion->getBrl().'</h1>'.
        '<h2>USD: '.$conversion->calculateUsd().'</h1>'.
        '<h2>EUR: '.$conversion->calculateEur().'</h1>';
    