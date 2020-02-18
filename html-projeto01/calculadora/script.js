function calcular(op){
    var num1 = parseFloat(document.getElementById("txtNum1").value);
    var num2 = parseFloat(document.getElementById("txtNum2").value);
    var result = 0;

    switch(op){
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            result = num1 / num2;
            break;
    }

    if(!isNaN(result)) { <!-- NaN: not a number -->
        alert(result);
    }else{
        alert("número inválido");
    }
}
