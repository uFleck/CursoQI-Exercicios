<?php

    class Conversion
    {
        private $brl;
        
        /* //function __construct() {

        } */

        public function Conversion()
        {
            
        }

        public function getBrl()
        {
            return $this->brl;
        }

        public function setBrl($brl)
        {
            $this->brl = $brl;
        }

        public function calculateEur()
        {
            return $this->brl / 6.43;
        }

        public function calculateUsd()
        {
            return $this->brl / 5.43;
        }
    }