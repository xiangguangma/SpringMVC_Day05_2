<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/11/9
  Time: 上午11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
    <script src="/js/jquery-3.2.1.js"></script>
</head>
<body>
<h1>主页</h1>

<form action="/login" method="post">
    <select id="depart" name="departId">
        <option value="-1">---请--选--择---</option>
    </select>

    <select id="post" name="postId">
        <option value="-1">---请--选--择---</option>
    </select>
    <br>
    学号: <br>
    ID: <input type="checkbox" name="ids" value="1"><br>
    ID: <input type="checkbox" name="ids" value="2"><br>
    ID: <input type="checkbox" name="ids" value="3"><br>

    <input type="submit" value="提交">

</form>


<script>
    /* 页面加载成功直接通过ajax请求获取部门集合 */
    $.ajax({
        type: "get",
        url: "/hr/findAll",

        success: function (result) {

            var selDepart = document.getElementById("depart");
            selDepart.innerHTML = "<option value='-1'>---请--选--择---</option>";

            /*遍历结果集*/
            for (var i = 0; i < result.length; i++){
                var depart = result[i];

                selDepart.innerHTML += "<option value='"+ depart.depId +"'>"+depart.depName+"</option>"

            }

        }
    });

    /* 根据部门id 发起职务请求 */
    $("#depart").change(function () {
        /*得到选中部门id*/
        var depId =  $("#depart").val();

        $.ajax({
            type: "get",
            url: "/hr/findPostByDepId",
            data: {
                "depId": depId
            },
            success: function (result) {
                var selPost = document.getElementById("post");
                selPost.innerHTML = "<option value='-1'>---请--选--择---</option>";

                /*遍历结果集*/
                for (var i = 0; i < result.length; i++){
                    var post = result[i];

                    selPost.innerHTML += "<option value='"+ post.postId +"'>"+post.postName+"</option>"

                }
            }
        })
    })
</script>

</body>
</html>
