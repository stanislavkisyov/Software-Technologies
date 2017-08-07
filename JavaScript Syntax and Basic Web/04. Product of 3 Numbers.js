function solve(nums) {
    [num1, num2, num3] = nums.map(Number);

    if ((num1 && num2 && num3 > 0)){
        console.log("Positive");
        return;
    }
    if ((num1 < 0 && num2 < 0) || (num1 < 0 && num3 < 0) || (num2 < 0 && num3 < 0))
    {
        console.log("Positive");
    }else {
        console.log("Negative");
    }
}

solve(['5', '3', '4']);