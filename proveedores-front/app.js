var currentRecord = {}

function save() {
    currentRecord.nombre = $('#proveedor').val();
    currentRecord.domicilio = $('#domicilio').val();
    currentRecord.cuitcuil = $('#cuitcuil').val(); 
    currentRecord.localidad = $('#localidad').val();     

    $.ajax({
        method : 'POST',
        url : 'http://localhost:8080/proveedores',
        contentType : 'application/json',
        data : JSON.stringify(currentRecord),
        success : () => {
            currentRecord = {};
            alert('Ok.');
            $('#proveedor').val('');
            $('#domicilio').val('');
            $('#cuitcuil').val('');
            $('#localidad').focus()
            load();
        },
        error : () => {
            alert('VxD');
        }
    })
}

function load() {

    var lista = $('#lista');
    lista.html('');
    $.ajax({
        method : 'GET',
        url : 'http://localhost:8080/proveedores',
        success : (response) => {
            response.forEach((item) => {
                lista.append($(`<div class="lista-item d-flex justify-content-between"><span>${item.nombre} ${item.apellido}</span><button class="btn btn-primary" onclick="loadProveedores(${item.id})">Ver</button></div>`));
            });
        },
        error : () => {
            alert('VxD')
        }
    })

}

function loadProveedores(id) {

    $.ajax({
        method : 'GET',
        url : 'http://localhost:8080/proveedores/' + id,
        success : function (response) {
            currentRecord = response;
            $('#proveedor').val(response.nombre);
            $('#domicilio').val(response.domicilio);
            $('#cuitcuil').val(response.cuitcuil);
            $('#localidad').val(response.localidad.nombre);            
        },
        error : function () {
            alert('VxD');
        }
    })
}

$(() => {
 load();   
})

