<?php

	class Ex03
	{
		private $productsName;
		private $price;
		private $amount;

		

		public function getProductsName()
		{
				return $this->productsName;
		}

		public function setProductsName($productsName)
		{
				$this->productsName = $productsName;
		}

		public function getPrice()
		{
				return $this->price;
		}

		public function setPrice($price)
		{
				$this->price = $price;
		}

		public function getAmount()
		{
				return $this->amount;
		}

		public function setAmount($amount)
		{
				$this->amount = $amount;
		}

		public function calculateTotal()
		{
			return $this->price * $this->amount;
		}
	}