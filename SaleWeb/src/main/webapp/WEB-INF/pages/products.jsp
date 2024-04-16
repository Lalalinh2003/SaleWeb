<%-- 
    Document   : products
    Created on : Apr 3, 2024, 3:57:17 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h1 class="text-center text-info mt-1">QUẢN LÝ SẢN PHẨM</h1>

<c:url value="/products" var="action"/>
<form:form method="post" action="${action}" modelAttribute="product" enctype="multipart/form-data">
    <form:errors path="*" element="div" cssClass="alert alert-danger"/>
    <div class="form-floating mb-3 mt-3">
        <form:input class="form-control" placeholder="Tên sản phẩm" id="name" path="name"/>
        <label for="name">Tên sản phẩm</label>
    </div>
    <div class="form-floating mb-3 mt-3">
        <form:input class="form-control" placeholder="Giá sản phẩm" id="price" path="price"/>
        <label for="price">Giá sản phẩm</label>
    </div>
    <div class="form-floating mb-3 mt-3">
        <form:input type="file" class="form-control" id="image" path="file"/>
        <label for="image">Ảnh sản phẩm</label>
    </div>
    <div class="form-floating">
        <form:select class="form-select" id="categoryId" path="categoryId">
            <c:forEach items="${categories}" var="c">
                <option value="${c.id}">${c.name}</option>
            </c:forEach>      
        </form:select>
        <label for="categoryId" class="form-label">Danh mục:</label>
    </div>
    <div class="form-floating">
        <button class="btn btn-info mt-1" type="submit">Thêm</button>
    </div>
</form:form>
