<?php
    include '../model/hotel.class.php';

    $hotel = new Hotel();
    $hotel->name = $_POST['inputname'];
    $hotel->email = $_POST['inputemail'];
    $hotel->phoneNumber = $_POST['inputphonenumber'];
    $hotel->rg = $_POST['inputrg'];

    header("location:../view/hotel.answer.php?inputname=$hotel->name&inputemail=$hotel->email&inputphonenumber=$hotel->phoneNumber&inputrg=$hotel->rg&totaldaily={$hotel->calculateDaily($_POST['inputsuite'], $_POST['inputdays'])}");