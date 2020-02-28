<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<h3>Client list</h3>
<div>
    <table class="table table-striped table-danger">
        <tr>
            <th>ID</th>
            <th>Professional</th>
            <th>Amateurs</th>
            <th>Discountcard</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list clients as client>
            <tr>
                <td>${client.id}</td>
                <td>${client.professional}</td>
                <td>${client.amateurs}</td>
                <td>${client.discountcard}</td>
                <td><a href="delete/${client.id}"><button>Delete</button></a></td>
                <td><button>Edit</button></td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>