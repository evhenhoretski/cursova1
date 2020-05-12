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
    Order paper:
    <br>
    <@spring.formInput "orderForm.paper" "" "text"/>
    <br>
    Order film:
    <br>
    <@spring.formInput "orderForm.film", "", "text"/>
    <br>
    Order chemical:
    <br>
    <@spring.formInput "orderForm.chemical", "", "text"/>
    <br>
    Order dissemination:
    <br>
    <@spring.formInput "orderForm.dissemination", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>