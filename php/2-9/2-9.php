<?php
$num = 1;
for($num =1; $num <= 100; $num++) {
	echo "<br />";
   if(($num % 5 == 0) && ($num % 3 == 0)){
    	echo "FizzBuzz!!";
    }elseif ($num % 3 == 0) {
			echo "Fizz!";
		}elseif($num % 5 == 0) {
			echo "Buzz!";
		}else {
			echo $num;
		}
}
