<?php

    class Person
    {
        private $name;
        private $age;

        public function __construct()
        {
        }
        public function __destruct()
        {
        }
        
        public function  __get($attr)
        {
            return $this->$attr;
        }

        public function  __set($attr, $value)
        {
            $this->$attr = $value;
        }

        public function calculateAgeInMonths ()
        {
            return $this->age * 12;
        }

        public function __toString()
        {
            return nl2br("
                Name:  $this->name 
                Age:  $this->age 
                Age in months: {$this->calculateAgeInMonths()}
            ");
        }


    }
