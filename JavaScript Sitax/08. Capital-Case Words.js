function solve(input) {

    let text = input.join(" ");
    console.log(text
        .split(/[^a-zA-Z]+/)
        .filter(e => !e.match(/[^a-zA-Z]+/))
        .filter(e => e === e.toUpperCase())
        .filter(e => e)
    );
}

