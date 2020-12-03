<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <title>Employee Data</title>
</head>
<body>
    <form style="width: 40%; margin: 100px auto;" action="../controller/employee.controller.php" method="post">
		<div class="form-group">
			<div class="input-group">
				<div class="input-group-prepend">
					<span class="input-group-text" style="width:140px;">NAME</span>
				</div>
				<input type="text" name="inputname" class="form-control" required autofocus>
			</div>
			<div class="input-group mt-3">
				<div class="input-group-prepend">
					<span class="input-group-text" style="width:140px;">ROLE</span>
				</div>
				<input type="text" name="inputrole" class="form-control" required>
            </div>
            <div class="input-group mt-3">
				<div class="input-group-prepend">
					<span class="input-group-text" style="width:140px;">ENROLLMENT</span>
				</div>
				<input type="text" name="inputenrollment" class="form-control" required>
            </div>
            <div class="input-group mt-3">
				<div class="input-group-prepend">
					<span class="input-group-text" style="width:140px;">HOURS VALUE</span>
				</div>
				<input type="number" name="inputhoursvalue" class="form-control" required>
            </div>
            <div class="input-group mt-3">
				<div class="input-group-prepend">
					<span class="input-group-text" style="width:140px;">TOTAL HOURS</span>
				</div>
				<input type="number" name="inputtotalhours" class="form-control" required>
			</div>
		</div>
		<button type="submit" style="width: 100%; height: 50px; margin-top: 50px;" class="btn btn-dark">CALCULATE</button>
	</form>
</body>
</html>