// div#header 태그에 로그인 정보 출력
var xhr = new XMLHttpRequest();
xhr.open("GET", "/bitcamp-java-project/html/header.html", false); // 동기 방식으로 요청한다.
xhr.send();
header.innerHTML = xhr.responseText; // 서버로부터 받은 header를 페이지에 삽입한다.

var xhr = new XMLHttpRequest();
xhr.open("GET", "/bitcamp-java-project/json/auth/loginUser", false);
xhr.send();
if (xhr.responseText == "") {
	location.href = "/bitcamp-java-project/html/auth/login.html";
} else {
	var data = JSON.parse(xhr.responseText);
	username.textContent = data.id;
}