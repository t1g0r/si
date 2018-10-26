<?php
	// require "mahasiswa.php";

	// $mhs = new Mahasiswa();

	// $mhs->NIM 		= "1111";
	// $mhs->Nama 		= "Tigor";
	// $mhs->Alamat	= "joglo";

	// $mhs->Cetak();
	// for (namavar = nilai ; kondisi ; incremental)

	for ($row=1 ; $row<=100 ; $row++){
		//kode disini akan di loop
		$str = "";

		for ($column=1 ; $column<=$row ; $column++){
			$str = $str."i";
		}

		echo "$str<br>";

	}

/*
i
ii
iii
iiii
iiiii

*/

?>