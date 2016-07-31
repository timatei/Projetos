    <div class="modal fade" id="confirm-delete" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
            
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="myModalLabel">Confirmar excluir ?</h4>
                </div>
            
                <div class="modal-body">
                    <p class="debug-url"></p>
                </div>
                
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Desistir</button>
                    <a class="btn btn-danger btn-ok">Deletar</a>
                </div>
            </div>
        </div>
    </div>

    <script>
        $('#confirm-delete').on('show.bs.modal', function(e) {
            $(this).find('.btn-ok').attr('href', $(e.relatedTarget).data('href'));
            $('.debug-url').html('Delete URL: <strong>' + $(this).find('.btn-ok').attr('href') + '</strong>');
        });
    </script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-lista').DataTable({
                responsive: true,
                "language": {
                	"search": "Filtrar:",
                	"emptyTable": "Nenhum dado disponíveis na tabela",
                    "lengthMenu": "Mostrando _MENU_ registros por página",
                    "zeroRecords": "Nenhum registro",
                    "info": "_PAGE_ de _PAGES_",
                    "infoEmpty": "Nenhum registro encontrado",
                    "infoFiltered": "(filtrado no total de _MAX_ registros)",
                    "paginate": {
                        "first":      "Primeiro",
                        "last":       "Último",
                        "next":       "Próximo",
                        "previous":   "Anterior"
                    },
                }
        });
    });
    
    $('#confirm-delete').on('show.bs.modal', function(e) {
        $(this).find('.btn-ok').attr('href', $(e.relatedTarget).data('href'));
        $('.debug-url').html('Delete URL: <strong>' + $(this).find('.btn-ok').attr('href') + '</strong>');
    });    
    </script>