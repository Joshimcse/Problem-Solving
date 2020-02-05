let input = require('fs').readFileSync('/dev/stdin', 'utf8');
let lines = input.split('\n');

let n1 = parseInt(lines.shift())
let n2 = parseInt(lines.shift())

if (n1 % 2 == 0) {
    if (n2 % 2 == 0)
        console.log(1);
    else
        console.log(0)
} else {
    if (n2 % 2 == 0)
        console.log(0);
    else
        console.log(1)
}