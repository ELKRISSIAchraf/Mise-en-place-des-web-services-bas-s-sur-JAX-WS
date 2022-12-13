<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>add histcarburant</title>
</head>
<body>
<nav><%@ include file="/header.jsp" %></nav>

<div class="container">
<div class="row">
    <div class="col-md-6 mx-auto mt-5">
        <form action="HistCarburant?action=ajouter" method="POST" >
            <div class="mb-3">
                <label class="form-label">Date</label>
                <input type="date" class="form-control" name="dateHistCar">
            </div>
            <div class="mb-3">
                <label class="form-label">Prix</label>
                <input type="number" class="form-control" name="prixHistCar">
            </div>
            
                <div class="mb-3">
                <label class="form-label">Station</label>
                <input type="number" class="form-control" name="idSta">
            </div>  
               <div class="mb-3">
                <label class="form-label">Carburant</label>
                <input type="number" class="form-control" name="idCar">
            </div>   
            <div class="d-grid gap-2 ">
                <button type="submit" class="btn btn-primary "><i class="fas fa-save"></i> Enregistrer</button>
            </div>   
        </form>
    </div>
</div>
</div>

</body>
</html>