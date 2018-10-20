<?php
	/**
	 * 
	 */
	class DSOrang
	{
		public $JenisKelamin;
		public $NamaLengkap;
		public $Alamat;
		public $NoKTP;

		function Cetak(){
			$sex 	= ($this->JenisKelamin == 'L'? "Laki-laki":"Perempuan");

			// echo "Hi <b>$this->NamaLengkap</b>, jenis kelamin kamu adalah <b>$sex</b>";
			// echo " tinggal di <b>$this->Alamat</b>, an no ktp <b>$this->NoKTP</b>";

			echo " Hi : <b>$this->NamaLengkap
					</b>, jenis kelamin <b>: $sex
				 	</b>, tinggal di : <b>$this->Alamat
			 	 	</b>, dan nomor KTP : <b>$this->NoKTP</b>";
		}
		
		// function __construct(argument)
		// {
		// 	# code...
		// }
	}
?>