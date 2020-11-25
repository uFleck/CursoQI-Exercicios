<?php

	class Agency
	{
		private $vehicle;
		private $vehicleType;
		private $fuelType;
		private $rentalPrice;
		private $dailyQuantities;

		

		public function getVehicle()
		{
				return $this->vehicle;
		}

		public function setVehicle($vehicle)
		{
				$this->vehicle = $vehicle;
		}

		public function getVehicleType()
		{
				return $this->vehicleType;
		}

		public function setVehicleType($vehicleType)
		{
				$this->vehicleType = $vehicleType;
		}

		public function getFuelType()
		{
				return $this->fuelType;
		}

		public function setFuelType($fuelType)
		{
				$this->fuelType = $fuelType;
		}

		public function getRentalPrice()
		{
				return $this->rentalPrice;
		}

		public function setRentalPrice($rentalPrice)
		{
				$this->rentalPrice = $rentalPrice;
		}

		public function getDailyQuantities()
		{
				return $this->dailyQuantities;
		}

		public function setDailyQuantities($dailyQuantities)
		{
				$this->dailyQuantities = $dailyQuantities;
		}

		public function selectVehicle()
		{
			if ($this->vehicleType == 1) {
				return $this->calculateDaily() * 0.02;
			} else {
				return $this->calculateDaily() * 0.05;
			}
		}

		public function calculateDaily()
		{
			return $this->dailyQuantities * $this->rentalPrice;
		}

		public function calculateFuel()
		{
			if ($this->fuelType == 1) {
				return 50;
			} else {
				return 100;
			}
		}

		public function calculateTotal()
		{
			return $this->calculateDaily() + $this->selectVehicle() + $this->calculateFuel();
		}
	}