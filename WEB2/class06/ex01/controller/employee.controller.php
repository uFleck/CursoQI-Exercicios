<?php

    include '../model/employee.class.php';

    $employee = new Employee();

    $employee->setHourValue(15.55);
    $employee->setTotalHours(175);

    echo 
        '<h1>Hour Value: '.$employee->getHourValue().'</h1>'.
        '<h1>Total Amount of Hours: '.$employee->getTotalHours().'</h1>'.
        '<h1>Gross Salary: '.$employee->calculateSalary().'</h1>'.
        '<h1>Transportation Voucher: '.$employee->calculateTransportationVoucher().'</h1>';