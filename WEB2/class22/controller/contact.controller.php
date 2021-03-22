<?php

    include "../model/contact.class.php";

    $contact = new Contact();
    $contact->name = $_POST['inputname'];
    $contact->phone = $_POST['inputphone'];
    $contact->email = $_POST['inputemail'];
    $contact->message = $_POST['inputmessage'];

    echo $contact;