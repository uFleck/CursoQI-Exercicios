<?php

    class Product
    {
		private $name;
		private $value;
		private $amount;

		public function getName()
		{
			return $this->name;
		}

		public function setName($name)
		{
			$this->name = $name;
			return $this;
		}

		public function getValue()
		{
			return $this->value;
		}

		public function setValue($value)
		{
			$this->value = $value;
			return $this;
		}

		public function getAmount()
		{
			return $this->amount;
		}

		public function setAmount($amount)
		{
			$this->amount = $amount;
			return $this;
		}

		public function calculateFinalValue()
		{
			return $this->value * $this->amount;
		}

		public function calculateDiscount()
		{
			return $this->calculateFinalValue() * 0.10;
		}

		public function calculateInterest()
		{
			return $this->calculateFinalValue() * 0.025;
		}

		public function calculateTotalDiscount()
		{
			return $this->calculateFinalValue() - $this->calculateDiscount();
		}

		public function calculateTotalInterest()
		{
			return $this->calculateFinalValue() + $this->calculateInterest();
		}
    }