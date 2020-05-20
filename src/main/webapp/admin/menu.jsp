<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/19
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>博客后台管理</title>
    <%@ include file="common/head.jspf" %>
    <style type="text/css">

        body {
            font-family: microsoft yahei;
        }

    </style>

    <script>
        /**
         * 点击选项后，打开选项卡
         * @param text //选项卡标题内容
         * @param url //选项卡对应的打开路径
         * @param icon //选项卡本身显示图标
         */
        function openTab(text, url, icon) {
            //判断选项卡是否存在
            if ($("#tabs").tabs('exists', text)) {
                //存在：选择与标题相同的选项卡显示
                $("#tabs").tabs("select", text);
            } else {
                //不存在：新建所选标题的选项卡
                $("#tabs").tabs('add', {
                    title: text,         //对应标题
                    closable: true,      //允许选项卡折叠
                    iconCls: icon,       //显示图标
                    content: "<iframe frameborder=0 scrolling='auto' style='width:100%;height:100%' src='${blog}/admin/" + url + "'></iframe>"
                    //选项卡显示内容，包含指向路径url,'${blog}'为前面设置的head.hspf中表示当前项目路径
                })
            }
        }

    </script>

</head>

<body class="easyui-layout">
<div data-options="region:'north'" style="height:78px;background-color:#E0ECFF">
    <table style="padding:5px" width="100%">

        <tr>
            <td width="50%">
                <h2>博客后台系统</h2>
            </td>
            <td valign="bottom" align="right" width="50%">
                <font size="3">&nbsp;&nbsp;<strong>欢迎：</strong>admain</font>
            </td>
        </tr>


    </table>
</div>
<div data-options="region:'south'" style="height:25px;padding: 5px" align="center">
    Copyright © 2020 仿SSM博客系统练习
</div>
<div data-options="region:'west',title:'导航菜单'" style="width:200px;">
    <div class="easyui-accordion" data-options="fit:true,border:false"> <%--fit:true 自动适应大小--%>
        <div title="常用操作" data-options="selected:true,iconCls:'icon-more'" style="padding:10px">

            <a href="javascript:openTab('写博客','writeblog.jsp','icon-writeblog')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-writeblog'"
               style="width: 150px;text-align: left">写博客</a> <%--plain:true 去除格式，不添加这个的话‘写博客’三个字有一个按钮框围着,因为这条easyui添加的class属性缘故--%>

            <a href="javascript:openTab('评论审核','commentReview.jsp','icon-review')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-review'"
               style="width: 150px;text-align: left">评论审核</a>

        </div>
        <div title="博客管理" data-options="iconCls:'icon-bloggl'" style="padding:10px">

            <a href="javascript:openTab('写博客','writeblog.jsp','icon-writeblog')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-writeblog'"
               style="width: 150px;text-align: left">写博客</a>

            <a href="javascript:openTab('博客信息管理','blogManage.jsp','icon-bloggl')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-bloggl'"
               style="width: 150px;text-align: left">博客信息管理</a>


        </div>
        <div title="博客类别管理" data-options="iconCls:'icon-bloglb'" style="padding: 10px">

            <a href="javascript:openTab('博客类别信息','blogTypeManage.jsp','icon-bloglb')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-bloglb'"
               style="width: 150px;text-align: left">博客类别信息</a>

        </div>
        <div title="评论管理" data-options="iconCls:'icon-plgl'" style="padding: 10px">

            <a href="javascript:openTab('评论审核','commentReview.jsp','icon-review')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-review'"
               style="width: 150px;text-align: left">评论审核</a>

            <a href="javascript:openTab('评论信息管理','commentManage.jsp','icon-plgl')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-plgl'"
               style="width: 150px;text-align: left">评论信息管理</a>

        </div>
        <div title="个人信息管理" data-options="iconCls:'icon-man'" style="padding: 10px">

            <a href="javascript:openTab('修改个人信息','modifyInfo.jsp','icon-man')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-man'"
               style="width: 150px;text-align: left">修改个人信息</a>

        </div>
        <div title="系统管理" data-options="iconCls:'icon-system'" style="padding: 10px">

            <a href="javascript:openTab('友情链接管理','linkManage.jsp','icon-link')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-link'"
               style="width: 150px;text-align: left">友情链接管理</a>

            <a href="javascript:openTab('修改密码','modifyPassword.jsp','icon-lock')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-lock'"
               style="width: 150px;text-align: left">修改密码</a>

            <a href="javascript:openTab('刷新系统缓存','refresh.jsp','icon-reload')" class="easyui-linkbutton"
               data-options="plain:true,iconCls:'icon-reload'"
               style="width: 150px;text-align: left">刷新系统缓存</a>

            <a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-undo'"
               style="width: 150px;text-align: left">安全退出</a>

        </div>

    </div>
</div>
<div data-options="region:'center'" style="background:#eee;">
    <div class="easyui-tabs" fit="true" border="false" id="tabs">

        <div title="首页" data-options="iconCls:'icon-home'">
            <div align="center" style="padding-top: 100px"><font color="blue" size="10">欢迎使用~</font></div>
        </div>

    </div>

</div>


</body>
</html>
