<?php

    class Hotel
    {
        private $name;
        private $email;
        private $phoneNumber;
        private $rg;

        public function __set($attr, $value)
        {
            $this->$attr = $value;
        }

        public function __get($attr)
        {
            return $this->$attr;
        }

        public function calculateDaily($suite, $days)
        {
            switch ($suite) {
                case '1':
                    $suite = 100;
                    break;
                
                case '2':
                    $suite = 150;
                    break;

                case '3':
                    $suite = 180;
                    break;
            }

            return $suite * $days;
        }

        public function __toString()
        {
            return nl2br("
                Name: $this->name
                E-mail: $this->email
                Phone Number: $this->phoneNumber
                RG: $this->rg
            ");
        }
    }