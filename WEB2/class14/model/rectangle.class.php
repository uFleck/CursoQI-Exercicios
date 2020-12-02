<?php

    class Rectangle
    {
        private $height;
        private $base;

        public function __get($attr)
        {
            return $this->$attr;
        }

        public function __set($attr, $value)
        {
            $this->$attr = $value;
        }

        public function calculateArea()
        {
            return $this->height * $this->base;
        }

        public function toString()
        {
            return nl2br("
                Base: $this->height
                Height: $this->base
                Area: {$this->calculateArea()}
            ");
        }
    }