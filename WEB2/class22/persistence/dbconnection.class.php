<?php

    class DbConnection extends PDO
    {
        private static $instance = null;

        public function DbConnection($dsn, $user, $password)
        {
            parent::__construct($dsn, $user, $password);
        }

        public static function getInstance()
        {
            if(!isset(self::$instance))
            {
                try {
                    
                } catch (\Throwable $th) {
                    //throw $th;
                }
            }
        }
    }