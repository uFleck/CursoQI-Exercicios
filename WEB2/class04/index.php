<?php

    include "person.class.php";

    $person = new Person();
    $person->setName("Bruno");
    $person->setAge(16);

    echo '<h3>Final Result:</h3>';
    echo '<p>Name: '.$person->getName().'</p>';
    echo '<p>Age: '.$person->getAge().'</p>';
