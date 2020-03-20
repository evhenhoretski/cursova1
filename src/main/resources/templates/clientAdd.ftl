<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="client" action="" method="POST">
    Client professional:<@spring.formInput "clientForm.professional" "" "text"/>
    <br>
    Client amateurs:<@spring.formInput "clientForm.amateurs", "", "text"/>
    <br>
    Client discountcard:<@spring.formInput "clientForm.discountcard", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>