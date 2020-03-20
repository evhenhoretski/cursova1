<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="person" action="" method="POST">
    Person name:<@spring.formInput "personForm.name" "" "text"/>
    <br>
    Person card:<@spring.formInput "personForm.card", "", "text"/>
    <br>
    Person professional:<@spring.formInput "personForm.professional", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>