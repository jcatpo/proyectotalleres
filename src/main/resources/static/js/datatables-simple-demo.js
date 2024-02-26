document.addEventListener('DOMContentLoaded', function() {
    const datatablesSimple = document.getElementById('datatablesSimple');
    
    if (datatablesSimple) {
        new simpleDatatables.DataTable(datatablesSimple, {
            language: {
                search: {
                    placeholder: "<span th:text=\"#{datatable.search}\">Buscar...</span>",
                },
                lengthMenu: "<span th:text=\"#{datatable.showing}\"></span> _MENU_ <span th:text=\"#{datatable.entries}\">entradas por página</span>",
                info: "<span th:text=\"#{datatable.showing}\">Mostrando</span> _START_ <span th:text=\"#{datatable.to}\">a</span> _END_ <span th:text=\"#{datatable.of}\">de</span> _TOTAL_ <span th:text=\"#{datatable.entries}\">entradas por página</span>",
            }
        });
    }
});