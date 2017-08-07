function solve(input) {
    let allTown = {};

    for (let json of input) {
        let obj = JSON.parse(json);
        if (!(obj.town in allTown)){
            allTown[obj.town] = 0;
        }
        allTown[obj.town] += obj.income;

    }

    for (let sortTown of Object.keys(allTown).sort()){
        console.log(`${sortTown} -> ${allTown[sortTown]}`);
        
    }

}

