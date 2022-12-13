<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Modifier Station</title>
</head>
<body>
<nav><%@ include file="/header.jsp" %></nav>
<div class="row">
    <div class="col-md-6 mx-auto mt-5">
        <form action="Station?action=update" method="POST" >
         <input type="hidden" class="form-control" name="id" value="${station.idSta}">
                     <div class="mb-3">
                <label class="form-label">Nom</label>
                <input type="text" class="form-control" name="nomSta" value="${station.nom}">
            </div>
            <div class="mb-3">
                <label class="form-label">Ville</label>
                <input type="text" class="form-control" name="villeSta" value="${station.ville}">
            </div>
            <div class="mb-3">
                <label class="form-label">Adresse</label>
                <input type="text" class="form-control" name="adresseSta" value="${station.adresse}">
                 </div>
                 
         
                
            <div class="d-grid gap-2 ">
                <button type="submit" class="btn btn-primary "><i class="fas fa-save"></i> Modifier</button>
            </div>   
        </form>
    </div>
</div>
</div>
</body>
</html>