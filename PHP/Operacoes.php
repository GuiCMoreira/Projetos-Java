<?php

$n1 = 20;
$n2 = 10;
$op = 1;
$repeat = false;

do {
  switch ($op) {
    case 1:
      echo "A + B = " . soma($n1, $n2);
      break;
    
    case 2:
      echo "A - B = " . subtr($n1, $n2);
      break;
    
    case 3:
      echo "A / B = " . divi($n1, $n2);
      break;
    
    case 4:
      echo "A * B = " . mult($n1, $n2);
      break;
    
    case 5:
      echo "Média = " . media($n1, $n2);
      break;
    
    case 6:
      $repeat = false;
      break;
    
    default:
      echo"Insira uma operação válida!";
      break;
  }
} while ($repeat);

function soma($n1, $n2){
return $n1 + $n2;
}

function subtr($n1, $n2){
return $n1 - $n2;
}

function divi($n1, $n2){
return $n1 / $n2;
}

function mult($n1, $n2){
return $n1 * $n2;
}

function media($n1, $n2){
return ($n1 + $n2) / 2;
}
