// div#header 태그에 로그인 정보 출력
$.get("/bitcamp-java-project/html2/header.html", (data) => {
	$("#header").html(data);
	loadLoginUser();
});

function loadLoginUser() {
	$.getJSON("/bitcamp-java-project/json/auth/loginUser", (data) => {
		if (data == "")
			location.href = "/bitcamp-java-project/html2/auth/login.html";
		else 
			$("#username").text(data.id);
			$("#logoutBtn").click((e) => {
				window.alert("okok");
				e.preventDefault(); // 클릭했을 때 원래 하던 일이 있는데 그 것을 하지 말라!
				$.get("/bitcamp-java-project/json/auth/logout", () => {
					location.href = "/bitcamp-java-project/html2/auth/login.html";
				});
			});
	});
}