# proficiency

<html>
<body>
<table border="1" width="700" height="1000">
<tr>
<td>Description</td>
<td>Method</td>
<td>URI </td>
<td>Request</td>
<td>Response</td>
</tr>
<tr>
<td>회원가입</td>
<td>POST</td>
<td>/api/user/signup</td>
<td>{
"username":"username",
"password": "password"
}</td>
<td>Response</td>
</tr>
<tr>
<td>로그인</td>
<td>POST</td>
<td>/api/user/login</td>
<td>{
"username":"username",
"password": "password"
}</td>
<td>Response</td>
</tr>
<tr>
<td>게시글 작성</td>
<td>POST</td>
<td>/api/posts</td>
<td>{
"title" : "title",
"content" : "content",
"username" : "username",
"password" : "password"
}</td>
<td>Response</td>
</tr>
<tr>
<td>전체 게시글 목록 조회</td>
<td>GET</td>
<td>/api/posts</td>
<td>-</td>
<td>{
"createdAt": "createdAt”,
"modifiedAt": "modifiedAt”,
"id": 1,
"title": "title",
"content": "content",
"username": "username"
}</td>
</tr>
<tr>
<td>선택한 게시글 조회</td>
<td>GET</td>
<td>/api/posts/{id}</td>
<td>-</td>
<td>{
"createdAt": "createdAt”,
"modifiedAt": "modifiedAt”,
"id": 1,
"title": "title",
"content": "content",
"username": "username"
}</td>
</tr>
<tr>
<td>선택한 게시글 수정</td>
<td>PUT</td>
<td>/api/posts/{id}</td>
<td>{
"title" : "title2",
"content" : "content2",
"username" : "username2",
"password" :"password2"
}</td>
<td>{
"createdAt": "createdAt”,
"modifiedAt": "modifiedAt”,
"id": 1,
"title": "title2",
"content": "content2",
"username": "username2"
}</td>
</tr>
<tr>
<td>선택한 게시글 삭제</td>
<td>DELETE</td>
<td>/api/posts/{id}</td>
<td>{
"password" :"password"
}</td>
<td>Response</td>
</tr>
</table>
</body>
</html>
