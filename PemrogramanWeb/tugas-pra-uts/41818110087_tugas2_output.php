<!DOCTYPE html>
<html>
<head>
	<title>Deret Matematika</title>
</head>
<body>
	<?php
		$inputBaris_41818110087 = $_POST["edBaris_41818110087"];

		echo "Jumlah Baris yang Dimasukkan : <b>$inputBaris_41818110087</b>";
		echo "<br><br>";

		echo "Output : <br><br>";

		$awal_41818110087 		= 2;

		// looping untuk baris
		for($r_41818110087 		= 0 ; $r_41818110087 < $inputBaris_41818110087 ; $r_41818110087++){

			$sc_41818110087 	= "<b>Baris ".($r_41818110087+1)."</b> : ";
			$iNum_41818110087 	= 2;
			$itotal_41818110087 = 0;

			// proses untuk kolom
			for($c_41818110087 = 0 ; $c_41818110087 <= $r_41818110087 ; $c_41818110087++){
				// variabel total penjumlahan
				$itotal_41818110087 += $iNum_41818110087;

				// variabel print
				$sc_41818110087 	= $sc_41818110087." ".$iNum_41818110087;

				// jika bukan karakter terakhir maka tambahkan "+"
				if ($c_41818110087 < $r_41818110087) $sc_41818110087 = $sc_41818110087. " + ";

				// tambahkan angka awal (2=>4=>6)
				$iNum_41818110087 	+= 2;
			}


			echo "$sc_41818110087 = $itotal_41818110087 <br>";

		}
	?>

</body>
</html>