<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    <title>Exercise 01 - Student</title>

    <style>
        .jumbotron {
            display: block;
            width: 50%;
            margin: auto;
            text-align: center;
        }
    </style>
</head>
<body>
    
    <div class="jumbotron bg-dark m-3" style="color: white;"> 
        
        <legend>Fill in the details below</legend>
        <form action="../controller/student.controller.php" method="post">
            <div class="form-group">
                <input type="text" name="inputname" placeholder="Type your name">
            </div>
            <div class="form-group">
                <input type="number" name="inputra" placeholder="Type your RA">
            </div>
            <div class="form-group">
                <input type="number" name="inputgrade1" placeholder="Type your first grade">
            </div>
            <div class="form-group">
                <input type="number" name="inputgrade2" placeholder="Type your second grade">
            </div>

            <div class="form-group">
                <select name="discipline" class="form-control" id="">
                    <option>Programming Logic</option>
                    <option>Operational Systems</option>
                    <option>Python Language</option>
                </select>
            </div>
            <div class="form-group">
                <textarea name="opinion" class="form-control" id="" cols="30" rows="5" placeholder="Type the opinion about the student"></textarea>
            </div>
            
            <div class="form-group mt-5">
                <input type="submit" class="btn btn-success" value="Register Student">
                <input type="reset" class="btn btn-warning" value="Clear Data">
            </div>
        </form>

    </div>


    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>
</html>