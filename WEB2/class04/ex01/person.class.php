<?php

    class Person
    {
        private $name;
        private $age;
        

        public function getName()
        {
            return $this->name;
        }

        public function setName($name)
        {
            $this->name = $name;
            return $this;
        }

        public function getAge()
        {
            return $this->age;
        }

        public function setAge($age)
        {
            $this->age = $age;
            return $this;
        }

        public function calculateAgeInMonths() 
        {
            return $this->age * 12;
        }

        public function calculateAgeInWeeks()
        {
            return $this->age * 52;
        }

        public function calculateAgeInDays() 
        {
            return $this->age * 365;
        }
    }
