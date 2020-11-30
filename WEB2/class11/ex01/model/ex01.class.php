<?php

	class Ex01
	{
		private $number1;
		private $number2;
		private $number3;
		
		public function getNumber1()
		{
				return $this->number1;
		}

		public function setNumber1($number1)
		{
				$this->number1 = $number1;
		}

		public function getNumber2()
		{
				return $this->number2;
		}

		public function setNumber2($number2)
		{
				$this->number2 = $number2;
		}

		public function getNumber3()
		{
				return $this->number3;
		}

		public function setNumber3($number3)
		{
				$this->number3 = $number3;
		}

		public function calculateSum()
		{
			return $this->number1 + $this->number2 + $this->number3;
		}
	}