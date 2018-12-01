<div class="box box-solid bg-yellow-gradient">
	<div class="box-header">
		<h3 class="box-title">DATA PASIEN</h3>
	</div>
</div>

<div class="box box-success">
	<div class="box-header">
		<div class="btn-group">
			<button type="button" class="btn btn-primary btn-sm"><i class="fa fa-refresh fa-lg"></i>Add Data</button>
		</div>
	</div>

	<div class="box-body">
		<table id="dtPasien" class="table table-bordered table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th width="200">Nama Pasien</th>
					<th>Jenis Kelamin</th>
					<th>Alamat</th>
					<th>Keterangan</th>
					<th width="125">Aksi</th>
				</tr>
			</thead>
			<tbody>
				<?php
					foreach($table as $data){
						echo "
								<td>".$data['kode']."</td>
								<td>".$data['nama']."</td>
								<td>".($data['sex']=="1"?"Laki-Laki":"Perempuan")."</td>
								<td>".$data['alamat']."</td>
								<td>".$data["keterangan"]."</td>
								<td>
									<a class='btn btn-default'>Edit</a>
									<a class='btn btn-default'>Hapus</a>
					             </td>
							</tr>
						";
					}
				?>
				
			</tbody id="checkboxlist">

		</table>
	</div>
	
</div>


<script type="text/javascript">
	$(function () {
		$("#dtPasien").dataTable({
			"aoColumnDefs":[{
				"bSortable":false,
				"aTargets":[0,4]
			}],
			"order":[[1,"asc"]]
		});
	})
</script>