
function togglepass() {// 입력된 값이 보이는지 확인하여 상태를 변경
    var password = document.getElementById("inpass");
    if (password.type === "password") {
        password.type = "text";
    } else {
        password.type = "password";
    }
}

window.onload = function() {
    var urlParams = new URLSearchParams(window.location.search); //현재 URL의 쿼리 문자열을 가져옴
    var signupboolean = urlParams.get('signupSuccess'); //파라미터의 값을 가져옴
    if (signupboolean === "true") {
        alert("회원가입이 완료되었습니다");
    } else if (signupboolean === "false") {
        alert("회원가입에 실패했습니다. 다시 시도해주세요.");
    }
};




