<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <title>Hotel Reservation</title>
</head>
<body>
    <h1 style="text-align: center; margin-top: 100px">Fill the Form!</h1>
    <form style="width: 40%; margin: 100px auto;" action="../controller/hotel.controller.php" method="post">
		<div class="form-group">
			<div class="input-group">
				<div class="input-group-prepend">
					<span class="input-group-text" style="width:150px;">NAME</span>
				</div>
				<input type="text" name="inputname" class="form-control" required autofocus>
			</div>
			<div class="input-group mt-3">
				<div class="input-group-prepend">
					<span class="input-group-text" style="width:150px;">E-MAIL</span>
				</div>
				<input type="text" name="inputemail" class="form-control" required>
            </div>
            <div class="input-group mt-3">
				<div class="input-group-prepend">
					<span class="input-group-text" style="width:150px;">PHONE NUMBER</span>
				</div>
				<input type="text" name="inputphonenumber" class="form-control" required>
            </div>
            <div class="input-group mt-3">
				<div class="input-group-prepend">
					<span class="input-group-text" style="width:150px;">RG</span>
				</div>
				<input type="number" name="inputrg" class="form-control" required>
            </div>
            <div class="input-group mt-3">
				<div class="input-group-prepend">
					<span class="input-group-text" style="width:150px;">SUITE</span>
				</div>
				<select name="inputsuite">
                    <option value="1">Single Suite</option>
                    <option value="2">Master Double Suite</option>
                    <option value="3">Family Suite</option>
                </select>
            </div>
            <div class="input-group mt-3">
				<div class="input-group-prepend">
					<span class="input-group-text" style="width:150px;">DAYS</span>
				</div>
				<input type="number" name="inputdays" class="form-control" required>
            </div>
		</div>
		<button type="submit" style="width: 100%; height: 50px; margin-top: 50px;" class="btn btn-dark">REGISTER</button>
	</form>
</body>
</html>