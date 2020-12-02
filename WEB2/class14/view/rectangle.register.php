<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <title>Rectangle Calculator</title>
</head>
<body>

    <h1 style="text-align: center; margin-top: 100px;">Rectangle Info</h1>

    <form style="width: 40%; margin: 100px auto;" action="../controller/rectangle.controller.php" method="post">
		<div class="form-group">
			<div class="input-group">
				<div class="input-group-prepend">
					<span class="input-group-text" style="width:140px;">HEIGHT</span>
				</div>
				<input type="number" name="inputheight" class="form-control" required autofocus>
			</div>
			<div class="input-group mt-3">
				<div class="input-group-prepend">
					<span class="input-group-text" style="width:140px;">BASE</span>
				</div>
				<input type="number" name="inputbase" class="form-control" required>
			</div>
		</div>
		<button type="submit" style="width: 100%; height: 50px; margin-top: 50px;" class="btn btn-dark">CALCULATE</button>
	</form>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>
</html>