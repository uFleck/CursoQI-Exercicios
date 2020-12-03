<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <title>Employee Answer</title>
</head>
<body style="background-color: black;">
    <p style="text-align: center; margin-top: 100px; font-size: 50px; color: white;">
        <?php
            echo "Employee: ".$_GET['inputname'];
            echo "<br>Role: ".$_GET['inputrole'];
            echo "<br>Enrollment: ".$_GET['inputenrollment'];
            echo "<br>Hours Value: ".$_GET['inputhoursvalue'];
            echo "<br>Total Hours: ".$_GET['inputtotalhours'];
            echo "<br>Final Salary: ".$_GET['salary'];
        ?>
    </p>
</body>
</html>