
function calculate(){
    let num1 = parseInt(document.getElementById("num1").value);
    let num2 = parseInt(document.getElementById("num2").value)
    let operation = document.getElementById("operator").value;

    if(isNaN(num1) || isNaN(num2)){
        alert("Please enter a valid number");
    }


    let result;
    switch(operation){
        case "+":{
             result = num1 + num2;
        } break;
        case "-":{
             result = num1 - num2;
    } break;
    case "*":{
        result = num1 * num2;
    }break;
    case "/":{
        if (num2 === 0) {
            document.getElementById('result').innerText = "Cannot divide by zero.";
            return;
        }
         result = num1 / num2;
    }break;
    default:{
        result = "Invalid operation";
    }
    }
    document.getElementById("result").innerText= `Result: ${result}`;
}