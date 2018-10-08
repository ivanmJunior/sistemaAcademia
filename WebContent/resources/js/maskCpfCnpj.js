$("#validationCPF").keydown(function(){
    try {
        $("#validationCPF").unmask();
    } catch (e) {}

    var tamanho = $("#validationCPF").val().length;

    if(tamanho < 11){
        $("#validationCPF").mask("999.999.999-99");
    } else if(tamanho >= 11){
        $("#validationCPF").mask("99.999.999/9999-99");
    }

    // ajustando foco
    var elem = this;
    setTimeout(function(){
        // mudo a posição do seletor
        elem.selectionStart = elem.selectionEnd = 10000;
    }, 0);
    // reaplico o valor para mudar o foco
    var currentValue = $(this).val();
    $(this).val('');
    $(this).val(currentValue);
});