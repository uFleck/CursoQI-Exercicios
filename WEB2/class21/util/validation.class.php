<?php

class Validation
{ 
	public static function validateName($value)
    {
		$exp = '/^[^.!@#$%¨&*]{2,40}$/';
		if(preg_match($exp, $value)){
			return true;
		}else{
			return false;
		}
	}

	public static function validateDrink($value)
    {
		$exp = '/^(Soda|H20|Water)$/';
		if(preg_match($exp, $value)){
			return true;
		}else{
			return false;
        }
	}
}