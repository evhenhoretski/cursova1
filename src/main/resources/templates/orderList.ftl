<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<h3>Order list</h3>
<br>
<div>
    <fieldset>
        <form name="search" action="" method="POST">
            Order dissemination:<@spring.formInput "searchForm.string" "" "text"/>
            <br>
            <input type="submit" value="Search"/>
        </form>
    </fieldset>
</div>

<br>

<a href="http://localhost:8080/" type="button" class="btn btn-light" style="float:left; margin-top:5px;"><i class="fa fa-chevron-circle-left"></i>Back to home page</a>

<a href="create" type="button" class="btn btn-light" style="float:right; margin-top:5px;"><i class="fa fa-plus-square-o"></i>Add new order</a>
<#--<a href="create"><button>Create</button></a>-->
<div>
    <table class="table table-striped table-danger">
        <tr>
            <th>ID</th>
            <th>Paper<a href="/web/order/list/sorted" type="button" class="btn btn-outline-light">
                    <i class="fa fa-sort-alpha-asc"></i></a> <a href="http://localhost:8080/web/order/list" type="button" class="btn btn-outline-light">
                    <i class="fa fa-undo"></i>Undo sort</a></th>
            <th>Film</th>
            <th>Chemical</th>
            <th>Dissemination</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list orders as order>
            <tr>
                <td>${order.id}</td>
                <td>${order.paper}</td>
                <td>${order.film}</td>
                <td>${order.chemical}</td>
                <td>${order.dissemination}</td>
                <td><a href="delete/${order.id}"><button>Delete</button></a></td>
                <td><a href="edit/${order.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>