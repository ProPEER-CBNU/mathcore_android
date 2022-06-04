<?php
    $con = mysqli_connect("localhost", "mistyc", "l92xfd1!", "mistyc");

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