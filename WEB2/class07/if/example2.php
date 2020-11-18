<?php

	$value = 0;

	if ($value > 0) {
		$answer = "The value is positive";
	} elseif ($value < 0) {
		$answer = "The value is negative";
	} else {
		$answer = "The value is equal to zero";
	}

	echo $answer;