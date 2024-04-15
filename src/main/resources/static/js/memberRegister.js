
function togglepass() {// 입력된 값이 보이는지 확인하여 상태를 변경
    var password = document.getElementById("inpass");
    if (password.type === "password") {
        password.type = "text";
    } else {
        password.type = "password";
    }
}




