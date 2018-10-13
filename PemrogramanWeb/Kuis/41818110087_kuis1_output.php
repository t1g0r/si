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

		// proses looping untuk baris
		for($r_41818110087 		= 0 ; $r_41818110087 < $inputBaris_41818110087 ; $r_41818110087++){

			$sc_41818110087 	= "<b>Baris ".($r_41818110087+1)."</b> : ";

			// nilai angka awal
			$iNum_41818110087 	= 1;

			// variabel untuk total penjumlahan
			$itotal_41818110087 = 0;

			// inisiasi variabel incremental (3,5,7,dst)
			$iinc__41818110087 = 3;

			// proses looping untuk kolom
			for($c_41818110087 = 0 ; $c_41818110087 <= $r_41818110087 ; $c_41818110087++){
				// variabel total penjumlahan
				$itotal_41818110087 += $iNum_41818110087;

				// variabel print
				$sc_41818110087 	= $sc_41818110087." ".$iNum_41818110087;

				// jika bukan karakter terakhir maka tambahkan "+"
				if ($c_41818110087 < $r_41818110087) $sc_41818110087 = $sc_41818110087. " + ";

				// tambahkan angka awal (2=>4=>6)
				$iNum_41818110087 	+= $iinc__41818110087;

				// tambahkan variabel incremental + 2 untuk mendapatkan nilai ganjil
				$iinc__41818110087 	+= 2;
			}

			// print hasil di layar
			echo "$sc_41818110087 = $itotal_41818110087 <br>";

		}
	?>

</body>
</html>