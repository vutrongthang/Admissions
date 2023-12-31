<%-- 
    Document   : header
    Created on : Apr 28, 2023, 4:03:57 PM
    Author     : vutrongthang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark sticky-top ">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Hỗ Trợ Tuyển Sinh</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link " href="#">Trang chủ</a>
                </li>
               
            </ul>
        </div>
        <c:url value="/" var="action"/>
        <form class="d-flex">
            <input class="form-control me-2" type="text" name="kw" placeholder="Nhập tên...">
            <button class="btn btn-primary" type="submit">Tìm</button>
        </form>
    </div>
</nav>
