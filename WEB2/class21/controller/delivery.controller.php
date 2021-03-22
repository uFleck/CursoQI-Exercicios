<?php
    session_start();

    include '../model/delivery.class.php';
    include '../util/validation.class.php';


    if(isset($_POST['inputname']) && 
	    isset($_POST['inputemail']) && 
	    isset($_POST['inputphone']) && 
	    isset($_POST['inputsnack']) && 
        isset($_POST['inputsnackamount']) && 
        isset($_POST['inputdrink']) && 
        isset($_POST['inputdrinkamount']) && 
        isset($_POST['inputpaymentform']) && 
        isset($_POST['inputdelivery']) ){
	    $errors = array();	
	
        if(!Validation::validateName($_POST['inputname'])){
            $errors[] = 'Invalid name.';
        }

        if(!Validation::validateDrink($_POST['inputdrink'])){
            $errors[] = 'Invalid drink.';
    	}

	    if(count($errors) == 0){		
            $delivery = new Delivery();

            $delivery->name = $_POST['inputname'];
            $delivery->email = $_POST['inputemail'];
            $delivery->phone = $_POST['inputphone'];
            $delivery->snack = $_POST['inputsnack'];
            $delivery->drink = $_POST['inputdrink'];
            $delivery->snackAmount = $_POST['inputsnackamount'];
            $delivery->drinkAmount = $_POST['inputdrinkamount'];
            $delivery->paymentForm = $_POST['inputpaymentform'];
            $delivery->delivery = $_POST['inputdelivery'];

		    $_SESSION['message'] = 'Order successfully registered!';		
			$_SESSION['delivery'] = serialize($delivery);
	
		    header("location:../view/delivery.answer.php");
	    }else{
		    $_SESSION['errors'] = serialize($errors);
		
		    header("location:../view/delivery.request.php");		
	    }
    }else{
	    echo 'Something is not filled';
    }
?>