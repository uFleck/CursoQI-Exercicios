<?php

    class Contact
    {
        private $id;
        private $name;
        private $email;
        private $phone;
        private $message;

        function __construct(){
        }

        function __destruct(){
        }

        function __set($attr, $value) {
            $this->$attr = $value;
        }

        function __get($attr) {
            return $this->$attr;
        }

        public function __toString()
        {
            return nl2br("Name: $this->name
                         Phone: $this->phone
                         E-mail: $this->email
                         Message: $this->message");
        }
    }