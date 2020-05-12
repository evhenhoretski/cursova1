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
    Photoshop selling:<@spring.formInput "photoshopForm.selling" "" "text"/>
    <br>
    Photoshop ondocuments:<@spring.formInput "photoshopForm.ondocuments", "", "text"/>
    <br>
    Photoshop restoration:<@spring.formInput "photoshopForm.restoration", "", "text"/>
    <br>
    Photoshop rolling:<@spring.formInput "photoshopForm.rolling", "", "text"/>
    <br>
    Photoshop artistic:<@spring.formInput "photoshopForm.artistic", "", "text"/>
    <br>
    Photoshop professionalphoto:<@spring.formInput "photoshopForm.professionalphoto", "", "text"/>
    <br>
    Photoshop goods:<@spring.formInput "photoshopForm.goods", "", "text"/>
    <br>
    Photoshop adress:<@spring.formInput "photoshopForm.adress", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>