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
<form name="print" action="" method="POST">
    Print number:
    <br>
    <@spring.formInput "printForm.number" "" "text"/>
    <br>
    Print format:
    <br>
    <@spring.formInput "printForm.format", "", "text"/>
    <br>
    Print type:
    <br>
    <@spring.formInput "printForm.type", "", "text"/>
    <br>
    Print term:
    <br>
    <@spring.formInput "printForm.term", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>