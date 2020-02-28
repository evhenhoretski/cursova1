<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<h3>Group list</h3>
<div>
    <table class="table table-striped table-danger">
        <tr>
            <th>ID</th>
            <th>Selling</th>
            <th>Ondocuments</th>
            <th>Restoration</th>
            <th>Rolling</th>
            <th>Artistic</th>
            <th>Professionalphoto</th>
            <th>Goods</th>
            <th>Adress</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list photoshops as photoshop>
            <tr>
                <td>${photoshop.id}</td>
                <td>${photoshop.selling}</td>
                <td>${photoshop.ondocuments}</td>
                <td>${photoshop.restoration}</td>
                <td>${photoshop.rolling}</td>
                <td>${photoshop.artistic}</td>
                <td>${photoshop.professionalphoto}</td>
                <td>${photoshop.goods}</td>
                <td>${photoshop.adress}</td>
                <td><a href="delete/${photoshop.id}"><button>Delete</button></a></td>
                <td><button>Edit</button></td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>