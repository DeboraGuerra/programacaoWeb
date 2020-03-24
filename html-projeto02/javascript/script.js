function meuNome(){
    var nome = document.getElementById('txtNome');
    alert("Meu nome é " + nome.value + ".");
}

function calculo(){
    var numero1 = document.getElementById('num1');
    var numero2 = document.getElementById('num2');

    var resultado = parseInt(numero1.value) + parseInt(numero2.value);

    alert(resultado);
}
