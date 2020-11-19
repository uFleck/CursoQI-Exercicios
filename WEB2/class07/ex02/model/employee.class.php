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

		public function calculateINSS($value)
		{
			$salary = $this->calculateSalary();

			if ($value == 1) {
				if ($salary <= 1045.00 ) {
					$inss = 0.075;
				}elseif ($salary <= 2089.60 ) {
					$inss = 0.09;
				}elseif ($salary <= 3134.40) {
					$inss = 0.12;
				}elseif ($salary <= 6101.06) {
					$inss = 0.14;
				}else {
					$inss = 0;
				}
			}else {
				if ($salary <= 1045.00 ) {
					$inss = "7,5%";
				}elseif ($salary <= 2089.60 ) {
					$inss = "9%";
				}elseif ($salary <= 3134.40) {
					$inss = "12%";
				}elseif ($salary <= 6101.06) {
					$inss = "14%";
				}else {
					$inss = "não foi possivel efetuar o calculo";
				}
				
			}
			return $inss;
		}

		public function calculateNetSalary()
		{
			return $this->calculateSalary() - $this->calculateTransportationVoucher() - $this->calculateINSS(1);
		}
    }