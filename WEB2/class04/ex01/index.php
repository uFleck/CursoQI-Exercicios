<?php

    include "person.class.php";

    $person = new Person();

    $person->setName("Bruno");
    $person->setAge(16);

    echo '<h1>Results: </h1>';

    echo '<h3>AGE: '.$person->getAge().'</h3>';
    echo '<h3>MONTHS: '.$person->calculateAgeInMonths().'</h3>';
    echo '<h3>WEEKS: '.$person->calculateAgeInWeeks().'</h3>';
    echo '<h3>DAYS: '.$person->calculateAgeInDays().'</h3>';