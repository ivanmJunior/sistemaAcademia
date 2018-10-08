(function() {
  'use strict';
  window.addEventListener('load', function() {
    // Busque todos os formulários que queremos aplicar estilos de validação Bootstrap personalizados para
    var forms = document.getElementsByClassName('needs-validation');
    // Faça um loop sobre eles e impeça a submissão
    var validation = Array.prototype.filter.call(forms, function(form) {
      form.addEventListener('submit', function(event) {
        if (form.checkValidity() === false) {
          event.preventDefault();
          event.stopPropagation();
        }
        form.classList.add('was-validated');
      }, false);
    });
  }, false);
})();

