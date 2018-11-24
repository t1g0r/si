<?php
	defined('BASEPATH') OR exit('No direct script access allowed');

	/**
	 * 
	 */
	class Pasien extends CI_Controller
	{
		
		function index(){
			$data["vPages"] = "pasien";
			$data["title"] = "Pasien";
			$data["description"] = "Data Pasien";
			$this->load->view('home',$data);
		}
	}
?>