<%-- 
    Document   : header
    Created on : Apr 3, 2024, 2:33:52 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">E-commerce Website</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#">Trang chủ</a>
                </li>
                
                <C:foreach items="${categories}" var="c">
                    <li class="nav-item">
                        <a class="nav-link" href="#">${c.name}</a>
                    </li>
                </C:foreach>
            </ul>
        </div>
    </div>
</nav>