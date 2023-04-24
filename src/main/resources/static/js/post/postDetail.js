function deletePost() {
    if(confirm("이 게시글을 삭제하시겠습니까?")) {
        console.log('삭제쿼리');
    }else {
        return false;
    }
}