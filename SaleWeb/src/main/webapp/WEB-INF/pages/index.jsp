<%-- 
    Document   : index
    Created on : Mar 20, 2024, 1:34:02 PM
    Author     : admin
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<h1 class="text-center text-info mt-1">QUẢN TRỊ SẢN PHẨM</h1>
<div>
    <a class="btn btn-info" href="<c:url value="/products" />">Thêm sản phẩm</a>
</div>
<table class="table table-striped mt-1">
    <tr>
        <th></th>
        <th>Id</th>
        <th>Tên</th><!-- comment -->
        <th>Giá</th>
        <th></th>
    </tr>
    
    <C:foreach items="${products}" var="p">
        <tr>
            <td> <img class="card-img-top" src="${p.image}" alt="${p.name}" style="width:300px"> </td>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${String.format("%,d", p.price)} VNĐ</td>
            <td>
                <button class="btn btn-info">Cập nhật</button>
                <button class="btn btn-danger">Xóa</button>
            </td>
        </tr>
    </C:foreach>
</table>

