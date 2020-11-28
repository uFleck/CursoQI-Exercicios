<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
	<title>Employee Register</title>
</head>
<body>
	<h1 style="text-align: center; margin-top: 100px;">Employee Register</h1>
	<form style="width: 40%; margin: 100px auto;" action="../controller/employee.controller.php" method="post">
		<div class="form-group">
			<label>Fixed salary</label>
			<div class="input-group">
				<div class="input-group-prepend">
					<span class="input-group-text">$</span>
				</div>
				
				<input type="text" name="inputsalary" class="form-control">
			</div>
			<label>Sales value</label>
			<div class="input-group">
				<div class="input-group-prepend">
					<span class="input-group-text">$</span>
				</div>
				<input type="text" name="inputsales" class="form-control">
			</div>
		</div>
		<button type="submit" style="width: 100%; height: 50px; margin-top: 50px;" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>