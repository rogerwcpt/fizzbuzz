<?php
    for ($x = 1; $x <= 100; $x++) {
        $divBy3 = $x % 3 == 0;
        $divBy5 = $x % 5 == 0;

        if ($divBy3 && $divBy5) 
            echo "FizzBuzz";
        elseif ($divBy3) 
            echo "Fizz"; 
        elseif ($divBy5) 
            echo "Buzz"; 
        else
            echo $x;

        echo "<br />";
    }         
?>
