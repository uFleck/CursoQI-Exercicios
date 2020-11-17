<?php

    class Employee
    {
        private $hourValue;
        private $totalHours;

        public function __construct()
        {
                
        }

        public function getHourValue()
        {
			return $this->hourValue;
        }

        public function setHourValue($hourValue)
        {
			$this->hourValue = $hourValue;
			return $this;
        }

        public function getTotalHours()
        {
			return $this->totalHours;
        }

        public function setTotalHours($totalHours)
        {
			$this->totalHours = $totalHours;
			return $this;
        }

        public function calculateSalary()
        {
            return $this->hourValue * $this->totalHours;
		}
		
		public function calculateTransportationVoucher()
		{
			return $this->calculateSalary() * 0.06;
		}
    }