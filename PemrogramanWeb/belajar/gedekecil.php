<?php

	$strInput		=	"Minum Aqua";

	function x($value,$index){
		return ($index % 2 == 1 ? strtolower($value) : strtoupper($value));
	}

	$arr 			= str_split($strInput);
	$hasil 			= array_map("x", $arr,array_keys($arr));

	echo implode("", $hasil);

?>