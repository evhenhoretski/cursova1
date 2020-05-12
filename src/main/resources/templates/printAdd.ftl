<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<style>
    * {
        background-color: lightblue;
    }

    .search {
        background: lightblue; /* Цвет фона */
        color: #454547; /* Цвет текста */
        padding: 10px; /* Поля вокруг текста */
        border-radius: 5px; /* Уголки */
    }
</style>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="print" action="" method="POST">
    Print number:<@spring.formInput "printForm.number" "" "text"/>
    <br>
    Print format:<@spring.formInput "printForm.format", "", "text"/>
    <br>
    Print type:<@spring.formInput "printForm.type", "", "text"/>
    <br>
    Print term:<@spring.formInput "printForm.term", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>