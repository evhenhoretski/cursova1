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
<form name="provider" action="" method="POST">
    Provider name:
    <br>
    <@spring.formInput "providerForm.name" "" "text"/>
    <br>
    Provider paper:
    <br>
    <@spring.formInput "providerForm.paper", "", "text"/>
    <br>
    Provider film:
    <br>
    <@spring.formInput "providerForm.film", "", "text"/>
    <br>
    Provider paint:
    <br>
    <@spring.formInput "providerForm.paint", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>