<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="booth" action="" method="POST">
    Booth adress:<@spring.formInput "boothForm.adress" "" "text"/>
    <br>
    Booth workplace:<@spring.formInput "boothForm.workplace" "" "text"/>
    <br>
    Booth manifestation:<@spring.formInput "boothForm.manifestation" "" "text"/>
    <br>
    Booth printing:<@spring.formInput "boothForm.printing" "" "text"/>
    <br>
    Booth discountcard:<@spring.formInput "boothForm.discountcard" "" "text"/>
    <br>
    Booth selling:<@spring.formInput "boothForm.selling" "" "text"/>
    <br>
    Booth proceeds:<@spring.formInput "boothForm.proceeds" "" "text"/>
    <br>
    Booth goods:<@spring.formInput "boothForm.goods" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>