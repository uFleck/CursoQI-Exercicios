<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Class 13</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>

        <h1>Interaction with forms via header</h1>

        <div class="jumbotron">
            <form name="" method="post" action="../controller/person.controller.php">
                <div class="form-group">
                    <input class="form-control" name="inputname" type="text" placeholder="Type your name: "
                    pattern="^[A-zÁ-ù ]{3,50}$" required autofocus>
                </div>
                <div class="form-group">
                    <input class="form-control" name="inputage" type="number" placeholder="Type your age: "
                           pattern="^[0-9]{1,3}$" required>
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-dark" value="Register">
                </div>
            </form>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>
</html>