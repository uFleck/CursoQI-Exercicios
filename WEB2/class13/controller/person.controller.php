<?php

include "../model/person.class.php";

$person = new Person();

$person->name = $_POST['inputname'];
$person->age = $_POST['inputage'];

header("location:../view/person.answer.php?inputname=$person->name&inputage=$person->age&result={$person->calculateAgeInMonths()}");