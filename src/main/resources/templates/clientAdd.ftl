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
    Client professional:
    <br>
    <@spring.formInput "clientForm.professional" "" "text"/>
    <br>
    Client amateurs:
    <br>
    <@spring.formInput "clientForm.amateurs", "", "text"/>
    <br>
    Client discountcard:
    <br>
    <@spring.formInput "clientForm.discountcard", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>