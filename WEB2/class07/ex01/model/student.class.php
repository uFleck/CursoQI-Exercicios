<?php

	class Student
	{
		private $n1;
		private $n2;

		

		public function getN1()
		{
				return $this->n1;
		}

		public function setN1($n1)
		{
				$this->n1 = $n1;
		}

		public function getN2()
		{
				return $this->n2;
		}

		public function setN2($n2)
		{
				$this->n2 = $n2;
		}

		public function calculateAverage()
		{
			$average = ($this->n1 + $this->n2) / 2;

			if ($average >= 6) {
				$answer = 'Approved!';
			} elseif ($average > 4) {
				$answer = 'Exam!';
			} else {
				$answer = 'Disapproved!';
			}

			return $answer.' Média: '.$average;
		}


	}