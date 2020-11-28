<?php

	class Ex02
	{
		private $name;
		private $birthYear;
		private $currentYear;

		

		public function getName()
		{
				return $this->name;
		}

		public function setName($name)
		{
				$this->name = $name;
		}

		public function getBirthYear()
		{
				return $this->birthYear;
		}

		public function setBirthYear($birthYear)
		{
				$this->birthYear = $birthYear;
		}

		public function getCurrentYear()
		{
				return $this->currentYear;
		}

		public function setCurrentYear($currentYear)
		{
				$this->currentYear = $currentYear;
		}

		public function calculateCurrentAge()
		{
			return $this->currentYear - $this->birthYear; 
		}
	}