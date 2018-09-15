<!DOCTYPE html>
<html>
<head>
	<title>Latihan 4</title>
</head>
<body>
	<h1>Data Input</h1>
	<form name="FormInput" method="Post" action="Latihan4.php">
		<table cellpadding="1" cellspacing="2" cellpadding="2" width="50%" border="1">
			<tr>
				<td>Nama Lengkap</td>
				<td><input type="text" id="nama" name="nama"></td>
			</tr>	
			<tr>
				<td width="30%">Alamat</td>
				<td><input type="text" id ="alamat" name="alamat"></td>
			</tr>	
			<tr>
				<td width="30%">Nomor KTP</td>
				<td><input type="text" id="noktp" name="noktp"></td>
			</tr>
			<tr>
				<td width="30%">Jenis Kelamin</td>
				<td><select type="select" id="kelamin" name="kelamin"> 
					<option value="Laki-laki">Laki-laki</option>
					<option value="Perempuan">Perempuan</option>
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
			echo " Hi : <b>".$_POST['nama'].
				 "</b>, jenis kelamin <b>: ".$_POST['kelamin'].
				 "</b>, tinggal di : <b>".$_POST['alamat'].
			 	 "</b>, dan nomor KTP : <b>".$_POST['noktp']."</b>";
		};
	?>
</body>
</html>