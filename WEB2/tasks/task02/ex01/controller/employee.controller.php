<?php


    include "../model/employee.class.php";

    $employee = new Employee();

    $employee->setFixedSalary($_POST['inputsalary']);
    $employee->setSalesValue($_POST['inputsales']);


	echo    
		"<h3>Fixed Salary: {$employee->getFixedSalary()}</h3>".
        "<h3>Sales Value: {$employee->getSalesValue()}</h3>".
        "<h3>Comissão: {$employee->calculateCommission()}</h3>".
        "<h3>Final Salary: {$employee->calculateFinalSalary()}</h3>";