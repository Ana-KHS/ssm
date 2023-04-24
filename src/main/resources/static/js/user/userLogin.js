function clickLogin() {
    var userId = document.getElementById('userId').value;
    var userPassword = document.getElementById('userPassword').value;

    if(userId == '' || userId == null) {
        alert("아이디를 입력해 주세요.");
    }else if(userPassword == '' || userPassword == null) {
        alert("비밀번호를 입력해 주세요.");
    }
}