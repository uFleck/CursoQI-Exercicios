<?php

    include '../model/rectangle.class.php';

    $rectangle = new Rectangle();

    $rectangle->height = $_POST['inputheight'];
    $rectangle->base = $_POST['inputbase'];

    header("location:../view/rectangle.answer.php?inputheight=$rectangle->height&inputbase=$rectangle->base&area={$rectangle->calculateArea()}");