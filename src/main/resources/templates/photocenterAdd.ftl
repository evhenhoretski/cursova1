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
    <table>
        Photocenter proceeds:<@spring.formInput "photocenterForm.proceeds" "" "text"/>
        <br>
        Photocenter order:<@spring.formInput "photocenterForm.order", "", "text"/>
        <br>
        Photocenter workplace:<@spring.formInput "photocenterForm.workplace", "", "text" />
        <br>
    </table>
    <input type="submit" value="Create"/>
</form>

</body>
</html>