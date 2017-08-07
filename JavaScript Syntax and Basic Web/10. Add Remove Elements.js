function solve(input) {


    let array = [];

    for (let i = 0; i < input.length; i++) {
        let tokens = input[i].split(" ");
        if (tokens[0] == "add"){
            let number = Number(tokens[1]);
            array.push(number);
        }else {
            let index = tokens[1];
            array.splice(index, 1);
        }
    }

    for (let obj of array) {
        console.log(obj);
    }
}
solve([ 'add 3', 'add 5', 'remove 1', 'add 2' ])