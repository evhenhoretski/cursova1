<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<h3>Booth list</h3>
<div>
    <table class="table table-striped table-danger">
        <tr>
            <th>ID</th>
            <th>Adress</th>
            <th>Workplace</th>
            <th>Manifestation</th>
            <th>Printing</th>
            <th>Discountcard</th>
            <th>Selling</th>
            <th>Proceeds</th>
            <th>Goods</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list booths as booth>
            <tr>
                <td>${booth.id}</td>
                <td>${booth.adress}</td>
                <td>${booth.workplace}</td>
                <td>${booth.manifestation}</td>
                <td>${booth.printing}</td>
                <td>${booth.discountcard}</td>
                <td>${booth.selling}</td>
                <td>${booth.proceeds}</td>
                <td>${booth.goods}</td>
                <td><a href="delete/${booth.id}"><button>Delete</button></a></td>
                <td><button>Edit</button></td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>