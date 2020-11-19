<?php

	$number = 4;

	switch ($number) {
		case 1:
			$message = '<p style="color: red">Summer: December, January, February and March</p>';
			break;
		
		case 2:
			$message = '<p style="color: orange">Autumn: March, April, May and June<p>';
			break;

		case 3:
			$message = '<p style="color: blue">Winter: June, July, August and September</p>';
			break;
		
		case 4:
			$message = '<p style="color: green">Spring: September, October, November and December</p>';
			break;
		default:
			$message = 'Erro';
			break;
	}

	echo "<h1>{$message}</h1>";