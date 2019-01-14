const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

let numberOfCase = 0;

while (true) {
    let findSize = parseInt(lines.shift());
    if (isNaN(findSize)) break;

    let maleSize = 0,
        femaleSize = 0;

    let shoesCorrection = lines.shift().split(' ');

    if(numberOfCase > 0) console.log(); 
    numberOfCase++;
    while (true) {
        let shoesSize = parseInt(shoesCorrection.shift());
        if (isNaN(shoesSize)) break;

        let maleOrFemale = shoesCorrection.shift();

        if (shoesSize != findSize) continue;
        else {
            if (maleOrFemale == 'M' || maleOrFemale == 'M\r') maleSize++;
            else femaleSize++;
        }
    }

    console.log(`Caso ${numberOfCase}:`);
    console.log('Pares Iguais: ' + (maleSize + femaleSize));
    console.log('F: ' + femaleSize);
    console.log('M: ' + maleSize);
}