function displayFormFields() {
    var selectedOption = document.getElementById("tipoUsuario").value;
    if (selectedOption == "cliente") {
        document.getElementById("formulario-cliente").classList.remove("d-none");
        document.getElementById("formulario-profesional").classList.add("d-none");
        document.getElementById("formulario-administrativo").classList.add("d-none");
    } else if (selectedOption == "profesional") {
        document.getElementById("formulario-cliente").classList.add("d-none");
        document.getElementById("formulario-profesional").classList.remove("d-none");
        document.getElementById("formulario-administrativo").classList.add("d-none");
    } else if (selectedOption == "administrativo") {
        document.getElementById("formulario-cliente").classList.add("d-none");
        document.getElementById("formulario-profesional").classList.add("d-none");
        document.getElementById("formulario-administrativo").classList.remove("d-none");
    }
}