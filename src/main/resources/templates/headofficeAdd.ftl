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
<form name="headoffice" action="" method="POST">
    Headoffice adress:
    <br>
    <@spring.formInput "headofficeForm.adress" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>