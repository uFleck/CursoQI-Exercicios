<?php

    class Delivery 
    {
        private $name;
        private $cpf;
        private $phone;
        private $address;
        private $email;
        private $snack;
        private $snackAmount;
        private $drink;
        private $drinkAmount;
        private $paymentForm;
        private $delivery;
        
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

        public function calculateSnackValue(){
            if($this->snack == 'Hot Dog'){
                return $this->snackAmount * 6.50;
            }else if($this->snack == 'Pressed'){
                return $this->snackAmount * 7.00;
            }else if($this->snack == 'French Fries'){
                return $this->snackAmount * 8.00;
            }else{
                return $this->snackAmount * 10.00;
            }
        }

        public function calculateDrinkValue(){
            if($this->drink == 'Soda'){
                return $this->drinkAmount * 3.50;
            }else if($this->drink == 'H20'){
                return $this->drinkAmount * 3.00;
            }else{
                return $this->drinkAmount * 2.00;
            }
        }

        public function calculateFinalValue(){
            if($this->delivery == 'Yes'){
                return $this->calculateDrinkValue() + $this->calculateSnackValue() + 3.00;
            }else{
                return $this->calculateDrinkValue() + $this->calculateSnackValue();
            }
        }

        public function getCurrentDate(){
            return date("d-M-Y");
        }

        public function __toString(){
            return  '<Center>'.$this->getCurrentDate().'</center><br/>'.
                    '<br>Name: '.$this->name.' <br>'.
                    '<br>E-mail: '.$this->email.' <br>'.
                    '<br>Phone: '.$this->phone.' <br>'.
                    '<br>Snack: '.$this->snack.' <br>'.
                    '<br>Drink: '.$this->drink.' <br>'.
                    '<br>Payment Form: '.$this->paymentForm.' <br>'.
                    '<br>Delivery: '.$this->delivery.' <br>'.
                    '<br>Drink Amount: '.$this->drinkAmount.' <br>'.
                    '<br>Snack Amount: '.$this->snackAmount.' <br>'.
                    '<br>Snack Total Value: R$ '.$this->calculateSnackValue().' <br>'.
                    '<br>Drink Total Value: R$ '.$this->calculateDrinkValue().' <br>'.
                    '<br>Final Value: R$ '.$this->calculateFinalValue().' <br>';          
        }
    }