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
	
	<h1>Fleck's Delivery</h1>
	<fieldset>
		<legend>Request</legend>
		<?php
			if( isset($_SESSION['message']) &&
				isset($_SESSION['delivery']) ){
				
				include '../model/delivery.class.php';
                
				$delivery = new Delivery();
				$delivery = unserialize( $_SESSION['delivery'] );
				echo '<br />'.$_SESSION['message'].
					 '<br />Data:'.$delivery;
			}
		?>		
	</fieldset>
	</body>
</html>




