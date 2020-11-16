<?php

    include "calculator.class.php";

    $calculator = new Calculator();

    $calculator->setValue1(2);
    $calculator->setValue2(2);

    echo '<h1 style="text-align: center; margin-top: 100px; font-size: 40px">Math Operations</h1>';

    echo '<h2 style="text-align: center; margin-top: 150px; color: blue; font-size: 30px"> Value One: '.$calculator->getValue1().'</h2>';
    echo '<h2 style="text-align: center; color: red; font-size: 30px"> Value Two: '.$calculator->getValue2().'</h2>';

    echo '<h2 style="text-align: center; margin-top: 150px; color: yellow; font-size: 30px"> Sum: '.$calculator->calculateSum().'</h2>';
    echo '<h2 style="text-align: center; color: orange; font-size: 30px"> Subtraction: '.$calculator->calculateSubtraction().'</h2>';
    echo '<h2 style="text-align: center; color: purple; font-size: 30px"> Multiplication: '.$calculator->calculateMultiplication().'</h2>';
    echo '<h2 style="text-align: center; color: turquoise; font-size: 30px"> Division: '.$calculator->calculateDivision().'</h2>';