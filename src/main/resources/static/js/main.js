// 모달 열기 함수
function openModal() {
    document.getElementById("myModal").style.display = "block";
}

// 모달 닫기 함수
function closeModal() {
    document.getElementById("myModal").style.display = "none";
}

// 사용자가 모달 외부를 클릭할 때 모달 닫기
window.onclick = function(event) {
    var modal = document.getElementById("myModal");
    if (event.target == modal) {
    modal.style.display = "none";
    }
}