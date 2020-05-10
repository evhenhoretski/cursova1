<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Chapter table</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<h3>Chapter list</h3>
<br>
<div>
    <fieldset>
        <form name="search" action="" method="POST">
            Chapter adress:<@spring.formInput "searchForm.string" "" "text"/>
            <br>
            <input type="submit" value="Search"/>
        </form>
    </fieldset>
</div>

<br>

<a href="https://app-photocenter.herokuapp.com/" type="button" class="btn btn-light" style="float:left; margin-top:5px;"><i class="fa fa-chevron-circle-left"></i>Back to home page</a>

<a href="create" type="button" class="btn btn-light" style="float:right; margin-top:5px;"><i class="fa fa-plus-square-o"></i>Add new chpter</a>
<#--<a href="create"><button>Create</button></a>-->

<div>
    <table class="table table-striped table-danger">
        <tr>
            <th>ID</th>
            <th>Adress<a href="/web/chapter/list/sorted" type="button" class="btn btn-outline-light">
                    <i class="fa fa-sort-alpha-asc"></i></a> <a href="https://app-photocenter.herokuapp.com/web/chapter/list" type="button" class="btn btn-outline-light">
                    <i class="fa fa-undo"></i>Undo sort</a></th>
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
                <td><a href="edit/${chapter.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>