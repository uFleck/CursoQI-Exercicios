<?php
    include '../model/employee.class.php';

    $employee = new Employee();
    $employee->name = $_POST['inputname'];
    $employee->role = $_POST['inputrole'];
    $employee->enrollment = $_POST['inputenrollment'];
    $employee->hoursValue = $_POST['inputhoursvalue'];
    $employee->totalHours = $_POST['inputtotalhours'];

    header("location:../view/employee.answer.php?inputname=$employee->name&inputrole=$employee->role&inputenrollment=$employee->enrollment&inputhoursvalue=$employee->hoursValue&inputtotalhours=$employee->totalHours&salary={$employee->calculateSalary()}");