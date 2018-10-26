<!DOCTYPE html>
<html>
<head>
	<title>Reverse String</title>
</head>
<body>
	<?php
		$sHasil_41818110087		= "";
		$sSumber_41818110087 	= $_POST["edKata_41818110087"];
		$sBalikkan_41818110087 	= strrev($sSumber_41818110087);

		// masukkan ke array
		$stemp_41818110087 		= explode(" ", $sBalikkan_41818110087);

		// loop array untuk membalikkan
		foreach ($stemp_41818110087 as $key_41818110087 => $value_41818110087) {
			$sHasil_41818110087 = $sHasil_41818110087.(($key_41818110087 % 2)== "1" ? strtolower($value_41818110087):strtoupper($value_41818110087))." ";
		}
	?>
	<h1>Hasil Data</h1>
	<table>
		<tr>
			<td><b>Sumber kata yang dimasukkan</b></td>
			<td>:</td>
			<td><?php echo $sSumber_41818110087 ?></td>
		</tr>
		<tr>
			<td><b>Hasil data yang dibalikkan</b></td>
			<td>:</td>
			<td><?php echo $sHasil_41818110087 ?></td>
		</tr>
	</table>

</body>
</html>