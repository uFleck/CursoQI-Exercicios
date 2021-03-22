<?php
	session_start();
?>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8"/>
		<title>Fleck's Delivery</title>
	</head>
	<body>
	<br/>
	
	<fieldset>
		<legend>There was an error when placing the order.</legend>
		<?php
			if( isset($_SESSION['errors']) ){
				$errors = array();
				$errors = unserialize($_SESSION['errors']);

				foreach($errors as $e){
					echo '<br />'.$e;
				}
            }
		?>		
	</fieldset>
	</body>
</html>





