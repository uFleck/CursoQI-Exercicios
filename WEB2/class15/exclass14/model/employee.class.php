<?php

    class Employee
    {
        private $name;
        private $role;
        private $enrollment;
        private $hoursValue;
        private $totalHours;

        public function __construct()
        {
            
        }

        public function __get($attr)
        {
            return $this->$attr;
        }

        public function __set($attr, $value)
        {
            $this->$attr = $value;
        }

        public function calculateSalary()
        {
            return $this->hoursValue * $this->totalHours;
        }

        public function __toString()
        {
            return nl2br("
                Name: $this->name
                Role: $this->role
                Enrollment: $this->enrollment
                Hours Value: R$ $this->hoursValue
                Total Hours: $this->totalHours
                Final Salary: R$ {$this->calculateSalary()}
            ");
        }
    }