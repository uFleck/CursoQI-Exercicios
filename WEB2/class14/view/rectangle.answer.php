<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <title>Rectangle Calculator</title>
</head>
<body style="text-align: center;"> 

    <h1 style="margin-top: 100px;">Rectangle Result</h1>

    <?php
        echo "<p>";
        echo "<br>BASE: ".$_GET['inputbase'];
        echo "<br>HEIGHT: ".$_GET['inputheight'];
        echo "<br>AREA: ".$_GET['area'];
        echo "<p>";
    ?>


    <h1 style="margin-top: 100px;">Date Functions</h1>
    <?php
        date_default_timezone_set('America/Sao_Paulo');

        echo date('d/m/Y');
    ?>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>
</html>