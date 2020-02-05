const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

let n = lines.shift(),
    count = 1;
while (n-- !== 0) {
    let nOfMember, captain;
    const inp = lines.shift().split(' ');
    nOfMember = parseInt(inp.shift());
    captain = Math.floor(nOfMember / 2);

    console.log(`Case ${count++}: ${parseInt(inp[captain])}`)
}