<?php

	class Ex05
	{
		private $usd;

		public function getUsd()
		{
				return $this->usd;
		}

		public function setUsd($usd)
		{
				$this->usd = $usd;
		}

		public function convertDollar($price)
		{
			return $this->usd * $price;
		}
	}