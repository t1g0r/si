<?php
	require "DSOrang.php";


	$orang = new DSOrang();
	$orang->JenisKelamin	= "L";
	$orang->NamaLengkap		= "Tigor M Manurung";
	$orang->Alamat 			= "Joglo Baru";
	$orang->NoKTP 			= "12345";
	$orang->Cetak();

	echo "<br>";


	$orang = new DSOrang();
	$orang->JenisKelamin	= "P";
	$orang->NamaLengkap		= "Shinta Ayu Hadiyanti";
	$orang->Alamat 			= "Joglo Baru";
	$orang->NoKTP 			= "999999";
	$orang->Cetak();

?>