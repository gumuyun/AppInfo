<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-12-17
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html;charset=UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>开发者登录</title>

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath }/statics/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath }/statics/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${pageContext.request.contextPath }/statics/css/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="https://colorlib.com/polygon/gentelella/css/animate.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath }/statics/css/custom.min.css" rel="stylesheet">
</head>

<body class="login">
<div>
    <a class="hiddenanchor" id="signup"></a>
    <a class="hiddenanchor" id="signin"></a>

    <div class="login_wrapper">
        <div class="animate form login_form">
            <section class="login_content">
                <form method="post" id="loginFrm" action="/dev/user/doLogin.html">
                    <h1>开发者登录</h1>
                    <div>
                        <input type="text" id="devCode" class="form-control" name="devCode" placeholder="请输入登录名" required="" /><span></span>

                    </div>
                    <div>
                        <input type="password" id="devPassword" class="form-control" name="devPassword" placeholder="请输入密码" required="" /><span></span>
                    </div>
                    <div>
                        <span>${msg}</span>
                    </div>
                    <div>
                        <a class="btn btn-default" href="javascript:void(0);" id="loginSmt">登录</a>
                        <a class="btn btn-default" href="javascript:void(0);" onclick="history.back();">返回</a>
                    </div>

                    <div class="clearfix"></div>

                    <div class="separator">
                        <div class="clearfix"></div>
                        <br />
                        <div>
                            <h1><i class="fa fa-paw"></i> APP信息管理平台 </h1>
                            <p>©2018 All Rights Reserved. 北大青鸟</p>
                        </div>
                    </div>
                </form>
            </section>
        </div>

    </div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#loginSmt").click(function () {
            var $devCode=$("#devCode")
            var $devPassword=$("#devPassword")
            if ($devCode.val()==""){
                $devCode.next().html("登录名不能为空！");
                return;
            }
            if ($devPassword.val()==""){
                $devPassword.next().html("密码不能为空！");
                return;
            }
            $("#loginFrm").submit();
        });


    })

</script>
</body>
</html>
