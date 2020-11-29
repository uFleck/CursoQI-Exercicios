<?php

	class Ex08
	{
		private $name;
		private $price;	

		public function getPrice()
		{
				return $this->price;
		}

		public function setPrice($price)
		{
				$this->price = $price;
		}

		public function getName()
		{
				return $this->name;
		}

		public function setName($name)
		{
				$this->name = $name;
		}

		public function calculateFinalPrice()
		{
			$interest = 0.02 * $this->price;
			$discount = 0.08 * $this->price;

			return $this->price + $interest - $discount;
		}
	}