<?php
    $con = mysqli_connect('localhost', 'ftp아이디', 'ftp비밀번호', 'ftp아이디');

    $UserEmail = $_POST["UserEmail"];
    $UserPwd = $_POST["UserPwd"];

    $statement = mysqli_prepare($con, "SELECT UserEmail FROM USER WHERE UserEmail = ?");

    mysqli_stmt_bind_param($statement, "s", $UserEmail);
    mysqli_stmt_execute($statement);
    mysqli_stmt_store_result($statement);
    mysqli_stmt_bind_result($statement, $userID);

    $response = array();
    $response["success"] = true;

    while(mysqli_stmt_fetch($statement)){
      $response["success"] = false;
      $response["UserEmail"] = $UserEmail;
    }

    echo json_encode($response);
?>