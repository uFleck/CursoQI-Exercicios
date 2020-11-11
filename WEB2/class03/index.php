<?php

    class Person
    {
        private $name;
        private $age;
        private $price;

        /**
         * Set the value of Name
         *
         * @param mixed $name
         *
         * @return self
         */
        public function setName($name)
        {
            $this->name = $name;

            return $this;
        }

        /**
         * Get the value of Name
         *
         * @return mixed
         */
        public function getName()
        {
            return $this->name;
        }

        /**
         * Set the value of Age
         *
         * @param mixed $age
         *
         * @return self
         */
        public function setAge($age)
        {
            $this->age = $age;

            return $this;
        }

        /**
         * Get the value of Age
         *
         * @return mixed
         */
        public function getAge()
        {
            return $this->age;
        }

        /**
         * Set the value of Price
         *
         * @param mixed $price
         *
         * @return self
         */
        public function setPrice($price)
        {
            $this->price = $price;

            return $this;
        }

        /**
         * Get the value of Price
         *
         * @return mixed
         */
        public function getPrice()
        {
            return $this->price;
        }

        function calculateAgeInMonths()
        {
            return $this->age * 12;
        }

    }

?>
