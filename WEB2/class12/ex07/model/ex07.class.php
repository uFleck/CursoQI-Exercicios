<?php

	class Ex07
	{
		private $height;
		private $base;

		public function getHeight()
		{
				return $this->height;
		}

		public function setHeight($height)
		{
				$this->height = $height;
		}

		public function getBase()
		{
				return $this->base;
		}

		public function setBase($base)
		{
				$this->base = $base;
		}

		public function calculateRectangleArea()
		{
			return $this->base * $this->height;
		}
	}