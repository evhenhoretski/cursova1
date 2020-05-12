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
    <table>
        Photocenter
        <br>
        <@spring.formInput "photocenterForm.proceeds" "" "text"/>
        <br>
        Photocenter order:
        <br>
        <@spring.formInput "photocenterForm.order", "", "text"/>
        <br>
        Photocenter workplace:
        <br>
        <@spring.formInput "photocenterForm.workplace", "", "text" />
        <br>
    </table>
    <input type="submit" value="Create"/>
</form>

</body>
</html>