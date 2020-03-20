<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<h3>Photocenter list</h3>
<div>
    <table class="table table-striped table-danger">
        <tr>
            <th>ID</th>
            <th>Proceeds</th>
            <th>Order</th>
            <th>Workplace</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list photocenters as photocenter>
            <tr>
                <td>${photocenter.id}</td>
                <td>${photocenter.proceeds}</td>
                <td>${photocenter.order}</td>
                <td>${photocenter.workplace}</td>
                <td><a href="delete/${photocenter.id}"><button>Delete</button></a></td>
                <td><a href="edit/${photocenter.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="create"><button>Create</button></a>
</div>
</body>
</html>