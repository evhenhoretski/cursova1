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
<form name="photocenter" action="" method="POST">
    Client professional:<@spring.formInput "clientForm.professional" "" "text"/>
    <br>
    Client amateurs:<@spring.formInput "clientForm.amateurs", "", "text"/>
    <br>
    Client discountcard:<@spring.formInput "clientForm.discountcard", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>