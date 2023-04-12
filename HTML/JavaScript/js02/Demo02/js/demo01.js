function exit() {
    window.close()
}

function shouCang() {
    alert("收藏成功！")
}

function deleteShopping() {
    var deleteShopping = confirm("确认删除吗？")

    if (deleteShopping) {
        alert("删除成功")
    }else {
        alert("删除失败")
    }
}

function jieSuan() {
    window.open("demo01.html","_blank")
}