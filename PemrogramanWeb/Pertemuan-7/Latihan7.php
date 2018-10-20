<?php
	require "DSOrang.php";
?>
<!DOCTYPE html>
<html>
<head>
	<title>Latihan 7</title>
</head>
<body>
	<h1>Data Input</h1>
	<form name="FormInput" method="Post" action="Latihan7.php">
		<table cellpadding="1" cellspacing="2" cellpadding="2" width="50%" border="1">
			<tr>
				<td>Nama Lengkap</td>
				<td><input type="text" id="nama" name="nama"></td>
			</tr>	
			<tr>
				<td width="30%">Alamat</td>
				<td>
					<textarea id = "alamat" name="alamat" cols="40" rows="4"></textarea></td>
			</tr>	
			<tr>
				<td width="30%">Nomor KTP</td>
				<td><input type="text" id="noktp" name="noktp"></td>
			</tr>
			<tr>
				<td width="30%">Jenis Kelamin</td>
				<td><select type="select" id="kelamin" name="kelamin"> 
					<option value="L">Laki-laki</option>
					<option value="P">Perempuan</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" name="submit" value="Kirim"></td>
			</tr>
		</table>
		
	</form>

	<br/>
	<br/>

	<?php
		if ($_POST){
			//nama dibalik
			$nama 	= strrev($_POST['nama']);

			//case kelamin
			$sex 	= ($_POST['kelamin'] == 'L'? "Laki-laki":"Perempuan");

			$orang = new DSOrang();
			$orang->JenisKelamin	= $_POST['kelamin'];
			$orang->NamaLengkap		= $_POST['nama'];
			$orang->Alamat 			= $_POST['alamat'];
			$orang->NoKTP 			= $_POST['noktp'];
			$orang->Cetak();
		};
	?>
</body>
</html>