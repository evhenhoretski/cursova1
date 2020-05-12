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
<form name="booth" action="" method="POST">
    Booth adress:
    <br>
    <@spring.formInput "boothForm.adress" "" "text"/>
    <br>
    Booth workplace:
    <br>
    <@spring.formInput "boothForm.workplace", "", "text"/>
    <br>
    Booth manifestation:
    <br>
    <@spring.formInput "boothForm.manifestation", "", "text"/>
    <br>
    Booth printing:
    <br>
    <@spring.formInput "boothForm.printing", "", "text"/>
    <br>
    Booth discountcard:
    <br>
    <@spring.formInput "boothForm.discountcard", "", "text"/>
    <br>
    Booth selling:
    <br>
    <@spring.formInput "boothForm.selling", "", "text"/>
    <br>
    Booth proceeds:
    <br>
    <@spring.formInput "boothForm.proceeds", "", "text"/>
    <br>
    Booth goods:
    <br>
    <@spring.formInput "boothForm.goods", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>