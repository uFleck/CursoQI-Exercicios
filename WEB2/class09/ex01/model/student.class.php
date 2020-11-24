<?php

    class Student
    {
        private $name;
        private $ra;
        private $grade1;
        private $grade2;
		private $opinion;
		private $discipline;

        public function __construct() {
            
        }

        public function getName()
        {
                return $this->name;
        }

        public function setName($name)
        {
                $this->name = $name;
        }

        public function getRa()
        {
                return $this->ra;
        }

        public function setRa($ra)
        {
                $this->ra = $ra;
        }

        public function getGrade1()
        {
                return $this->grade1;
        }

        public function setGrade1($grade1)
        {
                $this->grade1 = $grade1;
        }

        public function getGrade2()
        {
                return $this->grade2;
        }

        public function setGrade2($grade2)
        {
                $this->grade2 = $grade2;
		}
		
		public function getOpinion()
		{
				return $this->opinion;
		}

		public function setOpinion($opinion)
		{
				$this->opinion = $opinion;
		}

		public function getDiscipline()
		{
				return $this->discipline;
		}

		public function setDiscipline($discipline)
		{
				$this->discipline = $discipline;
		}

        public function calculateAverage()
        {
			$average = ($this->grade1 + $this->grade2) / 2;

			if ($average >= 6) {
					$answer = 'Approved!';
			} else {
					$answer = 'Disapproved!';
			}

			return $answer.' <br>Média: '.$average;
        }

    }