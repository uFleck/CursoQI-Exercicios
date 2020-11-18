<?php

	$number = 4;

	switch ($number) {
		case 1:
			$mensagem = '1 Bicycle!';
			break;
		
		case 2:
			$mensagem = '1 TV!';
			break;
		
		case 3:
			$mensagem = '1 Smartphone';
			break;

		case 4:
			$mensagem = '1 Tablet';
			break;

		case 5:
			$mensagem = '1 Fridge';
			break;

		default:
			$mensagem = 'There are no awards for this value!';
			break;
	}

	echo "Your reward is: {$mensagem}";