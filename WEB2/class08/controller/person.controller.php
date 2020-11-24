<?php

    include '../model/person.class.php';

    $person = new Person();

    $person->setName($_POST['inputname']);
    $person->setAge($_POST['inputage']);
    $person->setHeight($_POST['inputheight']);
    $person->setWeight($_POST['inputweight']);
    $person->setRg($_POST['inputrg']);

    echo "<h1>Name: {$person->getName()}".
         "<br>Age: {$person->getAge()}".
         "<br>Height: {$person->getHeight()}".
         "<br>Weight: {$person->getWeight()}".
         "<br>RG: {$person->getRg()}".
         "<br>BMI: {$person->calculateBMI()}";