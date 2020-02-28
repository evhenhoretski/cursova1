<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<h3>Chapter list</h3>
<div>
    <table class="table table-striped table-danger">
        <tr>
            <th>ID</th>
            <th>Adress</th>
            <th>Workplace</th>
            <th>Booth</th>
            <th>Implemintation</th>
            <th>Manifestation</th>
            <th>Printing</th>
            <th>Urgent</th>
            <th>Discountcard</th>
            <th>Film</th>
            <th>Sale</th>
            <th>Proceeds</th>
            <th>Goods</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list chapters as chapter>
            <tr>
                <td>${chapter.id}</td>
                <td>${chapter.adress}</td>
                <td>${chapter.workplace}</td>
                <td>${chapter.booth}</td>
                <td>${chapter.implemintation}</td>
                <td>${chapter.manifestation}</td>
                <td>${chapter.printing}</td>
                <td>${chapter.urgent}</td>
                <td>${chapter.discountcard}</td>
                <td>${chapter.film}</td>
                <td>${chapter.sale}</td>
                <td>${chapter.proceeds}</td>
                <td>${chapter.goods}</td>
                <td><a href="delete/${chapter.id}"><button>Delete</button></a></td>
                <td><button>Edit</button></td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>