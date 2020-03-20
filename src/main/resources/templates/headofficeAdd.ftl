<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="headoffice" action="" method="POST">
    Headoffice adress:<@spring.formInput "headofficeForm.adress" "" "text"/>
    <input type="submit" value="Create"/>
</form>
</body>
</html>