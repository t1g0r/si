<?php

class MPasien extends CI_Model {
    
    public function __construct() {
        parent::__construct();
    }
    
    function getAllData(){
        $query = $this->db->get("mpasien");
        return $query->result_array();
    }
}

?>