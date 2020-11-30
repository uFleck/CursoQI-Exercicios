<?php

	class Ex04
	{
		private $value1;
		private $value2;

		public function getValue1()
		{
				return $this->value1;
		}

		public function setValue1($value1)
		{
				$this->value1 = $value1;
		}

		public function getValue2()
		{
				return $this->value2;
		}

		public function setValue2($value2)
		{
				$this->value2 = $value2;
		}

		public function findDiff()
		{
			return abs($this->value1 - $this->value2);
		}
	}