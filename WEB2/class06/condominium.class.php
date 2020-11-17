<?php

    $installmentValue = 125;
    $penaltyValue = 0.37;
    $interestValue = $installmentValue * $penaltyValue;
    $totalValue = $installmentValue + $interestValue;

    echo
        '<h1>Result:</h1>'.
        '<h2>Initial installment value: $'.$installmentValue.'</h2>'.
        '<h2>Interest value: $'.$interestValue.'</h2>'.
        '<h2>Total value: $'.$totalValue.'</h2>';