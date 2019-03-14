<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>图片列表</title>
<style type="text/css">
    *{
        margin: 0;
        padding: 0;
    }
    ul{
        list-style: none;
    }
    .box{
        width:958px;
        border: 1px solid #ddd;
        margin: 50px auto 0;
        overflow: hidden;
    }
    .title{
        width: 50%;
        height: 50px;
        border-bottom: 1px solid #ddd;
        margin: 0 auto;
    }
    .title span{
        display: inline-block;
        height: 50px;
        border-bottom: 2px solid red;
        font:18px '微软雅黑';
        color: #000;
        line-height: 50px;
        padding: 0 15px; 
    }
    .box ul{
        width:950px;
        margin: 20px 0 13px 20px; 
    }
    .box ul li{
        width: 160px;
        height: 68px;
        float:left;
        margin: 0 29px 25px 0;
    }
</style>
</head>
<body>
<div class='box'>
    <div class="title"><span>商品概览</span></div>
    <table border="1" width="100%">
  <tr>
    <th>商品名称</th>
    <th>商品生产日期</th>
     <th>商品价格</th>
     <th>商品产地</th>
     <th>操作</th>
  </tr>
  <tr>
    <td align="center">1</td>
    <td align="center">2</td>
    <td align="center">3</td>
    <td align="center">4</td>
    <td align="center">
    <a href="#">新增商品</a>
    <a href="#">修改商品</a>
    <a href="#">删除商品</a>
    </td>
  </tr>
  <tr>
    <td align="center">1</td>
    <td align="center">2</td>
    <td align="center">3</td>
    <td align="center">4</td>
    <td align="center">
    <a href="#">新增商品</a>
    <a href="#">修改商品</a>
    <a href="#">删除商品</a>
    </td>
  </tr>
  <tr>
    <td align="center">1</td>
    <td align="center">2</td>
    <td align="center">3</td>
    <td align="center">4</td>
    <td align="center">
    <a href="#">新增商品</a>
    <a href="#">修改商品</a>
    <a href="#">删除商品</a>
    </td>
  </tr>
  <tr>
    <td align="center">1</td>
    <td align="center">2</td>
    <td align="center">3</td>
    <td align="center">4</td>
    <td align="center">
    <a href="#">新增商品</a>
    <a href="#">修改商品</a>
    <a href="#">删除商品</a>
    </td>
  </tr>
</table>
</div>
</body>
</html>