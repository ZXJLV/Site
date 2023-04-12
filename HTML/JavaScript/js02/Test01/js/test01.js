var num1ValueS=null;
var num1ValueN = 0;

var priceS = null;
var priceN = 0;

//每种商品的总价
var priceSum1 = 0
var priceSum2 = 0

//所有商品总价
var priceSum = 0.0;
function minus(num) {

    if (num === 0){
        num1ValueS = document.getElementById("num1").value
        num1ValueN = parseInt(num1ValueS)

        if (num1ValueN <= 1){
            alert("不能再减了！！！")
        }else {
            num1ValueN-=1
            priceS = document.getElementById("price01").value

            priceN = parseFloat(priceS)
            console.log(priceN);
            priceN = priceN*num1ValueN
            priceN = priceN.toFixed(2);
            priceSum1 = priceN
            priceSum1 = parseFloat(priceSum1)
            document.getElementById("num1").value = num1ValueN
            document.getElementById("price0").innerHTML="¥"+priceN

        }

    }else if (num === 1) {
        num1ValueS = document.getElementById("num2").value
        num1ValueN = parseInt(num1ValueS)

        if (num1ValueN <= 1){
            alert("不能再减了！！！")
        }else {
            num1ValueN-=1
            priceS = document.getElementById("price02").value

            priceN = parseFloat(priceS)
            console.log(priceN);
            priceN = priceN*num1ValueN
            priceN = priceN.toFixed(2);
            priceSum2 = priceN
            priceSum2 = parseFloat(priceSum2)

            document.getElementById("num2").value = num1ValueN
            document.getElementById("price1").innerHTML="¥"+priceN
        }


    }
    sum();

}

function add(num) {

    if (num === 0){
        num1ValueS = document.getElementById("num1").value
        num1ValueN = parseInt(num1ValueS)

        num1ValueN+=1
        console.log(num1ValueN);

        priceS = document.getElementById("price01").value

        priceN = parseFloat(priceS)
        console.log(priceN);
        priceN = priceN*num1ValueN
        priceN = priceN.toFixed(2);
        priceSum1 = priceN
        priceSum1 = parseFloat(priceSum1)

        document.getElementById("num1").value = num1ValueN
        document.getElementById("price0").innerHTML="¥"+priceN


    }else if (num === 1) {
        num1ValueS  = document.getElementById("num2").value
        num1ValueN = parseInt(num1ValueS)

        num1ValueN+=1
        console.log(num1ValueN);

        priceS = document.getElementById("price02").value

        priceN = parseFloat(priceS)
        console.log(priceN);
        priceN = priceN*num1ValueN
        priceN = priceN.toFixed(2);
        priceSum2 = priceN
        priceSum2 = parseFloat(priceSum2)

        document.getElementById("num2").value = num1ValueN
        document.getElementById("price1").innerHTML="¥"+priceN

    }

    sum();

}

function sum(){
    priceSum1 = document.getElementById("price01").value;
    priceSum1 = parseFloat(priceSum1)
    priceSum2 = document.getElementById("price02").value;
    priceSum2 = parseFloat(priceSum2)

    priceSum = priceSum1 + priceSum2;
    console.log(priceSum1);
    console.log(priceSum2);
    console.log("priceSum"+priceSum);
    document.getElementById("totalPrice").innerHTML=priceSum

}

window.onload = function() {
    // 在页面加载完成后自动执行的代码
    sum();
}


