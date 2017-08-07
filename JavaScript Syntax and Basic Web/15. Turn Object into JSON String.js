function main(arr) {
    let obj = {};

    for (let data of arr) {
        let tokens = data.split(" -> ");
        let key = tokens[0];
        obj[key] = Number(tokens[1]) || tokens[1];
    }

    console.log(JSON.stringify(obj));
}
main(['name -> Angel','surname -> Georgiev','age -> 20', 'grade -> 6.00',
    'date -> 23/05/1995','town -> Sofia'])