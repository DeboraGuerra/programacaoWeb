function selecionarMateria() {
    var checkboxes = document.getElementsByName('ckMateria'); //devolve um array de checkbox
    var dvconteudo = document.getElementById('dvConteudo');

    for (var i = 0; i < checkboxes.length; i++) {
        if (checkboxes[i].checked == true) {
            alert(checkboxes[i].id);
            dvconteudo.innerHTML += checkboxes[i].id;
        }
    }
}
