<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hotel Result</title>
</head>
<body>
    <p style="text-align: center; margin-top: 100px; font-size: 50px;">
        <?php
            echo "Name: ".$_GET['inputname'];
            echo "<br>E-mail: ".$_GET['inputemail'];
            echo "<br>Phone Number: ".$_GET['inputphonenumber'];
            echo "<br>RG: ".$_GET['inputrg'];
            echo "<br>Daily Total: ".$_GET['totaldaily'];
        ?>
    </p>
</body>
</html>