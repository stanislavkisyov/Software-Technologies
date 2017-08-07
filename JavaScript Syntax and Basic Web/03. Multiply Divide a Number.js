function solve(nums) {

    [n, x] = nums.map(Number);
    if (n <= x){
        console.log(n * x);
    }else {
        console.log(n / x);
    }

}
solve(['2', '3'])