<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<h3>Person list</h3>
<div>
    <table class="table table-striped table-danger">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Card</th>
            <th>Professional</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list persons as person>
            <tr>
                <td>${person.id}</td>
                <td>${person.name}</td>
                <td>${person.card}</td>
                <td>${person.professional}</td>
                <td><a href="delete/${person.id}"><button>Delete</button></a></td>
                <td><a href="edit/${person.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="create"><button>Create</button></a>
</div>
</body>
</html>