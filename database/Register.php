<?php 
    $con = mysqli_connect("localhost", "mistyc", "l92xfd1!", "mistyc");
    mysqli_query($con,'SET NAMES utf8');
 
    $UserEmail = $_POST["UserEmail"];
    $UserPwd = $_POST["UserPwd"];
    $UserName = $_POST["UserName"];
 
    $statement = mysqli_prepare($con, "INSERT INTO USER VALUES (?,?,?)");
    mysqli_stmt_bind_param($statement, "sss", $UserEmail, $UserPwd, $UserName);
    mysqli_stmt_execute($statement);
 
 
    $response = array();
    $response["success"] = true;
 
   
    echo json_encode($response);
?>