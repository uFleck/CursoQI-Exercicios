<?php

	class Ex09
	{
		private $name;
		private $grade = array();
		private $weight = array();

		public function getName()
		{
				return $this->name;
		}

		public function setName($name)
		{
				$this->name = $name;
		}

		public function getGrade()
		{
				return $this->grade;
		}

		public function setGrade($grade, $position)
		{
				$this->grade[$position] = $grade;
		}

		public function getWeight()
		{
				return $this->weight;
		}

		public function setWeight($weight, $position)
		{
				$this->weight[$position] = $weight;
		}

		public function calculateWeightedAverage()
		{
			$top = 0;
			$bot = 0;
		
			for ($i = 0; $i < count($this->grade); $i++) { 
				$top += $this->weight[$i] * $this->grade[$i];
				$bot += $this->weight[$i];
			}
		
			$weightedAverage =  $top / $bot;
			return $weightedAverage;
		}
	}
	