<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-
8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>HistCarburants</title>


</head>
<body>

<nav><%@ include file="/header.jsp" %></nav>

<div class="row d-flex flex-column flex-shrink-0 p-5  ">
    <div class="col-12">
        <div class="card">
            <div class="card-body">
                <h4 class="card-title">Liste des Carburants</h4>
     <a href="HistCarburant?action=ajouterHistCarburant"><button type="button" data-bs-toggle="modal" data-bs-target="#AddModal" class="btn btn-default btn-sm"><i class="fas fa-plus-circle"></i>Ajouter nouvelle histcarburant</button></a>   
                <div class="table-responsive">
                    <table class="table align-middle text-nowrap">
                        <thead>
                            <tr>
                                <th class="text-dark font-medium fs-4">Date</th>
                                <th class="text-dark font-medium fs-4">Prix</th>
                                 <th class="text-dark font-medium fs-4">Station</th>
                                 <th class="text-dark font-medium fs-4">Carburant</th>
                                 
                              
                                <th class="text-dark font-medium fs-4">Action</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${listHistCarburants}" var="histcar">
                            <tr >
                                <td class="fs-4">${histcar.date}</td>	
                                <td class="fs-4">${histcar.prix}</td>
                                <td class="fs-4">${histcar.idSta}</td>
                                <td class="fs-4">${histcar.idCar}</td>
                                
                                 
                                <td class="fs-4">  
                                    <h5 class="mb-0 fw-normal">
                                     <a href="HistCarburant?action=delete&id=<c:out value='${histcar.idHistcar}' />"><button type="button" class="btn btn-default btn-sm">delete</button></a>   
                                     <a href="HistCarburant?action=updateHistCarburant&id=<c:out value='${histcar.idHistcar}' />"><button type="button" class="btn btn-default btn-sm">update</button></a>   
                                    </h5>
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                        
                    </table>
                </div>
            </div>
        </div>

    </div>
</div>
</body>
