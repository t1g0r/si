<div class="box box-solid bg-yellow-gradient">
	<div class="box-header">
		<h3 class="box-title">DATA PASIEN</h3>
	</div>
</div>

<div class="box box-success">
	<div class="box-header">
		<div class="btn-group">
			<button type="button" class="btn btn-primary btn-sm"><i class="fa fa-refresh fa-lg"></i>Refresh</button>
			<button type="button" class="btn btn-primary btn-sm"><i class="fa fa-refresh fa-lg"></i>Add Data</button>
		</div>
	</div>

	<div class="box-body">
		<table id="dtPasien" class="table table-bordered table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th width="200">Nama Pasien</th>
					<th>Alamat</th>
					<th width="50">Keterangan</th>
					<th width="100">Aksi</th>
				</tr>
			</thead>
			<tbody>
				
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