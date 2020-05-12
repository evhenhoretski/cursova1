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
<form name="person" action="" method="POST">
    Person name:
    <br>
    <@spring.formInput "personForm.name" "" "text"/>
    <br>
    Person card:
    <br>
    <@spring.formInput "personForm.card", "", "text"/>
    <br>
    Person professional:
    <br>
    <@spring.formInput "personForm.professional", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>