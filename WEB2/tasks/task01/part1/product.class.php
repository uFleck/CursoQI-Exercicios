<?php

    class Product
    {
        private $name;
        private $value;
        private $amount;

        public function getName()
        {
                return $this->name;
        }

        public function setName($name)
        {
                $this->name = $name;
                return $this;
        }

        public function getValue()
        {
                return $this->value;
        }

        public function setValue($value)
        {
                $this->value = $value;
                return $this;
        }

        public function getAmount()
        {
                return $this->amount;
        }

        public function setAmount($amount)
        {
                $this->amount = $amount;
                return $this;
        }

        public function calculateFinalValue()
        {
            return $this->value * $this->amount;
        }
    }