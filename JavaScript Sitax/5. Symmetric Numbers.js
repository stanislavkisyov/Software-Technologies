function solve(input) {

    let result = '';
    for(let i = 1; i <= input; i++){
        if (isSum(i)){
            result += i + ' ';
        }
    }

    console.log(result);

    function isSum(number) {
        number = number.toString();

        for(let i = 0; i < number.length / 2; i++){
            if(number[i] !== number[number.length - i - 1]){
                return false;
            }
        }
        return true;



    }
}
solve(750);