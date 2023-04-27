function deletePost(postNo) {
    console.log(postNo);
    if(confirm("이 게시글을 삭제하시겠습니까?")) {
        $.ajax ({
            type: "post",
            url: "/post/list/delete",
            data: {"postNo": postNo},
            dataType: "json",
            success: function() {
                alert("게시글이 삭제되었습니다.");
                location.href("/post/list");
            }
        }).fail(function(error) {
            console.log(error);
        });
    }else {
        return false;
    }
}