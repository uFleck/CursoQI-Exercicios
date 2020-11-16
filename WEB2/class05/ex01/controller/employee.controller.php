<?php

    include '../model/employee.class.php';

    $employee = new Employee();

    $employee->setHourValue(12.50);
    $employee->setTotalHours(125);

    echo 
        '<h1>Hour Value: '.$employee->getHourValue().'</h1>'.
        '<h1>Total Amount of Hours: '.$employee->getTotalHours().'</h1>'.
        '<h1>Gross Salary: '.$employee->calculateSalary().'</h1>';