function openTab(evt, tabName) {
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }
    tablinks = document.getElementsByClassName("tablink");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
    document.getElementById(tabName).style.display = "block";
    evt.currentTarget.className += " active";
}

// 관리자 페이지 기본값: 회원 관리
document.getElementById("tab1").style.display = "block";
document.getElementsByClassName("tablink")[0].className += " active";

// 검색 리스트
function getSearchList() {

    event.preventDefault();

    $.ajax({
        type: "GET",
        url: "/admin/userlist",
        contentType: "application/json; charset=UTF-8",
        success: function (data) {
            alert(data);
            alert(JSON.stringify(data));

            var searchType = $("#search-type").val();
            var searchKeyword = $("#search-user").val();

            if (searchKeyword){
                if(searchType === "id") {
                    data = data.filter(user => user.usr_id.includes(searchKeyword));
                } else if (searchType === "nickname") {
                    data = data.filter(user => user.usr_nickname.includes(searchKeyword));
                }
            }


            // 테이블 초기화
            // $("#tab1").empty();

            $("#usertable").empty();

            let tablelist = `
            <table>
                <tr align="center">
                    <td><b>아이디</b></td>
                    <td><b>비밀번호</b></td>
                    <td><b>닉네임</b></td>
                    <td><b>이메일</b></td>
                    <td><b>이메일 수신</b></td>
                    <td><b>가입일</b></td>
                </tr>
            `;

            // 데이터 추가
            data.forEach(user => {
                tablelist += `
                <tr align="center">
                        <td>${user.usr_id}</td>
                        <td>${user.usr_password}</td>
                        <td>${user.usr_nickname}</td>
                        <td>${user.usr_email}</td>
                        <td>${user.usr_email_optout}</td>
                        <td>${user.usr_join_date}</td>
                    </tr>
                `;
            });

            tablelist += `</tbody></table>`;

            $("#usertable").html(tablelist);

        },
        error: function (xhr, status, error) {
            alert("user :" + xhr.status + "\n"
                + "message" + xhr.responseText + "\n"
                + "error: " + error);
        }
    });

}

function getSearchList2() {

    $.ajax({
        type: "GET",
        url: "/admin/communitylist",
        contentType: "application/json; charset=UTF-8",
        success: function(data){
            alert(data);
            alert(JSON.stringify(data));

            var searchTitle = $("#search-community").val();

            if (searchTitle) {
                data = data.filter(user => user.com_title.includes(searchTitle));  // usr_id 기준으로 필터링
            }

            // var searchType = $("search-type").val();
            // var searchKeyword = $("search-user").val();
            //
            // if (searchKeyword){
            //     if(searchType === "id") {
            //         data = data.filter(user => user.usr_id)
            //     }
            // }

            $("communitytable").empty();

            let tablelist = `
            
            <table>
            <tr align="center">
                        <td><b>번호</b></td>
                        <td><b>제목</b></td>
                        <td><b>닉네임</b></td>
                        <td><b>게시물 관리</b></td>
                        <td><b>신고 내역</b></td>
                        <td><b>작성날짜</b></td>
                    </tr>
            `;

            data.forEach(community => {
                tablelist += `
                <tr align="center">
                            <td>${community.com_post_number}</td>
                            <td>${community.com_title}</td>
                            <td>${community.usr_nickname}</td>
                            <td>${community.com_post_number}</td>
                            <td>${community.com_report_count}</td>
                            <td>${community.com_post_date}</td>
                        </tr>
                `;
            });

            tablelist += `</table>`;

            $("#communitytable").html(tablelist);
        },
        error: function (xhr, status, error){
            alert("community: " + xhr.status + "\n"
                +"message " + xhr.responseText + "\n"
                +"error: " + error);
        }
    });
}