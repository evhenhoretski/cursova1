<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Booth table</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<h3>Booth list</h3>
<br>
<div>
    <fieldset>
        <form name="search" action="" method="POST">
            Booth adress:<@spring.formInput "searchForm.string" "" "text"/>
            <br>
            <input type="submit" value="Search"/>
        </form>
    </fieldset>
</div>

<br>

<a href="https://app-photocenter.herokuapp.com/" type="button" class="btn btn-light" style="float:left; margin-top:5px;"><i class="fa fa-chevron-circle-left"></i>Back to home page</a>

<a href="create" type="button" class="btn btn-light" style="float:right; margin-top:5px;"><i class="fa fa-plus-square-o"></i>Add new booth</a>
<#--<a href="create"><button>Create</button></a>-->

<br>
<div>
    <table class="table table-striped table-danger">
        <tr>
            <th>ID</th>
            <th>Adress<a href="/web/booth/list/sorted" type="button" class="btn btn-outline-light">
                    <i class="fa fa-sort-alpha-asc"></i></a> <a href="https://app-photocenter.herokuapp.com/web/booth/list" type="button" class="btn btn-outline-light">
                    <i class="fa fa-undo"></i>Undo sort</a></th>
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
                <td><a href="edit/${booth.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>