<?php

    
    $name = array('Bruno', 'Koster');
    echo "<br>Name: ".$name[0];
    echo "<br>Name: ".$name[1];

    $product[] = "milk";

    echo "<br>Product: ".$product[0];

    echo "<br>";

    $state['RS'] = 'Rio Grande do sul';


    echo "<br>State: ".$state['RS'];

    echo "<br>";

    $city = array ('NH' => 'Novo Hamburgo', 'POA' => 'Porto Alegre');

    echo "<br>".$city['NH'];
    echo "<br>".$city['POA'];


    echo "<br>";

    $country = array('Brazil','Canadá');

    print_r($country);

    echo "<br><br>";

    $student = array('Maria', 'Pedro', 'Lucia');

    echo '<h4>in the variable $student has: '.count($student).' values';

    echo "<br><br>";

    $state = array('RS', 'RJ', 'SC', 'SP');


    if (in_array('SP',$state) == true) {
        echo 'value found.';
    }else{
        echo 'value not found.';
    }
    
    echo "<br><br>";

    $fruits = array('Orange', 'Grape', 'Strawberry', 'Watermelon', 'Orange');

    print_r(array_count_values($fruits));


    echo "<br><br>";

    $juice = array('del vale', 'maguary', 'sulavan', 'petry');


    if (is_array($juice) == true) {
        echo 'This variable is an array.';
    }else{
        echo 'This variable is not an array.';
    }