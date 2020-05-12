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
<form name="chapter" action="" method="POST">
    Chapter adress:<@spring.formInput "chapterForm.adress" "" "text"/>
    <br>
    Chapter workplace:<@spring.formInput "chapterForm.workplace", "", "text"/>
    <br>
    Chapter booth:<@spring.formInput "chapterForm.booth", "", "text"/>
    <br>
    Chapter implemintation:<@spring.formInput "chapterForm.implemintation", "", "text"/>
    <br>
    Chapter manifestation:<@spring.formInput "chapterForm.manifestation", "", "text"/>
    <br>
    Chapter printing:<@spring.formInput "chapterForm.printing", "", "text"/>
    <br>
    Chapter urgent:<@spring.formInput "chapterForm.urgent", "", "text"/>
    <br>
    Chapter discountcard:<@spring.formInput "chapterForm.discountcard", "", "text"/>
    <br>
    Chapter film:<@spring.formInput "chapterForm.film", "", "text"/>
    <br>
    Chapter sale:<@spring.formInput "chapterForm.sale", "", "text"/>
    <br>
    Chapter proceeds:<@spring.formInput "chapterForm.proceeds", "", "text"/>
    <br>
    Chapter goods:<@spring.formInput "chapterForm.goods", "", "text"/>
    <br>
    Chapter photocenter:<@spring.formInput "chapterForm.photocenter", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>