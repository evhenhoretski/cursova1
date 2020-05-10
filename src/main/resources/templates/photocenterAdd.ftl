<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="photocenter" action="" method="POST">
    <table>
        Photocenter proceeds:<@spring.formInput "photocenterForm.proceeds" "" "text"/>
        <br>
        Photocenter order:<@spring.formInput "photocenterForm.order", "", "text"/>
        <br>
        Photocenter workplace:<@spring.formSingleSelect "photocenterForm.workplace" "" />
        <select id="photocenter" name="photocenter">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
        </select>
        <br>
    </table>
    <input type="submit" value="Create"/>
</form>

</body>
</html>