<?php

    include '../model/student.class.php';

    $student = new Student();

    $student->setName($_POST['inputname']);
    $student->setRa($_POST['inputra']);
    $student->setGrade1($_POST['inputgrade1']);
    $student->setGrade2($_POST['inputgrade2']);
    $student->setOpinion($_POST['opinion']);
    $student->setDiscipline($_POST['discipline']);
    $a = 1;
    $b = 2;
    echo
        "Name: {$student->getName()}<br>".
        "RA: {$student->getRa()}<br>".
        "Grade 1: {$student->getGrade1()}<br>".
        "Grade 2: {$student->getGrade2()}<br>".
        "Average: {$student->calculateAverage()}<br>".
        "Opinion: {$student->getOpinion()}<br>".
        "Discipline: {$student->getDiscipline()}";