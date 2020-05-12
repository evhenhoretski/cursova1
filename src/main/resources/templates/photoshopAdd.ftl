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
<form name="photocenter" action="" method="POST">
    Photoshop selling:
    <br>
    <@spring.formInput "photoshopForm.selling" "" "text"/>
    <br>
    Photoshop ondocuments:
    <br>
    <@spring.formInput "photoshopForm.ondocuments", "", "text"/>
    <br>
    Photoshop restoration:
    <br>
    <@spring.formInput "photoshopForm.restoration", "", "text"/>
    <br>
    Photoshop rolling:
    <br>
    <@spring.formInput "photoshopForm.rolling", "", "text"/>
    <br>
    Photoshop artistic:
    <br>
    <@spring.formInput "photoshopForm.artistic", "", "text"/>
    <br>
    Photoshop professionalphoto:
    <br>
    <@spring.formInput "photoshopForm.professionalphoto", "", "text"/>
    <br>
    Photoshop goods:
    <br>
    <@spring.formInput "photoshopForm.goods", "", "text"/>
    <br>
    Photoshop adress:
    <br>
    <@spring.formInput "photoshopForm.adress", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>