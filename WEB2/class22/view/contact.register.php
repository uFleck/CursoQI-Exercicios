<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <title>Qi</title>
</head>
<body>
    <header>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">QI</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav">
                        <a class="nav-link active" aria-current="page" href="../index.html">Home</a>
                        <a class="nav-link" href="#">About</a>
                        <a class="nav-link" href="#">Contact</a>
                    </div>
                </div>
            </div>
        </nav>
    </header>

    <h1>Make your budget</h1>
    <article>
        <form action="../controller/contact.controller.php" method="post">
            <div class="form-group">
                <label for="formGroupExampleInput">Name</label>
                <input type="text" class="form-control" name="inputname" id="formGroupExampleInput" placeholder="Type your name: ">
            </div>
            <div class="form-group">
                <label for="formGroupExampleInput2">Phone</label>
                <input type="number" class="form-control" name="inputphone" id="formGroupExampleInput2" placeholder="Type your phone: ">
            </div>
            <div class="form-group">
            <label for="exampleInputEmail1">E-mail</label>
                <input type="email" class="form-control" name="inputemail" id="exampleInputEmail1" placeholder="Type your email:" aria-describedby="emailHelp">
            </div>
            <div class="form-group">
                <label for="validationTextarea">Message</label>
                <textarea class="form-control" name="inputmessage" id="validationTextarea" placeholder="Type your message:" required></textarea>
            </div>
            <button type="submit" class="btn btn-primary">Send</button>
        </form>
    </article>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>
</body>
</html>