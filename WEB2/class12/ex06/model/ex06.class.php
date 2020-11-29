<?php

	class Ex06
	{
		private $year;

		public function getYear()
		{
				return $this->year;
		}

		public function setYear($year)
		{
				$this->year = $year;
		}

		public function convertYearToMonths()
		{
			return $this->year * 12;
		}

		public function convertYearToWeeks()
		{
			return $this->year * 52;
		}

		public function convertYearToDays()
		{
			return $this->year * 365;
		}
	}