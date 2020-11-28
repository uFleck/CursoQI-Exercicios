<?php

	class Employee
	{
		private $fixedSalary;
		private $salesValue;

		public function __construct() {
		
		}
		
		public function getFixedSalary()
		{
				return $this->fixedSalary;
		}

		public function setFixedSalary($fixedSalary)
		{
				$this->fixedSalary = $fixedSalary;
		}

		public function getSalesValue()
		{
				return $this->salesValue;
		}

		public function setSalesValue($salesValue)
		{
				$this->salesValue = $salesValue;
		}

		public function calculateCommission()
		{
			return $this->salesValue * 0.04;
		}

		public function calculateFinalSalary()
		{
			return $this->fixedSalary + $this->calculateCommission();
		}
	}