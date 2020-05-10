<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Person table</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<h3>Person list</h3>
<br>
<div>
    <fieldset>
        <form name="search" action="" method="POST">
            Person name:<@spring.formInput "searchForm.string" "" "text"/>
            <br>
            <input type="submit" value="Search"/>
        </form>
    </fieldset>
</div>

<br>

<a href="https://app-photocenter.herokuapp.com/" type="button" class="btn btn-light" style="float:left; margin-top:5px;"><i class="fa fa-chevron-circle-left"></i>Back to home page</a>

<a href="create" type="button" class="btn btn-light" style="float:right; margin-top:5px;"><i class="fa fa-plus-square-o"></i>Add new photocenter</a>
<#--<a href="create"><button>Create</button></a>-->
<div>
    <table class="table table-striped table-danger">
        <tr>
            <th>ID</th>
            <th>Name<a href="/web/person/list/sorted" type="button" class="btn btn-outline-light">
                    <i class="fa fa-sort-alpha-asc"></i></a> <a href="http://localhost:8080/web/person/list" type="button" class="btn btn-outline-light">
                    <i class="fa fa-undo"></i>Undo sort</a></th>
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
</div>
</body>
</html>