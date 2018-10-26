<!DOCTYPE html>
<html>
<head>
	<title>Output</title>
</head>
<body>
	<?php
		$inputData = $_POST["edKata_41818110087"];

		echo "Jumlah Baris yang Dimasukkan : <b>$inputData</b>";
		echo "<br><br>";

		echo "Output : <br><br>";

		function gedekecil($value,$index){
			return ($index % 2 == 1 ? strtolower($value) : strtoupper($value));
		}

		$arrKata 	= explode(" ", strrev($inputData));
		$mapped 	= array_map("gedekecil", $arrKata,array_keys($arrKata)); 
		echo implode(" ", $mapped);
	?>

</body>
</html>