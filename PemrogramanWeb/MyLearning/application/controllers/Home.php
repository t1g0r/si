<?php
	defined('BASEPATH') OR exit('No direct script access allowed');

	/**
	 * 
	 */
	class Home extends CI_Controller
	{
		
		function index(){
			$data["vPages"] = "dashboard";
			$data["title"] = "Dashboard";
			$data["description"] = "Home Panel";
			$this->load->view('home',$data);
		}
	}
?>