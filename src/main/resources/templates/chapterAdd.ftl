<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<style>
    * {
        background-color: lightpink;
    }
</style>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="chapter" action="" method="POST">
    Chapter adress:
    <br>
    <@spring.formInput "chapterForm.adress" "" "text"/>
    <br>
    Chapter workplace:
    <br>
    <@spring.formInput "chapterForm.workplace", "", "text"/>
    <br>
    Chapter booth:
    <br>
    <@spring.formInput "chapterForm.booth", "", "text"/>
    <br>
    Chapter implemintation:
    <br>
    <@spring.formInput "chapterForm.implemintation", "", "text"/>
    <br>
    Chapter manifestation:
    <br>
    <@spring.formInput "chapterForm.manifestation", "", "text"/>
    <br>
    Chapter printing:
    <br>
    <@spring.formInput "chapterForm.printing", "", "text"/>
    <br>
    Chapter urgent:
    <br>
    <@spring.formInput "chapterForm.urgent", "", "text"/>
    <br>
    Chapter discountcard:
    <br>
    <@spring.formInput "chapterForm.discountcard", "", "text"/>
    <br>
    Chapter film:
    <br>
    <@spring.formInput "chapterForm.film", "", "text"/>
    <br>
    Chapter sale:
    <br>
    <@spring.formInput "chapterForm.sale", "", "text"/>
    <br>
    Chapter proceeds:
    <br>
    <@spring.formInput "chapterForm.proceeds", "", "text"/>
    <br>
    Chapter goods:
    <br>
    <@spring.formInput "chapterForm.goods", "", "text"/>
    <br>
    Chapter photocenter:
    <br>
    <@spring.formInput "chapterForm.photocenter", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>